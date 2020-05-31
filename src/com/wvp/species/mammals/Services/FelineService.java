package com.wvp.species.mammals.Services;

import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.models.Animal;
import com.wvp.species.AnimalRepository;
import com.wvp.species.mammals.Feline;

import java.util.ArrayList;

public class FelineService implements searchByAnimal {
    private final AnimalRepository animalRepository;

    public FelineService() {
        this.animalRepository = new AnimalRepository();
    }

    // Getters
    public ArrayList<Feline> getFelinesList() {
        return this.animalRepository.getFelineList();
    }

    public String getFelineInstance(String name) {
        this.animalRepository.getFelineList().get(0).getNickname();
        return name;
    }

    @Override
    public ArrayList<Animal> searchByAnimalName(String felineName) {
        return null;
    }

    @Override
    public void animalActivities(String searchedAnimal) {
        /*Feline foundFeline = this.searchByAnimalSpecies(searchedAnimal).get(0);
        System.out.println(foundFeline.isCarnivore());*/
    }
}
