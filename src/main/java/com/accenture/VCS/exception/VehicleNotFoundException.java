package com.accenture.VCS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VehicleNotFoundException extends RuntimeException {

	// private String message;

	public VehicleNotFoundException(String message) {
			super(message);
			//this.message = message;
		}

	public VehicleNotFoundException(String message, Throwable cause) {
			super(message,cause);
			// TODO Auto-generated constructor stub
		}

	public VehicleNotFoundException() {
			super();
			// TODO Auto-generated constructor stub
		}

	public VehicleNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

	public VehicleNotFoundException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
}