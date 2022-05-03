package com.hzw.hospital.bean;

public class Patient {
    private Integer pId;

    private String pUsername;

    private String pPwd;

    private String pName;

    private String pSex;

    private Integer pAge;

    private String pNum;

    private String pMed;

    private String pIll;

    public Patient() {
    }

    public Patient(Integer pId, String pUsername, String pPwd, String pName, String pSex, Integer pAge, String pNum, String pMed, String pIll) {
        this.pId = pId;
        this.pUsername = pUsername;
        this.pPwd = pPwd;
        this.pName = pName;
        this.pSex = pSex;
        this.pAge = pAge;
        this.pNum = pNum;
        this.pMed = pMed;
        this.pIll = pIll;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpUsername() {
        return pUsername;
    }

    public void setpUsername(String pUsername) {
        this.pUsername = pUsername == null ? null : pUsername.trim();
    }

    public String getpPwd() {
        return pPwd;
    }

    public void setpPwd(String pPwd) {
        this.pPwd = pPwd == null ? null : pPwd.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum == null ? null : pNum.trim();
    }

    public String getpMed() {
        return pMed;
    }

    public void setpMed(String pMed) {
        this.pMed = pMed == null ? null : pMed.trim();
    }

    public String getpIll() {
        return pIll;
    }

    public void setpIll(String pIll) {
        this.pIll = pIll == null ? null : pIll.trim();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId=" + pId +
                ", pUsername='" + pUsername + '\'' +
                ", pPwd='" + pPwd + '\'' +
                ", pName='" + pName + '\'' +
                ", pSex='" + pSex + '\'' +
                ", pAge=" + pAge +
                ", pNum='" + pNum + '\'' +
                ", pMed='" + pMed + '\'' +
                ", pIll='" + pIll + '\'' +
                '}';
    }
}