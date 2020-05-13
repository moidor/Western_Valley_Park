package com.wvp.people.services.tourists;

import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;

import java.util.ArrayList;

public class TouristService {
    private final ArrayList<Tourist> touristList;

    // Constructeur
    public TouristService() {
        this.touristList = new ArrayList<>();
        this.init();
    }

    private void init() {
        // French tourists
        Tourist brigitte = new Tourist(1, "Brigitte", 64,
                Nationality.FRENCH.getNationality(), ParkRegions.KUDUSCAMP.getRegionName(),
                ParkRegions.ANTELOPESVALLEY.getRegionName(), ParkRegions.ROOIBOSBERG.getRegionName(),
                ParkRegions.BUCHULAND.getRegionName());
        Tourist ziad = new Tourist(2, "Ziad", 1,
                Nationality.FRENCH.getNationality(), ParkRegions.MUIZENBERG.getRegionName(),
                ParkRegions.CAPESUGARBIRDPROTEA.getRegionName(), ParkRegions.GANSBAII.getRegionName());
        Tourist dina = new Tourist(3, "Dina", 4, Nationality.FRENCH.getNationality());
        // Canadian tourists
        Tourist jacques = new Tourist(4, "Jacques", 73, Nationality.CANADIAN.getNationality(),
                ParkRegions.TABLEMOUNTAIN.getRegionName(), ParkRegions.NAMIBIANREDDESERT.getRegionName());


        this.touristList.add(brigitte);
        this.touristList.add(ziad);
        this.touristList.add(dina);
        this.touristList.add(jacques);
    }

    public ArrayList<Tourist> getTouristList() {
        return this.touristList;
    }

    // ON CHERCHE UNIQUEMENT UN NOM
    public ArrayList<Tourist> searchByName(String name) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristList) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    public void touristActivities(String touristName) {
        Tourist foundTourist = this.searchByName(touristName).get(0);
        if (!foundTourist.hasVisitedRegions()) {
            System.out.println(foundTourist.getName() + " n'a pas encore visité de régions.");
        } else {
            System.out.println(foundTourist.getName() + " (n° client : " + foundTourist.getId()
                    + ")" + " visited " +
                    foundTourist.getVisitedRegions() + ". "
                    + foundTourist.takePicture("cheetah",
                    ParkRegions.ANTELOPESVALLEY.getRegionName() + "."));
        }
    }

    public ArrayList<Tourist> searchByNationality(String nationality) {
        ArrayList<Tourist> result = new ArrayList<>();
        for (Tourist t: this.touristList) {
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
        System.out.println("Search result : " + foundTouristsByNationality);
        return result;
    }

    /*public void touristNationality(String nationality) {
        ArrayList<Tourist> foundTouristsByNation = new ArrayList<>();
        Tourist touristNationInstance = this.searchByNationality(nationality).get(0);
        foundTouristsByNation.add(touristNationInstance);

        System.out.println(foundTouristsByNation);
    }*/
}
