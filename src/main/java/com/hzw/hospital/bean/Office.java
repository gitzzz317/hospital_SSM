package com.hzw.hospital.bean;

public class Office {
    private Integer oId;

    private String oName;

    private String oDes;

    private String oSite;

    public Office() {
    }

    public Office(Integer oId, String oName, String oDes, String oSite) {
        this.oId = oId;
        this.oName = oName;
        this.oDes = oDes;
        this.oSite = oSite;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName == null ? null : oName.trim();
    }

    public String getoDes() {
        return oDes;
    }

    public void setoDes(String oDes) {
        this.oDes = oDes == null ? null : oDes.trim();
    }

    public String getoSite() {
        return oSite;
    }

    public void setoSite(String oSite) {
        this.oSite = oSite == null ? null : oSite.trim();
    }

    @Override
    public String toString() {
        return "Office{" +
                "oId=" + oId +
                ", oName='" + oName + '\'' +
                ", oDes='" + oDes + '\'' +
                ", oSite='" + oSite + '\'' +
                '}';
    }
}