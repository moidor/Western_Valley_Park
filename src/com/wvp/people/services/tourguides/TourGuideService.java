package com.wvp.people.services.tourguides;

import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.TourGuide;
import com.wvp.people.services.tourists.TouristService;

import java.util.ArrayList;
import java.util.Arrays;

public class TourGuideService {
    private final ArrayList<TourGuide> tourGuidesList;

    public TourGuideService() {
        this.tourGuidesList = new ArrayList<>();
        this.init();
    }

    public void init() {
        // Import touristService
        TouristService touristService = new TouristService();
        //ArrayList<Tourist> listeDeTouristes = touristService.getTouristList();
        /*Tourist touristInstance = touristService;*/

        // Liste des guides touristiques
        TourGuide frank = new TourGuide(1, "Frank", 36,
                Nationality.SOUTH_AFRICAN.getNationality(),
                new String[]{"Dina", "Brigitte", "Ziad"},
                touristService.getTouristInstance(2),
                ParkRegions.KIRSTENBOSCH.getRegionName(),
                ParkRegions.STELLENBOSCH.getRegionName());
        TourGuide michelle = new TourGuide(2, "Michelle", 27,
                Nationality.NAMIBIAN.getNationality(),
                new String[]{"Jacques"},
                touristService.getTouristInstance(3),
                ParkRegions.BUCHULAND.getRegionName(),
                ParkRegions.NAMIBIANREDDESERT.getRegionName(),
                ParkRegions.TABLEMOUNTAIN.getRegionName());

        this.tourGuidesList.add(frank);
        this.tourGuidesList.add(michelle);
    }

    public ArrayList<TourGuide> getTourGuidesList() {
        return tourGuidesList;
    }

    public ArrayList<TourGuide> searchByName(String name) {
        ArrayList<TourGuide> result = new ArrayList<>();
        for (TourGuide t: this.tourGuidesList) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    public void tourGuideActivies(String tourGuideName) {
        TourGuide foundTourGuide = this.searchByName(tourGuideName).get(0);
        System.out.println(foundTourGuide.getName() + " makes " +
                foundTourGuide.getTourist().getName() + " - " + foundTourGuide.getGroupOfTourists()
        + " visit " + foundTourGuide.getTourist().getVisitedRegions() + ".");
    }
}
