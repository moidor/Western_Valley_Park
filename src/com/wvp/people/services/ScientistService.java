package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.enums.RangeOfExpertise;
import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.models.Animal;
import com.wvp.people.Scientist;
import com.wvp.species.AnimalRepository;

import java.util.ArrayList;

public class ScientistService implements searchByAnimal {
    private final ArrayList<Scientist> scientistsList;

    public ScientistService() {
        this.scientistsList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // Scientist instances
        Scientist julia = new Scientist(1, "Julia", 25, Gender.FEMALE.getGender(),
                Nationality.AMERICAN.getNationality(), Nationality.AMERICAN.getCountry(),
                RangeOfExpertise.FELINE.getRangeOfExpertise(), RangeOfExpertise.FELINE.getRangeOfExpertisePlural(),
                ParkRegions.ANTELOPESVALLEY.getRegionName());
        Scientist joshua = new Scientist(2, "Joshua", 32, Gender.MALE.getGender(),
                Nationality.DUTCH.getNationality(), Nationality.DUTCH.getCountry(),
                RangeOfExpertise.PACHYDERM.getRangeOfExpertise(), RangeOfExpertise.PACHYDERM.getRangeOfExpertisePlural(),
                ParkRegions.KUDUSCAMP.getRegionName());

        this.scientistsList.add(julia);
        this.scientistsList.add(joshua);
    }

    public ArrayList<Scientist> getScientistsList() {
        return scientistsList;
    }

    public ArrayList<Scientist> searchByName(String name) {
        ArrayList<Scientist> result = new ArrayList<>();
        for (Scientist sc: this.scientistsList) {
            if (sc.getName().toLowerCase().contains(name)) {
                result.add(sc);
            }
        }
        return result;
    }

    @Override
    public ArrayList searchByAnimalSpecies(String animalName) {
        return null;
    }

    @Override
    public void animalActivities(String searchedAnimal) {

    }

    AnimalRepository animalRepository = new AnimalRepository();
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

}
