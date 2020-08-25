package com.wvp.species;

import com.wvp.enums.Gender;
import com.wvp.enums.ParkRegions;
import com.wvp.interfaces.animals_interfaces.searchByAnimal;
import com.wvp.models.Animal;
import com.wvp.species.egg_laying.Bird;
import com.wvp.species.egg_laying.OtherEggLaying;
import com.wvp.species.egg_laying.Reptile;
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

    public void returnSearchAnimalByName(String animalName) {
        for (Animal animal: this.animalList) {
            if (animal.getNickname().toLowerCase().contains(animalName)) {
                System.out.println("Name: " + animal.getNickname() + ", ID: " + animal.getId()
                        + ", gender: " + animal.getGender() + ", age: " + animal.getAge() +
                         ", species: " + animal.getSpecies() +
                        ", family: " + animal.getFamily() + ", weight in Kg: " + animal.getWeight() +
                        ", speed in km/h: " + animal.getSpeed() + ", Java class: " + animal.getClass());
            }
        }
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
        Feline speedy = new Feline(1, Animals.CHEETAH.getSpecies(), "Speedy", 14,68, 93, Gender.FEMALE.getAnimalGender(), AnimalFamilies.FELINE.getFamily(), ParkRegions.SPRINGBOKSTRIDE.getRegionName());

        // Pachyderm instances
        Pachyderm rhino = new Pachyderm(1, Animals.RHINOCEROS.getSpecies(), "Super Rhino", 20, 500, 60, AnimalFamilies.PACHYDERM.getFamily(), Gender.FEMALE.getAnimalGender(), ParkRegions.CEDARBERG.getRegionName());
        Pachyderm dumbo = new Pachyderm(2, Animals.ELEPHANT.getSpecies(), "Dumbo", 27, 1000, 23, AnimalFamilies.PACHYDERM.getFamily(), Gender.FEMALE.getAnimalGender(), ParkRegions.SPRINGBOKSTRIDE.getRegionName());

        // Other mammal instances
        OtherMammal giraffe = new OtherMammal(1, Animals.GIRAFFE.getSpecies(), "Gigi", 12, 700, 60, AnimalFamilies.OTHERMAMMAL.getFamily(), Gender.FEMALE.getAnimalGender(), ParkRegions.FYNBOSLAND.getRegionName(), 2);

        // Other egg-laying instances
        OtherEggLaying penguin = new OtherEggLaying(1, Animals.PENGUIN.getSpecies(), "Pinguino", 5, 3, 10, AnimalFamilies.OTHEREGGLAYING.getFamily(), Gender.MALE.getAnimalGender(), ParkRegions.VANDYKSBAY.getRegionName());

        // Bird instances
        Bird suga = new Bird(1,
                Animals.SUGARBIRD.getSpecies(),
                "Suga",
                3,
                0.1,
                30,
                Gender.MALE.getAnimalGender(),
                AnimalFamilies.BIRD.getFamily(),
                ParkRegions.CAPESUGARBIRDPROTEA.getRegionName());

        // Reptile
        Reptile dundee = new Reptile(1, AnimalFamilies.REPTILE.getFamily(), "Dundee", 17, 200.00, 30, Gender.MALE.getAnimalGender(), Animals.CROCODILE.getSpecies(), ParkRegions.BUCHULAND.getRegionName());
        Reptile snaky = new Reptile(2, AnimalFamilies.REPTILE.getFamily(), "Snaky", 3, 1.6, 20, Gender.FEMALE.getAnimalGender(), Animals.MAMBA.getSpecies(), ParkRegions.TABLEMOUNTAIN.getRegionName());

        this.animalList.add(speedy);
        this.animalList.add(rhino);
        this.animalList.add(dumbo);
        this.animalList.add(giraffe);
        this.animalList.add(penguin);
        this.animalList.add(suga);
        this.animalList.add(dundee);
        this.animalList.add(snaky);
    }

}
