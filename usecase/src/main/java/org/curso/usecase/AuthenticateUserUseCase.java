package org.curso.usecase;

import org.curso.core.domain.User;

public interface AuthenticateUserUseCase {
    Boolean authenticate(String username, String password);
}
