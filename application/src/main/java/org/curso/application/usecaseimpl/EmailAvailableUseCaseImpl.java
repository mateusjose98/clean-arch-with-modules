package org.curso.application.usecaseimpl;

import org.curso.application.gateway.EmailAvailableGateway;
import org.curso.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {
    private EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public Boolean emailAvailable(String email) {
        return emailAvailableGateway.available(email);
    }
}
