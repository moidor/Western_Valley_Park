package com.wvp.people.repositories;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.TourGuide;
import com.wvp.people.services.TouristService;

import java.util.ArrayList;

public class TourGuideRepository {
    private final ArrayList<TourGuide> tourGuidesList;

    public TourGuideRepository() {
        this.tourGuidesList = new ArrayList<>();
        this.init();
    }

    public void init() {
        // Import touristService
        TouristService touristService = new TouristService();
        //ArrayList<Tourist> listeDeTouristes = touristService.getTouristList();
        /*Tourist touristInstance = touristService;*/

        // Liste des guides touristiques
        TourGuide frank = new TourGuide(1, "Frank", 36, Gender.MALE.getGender(),
                Nationality.SOUTH_AFRICAN.getNationality(),
                Nationality.SOUTH_AFRICAN.getCountry(),
                new String[]{touristService.getTouristInstance("Dina"),
                        touristService.getTouristInstance("Brigitte"),
                        touristService.getTouristInstance("Ziad")},
                ParkRegions.KIRSTENBOSCH.getRegionName(),
                ParkRegions.STELLENBOSCH.getRegionName());
        TourGuide michelle = new TourGuide(2, "Michelle", 27,Gender.FEMALE.getGender(),
                Nationality.NAMIBIAN.getNationality(),
                Nationality.NAMIBIAN.getCountry(),
                new String[]{touristService.getTouristInstance("Jacques"),
                        touristService.getTouristInstance("Mariette")},
                ParkRegions.BUCHULAND.getRegionName(),
                ParkRegions.NAMIBIANREDDESERT.getRegionName(),
                ParkRegions.TABLEMOUNTAIN.getRegionName());

        this.tourGuidesList.add(frank);
        this.tourGuidesList.add(michelle);
    }

    public ArrayList<TourGuide> getTourGuidesList() {
        return tourGuidesList;
    }
}
