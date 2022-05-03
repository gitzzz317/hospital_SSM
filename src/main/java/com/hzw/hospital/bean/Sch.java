package com.hzw.hospital.bean;

import java.util.Date;

public class Sch {
    private Integer schId;
    //医生多对一关系
//    private Integer dId;
    private Doctor doctor;

    private Integer surId;

    private String  schDate;

    private String schTime;

    private Integer schSize;

    private Integer schBooked;

    public Sch() {
    }

    public Sch(Integer schId, Doctor doctor, Integer surId, String schDate, String schTime, Integer schSize, Integer schBooked) {
        this.schId = schId;
        this.doctor = doctor;
        this.surId = surId;
        this.schDate = schDate;
        this.schTime = schTime;
        this.schSize = schSize;
        this.schBooked = schBooked;
    }

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getSurId() {
        return surId;
    }

    public void setSurId(Integer surId) {
        this.surId = surId;
    }

    public String getSchDate() {
        return schDate;
    }

    public void setSchDate(String schDate) {
        this.schDate = schDate;
    }

    public String getSchTime() {
        return schTime;
    }

    public void setSchTime(String schTime) {
        this.schTime = schTime;
    }

    public Integer getSchSize() {
        return schSize;
    }

    public void setSchSize(Integer schSize) {
        this.schSize = schSize;
    }

    public Integer getSchBooked() {
        return schBooked;
    }

    public void setSchBooked(Integer schBooked) {
        this.schBooked = schBooked;
    }

    @Override
    public String toString() {
        return "Sch{" +
                "schId=" + schId +
                ", doctor=" + doctor +
                ", surId=" + surId +
                ", schDate='" + schDate + '\'' +
                ", schTime='" + schTime + '\'' +
                ", schSize=" + schSize +
                ", schBooked=" + schBooked +
                '}';
    }
}