package com.wvp;

import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;
import com.wvp.people.services.tourists.TouristService;
import com.wvp.species.mammals.Feline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Western_Valley_Park {

    public static void main(String[] args) {
        // Appel de TouristService
        TouristService touristService = new TouristService();
        // Chercher un touriste afin d'afficher les régions visitées
        System.out.println("Entrez le nom d'un touriste : ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        touristService.touristActivities(search);
        // Chercher un touriste en fonction de sa nationalité
        System.out.println("Entrez une nationalité : ");
        Scanner scanner2 = new Scanner(System.in);
        String search2 = scanner2.nextLine();
        touristService.searchByNationality(search2);



        /*ArrayList<Tourist> resultList = touristService.searchByName(search);
        for (Tourist foundTourist: resultList) {
            System.out.println(foundTourist.getName() + " visited "
                    + foundTourist.getVisitedRegions() + ". "
                    + foundTourist.takePicture("cheetah", ParkRegions.KUDUSCAMP.getRegionName()));
        }*/

        /* Scanner scannerNationality = new Scanner(System.in);
        String searchByNationality = scannerNationality.nextLine();
        ArrayList<Tourist> resultListByNationality = touristService.searchByNationality(searchByNationality);
        for (Tourist result: resultListByNationality) {
            System.out.println(result.getName());
        }*/



/*
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
        System.out.println(brigitte.getName() + " is " + brigitte.getNationality());*/

        // HashMap avec input clavier
/*
        HashMap<Integer, String> touristes = new HashMap();
        touristes.put(1, "Brigitte");
        touristes.put(2, "Ziad");
        touristes.put(3, "Dina");
        // Interaction clavier
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1. Quelle fiche client voulez-vous afficher ?");
        int touristKey = scanner1.nextInt();
        System.out.println(touristes.getOrDefault(touristKey, "Client inexistant dans la base de données."));

*/
        // Interaction clavier
        /*Scanner scanner2 = new Scanner(System.in);
        System.out.println("2. Quel(le) touriste voulez-vous afficher ?");
        int touristId = scanner2.nextInt();
        if (touristId == 1) {
            System.out.println("Vous avez tapé : " + touristId + " pour le prénom de " +
                    brigitte.getName());
        } else {
            System.out.println("Contact inconnu");
        }*/

    }

}
