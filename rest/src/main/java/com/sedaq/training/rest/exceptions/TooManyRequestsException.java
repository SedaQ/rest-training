package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.TOO_MANY_REQUESTS,
        reason = "The user has sent too many requests in a given amount of time. Intended for use with rate-limiting schemes (RFC 6585).")
public class TooManyRequestsException extends RuntimeException {

    public TooManyRequestsException() {
    }

    public TooManyRequestsException(String message) {
        super(message);
    }

    public TooManyRequestsException(String message, Throwable ex) {
        super(message, ex);
    }

    public TooManyRequestsException(Throwable ex) {
        super(ex);
    }

}
