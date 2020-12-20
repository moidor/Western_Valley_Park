package com.wvp;

import com.wvp.models.Animal;
import com.wvp.people.Guard;
import com.wvp.people.repositories.GuardRepository;
import com.wvp.people.services.*;
import com.wvp.species.AnimalRepository;
import com.wvp.streams.File_buffer;
import com.wvp.streams.Serialization;

import java.util.ArrayList;
import java.util.HashMap;
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
                    "1. Animals \n" +
                    "2. Guard's activities \n" +
                    "3. Scientists' activities \n" +
                    "4. Tour guides' activities \n" +
                    "5. Tourists' activities \n" +
                    "6. Poachers' activities \n" +
                    "7. Options \n");

            userChoice = input.nextInt();

            // Initialisation des services et des repositories
                AnimalRepository animalRepository = new AnimalRepository();
                GuardService guardService = new GuardService();
                ScientistService scientistService = new ScientistService();
                TourGuideService tourGuideService = new TourGuideService();
                TouristService touristService = new TouristService();
                PoacherService poacherService = new PoacherService();


            switch (userChoice) {
                case 1:
                    System.out.println("Search an animal by \n" +
                            "1. Name \n" +
                            "2. Species \n" +
                            "3. See every animal \n");
                    response1 = input.nextInt();
                    // Afficher toutes les espèces animales disponibles
                    switch (response1) {
                        case 1 -> {
                            Scanner scannerAnimalName = new Scanner(System.in);
                            System.out.println("Search by animal name: ");
                            String searchedAnimalName = scannerAnimalName.nextLine();
                            //animalRepository.returnSearchedAnimalByName(researchAnimalName);
                            // Programmation fonctionnelle
                            animalRepository.returnSearchedAnimalByName2.accept(searchedAnimalName);
                        }
                        case 2 -> {
                            Scanner scannerAnimalName1 = new Scanner(System.in);
                            System.out.println("Search by animal species: ");
                            String animalNameResearch1 = scannerAnimalName1.nextLine();
                            animalRepository.getAnimalsBySpecies(animalNameResearch1);
                        }
                        case 3 -> animalRepository.getEveryAnimal();
                    }
                    break;

                case 2:
                    System.out.println("Search a guard \n" +
                            "1. Name \n" +
                            "2. Shooting an animal in self-defense \n" +
                            "3. Shooting a poacher in self-defense \n" +
                            "4. Arresting a poacher");
                    response1 = input.nextInt();
                    switch (response1) {
                        case 1 -> {
                            System.out.println("Search a guard: ");
                            guardService.getEveryGuard();
                            Scanner scannerGuard = new Scanner(System.in);
                            String searchGuard = scannerGuard.nextLine();
                            if (searchGuard.equals("quit")) {
                                System.out.println("Program stopped");
                                break;
                            }
                            guardService.getSearchedGuardByName(searchGuard);
                        }
                        case 2 -> {
                            System.out.println("Search a guard who shot an animal in self-defense: ");
                            guardService.getEveryGuard();
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
                            Guard guard = guardRepository.getGuardsList().get(0);
                            guard.shootAnimal(search2, search3);
                        }
                        case 3 -> {
                            System.out.println("Search a guard who shot a poacher in self-defense: ");
                            guardService.getEveryGuard();
                            Scanner scanner5 = new Scanner(System.in);
                            String search5 = scanner5.nextLine();
                            if (search5.equals("quit")) {
                                System.out.println("Program stopped");
                                break;
                            }
                            System.out.println("Write a poacher name. If you do not know one, consult the list. ");
                            poacherService.getEveryPoacher();
                            Scanner scanner6 = new Scanner(System.in);
                            String search6 = scanner6.nextLine();
                            guardService.guardShootingPoacher(search5, search6);
                        }
                        case 4 -> {
                            System.out.println("Search a guard to know which poacher he has arrested: ");
                            guardService.getEveryGuard();
                            Scanner scanner1 = new Scanner(System.in);
                            String search1 = scanner1.nextLine();
                            if (search1.equals("quit")) {
                                System.out.println("Program stopped");
                                break;
                            }
                            guardService.guardActivities(search1);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Search a scientist: ");
                    scientistService.getEveryScientist();
                    Scanner scanner4 = new Scanner(System.in);
                    Scanner scanner5 = new Scanner(System.in);
                    String search4 = scanner4.nextLine();
                    if (search4.equals("quit")) {
                        System.out.println("Program stopped");
                        break;
                    }
                    System.out.println("Search an animal name: ");
                    animalRepository.getEveryAnimal();
                    String search5 = scanner5.nextLine();
                    scientistService.scientistActivities(search4, search5);
                    break;

                case 4:
                    System.out.println("Search a tour guide: ");
                    tourGuideService.getEveryTourGuide();
                    Scanner scanner6 = new Scanner(System.in);
                    String search6 = scanner6.nextLine();
                    tourGuideService.tourGuideActivies(search6);
                    break;

                case 5:
                    System.out.println("Search a tourist by \n" +
                            "1. Name \n" +
                            "2. Nationality \n" +
                            "3. Take a picture");
                    response1 = input.nextInt();
                    switch (response1) {
                        case 1:
                            System.out.println("List of tourists: ");
                            touristService.getEveryTourist();
                            Scanner scanner7 = new Scanner(System.in);
                            String search7 = scanner7.nextLine();
                            touristService.touristActivities(search7);
                            break;

                        case 2:
                            System.out.println("Search tourists by nationality: ");
                            Scanner scanner8 = new Scanner(System.in);
                            String search8 = scanner8.nextLine();
                            touristService.searchByNationality(search8);
                            break;

                        case 3:
                            System.out.println("Enter a tourist and an animal name to photograph an animal !");
                            Scanner scanner8Bis = new Scanner(System.in);
                            String search8Bis = scanner8Bis.nextLine();
                            Scanner scanner8Bis1 = new Scanner(System.in);
                            String search8Bis1 = scanner8Bis1.nextLine();
                            touristService.touristTakingPicture(search8Bis, search8Bis1);
                    }
                    break;

                case 6:
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

                case 7:
                    System.out.println("Select an option \n" +
                            "1. Quit \n" +
                            "2. Download \n" +
                            "3. Serialization");
                    response1 = input.nextInt();
                    switch (response1) {
                        case 1:
                            System.out.println("Fin du programme");
                            break;

                //  Ne fonctionne pas encore
                        case 2:
                            File_buffer file_buffer = new File_buffer();
                            file_buffer.fileCreation();
                            break;

                        case 3:
                            Serialization serialization = new Serialization();
                            serialization.SerializeObjects();
                            break;
                    }

                default:
                    //System.out.println("This is not a valid menu option ! Please select another.");
                    break;
            }

        }
    }
}
