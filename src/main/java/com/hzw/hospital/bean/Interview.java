package com.hzw.hospital.bean;


public class Interview {
    private Integer iId;

//    private Integer pId;
    private Patient patient;

    private String  iDate;

    private String iTime;

//    private Integer dId;
    private Doctor doctor;

    public Interview() {
    }

    public Interview(Integer iId, Patient patient, String iDate, String iTime, Doctor doctor) {
        this.iId = iId;
        this.patient = patient;
        this.iDate = iDate;
        this.iTime = iTime;
        this.doctor = doctor;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate;
    }

    public String getiTime() {
        return iTime;
    }

    public void setiTime(String iTime) {
        this.iTime = iTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "iId=" + iId +
                ", patient=" + patient +
                ", iDate='" + iDate + '\'' +
                ", iTime='" + iTime + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}