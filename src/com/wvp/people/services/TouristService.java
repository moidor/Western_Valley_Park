package com.wvp.people.services;

import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;
import com.wvp.people.repositories.TouristRepository;

import java.util.ArrayList;

public class TouristService {
    TouristRepository touristRepository = new TouristRepository();

    public String getTouristInstance(String name) {
        this.touristRepository.getTouristsList().get(0).getName();
        return name;
    }

    // Comment intégrer plusieurs ID à la fois
    public ArrayList<Tourist> getLesTouristesById(int touristId) {
        ArrayList<Tourist> listeDeTouristes = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getId() == touristId) {
                listeDeTouristes.add(t);
            }
        }
        return listeDeTouristes;
    }

    // ON CHERCHE UNIQUEMENT UN NOM
    public ArrayList<Tourist> searchByName(String name) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    public void touristActivities(String touristName) {
        Tourist foundTourist = this.searchByName(touristName).get(0);
        if (foundTourist.hasVisitedRegions()) {
            System.out.println(foundTourist.getName() + " still did not visit any region.");
        } else {
            System.out.println(foundTourist.getName() + " (Customer n° : " + foundTourist.getId()
                    + ")" + " visited " +
                    foundTourist.getVisitedRegions() + ". "
                    + foundTourist.takePicture("cheetah",
                    ParkRegions.ANTELOPESVALLEY.getRegionName() + "."));
        }
    }

    public ArrayList<Tourist> searchByNationality(String nationality) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristRepository.getTouristsList()) {
            if (t.getNationality().toLowerCase().contains(nationality.toLowerCase())) {
                result.add(t);
            }
        }
        StringBuilder foundTouristsByNationality = new StringBuilder();
        for (Tourist tourist : result) {
            foundTouristsByNationality.append(tourist.getName()).append(" ");
        }
        /*String conversionInString = foundTouristsByNationality.toString();
        String conversionInString1 = String.join(", ", conversionInString);*/
        System.out.println("Search result by nationality : " + foundTouristsByNationality);
        return result;
    }
}
