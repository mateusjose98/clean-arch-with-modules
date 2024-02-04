package org.curso.usecase;

import org.curso.core.domain.Transaction;
import org.curso.core.domain.Wallet;

public interface TransferUserUseCase {
    Boolean transfer(Transaction transaction);
}
