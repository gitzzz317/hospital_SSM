package com.hzw.hospital.bean;

public class Doctor {
    private Integer dId;

    private String dUsername;

    private String dPwd;

    private String dName;

    private Integer dAge;

    private String dSex;

//    private Integer surId;
    private Surgery surgery;

    public Doctor() {
    }

    public Doctor(Integer dId, String dUsername, String dPwd, String dName, Integer dAge, String dSex, Surgery surgery) {
        this.dId = dId;
        this.dUsername = dUsername;
        this.dPwd = dPwd;
        this.dName = dName;
        this.dAge = dAge;
        this.dSex = dSex;
        this.surgery = surgery;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdUsername() {
        return dUsername;
    }

    public void setdUsername(String dUsername) {
        this.dUsername = dUsername;
    }

    public String getdPwd() {
        return dPwd;
    }

    public void setdPwd(String dPwd) {
        this.dPwd = dPwd;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Integer getdAge() {
        return dAge;
    }

    public void setdAge(Integer dAge) {
        this.dAge = dAge;
    }

    public String getdSex() {
        return dSex;
    }

    public void setdSex(String dSex) {
        this.dSex = dSex;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dId=" + dId +
                ", dUsername='" + dUsername + '\'' +
                ", dPwd='" + dPwd + '\'' +
                ", dName='" + dName + '\'' +
                ", dAge=" + dAge +
                ", dSex='" + dSex + '\'' +
                ", surgery=" + surgery +
                '}';
    }
}