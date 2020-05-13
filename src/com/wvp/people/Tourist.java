package com.wvp.people;

import com.wvp.interfaces.humans_interfaces.carryWeapons;
import com.wvp.models.Human;

public class Tourist extends Human implements carryWeapons {
    private final String nationality;
    private final String[] visitedRegions;
    private final int id;

    public Tourist(int id, String name, int age, String nationality, String ... visitedRegions) {
        super(name, age);
        this.id = id;
        this.nationality = nationality;
        this.visitedRegions = visitedRegions;
    }

    public int getId() {
        return id;
    }

    public String getNationality() {
        return nationality;
    }

    /*public void getTouristsListByNation() {
        return ;
    }*/

    // Method(s)
    // untel a pris tel animal/telle région en photo (system.out) avec scanner, sélectionner un animal qui sera ensuite
    // intégré dans le résultat (system.out)
    public String takePicture(String animalName, String visitedRegion) {
        return getName() + " took a picture of a " + animalName + " in " + visitedRegion;
    }

    // Aucune région encore visitée
    public boolean hasVisitedRegions() {
        return visitedRegions.length > 0;
    }

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
            String secondToLastIndex = visitedRegions[visitedRegions.length -2];
            String lastIndex = visitedRegions[visitedRegions.length - 1];
            String visitedRegionsString = String.join(", ", visitedRegions);
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
        return String.join("", visitedRegions);
    }
}
