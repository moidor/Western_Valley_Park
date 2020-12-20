package com.wvp.tests;
import com.wvp.models.Animal;
import com.wvp.people.Tourist;
import com.wvp.people.repositories.TouristRepository;
import com.wvp.species.AnimalRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TouristServiceTest {

    TouristRepository touristRepository = new TouristRepository();
    AnimalRepository animalRepository = new AnimalRepository();

    @Test
    void getTouristInstance() {
        System.out.println("Ce touriste existe bien dans la liste.");
        Assertions.assertNotNull(touristRepository.getTouristInstance("nozomi"));
        // Test de l'existence d'un touriste
        var ziad = touristRepository.getTouristsList().get(2);
        assertTrue(touristRepository.getTouristsList().contains(ziad));
        // Test d'échec
        var paysDeMariette = touristRepository.getTouristsList().get(4);
        assertFalse(paysDeMariette.getCountry().equalsIgnoreCase("Irlande"));
        // Test null (si on met à "null" le pays du touriste "Brigitte")
        //assertNull(touristRepository.getTouristsList().get(0).getCountry());
    }

    @Test
    void getLesTouristesById() {
    }

    @Test
    void getEveryTourist() {
        Assertions.assertNotNull(touristRepository.getTouristsList());
    }

    @Test
    void searchByName() {
        assertEquals(touristRepository.getTouristsList().get(2).getName(), "Dina");
        System.out.println("La liste de touristes n'est pas vide.");
            assertFalse(touristRepository.getTouristsList().isEmpty());
    }

    @Test
    void touristActivities() {
    }

    @Test
    void touristTakingPicture() {
        // Miyamoto - index 6
        Tourist touristInstance = touristRepository.getTouristsList().get(6);
        // Suga le Sugarbird du Cap
        Animal animalInstance = this.animalRepository.getAnimalList().get(5);
        assertTrue(touristInstance.getName().equalsIgnoreCase("miyamoto"));
        assertEquals(touristInstance.getName(), "Miyamoto");
        assertEquals(animalInstance.getNickname(), "Suga");
        assertTrue(touristInstance.stillDidNotVisitRegion());
        assertFalse(touristInstance.getVisitedRegions().contains(animalInstance.getRegionOfOrigin()));
    }

    @Test
    void searchByNationality() {
        assertEquals(touristRepository.getTouristsList().get(0).getNationality(), "French");
        assertEquals(touristRepository.getTouristsList().size(), 7);
    }
}