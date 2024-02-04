package org.curso.core.exception;

public class TransactionPinException extends Exception {
    private String code;
    private String message;
    public TransactionPinException(String message, String code) {
        super(message);
        this.code = code;
    }

}
