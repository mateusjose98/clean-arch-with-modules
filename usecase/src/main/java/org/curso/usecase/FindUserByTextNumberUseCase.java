package org.curso.usecase;

import org.curso.core.domain.User;

public interface FindUserByTextNumberUseCase {
    User findByTextNumber(String taxNumber);
}
