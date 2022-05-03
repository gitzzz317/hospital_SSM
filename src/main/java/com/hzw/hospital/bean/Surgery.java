package com.hzw.hospital.bean;

public class Surgery {
    private Integer surId;

    private Integer oId;

    private String surSite;

    private String surMana;

    public Surgery() {
    }

    public Surgery(Integer surId, Integer oId, String surSite, String surMana) {
        this.surId = surId;
        this.oId = oId;
        this.surSite = surSite;
        this.surMana = surMana;
    }

    public Integer getSurId() {
        return surId;
    }

    public void setSurId(Integer surId) {
        this.surId = surId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getSurSite() {
        return surSite;
    }

    public void setSurSite(String surSite) {
        this.surSite = surSite == null ? null : surSite.trim();
    }

    public String getSurMana() {
        return surMana;
    }

    public void setSurMana(String surMana) {
        this.surMana = surMana == null ? null : surMana.trim();
    }

    @Override
    public String toString() {
        return "Surgery{" +
                "surId=" + surId +
                ", oId=" + oId +
                ", surSite='" + surSite + '\'' +
                ", surMana='" + surMana + '\'' +
                '}';
    }
}