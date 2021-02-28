/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

/**
 *
 * @author sujayghodke
 */
public class Encounter {
    private int encounterNumber;
    private VitalSigns vs;
    private String doctorName;

    public int getEncounterNumber() {
        return encounterNumber;
    }

    public void setEncounterNumber(int encounterNumber) {
        this.encounterNumber = encounterNumber;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Encounter(int encounterNumber, VitalSigns vs, String doctorName) {
        this.encounterNumber = encounterNumber;
        this.vs = vs;
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "encounterNumber=" + encounterNumber + ", " + vs + "doctorName=" + doctorName + "\n";
    }

    
    
    
    
}
