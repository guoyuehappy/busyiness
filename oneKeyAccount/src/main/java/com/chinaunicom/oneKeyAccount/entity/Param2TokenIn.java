package com.chinaunicom.oneKeyAccount.entity;

public class Param2TokenIn {
    private  String APP_ID;
    private  String APP_SECRET;
    private  String TRANS_ID;
    private  String TIMESTAMP;

    public Param2TokenIn() {
    }

    public Param2TokenIn(String APP_ID, String APP_SECRET, String TRANS_ID, String TIMESTAMP) {
        this.APP_ID = APP_ID;
        this.APP_SECRET = APP_SECRET;
        this.TRANS_ID = TRANS_ID;
        this.TIMESTAMP = TIMESTAMP;
    }

    public String getAPP_ID() {
        return APP_ID;
    }

    public void setAPP_ID(String APP_ID) {
        this.APP_ID = APP_ID;
    }

    public String getAPP_SECRET() {
        return APP_SECRET;
    }

    public void setAPP_SECRET(String APP_SECRET) {
        this.APP_SECRET = APP_SECRET;
    }

    public String getTRANS_ID() {
        return TRANS_ID;
    }

    public void setTRANS_ID(String TRANS_ID) {
        this.TRANS_ID = TRANS_ID;
    }

    public String getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(String TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    @Override
    public String toString() {
        return "Param2TokenIn{" +
                "APP_ID='" + APP_ID + '\'' +
                ", APP_SECRET='" + APP_SECRET + '\'' +
                ", TRANS_ID='" + TRANS_ID + '\'' +
                ", TIMESTAMP='" + TIMESTAMP + '\'' +
                '}';
    }
}
