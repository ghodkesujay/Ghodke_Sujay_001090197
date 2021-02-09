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
public class Demographic {
    
    private String first_name;
    private String last_name;
    private String phone;
    private String dob;
    private String age;
    private String height;
    private String weight;
    private String ssn;

    public Demographic() {
    }

    
    public Demographic(String first_name, String last_name, String phone, String dob, String age, String height, String weight, String ssn) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.dob = dob;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
    }
    
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
}
