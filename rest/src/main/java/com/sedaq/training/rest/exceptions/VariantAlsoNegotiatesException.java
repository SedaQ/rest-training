package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.VARIANT_ALSO_NEGOTIATES,
        reason = "Transparent content negotiation for the request results in a circular reference. (RFC 2295)")
public class VariantAlsoNegotiatesException extends RuntimeException {

    public VariantAlsoNegotiatesException() {
    }

    public VariantAlsoNegotiatesException(String message) {
        super(message);
    }

    public VariantAlsoNegotiatesException(String message, Throwable ex) {
        super(message, ex);
    }

    public VariantAlsoNegotiatesException(Throwable ex) {
        super(ex);
    }

}
