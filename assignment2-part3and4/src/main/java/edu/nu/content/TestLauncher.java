/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sujayghodke
 */
public class TestLauncher {
    
    public static void main(String[] args) {
        PatientDirectory patientDirectory = new PatientDirectory();
        
        String recordTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        
        System.out.println("Creating first patient with normal blood pressure");
        //Details of first patient (normal blood pressure)
        Patient patient1 = new Patient();
        patient1.setFullName("Sujay Ghodke");
        patient1.setAge(1);
        patient1.encounterHistory = new EncounterHistory();
        VitalSigns vs1 = new VitalSigns(1, 40, 131, 60, 2, 6, recordTime);
        Encounter encounter1 = new Encounter(1, vs1, "Doctor Name 1");
        patient1.encounterHistory.addNewEncounter(encounter1);
        patientDirectory.addNewPatient(patient1);
        
        System.out.println("Creating second patient with abnormal blood pressure");
        //Details of second patient (abnormal blood pressure)
        Patient patient2 = new Patient();
        patient2.setFullName("Robert Vadra");
        patient2.setAge(2);
        patient2.encounterHistory = new EncounterHistory();
        VitalSigns vs2 = new VitalSigns(2, 25, 90, 110, 6, 11, recordTime);
        Encounter encounter2 = new Encounter(1, vs2, "Doctor Name 2");
        patient2.encounterHistory.addNewEncounter(encounter2);
        patientDirectory.addNewPatient(patient2);
        
        System.out.println("Creating third patient with normal blood pressure");
        //Details of third patient (normal blood pressure)
        Patient patient3 = new Patient();
        patient3.setFullName("Vijay Mallya");
        patient3.setAge(3);
        patient3.encounterHistory = new EncounterHistory();
        VitalSigns vs3 = new VitalSigns(3, 25, 90, 105, 11, 23, recordTime);
        Encounter encounter3 = new Encounter(1, vs3, "Doctor Name 3");
        patient3.encounterHistory.addNewEncounter(encounter3);
        patientDirectory.addNewPatient(patient3);
        
        System.out.println("Creating fourth patient with abnormal blood pressure");
        //Details of fourth patient (abnormal blood pressure)
        Patient patient4 = new Patient();
        patient4.setFullName("Christopher");
        patient4.setAge(4);
        patient4.encounterHistory = new EncounterHistory();
        VitalSigns vs4 = new VitalSigns(4, 25, 90, 70, 15, 32, recordTime);
        Encounter encounter4 = new Encounter(1, vs4, "Doctor Name 4");
        patient4.encounterHistory.addNewEncounter(encounter4);
        patientDirectory.addNewPatient(patient4);
        
        System.out.println("Creating fifth patient with abnormal blood pressure");
        //Details of fifth patient (abnormal blood pressure)
        Patient patient5 = new Patient();
        patient5.setFullName("Henry");
        patient5.setAge(4);
        patient5.encounterHistory = new EncounterHistory();
        VitalSigns vs5 = new VitalSigns(4, 25, 90, 60, 15, 32, recordTime);
        Encounter encounter5 = new Encounter(1, vs5, "Doctor Name 5");
        patient5.encounterHistory.addNewEncounter(encounter5);
        patientDirectory.addNewPatient(patient5);
        
        System.out.println("Creating sixth patient with abnormal blood pressure");
        //Details of sixth patient (abnormal blood pressure)
        Patient patient6 = new Patient();
        patient6.setFullName("Gayle");
        patient6.setAge(4);
        patient6.encounterHistory = new EncounterHistory();
        VitalSigns vs6 = new VitalSigns(4, 25, 90, 130, 15, 32, recordTime);
        Encounter encounter6 = new Encounter(1, vs6, "Doctor Name 6");
        patient6.encounterHistory.addNewEncounter(encounter6);
        patientDirectory.addNewPatient(patient6);
        
        System.out.println("Creating seventh patient with normal blood pressure");
        //Details of seventh patient (normal blood pressure)
        Patient patient7 = new Patient();
        patient7.setFullName("Aston");
        patient7.setAge(5);
        patient7.encounterHistory = new EncounterHistory();
        VitalSigns vs7 = new VitalSigns(5, 25, 80, 90, 22, 42, recordTime);
        Encounter encounter7 = new Encounter(1, vs7, "Doctor Name 7");
        patient7.encounterHistory.addNewEncounter(encounter7);
        patientDirectory.addNewPatient(patient7);
        
        System.out.println("Creating eighth patient with abnormal blood pressure");
        //Details of eighth patient (abnormal blood pressure)
        Patient patient8 = new Patient();
        patient8.setFullName("Aston");
        patient8.setAge(5);
        patient8.encounterHistory = new EncounterHistory();
        VitalSigns vs8 = new VitalSigns(5, 25, 80, 130, 22, 42, recordTime);
        Encounter encounter8 = new Encounter(1, vs8, "Doctor Name 7");
        patient8.encounterHistory.addNewEncounter(encounter8);
        patientDirectory.addNewPatient(patient8);
        
        //House 1 with Persons of patient1, patient2
        House house1 = new House();
        house1.addNewPerson(patient1);
        house1.addNewPerson(patient2);
        
        //House 2 with Persons of patient3, patient4
        House house2 = new House();
        house2.addNewPerson(patient3);
        house2.addNewPerson(patient4);
        
        //House 3 with Persons of patient5, patient6
        House house3 = new House();
        house3.addNewPerson(patient5);
        house3.addNewPerson(patient6);
        
        //House 4 with Persons of patient7, patient8
        House house4 = new House();
        house4.addNewPerson(patient7);
        house4.addNewPerson(patient8);
        
        //Community 1 with house1 and house2
        Community community1 = new Community();
        community1.addNewHouse(house1);
        community1.addNewHouse(house2);
        System.out.println("Community1 consists of house1 and house2 which has Patient1, Patient2, Patient3, Patient4");
        
        //Community 2 with house3 and house4
        Community community2 = new Community();
        community2.addNewHouse(house3);
        community2.addNewHouse(house4);
        System.out.println("Community2 consists of house3 and house4 which has Patient5, Patient6, Patient7, Patient8\n");
        
        //City with Community1 and Community2
        City city1 = new City();
        city1.addNewCommunity(community1);
        city1.addNewCommunity(community2);
        
        int x = 0;
        
        for(House house: community1.houseArr){
            for(Person person: house.personArr){
                Patient patient = (Patient) person;
                if(patient.isThisVitalSignNormal("BloodPressure", patient.encounterHistory.getLatestEncounter().getVs()) == false){
                    x = x + 1;
                }
               
            }
        }
        System.out.println("Number of patients with abnormal blood pressure in Community1: "+x);
        
        int y = 0;
        for(House house: community2.houseArr){
            for(Person person: house.personArr){
                Patient patient = (Patient) person;
                if(patient.isThisVitalSignNormal("BloodPressure", patient.encounterHistory.getLatestEncounter().getVs()) == false){
                    y = y + 1;
                }
            }
        }
        System.out.println("Number of patients with abnormal blood pressure in Community2: "+y);
        
        
    }
}
