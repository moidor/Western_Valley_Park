package com.wvp.tests;

import com.wvp.enums.Gender;
import com.wvp.enums.ParkRegions;
import com.wvp.models.Animal;
import com.wvp.species.AnimalRepository;
import com.wvp.species.enums.AnimalFamilies;
import com.wvp.species.enums.Animals;
import com.wvp.species.mammals.Feline;
import com.wvp.species.mammals.Services.FelineService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FelineServiceTest {

    FelineService felineService = new FelineService();
    AnimalRepository animalRepository = new AnimalRepository();
    ArrayList<Animal> animalArrayList = animalRepository.getAnimalList();

    @Test
    void getFelinesList() {
        assertNotNull(felineService);
    }

    @Test
    void getFelineInstance() {
        assertNotNull(felineService.getFelineInstance("Speedy"));
        var speedy = felineService.getFelinesList().get(0);
        assertTrue(felineService.getFelinesList().contains(speedy));
        // Création d'un nouveau félin à insérer dans la liste de son espèce
        Feline leopardy = new Feline(1, AnimalFamilies.FELINE.getFamily(), "Leopardy", 8, 40, 35, Gender.FEMALE.getAnimalGender(), Animals.LEOPARD.getSpecies(), ParkRegions.KUDUSCAMP.getRegionName());
        //Feline leopardyTest = new Feline(1, AnimalFamilies.FELINE.getFamily(), "LeopardyTest", 8, 40, 35, Gender.FEMALE.getAnimalGender(), Animals.LEOPARD.getSpecies(), ParkRegions.KUDUSCAMP.getRegionName());
        animalArrayList.ensureCapacity(20);
        animalArrayList.add(9, leopardy);
        //animalRepository.getAnimalList().set(0, leopardyTest);
        assertTrue(animalRepository.getFelineList().contains(leopardy));
        assertEquals(animalRepository.getAnimalList().get(9).getNickname(), "Leopardy");
        //System.out.println(animalRepository.getAnimalList().get(0).getNickname());
    }

    @Test
    void searchByAnimalName() {
        assertFalse(animalRepository.getFelineList().isEmpty());
        assertEquals(animalRepository.getFelineList().get(0).getNickname(), "Speedy");
    }

    @Test
    void animalActivities() {
    }
}