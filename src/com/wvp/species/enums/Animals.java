package com.wvp.species.enums;

public enum Animals {
    // Species
    MAMMAL("mammal", "mammals"),
    EGGLAYING("egg-laying", "egg-layings"),
    PENGUIN("penguin", "penguins"),
    // Felines
    CHEETAH("cheetah", "cheetahs"),
    LION("lion", "lions"),
    LEOPARD("leopard", "leopards"),
    BLACK_PANTHER("black panther", "black panthers"),
    JAGUAR("jaguar", "jaguars"),
    SERVAL("serval", "servals"),
    CARACAL("caracal", "caracals"),
    // Pachyderms
    RHINOCEROS("rhino", "rhinos"),
    ELEPHANT("elephant", "elephants"),
    HIPPOPOTAMUS("hippopotamus", "hippopotamus"),
    // Other mammals
    GIRAFFE("giraffe", "giraffes"),
    // Birds
    SUGARBIRD("sugarbird", "sugarbirds"),
    // Reptiles
    CROCODILE("crocodile", "crocodiles"),
    MAMBA("black mamba", "black mambas");

    private final String species;
    private final String speciesPlural;

    Animals(String species, String speciesPlural) {
        this.species = species;
        this.speciesPlural = speciesPlural;
    }

    public String getSpecies() {
        return species;
    }

    public String getSpeciesPlural() {
        return speciesPlural;
    }
}
