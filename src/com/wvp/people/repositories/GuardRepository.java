package com.wvp.people.repositories;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.exceptions.NoNameException;
import com.wvp.people.Guard;
import com.wvp.people.services.PoacherService;

import java.util.ArrayList;

public class GuardRepository {
    private final ArrayList<Guard> guardsList;

    public GuardRepository() {
        this.guardsList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // Import de PoacherService pour avoir accès à la liste
        PoacherService poacherService = new PoacherService();

        // Guard instances
        Guard theresa = new Guard(1, "Theresa", 29, Gender.FEMALE.getGender(), Nationality.SOUTH_AFRICAN.getNationality(),
                Nationality.SOUTH_AFRICAN.getCountry(),
                new String[]{poacherService.getPoacherInstance("Mark")},"Savannah Jeep", "hunting rifle",
                ParkRegions.KUDUSCAMP.getRegionName(), ParkRegions.CAPESUGARBIRDPROTEA.getRegionName(),
                ParkRegions.ANTELOPESVALLEY.getRegionName());
        Guard noah = new Guard(2, "Noah", 34, Gender.MALE.getGender(), Nationality.SOUTH_AFRICAN.getNationality(),
                Nationality.SOUTH_AFRICAN.getCountry(),
                new String[]{poacherService.getPoacherInstance("John")},"Savannah Jeep", "hunting rifle",
                ParkRegions.STELLENBOSCH.getRegionName());

        guardsList.add(theresa);
        guardsList.add(noah);
    }

    // Show the list of guards
    public ArrayList<Guard> getGuardsList() {
        return guardsList;
    }
}
