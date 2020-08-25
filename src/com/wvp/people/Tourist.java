package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class Tourist extends Human implements carryWeapons {

    public Tourist(int id, String name, int age, String gender, String nationality, String country, String ... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
    }

    @Override
    public String takePicture(String animalName, String animalFamily, String animalRegion) {
        return super.takePicture(animalName, animalFamily, animalRegion);
    }

    @Override
    public boolean stillDidNotVisitRegion() {
        return super.stillDidNotVisitRegion();
    }

    // Surcharge rajouter override ainsi que dans les autres classes l'implémentant
    public String canCarryWeapons(String message) {
        return message;
    }

    @Override
    public boolean canCarryWeapons() {
        return false;
    }

    @Override
    public String shootAnimal(String humanName, String animalName) {
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

    @Override
    public String getVisitedRegions() {
        return super.getVisitedRegions();
    }
}
