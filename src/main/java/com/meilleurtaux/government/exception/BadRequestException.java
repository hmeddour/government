package com.meilleurtaux.government.exception;

public class BadRequestException extends RuntimeException {

    private final int httpCode;
    public BadRequestException(final String message) {
        super(message);
        this.httpCode = 400;
    }
}
