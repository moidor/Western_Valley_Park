package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;

import java.util.ArrayList;

public class TouristService {
    private final ArrayList<Tourist> touristsList;

    // Constructeur
    public TouristService() {
        this.touristsList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // French tourists
        Tourist brigitte = new Tourist(1, "Brigitte", 64, Gender.FEMALE.getGender(),
                Nationality.FRENCH.getNationality(), Nationality.FRENCH.getCountry(),
                ParkRegions.KUDUSCAMP.getRegionName(),
                ParkRegions.ANTELOPESVALLEY.getRegionName(), ParkRegions.ROOIBOSBERG.getRegionName(),
                ParkRegions.BUCHULAND.getRegionName());
        Tourist ziad = new Tourist(2, "Ziad", 1, Gender.MALE.getGender(),
                Nationality.FRENCH.getNationality(), Nationality.FRENCH.getCountry(),
                ParkRegions.MUIZENBERG.getRegionName(),
                ParkRegions.CAPESUGARBIRDPROTEA.getRegionName(), ParkRegions.GANSBAII.getRegionName());
        Tourist dina = new Tourist(3, "Dina", 4, Gender.FEMALE.getGender(),
                Nationality.FRENCH.getNationality(), Nationality.FRENCH.getCountry());
        // Canadian tourists
        Tourist jacques = new Tourist(4, "Jacques", 73, Gender.MALE.getGender(),
                Nationality.CANADIAN.getNationality(), Nationality.CANADIAN.getCountry(),
                ParkRegions.TABLEMOUNTAIN.getRegionName(), ParkRegions.NAMIBIANREDDESERT.getRegionName());
        Tourist mariette = new Tourist(5, "Mariette", 75, Gender.FEMALE.getGender(),
                Nationality.CANADIAN.getNationality(), Nationality.CANADIAN.getCountry(),
                ParkRegions.TABLEMOUNTAIN.getRegionName(), ParkRegions.NAMIBIANREDDESERT.getRegionName());


        this.touristsList.add(brigitte);
        this.touristsList.add(ziad);
        this.touristsList.add(dina);
        this.touristsList.add(jacques);
        this.touristsList.add(mariette);
    }

    public String getTouristInstance(String name) {
        this.touristsList.get(0).getName();
        return name;
    }

    // Comment intégrer plusieurs ID à la fois
    public ArrayList<Tourist> getLesTouristesById(int touristId) {
        ArrayList<Tourist> listeDeTouristes = new ArrayList<>();
        for (Tourist t: this.touristsList) {
            if (t.getId() == touristId) {
                listeDeTouristes.add(t);
            }
        }
        return listeDeTouristes;
    }

    // ON CHERCHE UNIQUEMENT UN NOM
    public ArrayList<Tourist> searchByName(String name) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristsList) {
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
        for (Tourist t: this.touristsList) {
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
