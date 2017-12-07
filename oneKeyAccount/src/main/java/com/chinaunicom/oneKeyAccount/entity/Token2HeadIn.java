package com.chinaunicom.oneKeyAccount.entity;

public class Token2HeadIn {
    private  String APP_ID;
    private  String TRANS_ID;
    private  String TIMESTAMP;
    private  String TOKEN;

    public Token2HeadIn() {
    }

    public Token2HeadIn(String APP_ID, String TRANS_ID, String TIMESTAMP, String TOKEN) {
        this.APP_ID = APP_ID;
        this.TRANS_ID = TRANS_ID;
        this.TIMESTAMP = TIMESTAMP;
        this.TOKEN = TOKEN;
    }

    public String getAPP_ID() {
        return APP_ID;
    }

    public void setAPP_ID(String APP_ID) {
        this.APP_ID = APP_ID;
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

    public String getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    @Override
    public String toString() {
        return "Token2HeadIn{" +
                "APP_ID='" + APP_ID + '\'' +
                ", TRANS_ID='" + TRANS_ID + '\'' +
                ", TIMESTAMP='" + TIMESTAMP + '\'' +
                ", TOKEN='" + TOKEN + '\'' +
                '}';
    }
}
