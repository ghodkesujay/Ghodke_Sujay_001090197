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
    String fullName;
    int age;
    

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    
    
    @Override
    public String toString() {
        return "Person{" + "fullName=" + fullName + ", age=" + age + '}';
    }

//    @Override
//    public String toString() {
//        return "Person{" + "fullName=" + fullName + ", age=" + age + ", house=" + house + '}';
//    }

    
    
    
    
    
}
