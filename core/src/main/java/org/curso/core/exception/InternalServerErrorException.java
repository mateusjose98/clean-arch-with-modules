package org.curso.core.exception;

public class InternalServerErrorException extends Exception {
    private String code;
    private String message;
    public InternalServerErrorException(String message, String code) {
        super(message);
        this.code = code;
    }
}
