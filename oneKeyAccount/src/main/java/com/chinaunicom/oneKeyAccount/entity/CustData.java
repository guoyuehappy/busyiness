package com.chinaunicom.oneKeyAccount.entity;

import java.util.List;

public class CustData {
    private String OPERATOR_ID;                     //操作员ID
    private String PROVINCE;                        //省分
    private String CITY;                             //地市
    private String DISTRICT;                        //区县
    private String CHANNEL_ID;                      //渠道编码
    private String CHANNEL_TYPE;                    //渠道类型
    private Integer CHECK_TYPE;                     //校验类型
    private Integer OPE_SYS_TYPE;                   //办理业务系统
    private Integer SERVICE_CLASS_CODE;            //号码类型
    private String AREA_CODE;                       //号码区号
    private String SERIALNUMBER;                    //号码
    private String CERT_TYPE;                       //证件类型
    private String CERT_NUM;                        //证件号码
    private String CERT_NAME;                       //证件名称
    private String SER_TYPE;                        //受理类型

    public String getOPERATOR_ID() {
        return OPERATOR_ID;
    }

    public void setOPERATOR_ID(String OPERATOR_ID) {
        this.OPERATOR_ID = OPERATOR_ID;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
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

    public Integer getCHECK_TYPE() {
        return CHECK_TYPE;
    }

    public void setCHECK_TYPE(Integer CHECK_TYPE) {
        this.CHECK_TYPE = CHECK_TYPE;
    }

    public Integer getOPE_SYS_TYPE() {
        return OPE_SYS_TYPE;
    }

    public void setOPE_SYS_TYPE(Integer OPE_SYS_TYPE) {
        this.OPE_SYS_TYPE = OPE_SYS_TYPE;
    }

    public Integer getSERVICE_CLASS_CODE() {
        return SERVICE_CLASS_CODE;
    }

    public void setSERVICE_CLASS_CODE(Integer SERVICE_CLASS_CODE) {
        this.SERVICE_CLASS_CODE = SERVICE_CLASS_CODE;
    }

    public String getAREA_CODE() {
        return AREA_CODE;
    }

    public void setAREA_CODE(String AREA_CODE) {
        this.AREA_CODE = AREA_CODE;
    }

    public String getSERIALNUMBER() {
        return SERIALNUMBER;
    }

    public void setSERIALNUMBER(String SERIALNUMBER) {
        this.SERIALNUMBER = SERIALNUMBER;
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

    public String getCERT_NAME() {
        return CERT_NAME;
    }

    public void setCERT_NAME(String CERT_NAME) {
        this.CERT_NAME = CERT_NAME;
    }

    public String getSER_TYPE() {
        return SER_TYPE;
    }

    public void setSER_TYPE(String SER_TYPE) {
        this.SER_TYPE = SER_TYPE;
    }
}
