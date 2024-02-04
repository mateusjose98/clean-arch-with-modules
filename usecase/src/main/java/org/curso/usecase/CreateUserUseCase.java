package org.curso.usecase;

import org.curso.core.domain.User;
import org.curso.core.exception.EmailException;
import org.curso.core.exception.TaxNumberException;
import org.curso.core.exception.TransactionPinException;

public interface CreateUserUseCase {
    void create(User user,  String pin) throws TaxNumberException, EmailException, TransactionPinException;
}
