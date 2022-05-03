package com.hzw.hospital.bean;

public class Doctor {
    private Integer dId;

    private String dUsername;

    private String dPwd;

    private String dName;

    private Integer dAge;

    private String dSex;

    private Integer surId;

    public Doctor() {
    }

    public Doctor(Integer dId, String dUsername, String dPwd, String dName, Integer dAge, String dSex, Integer surId) {
        this.dId = dId;
        this.dUsername = dUsername;
        this.dPwd = dPwd;
        this.dName = dName;
        this.dAge = dAge;
        this.dSex = dSex;
        this.surId = surId;
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
        this.dUsername = dUsername == null ? null : dUsername.trim();
    }

    public String getdPwd() {
        return dPwd;
    }

    public void setdPwd(String dPwd) {
        this.dPwd = dPwd == null ? null : dPwd.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
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
        this.dSex = dSex == null ? null : dSex.trim();
    }

    public Integer getSurId() {
        return surId;
    }

    public void setSurId(Integer surId) {
        this.surId = surId;
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
                ", surId=" + surId +
                '}';
    }
}