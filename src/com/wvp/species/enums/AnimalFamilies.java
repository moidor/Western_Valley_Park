package com.wvp.species.enums;

public enum AnimalFamilies {
    // Families of animals
    // Mammals
    FELINE("feline"),
    OTHERMAMMAL("other mammal"),
    PACHYDERM("pachyderm"),
    // Egg-laying
    BIRD("bird"),
    OTHEREGGLAYING("other egg-laying"),
    REPTILE("reptile");

    // Attributes
    private final String family;

    AnimalFamilies(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }
}
