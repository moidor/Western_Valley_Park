package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Scientist;

import java.util.ArrayList;

public class ScientistService {
    private final ArrayList<Scientist> scientistsList;

    public ScientistService() {
        this.scientistsList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // Scientist instances
        Scientist julia = new Scientist(1, "Julia", 25, Gender.FEMALE.getGender(),
                Nationality.AMERICAN.getNationality(), Nationality.AMERICAN.getCountry(),
                "felines", ParkRegions.ANTELOPESVALLEY.getRegionName());

        this.scientistsList.add(julia);
    }

    public ArrayList<Scientist> getScientistsList() {
        return scientistsList;
    }

    public ArrayList<Scientist> searchByName(String name) {
        ArrayList<Scientist> result = new ArrayList<>();
        for (Scientist sc: this.scientistsList) {
            if (sc.getName().toLowerCase().contains(name)) {
                result.add(sc);
            }
        }
        return result;
    }

    public void scientistActivies(String scientistName) {
        Scientist foundScientist = this.searchByName(scientistName).get(0);
        System.out.println(foundScientist.getName() + " from " + foundScientist.getCountry()
                + " ... " //foundScientist.treatAnimal(foundScientist.getName(), )
                );
    }
}
