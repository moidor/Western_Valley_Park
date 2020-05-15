package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class Guard extends Human implements carryWeapons {
    // Attributes
    private String vehicle;
    private String liveRoundsRifle;
    private String[] arrestedPoachers;

    public Guard(int id, String name, int age, String gender, String nationality, String country,
                 String[] arrestedPoachers, String vehicle, String liveRoundsRifle, String... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
        this.vehicle = vehicle;
        this.liveRoundsRifle = liveRoundsRifle;
        this.arrestedPoachers = arrestedPoachers;
    }

    // Method(s)
    public boolean shootDart() {
        return true;
    }

    public String arrestPeople(String poacherName) {
        return "The " + getNationality() + " guard called " + getName() + " arrested "
                + getArrestedPoachers() + ".";
    }

    // Vehicle
    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    // Rifle
    public String getLiveRoundsRifle() {
        return liveRoundsRifle;
    }

    public void setLiveRoundsRifle(String liveRoundsRifle) {
        this.liveRoundsRifle = liveRoundsRifle;
    }

    // Show arrested poachers
    public String getArrestedPoachers() {
        if (arrestedPoachers.length == 2) {
            return String.join(" and ", arrestedPoachers);
        }
        else if (arrestedPoachers.length > 2) {
            String secondToLastIndex = arrestedPoachers[arrestedPoachers.length -2];
            String lastIndex = arrestedPoachers[arrestedPoachers.length - 1];
            String visitedRegionsString = String.join(", ", arrestedPoachers);
            /* Le prog. va supprimer l'avant-dernier et le dernier index, les virgules avant et après l'avant-dernier index,
             * puis rajouter l'avant-dernier et dernier index afin d'éviter les doublons. */
            if (visitedRegionsString.contains(secondToLastIndex + ",")) {
                // Suppression de l'avant-dernier index
                String removalSecondToLastIndex = visitedRegionsString.replace(secondToLastIndex, "");
                // Suppression du dernier index
                String removalLastIndex = removalSecondToLastIndex.replace(lastIndex, "");
                return removalLastIndex.replace(" ,", "") + secondToLastIndex + "" + " and " + lastIndex;
            }
        }
        return String.join("", arrestedPoachers);

    }

    // carryWeapon interface's methods
    @Override
    public boolean canCarryWeapons() {
        return true;
    }

    @Override
    public String shootAnimal(String animalName) {
        return "In self-defense, the " + getNationality() + " guard " + getName() + " killed a " + animalName + ".";

    }

    // Overriden methods from "Human"
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
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
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String getVisitedRegions() {
        return super.getVisitedRegions();
    }

    @Override
    public boolean hasVisitedRegions() {
        return super.hasVisitedRegions();
    }

    @Override
    public String takePicture(String animalName, String visitedRegion) {
        return super.takePicture(animalName, visitedRegion);
    }
}
