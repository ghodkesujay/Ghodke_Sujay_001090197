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
public class TestCases {
    public static void main(String[] args) {
        Patient p = new Patient();
        //executing test cases now
        System.out.println("Testing all possible cases below.\n");
        //Picking up current system time
        String recordTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        
        //VitalSigns vs = new VitalSigns(age, respRate, heartRate, bloodPressure, kilo, pounds, recordTime);
        
        //--------------------INFANT----------------//
        System.out.println("NEW BORN");
        System.out.println("Checking MINIMUM normal values of vital signs for Newborn.");
        VitalSigns vs = new VitalSigns(1, 30, 120, 50, 2, 4.5f, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for Newborn.");
        vs = new VitalSigns(1, 50, 160, 70, 3, 7, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for Newborn.");
        vs = new VitalSigns(1, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //--------------------INFANT----------------//
        System.out.println("\nINFANT");
        System.out.println("Checking MINIMUM normal values of vital signs for Infant.");
        vs = new VitalSigns(2, 20, 80, 70, 4, 9, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for Infant.");
        vs = new VitalSigns(2, 30, 140, 100, 10, 22, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for Infant.");
        vs = new VitalSigns(2, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //--------------------TODDLER----------------//
        System.out.println("\nTODDLER");
        System.out.println("Checking MINIMUM normal values of vital signs for Toddler.");
        vs = new VitalSigns(3, 20, 80, 80, 10, 22, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for Toddler.");
        vs = new VitalSigns(3, 30, 130, 110, 14, 31, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for Toddler.");
        vs = new VitalSigns(3, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //--------------------PRESCHOOLER----------------//
        System.out.println("\nPRESCHOOLER");
        System.out.println("Checking MINIMUM normal values of vital signs for Preschooler.");
        vs = new VitalSigns(4, 20, 80, 80, 14, 31, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for Preschooler.");
        vs = new VitalSigns(4, 30, 120, 110, 18, 40, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for Preschooler.");
        vs = new VitalSigns(4, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //--------------------SCHOOL AGE----------------//
        System.out.println("\nSCHOOL AGE");
        System.out.println("Checking MINIMUM normal values of vital signs for School Age.");
        vs = new VitalSigns(5, 20, 70, 80, 20, 41, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for School Age.");
        vs = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for School Age.");
        vs = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //------------------ADOLESCENT------------------//
        System.out.println("\nADOLESCENT");
        System.out.println("Checking MINIMUM normal values of vital signs for Adolescent.");
        vs = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking MAXIMUM normal values of vital signs for Adolescent.");
        vs = new VitalSigns(6, 20, 105, 120, 120, 120, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        System.out.println("Checking OUT OF RANGE values of vital signs for Adolescent.");
        vs = new VitalSigns(6, 60, 170, 121, 49, 99, recordTime);
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        
        System.out.println("-\n\n----Checking isThisVitalSignNormal method below.------\n");
        
        VitalSigns vs1 = new VitalSigns();
        //"RespiratoryRate\nHeartRate\nBloodPressure\nWeightKg\nWeightLb"
        
        //-------RespiratoryRate-------//
        
        System.out.println("Passing RespiratoryRate to isThisVitalSignNormal.");
        System.out.println("\n");
        String vsign = "RespiratoryRate";
        System.out.println("Checking for MINIMUM normal value.");
        vs1 = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for MAXIMUM normal value.");
        vs1 = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for OUT OF RANGE value.");
        vs1 = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        //-------HeartRate-------//
        System.out.println("\n");
        System.out.println("Passing HeartRate to isThisVitalSignNormal.");
        System.out.println("\n");
        vsign = "HeartRate";
        System.out.println("Checking for MINIMUM normal value.");
        vs1 = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for MAXIMUM normal value.");
        vs1 = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for OUT OF RANGE value.");
        vs1 = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        //-------BloodPressure-------//
        System.out.println("\n");
        System.out.println("Passing BloodPressure to isThisVitalSignNormal.");
        System.out.println("\n");
        vsign = "BloodPressure";
        System.out.println("Checking for MINIMUM normal value.");
        vs1 = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for MAXIMUM normal value.");
        vs1 = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for OUT OF RANGE value.");
        vs1 = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
     
        //-------WeightKg-------//
        System.out.println("\n");
        System.out.println("Passing WeightKg to isThisVitalSignNormal.");
        System.out.println("\n");
        vsign = "WeightKg";
        System.out.println("Checking for MINIMUM normal value.");
        vs1 = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for MAXIMUM normal value.");
        vs1 = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for OUT OF RANGE value.");
        vs1 = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        //-------WeightLb-------//
        System.out.println("\n");
        System.out.println("Passing WeightLb to isThisVitalSignNormal.");
        System.out.println("\n");
        vsign = "WeightLb";
        System.out.println("Checking for MINIMUM normal value.");
        vs1 = new VitalSigns(6, 12, 55, 110, 51, 111, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for MAXIMUM normal value.");
        vs1 = new VitalSigns(5, 30, 110, 120, 42, 92, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
        
        System.out.println("Checking for OUT OF RANGE value.");
        vs1 = new VitalSigns(5, 60, 170, 121, 49, 99, recordTime);
        if(p.isThisVitalSignNormal(vsign, vs1))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
    }
    
}
