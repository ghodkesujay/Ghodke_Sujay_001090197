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
public class Community {
    ArrayList<House> houseArr = new ArrayList<>();

    public ArrayList<House> getHouseArr() {
        return houseArr;
    }

    public void setHouseArr(ArrayList<House> houseArr) {
        this.houseArr = houseArr;
    }

    public Community() {
    }

    @Override
    public String toString() {
        return "Community{" + "houseArr=" + houseArr + '}';
    }
    
    public House addNewHouse(House house){
        houseArr.add(house);
        return house;
    }
    
}
