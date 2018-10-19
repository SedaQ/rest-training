package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.NETWORK_AUTHENTICATION_REQUIRED,
    reason = "The client needs to authenticate to gain network access. Intended for use by intercepting proxies used to control access to the network (e.g., \"captive portals\" used to require agreement to Terms of Service before granting full Internet access via a Wi-Fi hotspot).")
public class NetworkAuthenticationRequiredException extends RuntimeException {

  public NetworkAuthenticationRequiredException() {}

  public NetworkAuthenticationRequiredException(String message) {
    super(message);
  }

  public NetworkAuthenticationRequiredException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public NetworkAuthenticationRequiredException(Throwable ex) {
    super(ex);
  }

}
