package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT,
        reason = "The server timed out waiting for the request. According to HTTP specifications: \"The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time.\"")
public class RequestTimeoutException extends RuntimeException {

    public RequestTimeoutException() {
    }

    public RequestTimeoutException(String message) {
        super(message);
    }

    public RequestTimeoutException(String message, Throwable ex) {
        super(message, ex);
    }

    public RequestTimeoutException(Throwable ex) {
        super(ex);
    }

}
