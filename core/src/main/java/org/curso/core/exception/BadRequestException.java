package org.curso.core.exception;

public class BadRequestException extends Exception {
    private String code;
    private String message;
    public BadRequestException(String message, String code) {
        super(message);
        this.code = code;
    }
}
