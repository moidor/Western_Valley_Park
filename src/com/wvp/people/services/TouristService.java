package com.wvp.people.services;

import com.wvp.models.Animal;
import com.wvp.people.Tourist;
import com.wvp.people.repositories.TouristRepository;
import com.wvp.species.AnimalRepository;

import java.util.ArrayList;

public class TouristService {
    TouristRepository touristRepository = new TouristRepository();
    AnimalRepository animalRepository = new AnimalRepository();

    public String getTouristInstance(String name) {
        this.touristRepository.getTouristsList().get(0).getName();
        return name;
    }

    // Comment intégrer plusieurs ID à la fois
    public ArrayList<Tourist> getLesTouristesById(int touristId) {
        ArrayList<Tourist> listeDeTouristes = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getId() == touristId) {
                listeDeTouristes.add(t);
            }
        }
        return listeDeTouristes;
    }

    public void getEveryTourist() {
        for (Tourist tourist: this.touristRepository.getTouristsList()) {
            System.out.println(tourist.getName() +
                    ", gender: " + tourist.getGender() + ", from " + tourist.getCountry() + ".");
        }
    }

    // Recherche par nom en fonction d'un type générique
    public ArrayList<Tourist> searchByName(String name) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    public void touristActivities(String touristName) {
        Tourist foundTourist = this.searchByName(touristName).get(0);
        if (foundTourist.stillDidNotVisitRegion()) {
            System.out.println(foundTourist.getName() + " still did not visit any region.");
        } else {
            System.out.println("The " + foundTourist.getNationality() +
                    foundTourist.getName() + " (Customer n°" + foundTourist.getId()
                    + ")" + " visited " + foundTourist.getVisitedRegions() + ". ");
        }
    }

    public void touristTakingPicture(String touristName, String animalName) {
        Tourist foundTourist = this.searchByName(touristName).get(0);
        Animal foundAnimal = this.animalRepository.searchByAnimalName(animalName).get(0);
        if (foundTourist.stillDidNotVisitRegion())
            System.out.println(foundTourist.getName() + " still did not visit any region.");
        if (foundTourist.getVisitedRegions().contains(foundAnimal.getRegionOfOrigin())) {
            System.out.println(foundTourist.takePicture(foundAnimal.getNickname(), foundAnimal.getFamily(), foundAnimal.getRegionOfOrigin()));
        } else {
            System.out.println("Hum, it seems that " + foundTourist.getName() + " never visited " + foundAnimal.getRegionOfOrigin()
                    + " and can't snap " + foundAnimal.getNickname() + " as a result...");
        }
    }

    public ArrayList<Tourist> searchByNationality(String nationality) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getNationality().toLowerCase().contains(nationality.toLowerCase())) {
                result.add(t);
            }
        }
        StringBuilder foundTouristsByNationality = new StringBuilder();
        for (Tourist tourist : result) {
            foundTouristsByNationality.append(tourist.getName()).append(" ");
        }
        /*String conversionInString = foundTouristsByNationality.toString();
        String conversionInString1 = String.join(", ", conversionInString);*/
        System.out.println("Search result by nationality : " + foundTouristsByNationality);
        return result;
    }
}
