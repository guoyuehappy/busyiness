package com.chinaunicom.oneKeyAccount.entity;

public class OccupyNumIn {
    private String PROVINCE_CODE;              //省分编码
    private String CITY_CODE;                  //地市编码
    private String DISTRICT_CODE;             //区县编码（工号如果有区县编码，必填。如果工号没有区县编码，不填）
    private String CHANNEL_ID;                //渠道编码
    private String CHANNEL_TYPE;             //渠道类型（不校验，如果传入就使用。如果不传入。默认为工号对应的编码）
    private String STAFF_ID;                 //操作员ID（接口会对工号进行合理性校验。同时会校验工号对应的省分、地市、部门、渠道、渠道类型和 其他入参是否 匹配）
    private String SYS_CODE;                //机构系统编码
    private String SERIAL_NUMBER;           //业务号码
    private String ICCID;                    //卡号
    private String IMSI;                     //IMSI
    private String REQ_NO;                  //业务流水

    public OccupyNumIn() {
    }

    public OccupyNumIn(String PROVINCE_CODE, String CITY_CODE, String DISTRICT_CODE, String CHANNEL_ID, String CHANNEL_TYPE, String STAFF_ID, String SYS_CODE, String SERIAL_NUMBER, String ICCID, String IMSI, String REQ_NO) {
        this.PROVINCE_CODE = PROVINCE_CODE;
        this.CITY_CODE = CITY_CODE;
        this.DISTRICT_CODE = DISTRICT_CODE;
        this.CHANNEL_ID = CHANNEL_ID;
        this.CHANNEL_TYPE = CHANNEL_TYPE;
        this.STAFF_ID = STAFF_ID;
        this.SYS_CODE = SYS_CODE;
        this.SERIAL_NUMBER = SERIAL_NUMBER;
        this.ICCID = ICCID;
        this.IMSI = IMSI;
        this.REQ_NO = REQ_NO;
    }

    public String getPROVINCE_CODE() {
        return PROVINCE_CODE;
    }

    public void setPROVINCE_CODE(String PROVINCE_CODE) {
        this.PROVINCE_CODE = PROVINCE_CODE;
    }

    public String getCITY_CODE() {
        return CITY_CODE;
    }

    public void setCITY_CODE(String CITY_CODE) {
        this.CITY_CODE = CITY_CODE;
    }

    public String getDISTRICT_CODE() {
        return DISTRICT_CODE;
    }

    public void setDISTRICT_CODE(String DISTRICT_CODE) {
        this.DISTRICT_CODE = DISTRICT_CODE;
    }

    public String getCHANNEL_ID() {
        return CHANNEL_ID;
    }

    public void setCHANNEL_ID(String CHANNEL_ID) {
        this.CHANNEL_ID = CHANNEL_ID;
    }

    public String getCHANNEL_TYPE() {
        return CHANNEL_TYPE;
    }

    public void setCHANNEL_TYPE(String CHANNEL_TYPE) {
        this.CHANNEL_TYPE = CHANNEL_TYPE;
    }

    public String getSTAFF_ID() {
        return STAFF_ID;
    }

    public void setSTAFF_ID(String STAFF_ID) {
        this.STAFF_ID = STAFF_ID;
    }

    public String getSYS_CODE() {
        return SYS_CODE;
    }

    public void setSYS_CODE(String SYS_CODE) {
        this.SYS_CODE = SYS_CODE;
    }

    public String getSERIAL_NUMBER() {
        return SERIAL_NUMBER;
    }

    public void setSERIAL_NUMBER(String SERIAL_NUMBER) {
        this.SERIAL_NUMBER = SERIAL_NUMBER;
    }

    public String getICCID() {
        return ICCID;
    }

    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    public String getREQ_NO() {
        return REQ_NO;
    }

    public void setREQ_NO(String REQ_NO) {
        this.REQ_NO = REQ_NO;
    }

    @Override
    public String toString() {
        return "OccupyNumIn{" +
                "PROVINCE_CODE='" + PROVINCE_CODE + '\'' +
                ", CITY_CODE='" + CITY_CODE + '\'' +
                ", DISTRICT_CODE='" + DISTRICT_CODE + '\'' +
                ", CHANNEL_ID='" + CHANNEL_ID + '\'' +
                ", CHANNEL_TYPE='" + CHANNEL_TYPE + '\'' +
                ", STAFF_ID='" + STAFF_ID + '\'' +
                ", SYS_CODE='" + SYS_CODE + '\'' +
                ", SERIAL_NUMBER='" + SERIAL_NUMBER + '\'' +
                ", ICCID='" + ICCID + '\'' +
                ", IMSI='" + IMSI + '\'' +
                ", REQ_NO='" + REQ_NO + '\'' +
                '}';
    }
}
