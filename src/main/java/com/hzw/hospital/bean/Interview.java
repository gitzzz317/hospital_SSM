package com.hzw.hospital.bean;


public class Interview {
    private Integer iId;

    private Integer pId;

    private String  iDate;

    private String iTime;

    private Integer dId;

    public Interview() {
    }

    public Interview(Integer iId, Integer pId, String  iDate, String iTime, Integer dId) {
        this.iId = iId;
        this.pId = pId;
        this.iDate = iDate;
        this.iTime = iTime;
        this.dId = dId;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String  getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate;
    }

    public String getiTime() {
        return iTime;
    }

    public void setiTime(String iTime) {
        this.iTime = iTime == null ? null : iTime.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "iId=" + iId +
                ", pId=" + pId +
                ", iDate=" + iDate +
                ", iTime='" + iTime + '\'' +
                ", dId=" + dId +
                '}';
    }
}