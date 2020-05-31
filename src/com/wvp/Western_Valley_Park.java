package com.wvp;

import com.wvp.exceptions.InputTypeError;
import com.wvp.exceptions.NoNameException;
import com.wvp.people.Guard;
import com.wvp.people.repositories.GuardRepository;
import com.wvp.people.services.*;
import com.wvp.species.AnimalRepository;
import com.wvp.species.mammals.Services.FelineService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Western_Valley_Park {

    public static void main(String[] args) throws InputTypeError {

        Scanner sc = new Scanner(System.in);
        int response;
        int response1;
        // Boucle while
        while (true) {
            System.out.println("Choose in the menu : ");
            //assert false;
            response = sc.nextInt();
            try {
                if (response == 1) {
                    GuardService guardService = new GuardService();
                    System.out.println("Search a guard : ");
                    Scanner scanner5 = new Scanner(System.in);
                    String search5 = scanner5.nextLine();
                    System.out.println("Search a guard who shot an animal : ");
                    Scanner scanner11 = new Scanner(System.in);
                    String search11 = scanner11.nextLine();
                    Scanner scanner12 = new Scanner(System.in);
                    String search12 = scanner12.nextLine();
                    guardService.guardActivities(search5);
                    GuardRepository guardRepository = new GuardRepository();
                    Guard instanceGuard = guardRepository.getGuardsList().get(0);
                    instanceGuard.shootAnimal(search11, search12);
                } else if (response == 2) {
                    System.out.println("Show every animal : ");
                    System.out.println("Search an animal by name : ");
                    AnimalRepository animalRepository = new AnimalRepository();
                    // boucle pour afficher les animaux
                    animalRepository.getEveryAnimal();
                } else if (response == 3) {
                    System.out.println("Fin du programme");
                    break;
                } else if (response == 4) {
                    // Animal
                    System.out.println("Search by animal family");
                    Scanner scanner9 = new Scanner(System.in);
                    String search9 = scanner9.nextLine();
                    AnimalRepository animalRepository = new AnimalRepository();
                    animalRepository.getAnimalsBySpecies(search9);
                }
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
                e.getMessage();
            }


        }


        /*// Guard
        GuardService guardService = new GuardService();
        System.out.println("Search a guard : ");
        Scanner scanner5 = new Scanner(System.in);
        String search5 = scanner5.nextLine();
        System.out.println("Search a guard");
        Scanner scanner11 = new Scanner(System.in);
        String search11 = scanner11.nextLine();
        Scanner scanner12 = new Scanner(System.in);
        String search12 = scanner12.nextLine();
        guardService.guardActivities(search5);
        GuardRepository guardRepository = new GuardRepository();
        Guard instanceGuard = guardRepository.getGuardsList().get(0);
        instanceGuard.shootAnimal(search11, search12);



        // Animal
        System.out.println("Search by animal family");
        Scanner scanner9 = new Scanner(System.in);
        String search9 = scanner9.nextLine();
        AnimalRepository animalRepository = new AnimalRepository();
        animalRepository.getAnimalsBySpecies(search9);

        // Scientist
        ScientistService scientistService = new ScientistService();
        System.out.println("Search a scientist : ");
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        String search6 = scanner6.nextLine();
        String search8 = scanner8.nextLine();
        scientistService.scientistActivities(search6, search8);

        // Feline
        *//*FelineService felineService = new FelineService(animalRepository);
        System.out.println("Search a feline : ");
        Scanner scanner7 = new Scanner(System.in);
        String search7 = scanner7.nextLine();
        felineService.animalActivities(search7);*//*

        // Appel de TouristService
        TouristService touristService = new TouristService();
        // Chercher un touriste afin d'afficher les régions visitées
        System.out.println("Type a tourist name : ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        touristService.touristActivities(search);
        // Chercher un touriste en fonction de sa nationalité
        System.out.println("Type a tourist nationality : ");
        Scanner scanner2 = new Scanner(System.in);
        String search2 = scanner2.nextLine();
        touristService.searchByNationality(search2);

        // Tour guides
        TourGuideService tourGuideService = new TourGuideService();
        System.out.println("Type a tour guide name : ");
        Scanner scanner3 = new Scanner(System.in);
        String search3 = scanner3.nextLine();
        tourGuideService.tourGuideActivies(search3);

        // Poacher
        PoacherService poacherService = new PoacherService();
        System.out.println("Search poacher : ");
        // condition sur le nombre minimum de caractères lors de la recherche
        Scanner scanner4 = new Scanner(System.in);
        String search4 = scanner4.nextLine();
        Scanner scanner10 = new Scanner(System.in);
        String search10 = scanner10.nextLine();
        poacherService.poacherActivities(search4, search10);







        *//*ArrayList<Tourist> resultList = touristService.searchByName(search);
        for (Tourist foundTourist: resultList) {
            System.out.println(foundTourist.getName() + " visited "
                    + foundTourist.getVisitedRegions() + ". "
                    + foundTourist.takePicture("cheetah", ParkRegions.KUDUSCAMP.getRegionName()));
        }*//*

        *//* Scanner scannerNationality = new Scanner(System.in);
        String searchByNationality = scannerNationality.nextLine();
        ArrayList<Tourist> resultListByNationality = touristService.searchByNationality(searchByNationality);
        for (Tourist result: resultListByNationality) {
            System.out.println(result.getName());
        }*//*



*//*
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
        System.out.println(brigitte.getName() + " is " + brigitte.getNationality());*//*

        // HashMap avec input clavier
*//*
        HashMap<Integer, String> touristes = new HashMap();
        touristes.put(1, "Brigitte");
        touristes.put(2, "Ziad");
        touristes.put(3, "Dina");
        // Interaction clavier
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1. Quelle fiche client voulez-vous afficher ?");
        int touristKey = scanner1.nextInt();
        System.out.println(touristes.getOrDefault(touristKey, "Client inexistant dans la base de données."));

*//*
        // Interaction clavier
        *//*Scanner scanner2 = new Scanner(System.in);
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
