package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Animal;
import com.wvp.models.Human;
import com.wvp.people.services.GuardService;
import com.wvp.people.services.PoacherService;
import com.wvp.species.AnimalRepository;

import java.io.Serializable;
import java.util.Arrays;

public class Guard extends Human implements carryWeapons, Serializable {
    // Attributes
    private String vehicle;
    private String liveRoundsRifle;
    private final String[] arrestedPoachers;

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

    public String arrestPeople() {
        return "The " + getNationality() + " guard called " + getName() + " arrested "
                + getArrestedPoachers() + " the poacher.";
    }

    public String guardIntroduction() {
        return "Name: " + getName() + ", ID: " + getId()
                + ", gender: " + getGender() + ", age: " + getAge() +
                ", live rounds rifle: " + getLiveRoundsRifle() +
                ", visited regions: " + getVisitedRegions() + ", vehicle: " + getVehicle()
                + ", Java class: " + getClass();
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

    public String shootPoacher(String guardName, String poacherName) {
        PoacherService poacherService = new PoacherService();
        GuardService guardService = new GuardService();
        Guard foundGuard = guardService.searchByName(guardName).get(0);
        Poacher foundPoacher = poacherService.searchByName(poacherName).get(0);
        return "In self-defense, the " + foundGuard.getNationality() + " guard "
                + foundGuard.getName() + " shot the " + foundPoacher.getNationality() + " poacher "
                + foundPoacher.getName() + " with a " +
                foundGuard.getLiveRoundsRifle() + ". " + foundPoacher.getName() +
                " was threatening with a " + foundPoacher.getLiveRoundsRifle() +
                " and also owned " + foundPoacher.getBladedWeapon() + ".";
    }

    // Overriding of "toString()" method
    @Override
    public String toString() {
        return "Guard - " + super.toString() +
                " {'vehicle='" + vehicle + '\'' +
                ", liveRoundsRifle='" + liveRoundsRifle + '\'' +
                ", arrestedPoachers=" + Arrays.toString(arrestedPoachers) +
                '}';
    }

    // carryWeapon interface's methods
    @Override
    public boolean canCarryWeapons() {
        return true;
    }

    @Override
    public String shootAnimal(String guardName, String animalName) {
        AnimalRepository animalRepository = new AnimalRepository();
        GuardService guardService = new GuardService();
        Guard foundGuard = guardService.searchByName(guardName).get(0);
        Animal foundAnimal = animalRepository.searchByAnimalName(animalName).get(0);
        System.out.println("In self-defense, the " + foundGuard.getNationality() + " guard "
                + foundGuard.getName() + " shot " + foundAnimal.getNickname() + " with a " +
                foundGuard.getLiveRoundsRifle() + ".");
        return null;
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
