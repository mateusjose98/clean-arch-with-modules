package org.curso.core.exception.enums;

public enum ErrorCodeEnum {

    ON0001("Tax number inválido", "ON-0001"),
    ON0002("Tax number indisponível", "ON-0002"),
    ON0003("Email indisponível", "ON-0003"),
    TR0001("Logista não tem a função tranferência disponível", "TR-0001"),
    TR0002("Saldo deve ser maior ou igual a que zero", "TR-0002"),
    TRP0001("PIN inválido","TRP-0001" )
  ;
    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
