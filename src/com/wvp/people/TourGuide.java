package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

import java.util.ArrayList;

public class TourGuide extends Human implements carryWeapons {
    private final int id;
    protected String[] groupOfTourists;
    protected Tourist tourist;

    public TourGuide(int id, String name, int age, String nationality, String[] groupOfTourists,
                     Tourist tourist,
                     String... visitedRegions) {
        super(name, age, nationality, visitedRegions);
        this.id = id;
        this.groupOfTourists = groupOfTourists;
        this.tourist = tourist;
    }

    public int getId() {
        return id;
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

    public void setGroupOfTourists(String[] groupOfTourists) {
        this.groupOfTourists = groupOfTourists;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
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
