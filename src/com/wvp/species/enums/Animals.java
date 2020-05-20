package com.wvp.species.enums;

public enum Animals {
    MAMMAL("mammal", "mammals"),
    EGGLAYING("egg-laying", "egg-layings"),
    // Felines
    CHEETAH("cheetah", "cheetahs"),
    LION("lion", "lions"),
    LEOPARD("leopard", "leopards"),
    BLACK_PANTHER("black panther", "black panthers"),
    JAGUAR("jaguar", "jaguars"),
    SERVAL("serval", "servals"),
    CARACAL("caracal", "caracals"),
    RHINOCEROS("rhino", "rhinos");

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
