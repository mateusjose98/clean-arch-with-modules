package org.curso.core.exception;

public class EmailException extends Exception {
    private String code;
    private String message;
    public EmailException(String message, String code) {
        super(message);
        this.code = code;
    }
}
