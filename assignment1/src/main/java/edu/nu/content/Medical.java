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
public class Medical {
    private String rec_no;
    private String allergy1;
    private String allergy2;
    private String allergy3;

    public Medical(String rec_no, String allergy1, String allergy2, String allergy3) {
        this.rec_no = rec_no;
        this.allergy1 = allergy1;
        this.allergy2 = allergy2;
        this.allergy3 = allergy3;
    }

    public Medical() {
    }
    
    

    public String getRec_no() {
        return rec_no;
    }

    public void setRec_no(String rec_no) {
        this.rec_no = rec_no;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getAllergy3() {
        return allergy3;
    }

    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }
    
    
}
