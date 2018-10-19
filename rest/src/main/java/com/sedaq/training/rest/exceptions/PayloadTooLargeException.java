package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.PAYLOAD_TOO_LARGE,
    reason = "The request is larger than the server is willing or able to process. Previously called \"Request Entity Too Large\".")
public class PayloadTooLargeException extends RuntimeException {

  public PayloadTooLargeException() {}

  public PayloadTooLargeException(String message) {
    super(message);
  }

  public PayloadTooLargeException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public PayloadTooLargeException(Throwable ex) {
    super(ex);
  }

}
