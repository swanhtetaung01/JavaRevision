package org.javarevision.exceptions.customexceptions;

public class TooOldException extends RuntimeException {
    public TooOldException(String message){
        super(message);
    }
}
