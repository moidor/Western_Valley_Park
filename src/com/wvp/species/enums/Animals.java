package com.wvp.species.enums;

public enum Animals {
    // Felines
    CHEETAH("cheetah", "cheetahs"),
    LION("lion", "lions"),
    LEOPARD("leopards", "leopards"),
    BLACK_PANTHER("black panther", "black panthers");

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
