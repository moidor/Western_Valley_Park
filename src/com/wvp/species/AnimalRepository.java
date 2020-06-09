package com.wvp.species;

import com.wvp.enums.Gender;
import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.models.Animal;
import com.wvp.species.enums.AnimalFamilies;
import com.wvp.species.enums.Animals;
import com.wvp.species.mammals.Feline;
import com.wvp.species.mammals.OtherMammal;
import com.wvp.species.mammals.Pachyderm;

import java.util.ArrayList;

public class AnimalRepository implements searchByAnimal {
    // Déclaration d'une variable VIDE dans la mémoire du PC afin de la remplir après
    private final ArrayList<Animal> animalList;

    public AnimalRepository() {
        // Instanciation de la liste et son remplissage après avec la méthode "animalInit()"
        this.animalList = new ArrayList<>();
        this.animalInit();
    }

    // Getters
    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }



    public ArrayList<Feline> getFelineList() {
        ArrayList<Feline> result = new ArrayList<>();
        for (Animal animal:this.animalList) {
            if (animal instanceof Feline) {
                result.add((Feline) animal);
            }
        }
        return result;
    }

    public ArrayList<Pachyderm> getPachydermList() {
        ArrayList<Pachyderm> result = new ArrayList<>();
        for (Animal pachyderm:this.animalList) {
            if (pachyderm instanceof Pachyderm) {
                result.add((Pachyderm) pachyderm);
            }
        }
        return result;
    }

    public void getEveryAnimal() {
        for (Animal animal: this.animalList) {
            System.out.println(animal.getNickname() + ", the " + animal.getSpecies() + " from the " +
                    animal.getFamily() + " family.");
        }
    }

    // Generic method
    public <T extends Animal> void getAnimalsBySpecies(String animalFamily) {
        ArrayList<T> result = new ArrayList<>();
        for (Animal animal:this.animalList) {
            if (animal.getFamily().toLowerCase().contains(animalFamily)) {
                result.add((T) animal);
            }
        }
        StringBuilder foundGenericAnimalFamily = new StringBuilder();
        for (Animal animal : result) {
            foundGenericAnimalFamily.append(animal.getNickname()).append(" - ");
        }
        System.out.println("Search result by animal family : " + foundGenericAnimalFamily);
    }

    @Override
    public ArrayList<Animal> searchByAnimalName(String animalName) {
        ArrayList<Animal> result = new ArrayList<>();
        for (Animal animal: this.animalList) {
            if (animal.getNickname().toLowerCase().contains(animalName)) {
                result.add(animal);
            }
        }
        return result;
    }

    @Override
    public void animalActivities(String searchedAnimal) {

    }

    //*** Animal instances ***//
    private void animalInit() {
        // Feline instances
        Feline cheetah = new Feline(1, Animals.CHEETAH.getSpecies(), AnimalFamilies.FELINE.getFamily(),
                "Speedy", 14,68, 93, Gender.FEMALE.getAnimalGender());

        // Pachyderm instances
        Pachyderm rhino = new Pachyderm(1, Animals.RHINOCEROS.getSpecies(), AnimalFamilies.PACHYDERM.getFamily(),
                "Super Rhino", 20, 500, 60, Gender.FEMALE.getAnimalGender());
        Pachyderm dumbo = new Pachyderm(2, Animals.ELEPHANT.getSpecies(), AnimalFamilies.PACHYDERM.getFamily(),
                "Dumbo", 27, 1000, 23, Gender.FEMALE.getAnimalGender());

        // Other mammals
        OtherMammal giraffe = new OtherMammal(1, Animals.GIRAFFE.getSpecies(), AnimalFamilies.OTHERMAMMAL.getFamily(),
                "Gigi", 12, 700, 60, Gender.FEMALE.getAnimalGender(), 4);

        this.animalList.add(cheetah);
        this.animalList.add(rhino);
        this.animalList.add(dumbo);
        this.animalList.add(giraffe);
    }

}
