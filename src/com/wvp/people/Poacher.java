package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class Poacher extends Human implements carryWeapons {
    // Attributes
    private String liveRoundsRifle;
    private String bladedWeapon;
    protected String[] killedAnimals;

    // Constructor
    public Poacher(int id, String name, int age, String gender, String nationality, String country, String liveRoundsRifle,
                   String bladedWeapon,
                   String... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
        this.liveRoundsRifle = liveRoundsRifle;
        this.bladedWeapon = bladedWeapon;
    }

    // carryWeapon interface's methods
    @Override
    public boolean canCarryWeapons() {
        return true;
    }

    @Override
    // Intégrer un paramètre référençant le lieu d'origine de l'animal pour l'afficher dans le retour
    public String shootAnimal(String animalName) {
        return "A " + getNationality() + " poacher called " + getName() + " killed a " + animalName +
                " with a " + getLiveRoundsRifle() + ".";
    }

    // Method(s)
    public String getLiveRoundsRifle() {
        return liveRoundsRifle;
    }

    public void setLiveRoundsRifle(String liveRoundsRifle) {
        this.liveRoundsRifle = liveRoundsRifle;
    }

    public String getBladedWeapon() {
        return bladedWeapon;
    }

    public void setBladedWeapon(String bladedWeapon) {
        this.bladedWeapon = bladedWeapon;
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
}
