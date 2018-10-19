package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.PROXY_AUTHENTICATION_REQUIRED, reason = "The client must first authenticate itself with the proxy.")
public class ProxyAuthenticationRequiredException extends RuntimeException {

  public ProxyAuthenticationRequiredException() {}

  public ProxyAuthenticationRequiredException(String message) {
    super(message);
  }

  public ProxyAuthenticationRequiredException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public ProxyAuthenticationRequiredException(Throwable ex) {
    super(ex);
  }

}
