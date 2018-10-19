package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY,
    reason = "The request was well-formed but was unable to be followed due to semantic errors (RFC 4918).")
public class UnprocessableEntityException extends RuntimeException {

  public UnprocessableEntityException() {}

  public UnprocessableEntityException(String message) {
    super(message);
  }

  public UnprocessableEntityException(String message, Throwable ex) {
	super(message,ex);
  }

  public UnprocessableEntityException(Throwable ex) {
    super(ex);
  }

}
