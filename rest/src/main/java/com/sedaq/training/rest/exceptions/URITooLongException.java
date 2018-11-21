package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.URI_TOO_LONG, reason = "The URI provided was too long for the server to process."
        + "Often the result of too much data being encoded as a query-string of a GET request, in which case it should be converted to a POST request (RFC 7231).")
public class URITooLongException extends RuntimeException {

    public URITooLongException() {
    }

    public URITooLongException(String message) {
        super(message);
    }

    public URITooLongException(String message, Throwable ex) {
        super(message, ex);
    }

    public URITooLongException(Throwable ex) {
        super(ex);
    }

}
