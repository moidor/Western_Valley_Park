package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class Tourist extends Human implements carryWeapons {

    public Tourist(int id, String name, int age, String gender, String nationality, String country, String ... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
    }

    @Override
    public String takePicture(String animalName, String visitedRegion) {
        return super.takePicture(animalName, visitedRegion);
    }

    @Override
    public boolean hasVisitedRegions() {
        return super.hasVisitedRegions();
    }

    // Surcharge
    public String canCarryWeapon(String message) {
        return message;
    }

    @Override
    public boolean canCarryWeapons() {
        return false;
    }

    @Override
    public String shootAnimal(String animalName) {
        return null;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    /*@Override
    public String getVisitedRegions() {
        if (visitedRegions.length == 2) {
            return String.join(" and ", visitedRegions);
        }
        else if (visitedRegions.length > 2) {
            String secondToLastIndex = visitedRegions[visitedRegions.length -2];
            String lastIndex = visitedRegions[visitedRegions.length - 1];
            String visitedRegionsString = String.join(", ", visitedRegions);
            *//* Le prog. va supprimer l'avant-dernier et le dernier index, les virgules avant et après l'avant-dernier index,
            * puis rajouter l'avant-dernier et dernier index afin d'éviter les doublons. *//*
            if (visitedRegionsString.contains(secondToLastIndex + ",")) {
                // Suppression de l'avant-dernier index
                String removalSecondToLastIndex = visitedRegionsString.replace(secondToLastIndex, "");
                // Suppression du dernier index
                String removalLastIndex = removalSecondToLastIndex.replace(lastIndex, "");
                return removalLastIndex.replace(" ,", "") + secondToLastIndex + "" + " and " + lastIndex;
            }
        }
        return String.join("", visitedRegions);
    }*/
}
