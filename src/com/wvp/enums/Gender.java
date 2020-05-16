package com.wvp.enums;

public enum Gender {
    FEMALE("woman", "female"),
    MALE("man", "male");

    private final String gender;
    private final String animalGender;

    public String getGender() {
        return gender;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    Gender(String gender, String animalGender) {
        this.gender = gender;
        this.animalGender = animalGender;
    }
}
