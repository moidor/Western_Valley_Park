package com.wvp.interfaces.animals_interfaces;

public interface carnivore {
    boolean isCarnivore();

    // REDEFINIR LE CORPS DE LA METHODE AVEC UNE CONDITION POUR AFFICHER L ARTICLE DEFINI A OU AN
    // EN FONCTION DU SUBSTANTIF SUIVANT DE L ANIMAL QUI ÉMANERA DIRECTEMENT DE L ENUM ANIMALS
    String isHunting(String animalSpecies);
}
