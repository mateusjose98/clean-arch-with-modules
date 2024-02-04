package org.curso.application.gateway;

import org.curso.core.domain.TransactionPin;

public interface CreateTransactionPinGateway {
    void create(TransactionPin pin);
}
