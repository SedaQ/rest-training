package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE,
    reason = "The requested resource is capable of generating only content not acceptable according to the Accept headers sent in the request.")
public class InvalidParameterException extends RuntimeException {

  private static final long serialVersionUID = -8624578151167634036L;

  public InvalidParameterException() {}

  public InvalidParameterException(String message) {
    super(message);
  }

  public InvalidParameterException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public InvalidParameterException(Throwable ex) {
    super(ex);
  }
}
