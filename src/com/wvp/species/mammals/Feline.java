package com.wvp.species.mammals;

import com.wvp.interfaces.animals_interfaces.canSwim;
import com.wvp.interfaces.animals_interfaces.carnivore;
import com.wvp.models.Animal;

public class Feline extends Animal implements carnivore, canSwim {
    public Feline(int id, String species, String nickname, int age, int weight, int speed, String gender) {
        super(id, species, nickname, age, weight, speed, gender);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }

    @Override
    public String getNickname() {
        return super.getNickname();
    }

    @Override
    public void setNickname(String nickname) {
        super.setNickname(nickname);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public void isImmobile() {
        super.isImmobile();
    }

    // Implemented methods
    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

    // REDEFINIR LE CORPS DE LA METHODE AVEC UNE CONDITION POUR AFFICHER L ARTICLE DEFINI A OU AN
    // EN FONCTION DU SUBSTANTIF SUIVANT DE L ANIMAL QUI EMANERA DIRECTEMENT DE L ENUM ANIMALS
    @Override
    public String isHunting(String animalSpecies) {
        return getNickname() + ", the " + getSpecies() + " is hunting a " + animalSpecies + ".";
    }
}
