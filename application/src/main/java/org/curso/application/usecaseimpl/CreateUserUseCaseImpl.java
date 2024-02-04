package org.curso.application.usecaseimpl;

import org.curso.application.gateway.CreateUserGateway;
import org.curso.core.domain.TransactionPin;
import org.curso.core.domain.User;
import org.curso.core.domain.Wallet;
import org.curso.core.exception.EmailException;
import org.curso.core.exception.TaxNumberException;
import org.curso.core.exception.TransactionPinException;
import org.curso.core.exception.enums.ErrorCodeEnum;
import org.curso.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;
    private CreateWalletUseCase createWalletUseCase;
    private CreateTransactionPinUseCase createTransactionPinUseCase;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway, CreateWalletUseCase createWalletUseCase, CreateTransactionPinUseCase createTransactionPinUseCase) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
        this.createWalletUseCase = createWalletUseCase;
        this.createTransactionPinUseCase = createTransactionPinUseCase;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException {

        Boolean taxNumberAvailable = taxNumberAvailableUseCase.taxNumberAvailable(user.getTaxNumber().getValue());
        Boolean emailAvailable = emailAvailableUseCase.emailAvailable(user.getEmail());

        if(!taxNumberAvailable) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }
        if(!emailAvailable) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }

        User created = createUserGateway.create(user);

        createWalletUseCase.create(new Wallet(BigDecimal.ZERO, created));
        createTransactionPinUseCase.create(new TransactionPin(created, pin));






    }
}
