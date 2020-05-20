package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.enums.RangeOfExpertise;
import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.people.Scientist;
import com.wvp.species.AnimalRepository;
import com.wvp.species.mammals.Feline;
import com.wvp.species.mammals.Services.FelineService;

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
                RangeOfExpertise.FELINE.getRangeOfExpertise(), ParkRegions.ANTELOPESVALLEY.getRegionName());
        Scientist joshua = new Scientist(2, "Joshua", 32, Gender.MALE.getGender(),
                Nationality.DUTCH.getNationality(), Nationality.DUTCH.getCountry(),
                RangeOfExpertise.PACHYDERM.getRangeOfExpertise(), ParkRegions.KUDUSCAMP.getRegionName());

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

    FelineService felineService = new FelineService();
    public void scientistActivities(String scientistName, String animalName) {
        Scientist foundScientist = this.searchByName(scientistName).get(0);
        Feline foundFeline = this.felineService.getFelinesList().get(0);
        System.out.println(foundScientist.getName() + " from " + foundScientist.getCountry()
                + " is taking care of " + foundFeline.getNickname() + " the " + foundFeline.getSpecies() +
                ". " + foundScientist.treatAnimal(foundScientist.getName(), foundFeline.getNickname()));
    }

    /*public void scientistActivies(String scientistName, String animalName) {
        Scientist foundScientist = this.searchByName(scientistName).get(0);
        Feline foundFeline = (Feline) this.searchByAnimalSpecies(animalName).get(0);
        if (foundScientist.getRangeOfExpertise().equals(foundFeline.getSpecies())) {
            System.out.println(foundScientist.getName() + " from " + foundScientist.getCountry()
                    + " is taking care of " + foundFeline.getNickname() + " the " + foundFeline.getSpecies() +
                    ". " + foundScientist.treatAnimal(foundScientist.getName(), foundFeline.getNickname())
            );
        } else {
            System.out.println(foundScientist.getName() + " ne peut pas soigner cet animal...");
        }
    }*/
}
