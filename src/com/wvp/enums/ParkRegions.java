package com.wvp.enums;

public enum ParkRegions {
    ROOIBOSBERG("Rooibosberg"),
    MUIZENBERG("Muizenberg"),
    KUDUSCAMP("Kudu's Camp"),
    ANTELOPESVALLEY("Antelopes' Valley"),
    CAPESUGARBIRDPROTEA("The Cape Sugarbird's Protea"),
    BUCHULAND("Buchu Land"),
    STELLENBOSCH("Stellenbosch"),
    KIRSTENBOSCH("Kirstenbosh"),
    GANSBAII("Gansbaii"),
    NAMIBIANREDDESERT("Namibian Red Desert"),
    TABLEMOUNTAIN("Table Mountain");

    private final String regionName;

    public String getRegionName() {
        return regionName;
    }

    ParkRegions(String regionName) {
        this.regionName = regionName;
    }
}
