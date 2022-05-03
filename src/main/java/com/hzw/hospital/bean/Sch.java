package com.hzw.hospital.bean;

import java.util.Date;

public class Sch {
    private Integer schId;

    private Integer dId;

    private Integer surId;

    private Date schDate;

    private String schTime;

    private Integer schSize;

    private Integer schBooked;

    public Sch() {
    }

    public Sch(Integer schId, Integer dId, Integer surId, Date schDate, String schTime, Integer schSize, Integer schBooked) {
        this.schId = schId;
        this.dId = dId;
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

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getSurId() {
        return surId;
    }

    public void setSurId(Integer surId) {
        this.surId = surId;
    }

    public Date getSchDate() {
        return schDate;
    }

    public void setSchDate(Date schDate) {
        this.schDate = schDate;
    }

    public String getSchTime() {
        return schTime;
    }

    public void setSchTime(String schTime) {
        this.schTime = schTime == null ? null : schTime.trim();
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
                ", dId=" + dId +
                ", surId=" + surId +
                ", schDate=" + schDate +
                ", schTime='" + schTime + '\'' +
                ", schSize=" + schSize +
                ", schBooked=" + schBooked +
                '}';
    }
}