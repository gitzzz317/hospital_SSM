package com.hzw.hospital.bean;

public class Surgery {
    private Integer surId;

//    private Integer oId;
    private Office office;

    private String surSite;

    private String surMana;

    public Surgery() {
    }

    public Surgery(Integer surId, Office office, String surSite, String surMana) {
        this.surId = surId;
        this.office = office;
        this.surSite = surSite;
        this.surMana = surMana;
    }

    public Integer getSurId() {
        return surId;
    }

    public void setSurId(Integer surId) {
        this.surId = surId;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public String getSurSite() {
        return surSite;
    }

    public void setSurSite(String surSite) {
        this.surSite = surSite;
    }

    public String getSurMana() {
        return surMana;
    }

    public void setSurMana(String surMana) {
        this.surMana = surMana;
    }

    @Override
    public String toString() {
        return "Surgery{" +
                "surId=" + surId +
                ", office=" + office +
                ", surSite='" + surSite + '\'' +
                ", surMana='" + surMana + '\'' +
                '}';
    }
}