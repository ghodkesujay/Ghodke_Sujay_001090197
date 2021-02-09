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
public class Account {
    private String bank;
    private String routing;
    private String acc_no;
    private String acc_bal;
    private String acc_type;

    public Account(String bank, String routing, String acc_no, String acc_bal, String acc_type) {
        this.bank = bank;
        this.routing = routing;
        this.acc_no = acc_no;
        this.acc_bal = acc_bal;
        this.acc_type = acc_type;
    }

    public Account() {
        
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_bal() {
        return acc_bal;
    }

    public void setAcc_bal(String acc_bal) {
        this.acc_bal = acc_bal;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }
    
    
}
