package com.wvp.exceptions;

public class InputTypeError extends Exception {
    public InputTypeError() {
        super("Veuillez taper un chiffre afin de sélectionner une option du menu.");
    }
}
