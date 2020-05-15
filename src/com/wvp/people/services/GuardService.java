package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Guard;
import com.wvp.people.Poacher;

import java.util.ArrayList;

public class GuardService {
    private final ArrayList<Guard> guardsList;

    public GuardService() {
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

    public ArrayList<Guard> searchByName(String guardName) {
        ArrayList<Guard> result = new ArrayList<>();
        for (Guard g: this.guardsList) {
            if (g.getName().toLowerCase().contains(guardName)) {
                result.add(g);
            }
        }
        return result;
    }

    public void guardActivities(String guardName) {
        Guard foundGuard = this.searchByName(guardName).get(0);
        System.out.println(foundGuard.arrestPeople("Josh"));
    }
}
