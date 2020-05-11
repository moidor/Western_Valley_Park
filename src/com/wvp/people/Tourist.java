package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

import java.util.Arrays;

public class Tourist extends Human implements carryWeapons {
    private final String nationality;
    private final String[] visitedRegions;
    private int id;

    public Tourist(int id, String name, int age, String nationality, String ... visitedRegions) {
        super(name, age);
        this.id = id;
        this.nationality = nationality;
        this.visitedRegions = visitedRegions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    // Method(s)
    // untel a pris tel animal/telle région en photo (system.out) avec scanner, sélectionner un animal qui sera ensuite
    // intégré dans le résultat (system.out)
    public void takePicture(String animalName, String visitedRegion) {
        System.out.println(getName() + " took a picture of a " + animalName + " in " + visitedRegion);
    };

    // Surcharge
    public String canCarryWeapon(String message) {
        return message;
    }

    @Override
    public boolean canCarryWeapon() {
        return false;
    }

    @Override
    public boolean shootAnimal() {
        return false;
    }

    @Override
    public String getVisitedRegions() {
        if (visitedRegions.length == 2) {
            return String.join(" and ", visitedRegions);
        }
        else if (visitedRegions.length > 2) {
            String lastIndex = visitedRegions[visitedRegions.length - 1];
            return String.join(", ", visitedRegions)+ " and " + lastIndex;
        }
        return String.join(", ", visitedRegions);
    }
}
