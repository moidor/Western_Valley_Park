package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;
//GENERICITE AVEC LES ANIMAUX POUR LES SCIENTIFIQUES

public class Scientist extends Human implements carryWeapons {
    // Attributes/fields
    private final String rangeOfExpertise;
    private final String rangeOfExpertisePlural;

    // Constructor
    public Scientist(int id, String name, int age, String gender, String nationality, String country,
                     String rangeOfExpertise, String rangeOfExpertisePlural, String... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
        this.rangeOfExpertise = rangeOfExpertise;
        this.rangeOfExpertisePlural = rangeOfExpertisePlural;
    }

    // Method(s)
    public String treatAnimal(String scientistName, String animalName) {
        return scientistName + " treats " + animalName + ".";
    }

    public String getRangeOfExpertise() {
        return rangeOfExpertise;
    }

    public String getRangeOfExpertisePlural() {
        return rangeOfExpertisePlural;
    }

    // Implemented methods
    @Override
    public boolean canCarryWeapons() {
        return false;
    }

    @Override
    public String shootAnimal(String humanName, String animalName) {
        return null;
    }

    // Overriden methods
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
    public boolean stillDidNotVisitRegion() {
        return super.stillDidNotVisitRegion();
    }

    @Override
    public String takePicture(String animalName, String animalFamily, String animalRegion) {
        return super.takePicture(animalName, animalFamily, animalRegion);
    }
}
