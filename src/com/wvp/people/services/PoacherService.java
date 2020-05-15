package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Poacher;

import java.util.ArrayList;

public class PoacherService {
    private final ArrayList<Poacher> poachersList;

    public PoacherService() {
        this.poachersList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // Poacher instances
        // Ajouter un tableau d'animaux tués
        Poacher john = new Poacher(1, "John", 43, Gender.MALE.getGender(), Nationality.MOZAMBICAN.getNationality(),
                Nationality.MOZAMBICAN.getCountry(), "shotgun", "machete",
                ParkRegions.KUDUSCAMP.getRegionName());
        Poacher mark = new Poacher(2, "Mark", 37, Gender.MALE.getGender(), Nationality.NAMIBIAN.getNationality(),
                Nationality.NAMIBIAN.getCountry(), "assault rifle", "sword",
                ParkRegions.NAMIBIANREDDESERT.getRegionName());

        poachersList.add(john);
        poachersList.add(mark);
    }

    // Show the list of poachers
    public ArrayList<Poacher> getPoachersList() {
        return poachersList;
    }

    // Get poacher instance
    public String getPoacherInstance(String name) {
        this.poachersList.get(0).getName();
        return name;
    }

    public ArrayList<Poacher> searchByName(String poacherName) {
        ArrayList<Poacher> result = new ArrayList<>();
        for (Poacher p: this.poachersList) {
            if (p.getName().toLowerCase().contains(poacherName)) {
                result.add(p);
            }
        }
        return result;
    }

    public void poacherActivities(String poacherName) {
       Poacher foundPoacher = this.searchByName(poacherName).get(0);
       // System.out.println("The " + foundPoacher.getNationality() + " poacher " + foundPoacher.getName());
        System.out.println(foundPoacher.shootAnimal("giraffe"));
    }
}
