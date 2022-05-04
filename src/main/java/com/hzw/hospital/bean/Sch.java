package com.hzw.hospital.bean;

import java.util.Date;

public class Sch {
    private Integer schId;
    //医生多对一关系
//    private Integer dId;
    private Doctor doctor;
//    诊室多对一关系
//    private Integer surId;
    private Surgery surgery;

    private String  schDate;

    private String schTime;

    private Integer schSize;

    private Integer schBooked;

    public Sch() {
    }

    public Sch(Integer schId, Doctor doctor, Surgery surgery, String schDate, String schTime, Integer schSize, Integer schBooked) {
        this.schId = schId;
        this.doctor = doctor;
        this.surgery = surgery;
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

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
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
                ", surgery=" + surgery +
                ", schDate='" + schDate + '\'' +
                ", schTime='" + schTime + '\'' +
                ", schSize=" + schSize +
                ", schBooked=" + schBooked +
                '}';
    }
}