package org.curso.application.usecaseimpl;

import org.curso.application.gateway.CreateWalletGateway;
import org.curso.core.domain.Wallet;
import org.curso.usecase.CreateWalletUseCase;

public class CreateWalletUseCaseImpl implements CreateWalletUseCase {

    private CreateWalletGateway createWalletGateway;

    public CreateWalletUseCaseImpl(CreateWalletGateway createWalletGateway) {
        this.createWalletGateway = createWalletGateway;
    }

    @Override
    public void create(Wallet wallet) {
        createWalletGateway.create(wallet);

    }
}
