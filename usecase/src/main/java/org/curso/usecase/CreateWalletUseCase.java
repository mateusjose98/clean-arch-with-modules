package org.curso.usecase;

import org.curso.core.domain.TransactionPin;
import org.curso.core.domain.Wallet;

public interface CreateWalletUseCase {
    void create(Wallet wallet);
}
