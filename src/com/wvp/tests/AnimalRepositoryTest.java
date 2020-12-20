package com.wvp.tests;

import com.wvp.enums.Gender;
import com.wvp.enums.ParkRegions;
import com.wvp.models.Animal;
import com.wvp.species.AnimalRepository;
import com.wvp.species.enums.AnimalFamilies;
import com.wvp.species.enums.Animals;
import com.wvp.species.mammals.Feline;
import com.wvp.species.mammals.Pachyderm;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class AnimalRepositoryTest {
    AnimalRepository animalRepository = new AnimalRepository();

    private static List<Pachyderm> getPachydermInstances() {
        return List.of(
                new Pachyderm(1, Animals.ELEPHANT.getSpecies(), "Dumbo", 8, 450, 25, Gender.FEMALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.ANTELOPESVALLEY.getRegionName()),
                new Pachyderm(2, Animals.ELEPHANT.getSpecies(), "Serge", 32, 859, 30, Gender.MALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.ANTELOPESVALLEY.getRegionName()),
                new Pachyderm(3, Animals.ELEPHANT.getSpecies(), "Frank", 15, 638, 32, Gender.MALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.ROOIBOSBERG.getRegionName()),
                new Pachyderm(4, Animals.ELEPHANT.getSpecies(), "Nono", 40, 800, 27, Gender.MALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.STELLENBOSCH.getRegionName()),
                new Pachyderm(5, Animals.ELEPHANT.getSpecies(), "Mimi", 42, 950, 26, Gender.FEMALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.BUCHULAND.getRegionName())
        );
    }

    @Test
    void getAnimalList() {
        // Polymorphisme
        for (Animal animal: animalRepository.getAnimalList()) {
            animal.animalSound();
        }

        System.out.println();
        ArrayList<Animal> returnAnimals = animalRepository.getAnimalList();
        returnAnimals.stream()
                .filter(animal -> animal.getNickname().startsWith("S"))
                .limit(2)
                .map(Animal::getNickname)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
    }

    @Test
    void getFelineList() {
        assertNotNull(animalRepository.getFelineList());
        assertFalse(animalRepository.getFelineList().isEmpty());
    }

    @Test
    void getPachydermList() {
        Pachyderm dumboTest = new Pachyderm(1, Animals.ELEPHANT.getSpecies(), "Dumbo-test", 8, 450, 25, Gender.FEMALE.getAnimalGender(), AnimalFamilies.PACHYDERM.getFamily(), ParkRegions.ANTELOPESVALLEY.getRegionName());
        assertEquals(dumboTest.getFamily(), "pachyderm");
        assertNotNull(animalRepository.getPachydermList());
        ArrayList<Pachyderm> pachydermArrayList = animalRepository.getPachydermList();
        pachydermArrayList.add(dumboTest);
        assertTrue(pachydermArrayList.contains(dumboTest));
        assertFalse(pachydermArrayList.isEmpty());
        assertTrue(pachydermArrayList.size() > 0);

        // Sort pachydermArrayList from animalRepository
        System.out.println("Stream to display Pachyderms instead of conditions");
        ArrayList<Animal> returnAnimals = animalRepository.getAnimalList();
        List<Animal> returnPachyderms = returnAnimals.stream()
                .filter(animal -> animal.getFamily()
                .equals(AnimalFamilies.PACHYDERM.getFamily()))
                .collect(Collectors.toList());
            returnPachyderms.forEach(System.out::println);

        assertTrue(returnPachyderms.stream()
                .allMatch(pachyderm -> pachyderm.getFamily().equals(AnimalFamilies.PACHYDERM.getFamily())));
        assertFalse(returnPachyderms.stream()
                .allMatch(pachyderm -> pachyderm.getFamily().equals(AnimalFamilies.FELINE.getFamily())));
        assertNotNull(returnPachyderms);
        System.out.println();


        // Poids moyen des pachydermes mâles
        double poidsMoyen = returnPachyderms.stream()
                .filter(animal -> animal.getGender().equals(Gender.MALE.getAnimalGender()))
                .mapToDouble(Animal::getWeight)
                .average()
                .orElse(0);
        System.out.println("Poids moyen d'un pachyderme mâle : " + poidsMoyen);

        // OPTIONAL ABOUT ANIMALS NOT LIVING IN ANTELOPE'S VALLEY, renvoie l'animal sinon "n'habite pas Antelope's Valley"
        /* System.out.println("Stream to display Pachyderms instead of conditions");
        ArrayList<Animal> returnAnimals2 = animalRepository.getAnimalList();
        List<Animal> returnPachyderms2 = returnAnimals2.stream()
                .filter(animal -> animal.getRegionOfOrigin()
                .equals(ParkRegions.ANTELOPESVALLEY.getRegionName()))
                .collect(Collectors.toList());
        returnPachyderms2.forEach(System.out::println);
        System.out.println();*/

        // Declarative approach ☺ (amigoscode)
        List<Pachyderm> pachydermList = getPachydermInstances();
        // Filter
        List<Pachyderm> femalePachyderms = pachydermList.stream()
                .filter(pachyderm -> pachyderm.getGender().equals(Gender.MALE.getAnimalGender()))
                .collect(Collectors.toList());
        //femalePachyderms.forEach(System.out::println);

        // Sort
        List<Pachyderm> sorted = pachydermList.stream()
                .sorted(Comparator.comparing(Pachyderm::getAge)
                        .thenComparing(Pachyderm::getNickname)
                        .reversed())
                .collect(Collectors.toList());
        // sorted.forEach(System.out::println);

        // All match
        boolean allMatch = pachydermList.stream().allMatch(pachyderm -> pachyderm.getAge() > 10);
        //System.out.println(allMatch);

        // Any match
        boolean anyMatch = pachydermList.stream().anyMatch(pachyderm -> pachyderm.getAge() > 10);
        //System.out.println(anyMatch);

        // None match
        boolean noneMatch = pachydermList.stream().noneMatch(pachyderm -> pachyderm.getNickname()
                .equals("Chamito"));
        //System.out.println(noneMatch);

        // Max
        pachydermList.stream().max(Comparator.comparing(Pachyderm::getAge));
                //.ifPresent(System.out::println);

        // Min
        pachydermList.stream().min(Comparator.comparing(Pachyderm::getAge));
                //.ifPresent(System.out::println);

        // Group
        Map<String, List<Pachyderm>> groupByGender = pachydermList.stream()
                .sorted(Comparator.comparing(Pachyderm::getNickname))
                .collect(Collectors.groupingBy(Pachyderm::getGender));

        groupByGender.forEach((gender, pachyderms) -> {
            System.out.println(gender.toUpperCase(Locale.ROOT));
            pachyderms.forEach(System.out::println);
            System.out.println();
        });

        // Oldest female
        Optional<String> oldestFemalePachyderm = pachydermList.stream()
                .filter(pachyderm -> pachyderm.getGender().equals(Gender.FEMALE.getAnimalGender()))
                .max(Comparator.comparing(Pachyderm::getAge))
                .map(Pachyderm::getNickname);
        oldestFemalePachyderm.ifPresent(System.out::println);
    }

    @Test
    void getEveryAnimal() {
        for (Animal animal : animalRepository.getAnimalList()) {
            //System.out.println(animal.getNickname());
            assertNotNull(animal.getNickname());
        }
    }

    @Test
    void getAnimalsBySpecies() {
        //TODO Méthode générique à tester !
/*        Feline felineGeneric = animalRepository.getAnimalsBySpecies("felines");
        assertT();*/

    }

    @Test
    void returnSearchAnimalByName() {
    }

    @Test
    void searchByAnimalName() {
    }

    @Test
    void animalActivities() {
    }
}