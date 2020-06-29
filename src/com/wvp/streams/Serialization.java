package com.wvp.streams;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Guard;
import com.wvp.people.repositories.GuardRepository;
import com.wvp.people.services.PoacherService;

import java.io.*;
import java.util.ArrayList;

public class Serialization {
    public void SerializeObjects() {
        // Déclaration des objets hors du try/catch
        ObjectInputStream ois;
        ObjectOutputStream oos;
        // Import de GuardService
        GuardRepository guardRepository = new GuardRepository();
        PoacherService poacherService = new PoacherService();

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream(new File("guard.txt"))
            ));

            // Instanciation d'un objet de type "Guard"
            for (Guard guard: guardRepository.getGuardsList()) {
                oos.writeObject(new Guard(guard.getId(), guard.getName(), guard.getAge(), guard.getGender(),
                        guard.getNationality(), guard.getCountry(), new String[]{guard.getArrestedPoachers()},
                        guard.getVehicle(), guard.getLiveRoundsRifle(), guard.getVisitedRegions()));
            }

            /*oos.writeObject(new Guard(1, "Theresa", 29, Gender.FEMALE.getGender(), Nationality.SOUTH_AFRICAN.getNationality(),
                    Nationality.SOUTH_AFRICAN.getCountry(),
                    new String[]{poacherService.getPoacherInstance("Mark")},"Savannah Jeep", "hunting rifle",
                    ParkRegions.KUDUSCAMP.getRegionName(), ParkRegions.CAPESUGARBIRDPROTEA.getRegionName(),
                    ParkRegions.ANTELOPESVALLEY.getRegionName()));*/
            /*oos.writeObject(new Game("Pro Evolution Soccer 2020", "Sport", 69.99));
            oos.writeObject(new Game("Tony Hawk Pro Skater 2", "Sport", 34.99));*/
            // TOUJOURS CLÔTURER LE FLUX
            oos.close();

            // Récupération des données
            ois = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream(new File("guard.txt"))
            ));
            /*ArrayList<ObjectInputStream> oisList = new ArrayList<>();
            oisList.add(ois);*/

            try {
                System.out.println("Affichage des jeux : ");
                System.out.println("**********\n");
                /*for (ObjectInputStream ois1: oisList) {
                    System.out.println(ois1.readObject().toString());
                    System.out.println(ois1.readObject().toString());

                }*/
                System.out.println(ois.readObject().toString());
                System.out.println(ois.readObject().toString());

            } catch (ClassNotFoundException e) {
                // La désérialisation d'un objet peut engender ce type d'erreur (ClassNotFoundException)
                e.printStackTrace();
            }

            ois.close();
            // Fin du premier try
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
