package org.curso.usecase;

import org.curso.core.domain.Transaction;

public interface CreateTransactionUseCase {
    void create(Transaction transaction);
}
