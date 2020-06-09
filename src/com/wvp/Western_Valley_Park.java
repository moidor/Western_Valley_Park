package com.wvp;

import com.wvp.people.Guard;
import com.wvp.people.repositories.GuardRepository;
import com.wvp.people.services.*;
import com.wvp.species.AnimalRepository;

import java.util.Scanner;

public class Western_Valley_Park {

    public static void main(String[] args) {
        System.out.println("Press \"Enter\" to launch the program.");
        Scanner input = new Scanner(System.in);
        String response;
        int userChoice;
        int response1;

        response = input.nextLine();


        // Boucle while
        while (true) {
            System.out.println("Choose in the menu : \n" +
                    "1. Quit \n" +
                    "2. Guard's activities \n" +
                    "3. Guard shooting an animal \n" +
                    "4. Scientists' activities \n" +
                    "5. Tour guides' activities \n" +
                    "6. Tourists' activities \n" +
                    "7. Poachers' activities");

            userChoice = input.nextInt();
            AnimalRepository animalRepository = new AnimalRepository();
            // Importation des services
                GuardService guardService = new GuardService();
                ScientistService scientistService = new ScientistService();
                TourGuideService tourGuideService = new TourGuideService();
                TouristService touristService = new TouristService();
                PoacherService poacherService = new PoacherService();


            switch (userChoice) {
                case 1:
                    System.out.println("Fin du programme");
                    break;

                case 2:
                    System.out.println("Search a guard : ");
                    guardService.getEveryGuard();
                    Scanner scanner1 = new Scanner(System.in);
                    String search1 = scanner1.nextLine();
                    if (search1.equals("quit")) {
                        System.out.println("Program stopped");
                        break;
                    }
                    guardService.guardActivities(search1);
                    break;

                case 3:
                    System.out.println("Search a guard who shot an animal : ");
                    Scanner scanner2 = new Scanner(System.in);
                    String search2 = scanner2.nextLine();
                    if (search2.equals("quit")) {
                        System.out.println("Program stopped");
                        break;
                    }
                    System.out.println("Write an animal name. If you do not know one, consult the list. ");
                    animalRepository.getEveryAnimal();
                    Scanner scanner3 = new Scanner(System.in);
                    String search3 = scanner3.nextLine();
                    GuardRepository guardRepository = new GuardRepository();
                    Guard instanceGuard = guardRepository.getGuardsList().get(0);
                    instanceGuard.shootAnimal(search2, search3);
                    break;

                case 4:
                    System.out.println("Search a scientist : ");
                    scientistService.getEveryScientist();
                    Scanner scanner4 = new Scanner(System.in);
                    Scanner scanner5 = new Scanner(System.in);
                    String search4 = scanner4.nextLine();
                    if (search4.equals("quit")) {
                        System.out.println("Program stopped");
                        break;
                    }
                    System.out.println("Search an animal name : ");
                    animalRepository.getEveryAnimal();
                    String search5 = scanner5.nextLine();
                    scientistService.scientistActivities(search4, search5);
                    break;

                case 5:
                    System.out.println("Search a tour guide : ");
                    Scanner scanner6 = new Scanner(System.in);
                    String search6 = scanner6.nextLine();
                    tourGuideService.tourGuideActivies(search6);
                    break;

                case 6:
                    System.out.println("Search a tourist by \n" +
                            "1. Name \n" +
                            "2. Nationality");
                    response1 = input.nextInt();
                    switch (response1) {
                        case 1:
                            System.out.println("List of tourists : ");
                            touristService.getEveryTourist();
                            Scanner scanner7 = new Scanner(System.in);
                            String search7 = scanner7.nextLine();
                            touristService.touristActivities(search7);
                            break;

                        case 2:
                            System.out.println("Search tourists by nationality : ");
                            Scanner scanner8 = new Scanner(System.in);
                            String search8 = scanner8.nextLine();
                            touristService.searchByNationality(search8);
                            break;
                    }
                    break;

                case 7:
                    System.out.println("Search a poacher : ");
                    poacherService.getEveryPoacher();
                    Scanner scanner9 = new Scanner(System.in);
                    String search8 = scanner9.nextLine();
                    if (search8.equals("quit")) {
                        System.out.println("Program stopped");
                        break;
                    }
                    System.out.println("Type an attacked animal by the poacher : ");
                    animalRepository.getEveryAnimal();
                    Scanner scanner10 = new Scanner(System.in);
                    String search10 = scanner10.nextLine();
                    poacherService.poacherActivities(search8, search10);
                    break;

                case 8:


                default:
                    //System.err.println("This is not a valid menu option! Please select another");
                    break;
            }

            /*try {
                if (response == 1) {

                    System.out.println();
                    if (response1 == 0) {


                    } else if (response1 == 2) {

                    }


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


    } */

            // Boucle do/while
        /*do {
            System.out.println("Choose in the menu : ");


                if (response == 1) {
                        System.out.println("1. Guard's activities \n" +
                            "2. Shooting an animal");
                        if (response1 == 1) {
                            GuardService guardService = new GuardService();
                            System.out.println("Search a guard : ");
                            Scanner scanner5 = new Scanner(System.in);
                            String search5 = scanner5.nextLine();
                            guardService.guardActivities(search5);

                        }
                    } else if (response1 == 2) {
                        System.out.println("Search a guard who shot an animal : ");
                        Scanner scanner11 = new Scanner(System.in);
                        String search11 = scanner11.nextLine();
                        Scanner scanner12 = new Scanner(System.in);
                        String search12 = scanner12.nextLine();
                        GuardRepository guardRepository = new GuardRepository();
                        Guard instanceGuard = guardRepository.getGuardsList().get(0);
                        instanceGuard.shootAnimal(search11, search12);
                    }

                else if (response == 2) {
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


        } while (true);*/




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



        // Poacher








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
}
