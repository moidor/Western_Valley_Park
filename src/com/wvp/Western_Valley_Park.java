package com.wvp;

import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;
import com.wvp.species.mammals.Feline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Western_Valley_Park {

    public static void main(String[] args) {
        Tourist brigitte = new Tourist(1, "Brigitte", 64,
                Nationality.FRENCH.getNationality(), ParkRegions.KUDUSCAMP.getRegionName(),
                ParkRegions.ANTELOPESVALLEY.getRegionName(), ParkRegions.ROOIBOSBERG.getRegionName());

        Feline cheetah = new Feline("cheetah", 10);
        // Region enum
        ParkRegions kuduscamp = ParkRegions.KUDUSCAMP;
        // Picture taken by Brigitte
        brigitte.takePicture(cheetah.getName(), kuduscamp.getRegionName());
        System.out.println(brigitte.getName() + " a visité "
                + brigitte.getVisitedRegions());

        // Méthode surcharge canCarryWeapon
        System.out.println(brigitte.getName() +
                brigitte.canCarryWeapon(" ne peut pas tenir une arme durant les visites de " +
                brigitte.getVisitedRegions()));

        // Nationality
        Nationality french = Nationality.FRENCH;
        System.out.println(brigitte.getName() + " is " + brigitte.getNationality());

        // HashMap avec input clavier
        HashMap<Integer, String> touristes = new HashMap();
        touristes.put(1, "Brigitte");
        touristes.put(2, "Ziad");
        touristes.put(3, "Dina");
        // Interaction clavier
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1. Quelle fiche client voulez-vous afficher ?");
        int touristKey = scanner1.nextInt();
        System.out.println(touristes.getOrDefault(touristKey, "Client inexistant dans la base de données."));

        // Interaction clavier
        Scanner scanner = new Scanner(System.in);
        System.out.println("2. Quel(le) touriste voulez-vous afficher ?");
        int touristId = scanner.nextInt();
        if (touristId == 1) {
            System.out.println("Vous avez tapé : " + touristId + " pour le prénom de " +
                    brigitte.getName());
        } else {
            System.out.println("Contact inconnu");
        }

    }
}
