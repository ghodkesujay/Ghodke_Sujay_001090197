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
public class PatientDirectory {
    private ArrayList<Patient> patientArr = new ArrayList<>();

    public PatientDirectory() {
    }

    public ArrayList<Patient> getPatientArr() {
        return patientArr;
    }

    public void setPatientArr(ArrayList<Patient> patientArr) {
        this.patientArr = patientArr;
    }
    
    public Patient addNewPatient(Patient patient){
        patientArr.add(patient);
        return patient;
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "\n" + patientArr + '}';
    }
    
    
    
}
