package com.wvp.enums;

public enum RangeOfExpertise {
    FELINE("feline", "felines"),
    PACHYDERM("pachyderm", "pachyderms"),
    BIRD("bird", "birds");

    private final String rangeOfExpertise;
    private final String rangeOfExpertisePlural;

    RangeOfExpertise(String rangeOfExpertise, String rangeOfExpertisePlural) {
        this.rangeOfExpertise = rangeOfExpertise;
        this.rangeOfExpertisePlural = rangeOfExpertisePlural;
    }

    public String getRangeOfExpertise() {
        return rangeOfExpertise;
    }

    public String getRangeOfExpertisePlural() {
        return rangeOfExpertisePlural;
    }
}
