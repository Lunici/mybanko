package org.mybanko.exception;

public class NoSuchEnumElementException extends RuntimeException{
    public NoSuchEnumElementException(String enumName, int elementId) {
        super("Can't find the element with id '" + elementId + "' in enum '" + enumName + "'.");
    }

}
