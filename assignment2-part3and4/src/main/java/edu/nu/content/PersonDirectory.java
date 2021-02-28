/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class PersonDirectory {
    ArrayList<Person> personArr = new ArrayList<Person>();

    public ArrayList<Person> getPersonArr() {
        return personArr;
    }

    public void setPersonArr(ArrayList<Person> personArr) {
        this.personArr = personArr;
    }

    public PersonDirectory() {
    }
    
    public Person addNewPerson(Person person){
        personArr.add(person);
        return person;
    }
}
