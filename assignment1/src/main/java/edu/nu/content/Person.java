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
public class Person {
    Demographic demo;
    Address add;
    
    Account checkingAcc;
    Driver driver;
    Medical medical;

    public Person(Demographic demo, Address add, Account checkingAcc, Driver driver, Medical medical) {
        this.demo = demo;
        this.add = add;
    
        this.checkingAcc = checkingAcc;
        this.driver = driver;
        this.medical = medical;
    }

    public Demographic getDemo() {
        return demo;
    }

    public void setDemo(Demographic demo) {
        this.demo = demo;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    

    public Account getCheckingAcc() {
        return checkingAcc;
    }

    public void setCheckingAcc(Account checkingAcc) {
        this.checkingAcc = checkingAcc;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    
}
