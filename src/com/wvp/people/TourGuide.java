package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

import java.util.ArrayList;
import java.util.List;

public class TourGuide extends Human implements carryWeapons {
    private final String nationality;
    private final String[] visitedRegions;
    private final int id;
    private List<Tourist> groupOfTourists;

    public TourGuide(int id, String name, int age, String nationality,
                     List<Tourist> groupOfTourists, String... visitedRegions) {
        super(name, age);
        this.id = id;
        this.nationality = nationality;
        this.groupOfTourists = groupOfTourists;
        this.visitedRegions = visitedRegions;
    }

    public String getNationality() {
        return nationality;
    }

    public int getId() {
        return id;
    }

    public List<Tourist> getGroupOfTourists() {
        return groupOfTourists;
    }

    public void setGroupOfTourists(List<Tourist> groupOfTourists) {
        this.groupOfTourists = groupOfTourists;
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
            String regionVisitees = String.join(", ", visitedRegions);
            // Suppression du dernier index afin d'intégrer le mot "and" avant la dernière région
            String supprDernierIndex = regionVisitees.replace(lastIndex, "");
            return supprDernierIndex + "and " + lastIndex;
        }
        return String.join(", ", visitedRegions);
    }
}
