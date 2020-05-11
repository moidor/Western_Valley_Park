package com.wvp.enums;

public enum Nationality {
    SOUTH_AFRICAN("South African"),
    NAMIBIAN("Namibian"),
    MOZAMBICAN("Mozambican"),
    FRENCH("French"),
    DUTCH("Dutch"),
    AMERICAN("American"),
    CANADIAN("Canadian"),
    JAPANESE("Japanese");

    // Attribute
    private final String nationality;

    // Getter
    public String getNationality() {
        return nationality;
    }

    // Constructor
    Nationality(String nationality) {
        this.nationality = nationality;
    }
}
