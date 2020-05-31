package com.wvp.interfaces.animals_interfaces;

import com.wvp.models.Animal;

import java.util.ArrayList;

public interface searchByAnimal {
    ArrayList<Animal> searchByAnimalName(String animalName);

    void animalActivities(String searchedAnimal);
}
