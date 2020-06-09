package com.wvp.people.services;

import com.wvp.models.Animal;
import com.wvp.people.Scientist;
import com.wvp.people.repositories.ScientistRepository;
import com.wvp.species.AnimalRepository;

import java.util.ArrayList;

public class ScientistService {
    // import of repositories
    ScientistRepository scientistRepository = new ScientistRepository();
    AnimalRepository animalRepository = new AnimalRepository();

    public ArrayList<Scientist> searchByName(String name) {
        ArrayList<Scientist> result = new ArrayList<>();
        for (Scientist sc: this.scientistRepository.getScientistsList()) {
            if (sc.getName().toLowerCase().contains(name)) {
                result.add(sc);
            }
        }
        return result;
    }

    public void scientistActivities(String scientistName, String animalName) {
        Scientist foundScientist = this.searchByName(scientistName).get(0);
        Animal foundAnimal = this.animalRepository.searchByAnimalName(animalName).get(0);
        if (foundScientist.getRangeOfExpertise().equals(foundAnimal.getFamily())) {
            System.out.println(foundScientist.getName() + " from " + foundScientist.getCountry()
            + " is taking care of " + foundAnimal.getNickname() + " the " + foundAnimal.getSpecies() +
            ". " + foundScientist.treatAnimal(foundScientist.getName(), foundAnimal.getNickname()));
        } else {
            System.out.println(foundScientist.getName() +
                    ", specialist of " + foundScientist.getRangeOfExpertisePlural()
                    + "," + " cannot treat " + foundAnimal.getNickname() +
                    " which belongs to the " + foundAnimal.getFamily() + " family.");
        }
    }

    public void getEveryScientist() {
        for (Scientist scientist : this.scientistRepository.getScientistsList()) {
            System.out.println("Name : " + scientist.getName() + ", nationality : " + scientist.getNationality() +
                    ", gender : " + scientist.getGender() +
                    ", expertise : " + scientist.getRangeOfExpertisePlural() + ", visited regions : " + scientist.getVisitedRegions() + ".");
        }
    }

}
