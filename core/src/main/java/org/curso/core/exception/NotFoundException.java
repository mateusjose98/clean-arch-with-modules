package org.curso.core.exception;

public class NotFoundException  extends Exception {
    private String code;
    private String message;
    public NotFoundException(String message, String code) {
        super(message);
        this.code = code;
    }
}
