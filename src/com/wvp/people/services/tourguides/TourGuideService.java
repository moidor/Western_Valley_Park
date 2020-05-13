package com.wvp.people.services.tourguides;

import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.TourGuide;
import com.wvp.people.Tourist;

import java.util.ArrayList;

public class TourGuideService {
    private final ArrayList<TourGuide> guideList;

    public TourGuideService(ArrayList<TourGuide> guideList) {
        this.guideList = guideList;
        this.init();
    }

    public void init() {
        /*// Liste des guides touristiques
        TourGuide frank = new TourGuide(1, "Frank", 36,
                Nationality.SOUTH_AFRICAN.getNationality(),
                ArrayList<Tourist>,
                ParkRegions.KIRSTENBOSCH.getRegionName(),
                ParkRegions.STELLENBOSCH.getRegionName());
        TourGuide michelle = new TourGuide(2, "Michelle", 27,
                Nationality.NAMIBIAN.getNationality(),
                ParkRegions.BUCHULAND.getRegionName(),
                ParkRegions.NAMIBIANREDDESERT.getRegionName());*/

     /*   this.guideList.add(frank);
        this.guideList.add(michelle);*/

        // Liste des touristes accompagnés
    }

    public ArrayList<TourGuide> getGuideList() {
        return guideList;
    }

    public ArrayList<TourGuide> searchByName(String name) {
        ArrayList<TourGuide> result = new ArrayList<>();
        for (TourGuide t: this.guideList) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    // Renvoi de la liste du/des touriste(s) accompagné(s) par le guide

}
