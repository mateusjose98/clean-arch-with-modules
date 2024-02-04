package org.curso.core.domain;

import org.curso.core.domain.enums.UserType;
import org.curso.core.exception.TransferException;
import org.curso.core.exception.enums.ErrorCodeEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wallet {
    private Long id;
    private BigDecimal balance;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Wallet() {
    }

    public Wallet(BigDecimal balance, User user) {
        this.balance = balance;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    public Wallet(Long id, BigDecimal balance, User user, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.balance = balance;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public void recieveValue(BigDecimal value) {
        this.balance.add(value);
    }

    public void transfer(BigDecimal value) throws TransferException {
        if (UserType.SHOPKEEPER.equals(this.getUser().getType())) {
            throw new TransferException(ErrorCodeEnum.ON0001.getMessage(), ErrorCodeEnum.ON0001.getCode());
        }
        if(this.balance.compareTo(value) < 0) {
            throw new TransferException(ErrorCodeEnum.TR0002.getMessage(), ErrorCodeEnum.TR0002.getCode());
        }
        this.balance = this.balance.subtract(value);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
