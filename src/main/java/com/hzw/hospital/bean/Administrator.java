package com.hzw.hospital.bean;

public class Administrator {
    private String mId;

    private String mPwd;

    public Administrator() {
    }

    public Administrator(String mId, String mPwd) {
        this.mId = mId;
        this.mPwd = mPwd;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd == null ? null : mPwd.trim();
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "mId='" + mId + '\'' +
                ", mPwd='" + mPwd + '\'' +
                '}';
    }
}