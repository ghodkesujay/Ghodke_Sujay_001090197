/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;
import java.util.*;

/**
 *
 * @author sujayghodke
 */
public class Driver {
    private String license_no;
    private String issue_date;
    private String exp_date;
    private String blood_type;
    private String picture;

    public Driver(String license_no, String issue_date, String exp_date, String blood_type, String picture) {
        this.license_no = license_no;
        this.issue_date = issue_date;
        this.exp_date = exp_date;
        this.blood_type = blood_type;
        this.picture = picture;
    }

    public Driver() {
        
    }

    public String getLicense_no() {
        return license_no;
    }

    public void setLicense_no(String license_no) {
        this.license_no = license_no;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
    
    
}
