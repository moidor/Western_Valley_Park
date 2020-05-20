package com.wvp.species;

import com.wvp.enums.Gender;
import com.wvp.models.Animal;
import com.wvp.species.enums.Animals;
import com.wvp.species.mammals.Feline;
import com.wvp.species.mammals.Pachyderm;

import java.util.ArrayList;

public class AnimalRepository {
    private static final Object T = null;
    // Déclaration d'une variable vide dans la mémoire du PC afin de la remplir après
    private final ArrayList<Animal> animalList;

    public AnimalRepository() {
        // Instanciation de la liste et son remplissage après
        this.animalList = new ArrayList<>();
        this.animalInit();
    }

    // Getter
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
        for (Animal animal:this.animalList) {
            if (animal instanceof Pachyderm) {
                result.add((Pachyderm) animal);
            }
        }
        return result;
    }

    public <T extends Animal> ArrayList<T> getList() {
        Class<T> type;
        ArrayList<T> result = new ArrayList<T>();
        for (Animal animal:this.animalList) {
            if (this.animalList.contains(T)) {
                result.add((T) animal);
            }
        }
        return result;
    }

    private void animalInit() {
        // Feline instances
        Feline cheetah = new Feline(1, Animals.CHEETAH.getSpecies(),
                "Speedy", 14,
                68, 93, Gender.FEMALE.getAnimalGender());

        Pachyderm rhino = new Pachyderm(2, Animals.RHINOCEROS.getSpecies(),
                "Super Rhino", 20, 500, 60, Gender.FEMALE.getAnimalGender());

        this.animalList.add(cheetah);
        this.animalList.add(rhino);
    }

}
