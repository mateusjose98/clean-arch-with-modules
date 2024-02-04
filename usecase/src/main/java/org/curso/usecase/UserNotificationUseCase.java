package org.curso.usecase;

import org.curso.core.domain.Transaction;
import org.curso.core.domain.User;

public interface UserNotificationUseCase {
    Boolean notify(Transaction transaction, String email);
}
