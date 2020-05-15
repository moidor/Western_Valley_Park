package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class TourGuide extends Human implements carryWeapons {
    protected String[] groupOfTourists;

    public TourGuide(int id, String name, int age, String gender,
                     String nationality,
                     String country,
                     String[] groupOfTourists,
                     String... visitedRegions) {
        super(id, name, age, gender, nationality, country, visitedRegions);
        this.groupOfTourists = groupOfTourists;
    }

    public String getGroupOfTourists() {
        if (groupOfTourists.length == 2) {
            return String.join(" and ", groupOfTourists);
        }
        else if (groupOfTourists.length > 2) {
            String secondToLastIndex = groupOfTourists[groupOfTourists.length -2];
            String lastIndex = groupOfTourists[groupOfTourists.length - 1];
            String visitedRegionsString = String.join(", ", groupOfTourists);
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
        return String.join("", groupOfTourists);
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
    public boolean hasVisitedRegions() {
        return super.hasVisitedRegions();
    }

    @Override
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getVisitedRegions() {
        return super.getVisitedRegions();
    }

    @Override
    public String takePicture(String animalName, String visitedRegion) {
        return super.takePicture(animalName, visitedRegion);
    }
}
