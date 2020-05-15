package com.wvp.enums;

public enum Nationality {
    SOUTH_AFRICAN("South Africa", "South African"),
    NAMIBIAN("Namibia", "Namibian"),
    MOZAMBICAN("Mozambique", "Mozambican"),
    FRENCH("France", "French"),
    DUTCH("the Nertherlands", "Dutch"),
    AMERICAN("the United States", "American"),
    CANADIAN("Canada", "Canadian"),
    JAPANESE("Japan", "Japanese");

    // Attribute
    private final String country;
    private final String nationality;

    // Constructor
    Nationality(String country, String nationality) {
        this.country = country;
        this.nationality = nationality;
    }

    // Getters
    public String getNationality() {
        return nationality;
    }

    public String getCountry() {
        return country;
    }
}
