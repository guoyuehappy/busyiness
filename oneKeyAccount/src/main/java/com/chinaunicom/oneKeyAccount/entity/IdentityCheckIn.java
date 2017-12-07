package com.chinaunicom.oneKeyAccount.entity;

public class IdentityCheckIn {
    private String SYS_CODE;                     //系统编码
    private String PROVINCE_CODE;               //省分编码
    private String EPARCHY_CODE;                //地市编码
    private String ID_TYPE;                     //证件类型
    private String CERT_NAME;                   //证件姓名
    private String CERT_TYPE;                   //认证类型
    private String CERT_NUM;                    //证件编码

    public IdentityCheckIn() {
    }

    public IdentityCheckIn(String SYS_CODE, String PROVINCE_CODE, String EPARCHY_CODE, String ID_TYPE, String CERT_NAME, String CERT_TYPE, String CERT_NUM) {
        this.SYS_CODE = SYS_CODE;
        this.PROVINCE_CODE = PROVINCE_CODE;
        this.EPARCHY_CODE = EPARCHY_CODE;
        this.ID_TYPE = ID_TYPE;
        this.CERT_NAME = CERT_NAME;
        this.CERT_TYPE = CERT_TYPE;
        this.CERT_NUM = CERT_NUM;
    }

    public String getSYS_CODE() {
        return SYS_CODE;
    }

    public void setSYS_CODE(String SYS_CODE) {
        this.SYS_CODE = SYS_CODE;
    }

    public String getPROVINCE_CODE() {
        return PROVINCE_CODE;
    }

    public void setPROVINCE_CODE(String PROVINCE_CODE) {
        this.PROVINCE_CODE = PROVINCE_CODE;
    }

    public String getEPARCHY_CODE() {
        return EPARCHY_CODE;
    }

    public void setEPARCHY_CODE(String EPARCHY_CODE) {
        this.EPARCHY_CODE = EPARCHY_CODE;
    }

    public String getID_TYPE() {
        return ID_TYPE;
    }

    public void setID_TYPE(String ID_TYPE) {
        this.ID_TYPE = ID_TYPE;
    }

    public String getCERT_NAME() {
        return CERT_NAME;
    }

    public void setCERT_NAME(String CERT_NAME) {
        this.CERT_NAME = CERT_NAME;
    }

    public String getCERT_TYPE() {
        return CERT_TYPE;
    }

    public void setCERT_TYPE(String CERT_TYPE) {
        this.CERT_TYPE = CERT_TYPE;
    }

    public String getCERT_NUM() {
        return CERT_NUM;
    }

    public void setCERT_NUM(String CERT_NUM) {
        this.CERT_NUM = CERT_NUM;
    }

    @Override
    public String toString() {
        return "IdentityCheckIn{" +
                "SYS_CODE='" + SYS_CODE + '\'' +
                ", PROVINCE_CODE='" + PROVINCE_CODE + '\'' +
                ", EPARCHY_CODE='" + EPARCHY_CODE + '\'' +
                ", ID_TYPE='" + ID_TYPE + '\'' +
                ", CERT_NAME='" + CERT_NAME + '\'' +
                ", CERT_TYPE='" + CERT_TYPE + '\'' +
                ", CERT_NUM='" + CERT_NUM + '\'' +
                '}';
    }
}
