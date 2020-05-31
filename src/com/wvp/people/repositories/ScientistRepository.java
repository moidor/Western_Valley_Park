package com.wvp.people.repositories;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.enums.RangeOfExpertise;
import com.wvp.people.Scientist;

import java.util.ArrayList;

public class ScientistRepository {
    private final ArrayList<Scientist> scientistsList;

    public ScientistRepository() {
        this.scientistsList = new ArrayList<>();
        this.scientistInit();
    }

    private void scientistInit() {
        // Scientist instances
        Scientist julia = new Scientist(1, "Julia", 25, Gender.FEMALE.getGender(),
                Nationality.AMERICAN.getNationality(), Nationality.AMERICAN.getCountry(),
                RangeOfExpertise.FELINE.getRangeOfExpertise(), RangeOfExpertise.FELINE.getRangeOfExpertisePlural(),
                ParkRegions.ANTELOPESVALLEY.getRegionName());
        Scientist joshua = new Scientist(2, "Joshua", 32, Gender.MALE.getGender(),
                Nationality.DUTCH.getNationality(), Nationality.DUTCH.getCountry(),
                RangeOfExpertise.PACHYDERM.getRangeOfExpertise(), RangeOfExpertise.PACHYDERM.getRangeOfExpertisePlural(),
                ParkRegions.KUDUSCAMP.getRegionName());

        this.scientistsList.add(julia);
        this.scientistsList.add(joshua);
    }

    // Getter
    public ArrayList<Scientist> getScientistsList() {
        return scientistsList;
    }
}
