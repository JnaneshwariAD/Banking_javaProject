package com.icici;

public class InvalidChoiceException extends RuntimeException {
public String message;

public InvalidChoiceException(String message) {
	this.message=message;
}
@Override
public String getMessage() {
	return message;
}

}
