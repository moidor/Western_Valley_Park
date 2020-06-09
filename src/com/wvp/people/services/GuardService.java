package com.wvp.people.services;

import com.wvp.exceptions.NoFoundIndexNameException;
import com.wvp.exceptions.NoNameException;
import com.wvp.people.Guard;
import com.wvp.people.repositories.GuardRepository;

import java.util.ArrayList;

public class GuardService {
    GuardRepository guardRepository = new GuardRepository();

    public ArrayList<Guard> searchByName(String guardName) {
        ArrayList<Guard> result = new ArrayList<>();
        for (Guard g: this.guardRepository.getGuardsList()) {
                if (g.getName().toLowerCase().contains(guardName)) {
                    result.add(g);
                }
                /*else if (!g.getName().toLowerCase().contains(guardName)) {
                    System.out.println("Guard not found");
                }*/
            }
        return result;
    }

    public void guardActivities(String guardName){
        Guard foundGuard = this.searchByName(guardName).get(0);
        System.out.println(foundGuard.arrestPeople());
    }

    public void getEveryGuard() {
        for (Guard g: this.guardRepository.getGuardsList()) {
            System.out.println("Name : " + g.getName() + ", nationality : " + g.getNationality() +
                    ", gender : " + g.getGender() + ", visited regions : " + g.getVisitedRegions() + ".");
        }
    }
}
