package com.wvp.species.mammals.Services;

import com.wvp.enums.Gender;
import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.species.enums.Animals;
import com.wvp.species.mammals.Feline;

import java.util.ArrayList;

public class FelineService implements searchByAnimal {
    private final ArrayList<Feline> felinesList;

    public FelineService() {
        this.felinesList = new ArrayList<>();
        this.init();
    }

    // Getter
    public ArrayList<Feline> getFelinesList() {
        return felinesList;
    }

    private void init() {
        // Feline instances
        Feline cheetah = new Feline(1, Animals.CHEETAH.getSpecies(), "Speedy", 14,
                68, 93, Gender.FEMALE.getAnimalGender());

        this.felinesList.add(cheetah);
    }

    @Override
    public ArrayList<Feline> searchByAnimalSpecies(String felineName) {
        ArrayList<Feline> result = new ArrayList<>();
        for (Feline f:this.felinesList) {
            if (f.getSpecies().toLowerCase().contains(felineName)) {
                result.add(f);
            }
        }
        return result;
    }

    @Override
    public void animalActivities(String searchedAnimal) {
        Feline foundFeline = this.searchByAnimalSpecies(searchedAnimal).get(0);
        System.out.println(foundFeline.isHunting("antelope"));
    }
}
