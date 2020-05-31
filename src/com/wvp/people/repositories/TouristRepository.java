package com.wvp.people.repositories;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Tourist;

import java.util.ArrayList;

public class TouristRepository {
    private final ArrayList<Tourist> touristsList;

    // Constructeur
    public TouristRepository() {
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

    public ArrayList<Tourist> getTouristsList() {
        return touristsList;
    }
}
