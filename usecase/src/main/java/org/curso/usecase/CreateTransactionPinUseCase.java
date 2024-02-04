package org.curso.usecase;

import org.curso.core.domain.Transaction;
import org.curso.core.domain.TransactionPin;

public interface CreateTransactionPinUseCase {
    void create(TransactionPin pin);
}
