package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,
        reason = "A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.")
public class InternalServerErrorException extends RuntimeException {

    public InternalServerErrorException() {
    }

    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException(String message, Throwable ex) {
        super(message, ex);
    }

    public InternalServerErrorException(Throwable e) {
        super(e);
    }
}
