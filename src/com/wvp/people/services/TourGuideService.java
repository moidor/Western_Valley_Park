package com.wvp.people.services;

import com.wvp.enums.Gender;
import com.wvp.enums.Nationality;
import com.wvp.enums.ParkRegions;
import com.wvp.people.Guard;
import com.wvp.people.TourGuide;
import com.wvp.people.repositories.TourGuideRepository;

import java.util.ArrayList;

public class TourGuideService {
    TourGuideRepository tourGuideRepository = new TourGuideRepository();

    public ArrayList<TourGuide> searchByName(String name) {
        ArrayList<TourGuide> result = new ArrayList<>();
        for (TourGuide t: this.tourGuideRepository.getTourGuidesList()) {
            if (t.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(t);
            }
        }
        return result;
    }

    public void tourGuideActivies(String tourGuideName) {
        TourGuide foundTourGuide = this.searchByName(tourGuideName).get(0);
        System.out.println(foundTourGuide.getName() + " from " + foundTourGuide.getCountry()
                + " makes " + foundTourGuide.getGroupOfTourists()
        + " visit " + foundTourGuide.getVisitedRegions() + ".");
    }

    public void getEveryTourGuide() {
        for (TourGuide tourGuide: this.tourGuideRepository.getTourGuidesList()) {
            System.out.println("Name : " + tourGuide.getName()+
                    ", gender : " + tourGuide.getGender() + ".");
        }
    }
}
