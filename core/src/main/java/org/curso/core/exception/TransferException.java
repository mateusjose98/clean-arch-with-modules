package org.curso.core.exception;

public class TransferException extends Exception {
    private String code;
    private String message;
    public TransferException(String message, String code) {
        super(message);
        this.code = code;
    }


}
