/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.content;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author sujayghodke
 */
public class VitalSigns {
    
    private int age;
    private int respiratoryRate;
    private int heartRate;
    private int bp;
    private float weightKg;
    private float weightLb;
//    private String recordTime2 = new SimpleDateFormat(“yyyy/MM/dd HH:mm:ss”).format(Calendar.getInstance().getTime());
    private String recordTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    
    
    

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
    }

    public float getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(float weightLb) {
        this.weightLb = weightLb;
    }

    public VitalSigns() {
    }

    public VitalSigns(int age, int respiratoryRate, int heartRate, int bp, float weightKg, float weightLb, String recordTime) {
        this.age = age;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bp = bp;
        this.weightKg = weightKg;
        this.weightLb = weightLb;
    }

//    @Override
//    public String toString() {
//        return "VitalSigns{" + "age=" + age + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", bp=" + bp + ", weightKg=" + weightKg + ", weightLb=" + weightLb + '}'+
//                "\n";
//    }

    @Override
    public String toString() {
        return "VitalSigns{" + "age=" + age + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", bp=" + bp + ", weightKg=" + weightKg + ", weightLb=" + weightLb + ", recordTime=" + recordTime + '}'+
                "\n";
    }
    
    
    

    
    
    
}
