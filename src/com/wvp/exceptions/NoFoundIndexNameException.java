package com.wvp.exceptions;

public class NoFoundIndexNameException extends IndexOutOfBoundsException {
    /**
     * Constructs an <code>IndexOutOfBoundsException</code> with no
     * detail message.
     */
    public NoFoundIndexNameException() {
        super("Erreur d'index...");
    }
}
