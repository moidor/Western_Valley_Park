package com.wvp.people.services;

import com.wvp.models.Animal;
import com.wvp.people.Poacher;
import com.wvp.people.repositories.PoacherRepository;
import com.wvp.species.AnimalRepository;

import java.util.ArrayList;

public class PoacherService {
    PoacherRepository poacherRepository = new PoacherRepository();
    AnimalRepository animalRepository = new AnimalRepository();

    // Get poacher instance
    public String getPoacherInstance(String name) {
        this.poacherRepository.getPoachersList().get(0).getName();
        return name;
    }

    public ArrayList<Poacher> searchByName(String poacherName) {
        ArrayList<Poacher> result = new ArrayList<>();
        for (Poacher p: this.poacherRepository.getPoachersList()) {
            if (p.getName().toLowerCase().contains(poacherName)) {
                result.add(p);
            }
        }
        return result;
    }

    public void poacherActivities(String poacherName, String animalName) {
       Poacher foundPoacher = this.searchByName(poacherName).get(0);
        Animal foundAnimal = this.animalRepository.searchByAnimalName(animalName).get(0);
       // System.out.println("The " + foundPoacher.getNationality() + " poacher " + foundPoacher.getName());
        //System.out.println(foundPoacher.shootAnimal(foundAnimal.getNickname()));
    }
}
