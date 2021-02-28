/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistoryArr = new ArrayList<Encounter>();
    private Encounter latestEncounter;

    public ArrayList<Encounter> getEncounterHistoryArr() {
        return encounterHistoryArr;
    }

    public void setEncounterHistoryArr(ArrayList<Encounter> encounterHistoryArr) {
        this.encounterHistoryArr = encounterHistoryArr;
    }

    public Encounter getLatestEncounter() {
        return latestEncounter;
    }

    public void setLatestEncounter(Encounter latestEncounter) {
        this.latestEncounter = latestEncounter;
    }

    public EncounterHistory(Encounter latestEncounter) {
        this.latestEncounter = latestEncounter;
    }

    public EncounterHistory() {
    }
    
    public Encounter addNewEncounter(Encounter encounter){
        encounterHistoryArr.add(encounter);
        latestEncounter = encounter;
        return encounter;
    }

    @Override
    public String toString() {
        return "\nEncounterHistory\n" + encounterHistoryArr; 
//        + "\n latestEncounter=" + latestEncounter;
    }
    
    
}
