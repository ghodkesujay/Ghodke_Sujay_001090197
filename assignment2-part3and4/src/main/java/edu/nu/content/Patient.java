/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sujayghodke
 */
public class Patient extends Person{
    
    
    EncounterHistory encounterHistory;

    public Patient() {
    }

//    public Patient(EncounterHistory encounterHistory, String fullName, int age) {
//        super(fullName, age);
//        this.encounterHistory = encounterHistory;
//    }

    public Patient(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Patient(EncounterHistory encounterHistory, String fullName, int age) {
        super(fullName, age);
        this.encounterHistory = encounterHistory;
    }

    
    

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
    //code for storing history of vital signs
    private ArrayList<VitalSigns> historyArr = new ArrayList<>();

    public ArrayList<VitalSigns> getHistoryArr() {
        return historyArr;
    }

    public void setHistoryArr(ArrayList<VitalSigns> historyArr) {
        this.historyArr = historyArr;
    }

    public VitalSigns addNewVitals(VitalSigns vs){
        //VitalSigns newVitals = new VitalSigns();
        historyArr.add(vs);
        return vs;
    }

    @Override
    public String toString() {
        return "Patient{"+ super.toString() + encounterHistory ;
    }

    

    
//    @Override
//    public String toString() {
//        return "Patient{" + " historyArr=" + historyArr + '}';
//    }
    

    public boolean isPatientNormal(int age, VitalSigns vs) {
        switch (age) {
            case 1:
                if (vs.getRespiratoryRate() > 29 && vs.getRespiratoryRate() < 51
                        && vs.getHeartRate() > 119 && vs.getHeartRate() < 161
                        && vs.getBp() > 49 && vs.getBp() < 71
                        && vs.getWeightKg() >= 2 && vs.getWeightKg() <= 3
                        && vs.getWeightLb() >= 4.5 && vs.getWeightLb() <= 7) {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31
                        && vs.getHeartRate() > 79 && vs.getHeartRate() < 141
                        && vs.getBp() > 69 && vs.getBp() < 101
                        && vs.getWeightKg() >= 4 && vs.getWeightKg() <= 10
                        && vs.getWeightLb() >= 9 && vs.getWeightLb() <= 22) {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31
                        && vs.getHeartRate() > 79 && vs.getHeartRate() < 131
                        && vs.getBp() > 79 && vs.getBp() < 111
                        && vs.getWeightKg() >= 10 && vs.getWeightKg() <= 14
                        && vs.getWeightLb() >= 22 && vs.getWeightLb() <= 31) {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31
                        && vs.getHeartRate() > 79 && vs.getHeartRate() < 121
                        && vs.getBp() > 79 && vs.getBp() < 111
                        && vs.getWeightKg() >= 14 && vs.getWeightKg() <= 18
                        && vs.getWeightLb() >= 31 && vs.getWeightLb() <= 40) {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31
                        && vs.getHeartRate() > 69 && vs.getHeartRate() < 111
                        && vs.getBp() > 79 && vs.getBp() < 121
                        && vs.getWeightKg() >= 20 && vs.getWeightKg() <= 42
                        && vs.getWeightLb() >= 41 && vs.getWeightLb() <= 92) {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (vs.getRespiratoryRate() > 11 && vs.getRespiratoryRate() < 21
                        && vs.getHeartRate() > 54 && vs.getHeartRate() < 106
                        && vs.getBp() > 109 && vs.getBp() < 121
                        && vs.getWeightKg() > 50
                        && vs.getWeightLb() > 110) {
                    return true;
                } else {
                    return false;
                }

            default:
                return false;
        }
    }

    public boolean isThisVitalSignNormal(String vsign, VitalSigns vs) {

        if (vsign.equalsIgnoreCase("RespiratoryRate")) {
            switch (vs.getAge()) {
                case 1:
                    if (vs.getRespiratoryRate() > 29 && vs.getRespiratoryRate() < 51) {
                        return true;
                    } else {
                        return false;
                    }
                case 2:
                    if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31) {
                        return true;
                    } else {
                        return false;
                    }
                case 3:
                    if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31) {
                        return true;
                    } else {
                        return false;
                    }
                case 4:
                    if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31) {
                        return true;
                    } else {
                        return false;
                    }
                case 5:
                    if (vs.getRespiratoryRate() > 19 && vs.getRespiratoryRate() < 31) {
                        return true;
                    } else {
                        return false;
                    }
                case 6:
                    if (vs.getRespiratoryRate() > 11 && vs.getRespiratoryRate() < 21) {
                        return true;
                    } else {
                        return false;
                    }
                default:
                    return false;
            }
        } else if (vsign.equalsIgnoreCase("HeartRate")) {
            switch (vs.getAge()) {
                case 1:
                    if (vs.getHeartRate() > 119 && vs.getHeartRate() < 161) {
                        return true;
                    } else {
                        return false;
                    }
                case 2:
                    if (vs.getHeartRate() > 79 && vs.getHeartRate() < 141) {
                        return true;
                    } else {
                        return false;
                    }
                case 3:
                    if (vs.getHeartRate() > 79 && vs.getHeartRate() < 131) {
                        return true;
                    } else {
                        return false;
                    }
                case 4:
                    if (vs.getHeartRate() > 79 && vs.getHeartRate() < 121) {
                        return true;
                    } else {
                        return false;
                    }
                case 5:
                    if (vs.getHeartRate() > 69 && vs.getHeartRate() < 111) {
                        return true;
                    } else {
                        return false;
                    }
                case 6:
                    if (vs.getHeartRate() > 54 && vs.getHeartRate() < 106) {
                        return true;
                    } else {
                        return false;
                    }

                default:
                    return false;
            }
        } else if (vsign.equalsIgnoreCase("BloodPressure")) {
            switch (vs.getAge()) {
                case 1:
                    if (vs.getBp() > 49 && vs.getBp() < 71) {
                        return true;
                    } else {
                        return false;
                    }
                case 2:
                    if (vs.getBp() > 69 && vs.getBp() < 101) {
                        return true;
                    } else {
                        return false;
                    }
                case 3:
                    if (vs.getBp() > 79 && vs.getBp() < 111) {
                        return true;
                    } else {
                        return false;
                    }
                case 4:
                    if (vs.getBp() > 79 && vs.getBp() < 111) {
                        return true;
                    } else {
                        return false;
                    }
                case 5:
                    if (vs.getBp() > 79 && vs.getBp() < 121) {
                        return true;
                    } else {
                        return false;
                    }
                case 6:
                    if (vs.getBp() > 109 && vs.getBp() < 121) {
                        return true;
                    } else {
                        return false;
                    }

                default:
                    return false;
            }

        } else if (vsign.equalsIgnoreCase("WeightKg")){
            switch(vs.getAge()){
            case 1: if (vs.getWeightKg()>=2 && vs.getWeightKg()<=3) 
                    return true;
                    else
                    return false;
            case 2: if (vs.getWeightKg()>=4 && vs.getWeightKg()<=10) 
                    return true;
                    else
                    return false;
            case 3: if (vs.getWeightKg()>=10 && vs.getWeightKg()<=14) 
                    return true;
                    else
                    return false;
            case 4: if (vs.getWeightKg()>=14 && vs.getWeightKg()<=18) 
                    return true;
                    else
                    return false;
            case 5: if (vs.getWeightKg()>=20 && vs.getWeightKg()<=42) 
                    return true;
                    else
                    return false;
            case 6: if (vs.getWeightKg()>50) 
                    return true;
                    else
                    return false;
            
            default: return false;
        }
        }
        else if(vsign.equalsIgnoreCase("WeightLb")){
            switch(vs.getAge()){
            case 1: if (vs.getWeightLb()>=4.5 && vs.getWeightLb()<=7) 
                    return true;
                    else
                    return false;
            case 2: if (vs.getWeightLb()>=9 && vs.getWeightLb()<=12) 
                    return true;
                    else
                    return false;
            case 3: if (vs.getWeightLb()>=22 && vs.getWeightLb()<=31) 
                    return true;
                    else
                    return false;
            case 4: if (vs.getWeightLb()>=31 && vs.getWeightLb()<=40) 
                    return true;
                    else
                    return false;
            case 5: if (vs.getWeightLb()>=41 && vs.getWeightLb()<=92) 
                    return true;
                    else
                    return false;
            case 6: if (vs.getWeightLb()>110) 
                    return true;
                    else
                    return false;
            
            default: return false;
        }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Person person = new Person();
        Patient p = new Patient();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter patient's full name.\n");
        String fullName = sc.nextLine();
        person.fullName = fullName;
        
        System.out.println("Choose age group.\n");
        System.out.println("Enter 1 for NEW BORN"
                + "\nEnter 2 for INFANT "
                + "\nEnter 3 for TODDLER"
                + "\nEnter 4 for PRESCHOOLER"
                + "\nEnter 5 for SCHOOL AGE"
                + "\nEnter 6 for ADOLESCENT");
        int age = sc.nextInt();
        System.out.println("Enter respiratory rate.");
        int respRate = sc.nextInt();
        System.out.println("Enter heart rate.");
        int heartRate = sc.nextInt();
        System.out.println("Enter systolic blood pressure.");
        int bloodPressure = sc.nextInt();
        System.out.println("Enter weight in kilos.");
        float kilo = sc.nextFloat();
        System.out.println("Enter weight in pounds");
        float pounds = sc.nextFloat();
        
        //Picking up current system time
        String recordTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        
//        VitalSignsHistory history = new VitalSignsHistory();
       
        VitalSigns vs = new VitalSigns(age, respRate, heartRate, bloodPressure, kilo, pounds, recordTime);
      
        p.addNewVitals(vs);

        
        System.out.println("YOUR HEALTH INFORMATION:\nAgeGroup: "+vs.getAge()+"\nRespiratory Rate: "+vs.getRespiratoryRate()+
                "\nHeart Rate: "+vs.getHeartRate()+"\nBlood Pressure: "+vs.getBp()+
                "\nWeight(in KGs): "+vs.getWeightKg()+"\nWeight(in LBs): "+vs.getWeightLb());
        
        if(p.isPatientNormal(vs.getAge(), vs)){
            System.out.println("Patient is normal.");
        }
        else{
            System.out.println("Patient is NOT normal.");
        }
        
        //printing data stored in the array list
//        System.out.println("Testing data stored in arraylist (FIRST TIME)\n"+p.toString());
        
        String flag = "N";
        /*System.out.println("\nDo you want to enter new vital signs?"
                + "\nEnter 'Y' for YES & 'N' for NO.");
        flag = sc.nextLine(); */
        
        System.out.println("\nDo you want to enter new vital signs?"
                + "\nEnter 'Y' for YES & 'N' for NO.");    
        flag = sc.next();
        
        
        VitalSigns vsCurrent = new VitalSigns();
        vsCurrent = vs;
        //repeating the user input code below
        while (flag.equalsIgnoreCase("Y")) {
            
        
            System.out.println("Choose age group.\n");
            System.out.println("Enter 1 for NEW BORN"
                    + "\nEnter 2 for INFANT "
                    + "\nEnter 3 for TODDLER"
                    + "\nEnter 4 for PRESCHOOLER"
                    + "\nEnter 5 for SCHOOL AGE"
                    + "\nEnter 6 for ADOLESCENT");
            int age1 = sc.nextInt();
            System.out.println("Enter respiratory rate.");
            int respRate1 = sc.nextInt();
            System.out.println("Enter heart rate.");
            int heartRate1 = sc.nextInt();
            System.out.println("Enter systolic blood pressure.");
            int bloodPressure1 = sc.nextInt();
            System.out.println("Enter weight in kilos.");
            float kilo1 = sc.nextFloat();
            System.out.println("Enter weight in pounds");
            float pounds1 = sc.nextFloat();

            
            String recordTime1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        
        
            VitalSigns vs1 = new VitalSigns(age1, respRate1, heartRate1, bloodPressure1, kilo1, pounds1, recordTime1);
      
//            history.addNewVitals(vs1);
            p.addNewVitals(vs1);
            
            if (p.isPatientNormal(vs.getAge(), vs)) {
                System.out.println("Patient is normal.");
            } 
            else {
                System.out.println("Patient is NOT normal.");
            }
            
            System.out.println("\nDo you want to enter new vital signs?"
                + "\nEnter 'Y' for YES & 'N' for NO.");    
            flag = sc.next();
            vsCurrent = vs1;
        }
        
        //printing data stored in the array list (SECOND TIME)
        System.out.println("\n\nPatient name:"+person.fullName);
        System.out.println("HISTORY of vital signs:\n"+p.toString());
        
        System.out.println("\nCURRENT Vital signs:\n"+vsCurrent);
        
        System.out.println("If you wish to check if any particular vital sign is abnormal\n"
                + "Please enter vital sign name below.");
        System.out.println("You can check any one of below vital signs.\n"
                + "RespiratoryRate\nHeartRate\nBloodPressure\nWeightKg\nWeightLb");
        
        String vsign = sc.next();
        
        if(p.isThisVitalSignNormal(vsign, vsCurrent))
            System.out.println("The "+vsign+" is normal.");
        else
            System.out.println("The "+vsign+" is NOT normal.");
    }
    
}
