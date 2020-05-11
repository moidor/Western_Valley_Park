package com.wvp.enums;

public enum Gender {
    FEMALE("woman"),
    MAN("man");

    private String gender;

    public String getGender() {
        return gender;
    }

    Gender(String gender) {
        this.gender = gender;
    }
}