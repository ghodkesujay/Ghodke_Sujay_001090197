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
public class City {
    ArrayList<Community> communityArr = new ArrayList<>();

    public ArrayList<Community> getCommunityArr() {
        return communityArr;
    }

    public void setCommunityArr(ArrayList<Community> communityArr) {
        this.communityArr = communityArr;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "City{" + "communityArr=" + communityArr + '}';
    }
    
    public Community addNewCommunity(Community community){
        communityArr.add(community);
        return community;
    }
    
}
