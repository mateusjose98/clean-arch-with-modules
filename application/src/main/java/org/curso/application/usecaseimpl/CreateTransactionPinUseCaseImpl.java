package org.curso.application.usecaseimpl;

import org.curso.application.gateway.CreateTransactionPinGateway;
import org.curso.core.domain.TransactionPin;
import org.curso.usecase.CreateTransactionPinUseCase;

public class CreateTransactionPinUseCaseImpl implements CreateTransactionPinUseCase {

    private CreateTransactionPinGateway createTransactionPinGateway;

    public CreateTransactionPinUseCaseImpl(CreateTransactionPinGateway createTransactionPinGateway) {
        this.createTransactionPinGateway = createTransactionPinGateway;
    }

    @Override
    public void create(TransactionPin pin) {

        createTransactionPinGateway.create(pin);

    }
}
