package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED,
    reason = "Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided."
        + "The response must include a WWW-Authenticate header field containing a challenge applicable to the requested resource (RFC 7235).")
public class UnauthorizedException extends RuntimeException {

  public UnauthorizedException() {}

  public UnauthorizedException(String message) {
    super(message);
  }

  public UnauthorizedException(String message, Throwable ex) {
	super(message,ex);
  }

  public UnauthorizedException(Throwable ex) {
    super(ex);
  }

}
