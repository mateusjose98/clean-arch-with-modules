package org.curso.usecase;

import org.curso.core.domain.TransactionPin;

public interface EmailAvailableUseCase {

    Boolean emailAvailable(String email);
}
