/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author sujayghodke
 */
public class MainLauncher {

    public static void main(String[] args) {
        House house = new House();
        Person person = new Person();
        
        
        PatientDirectory patientDirectory = new PatientDirectory();

        Scanner sc = new Scanner(System.in);

        String flagP = "N";

        do {
            Patient p;
            Encounter encounter;
            Encounter latest;
            EncounterHistory encounterHistory = new EncounterHistory();
            

            System.out.println("Please enter patient's full name.\n");
            String fullName = sc.nextLine();
            person.setFullName(fullName);
            
//            System.out.println("Enter patient's house number.\n");
//            int houseNumber = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Enter patient's street address.\n");
//            String streetAddress = sc.nextLine();
            
            
            int counter = 0;
            String flag = "N";

            do {

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

                sc.nextLine(); //written to accept extra next line

                person.setAge(age);
                VitalSigns vs = new VitalSigns(age, respRate, heartRate, bloodPressure, kilo, pounds, recordTime);
                counter = counter + 1;
                System.out.println("Enter the Doctor's name.");
                String doctorName = sc.nextLine();

                System.out.println("Do you wish to enter information of next encounter?");
                System.out.println("Enter 'Y' for YES and 'N' for NO.");
                flag = sc.next();

                encounter = new Encounter(counter, vs, doctorName);

                latest = encounterHistory.addNewEncounter(encounter);

                encounterHistory.setLatestEncounter(latest);
                
                

            } while (flag.equalsIgnoreCase("Y"));

            System.out.println("\nPatient's name is " + person.fullName);
//            System.out.println("Displaying the list of encounters: " + encounterHistory.toString());

            p = new Patient(encounterHistory, fullName, counter);
            
            patientDirectory.addNewPatient(p);
            
            house.addNewPerson(person);
            
            System.out.println("Do you wish to enter information of a new Patient?"
                    + "\nEnter 'Y' for YES and 'N' for NO.");
            flagP = sc.next();
            sc.nextLine(); //for accepting next line character
        } while (flagP.equalsIgnoreCase("Y"));
        
        System.out.println("Displaying the list of Patients with their history:\n" + patientDirectory.toString());
        
        

    }
}
