package com.chinaunicom.oneKeyAccount.utils;

import com.chinaunicom.oneKeyAccount.entity.Param2TokenIn;
import com.chinaunicom.oneKeyAccount.entity.Token2HeadIn;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfy
 * @since  2017-12-06
 */
public class Utils {
    private  static   JsonConfig jsonConfig = new JsonConfig();
    static {
        PropertyFilter filter = new PropertyFilter() {
            public boolean apply(Object object, String fieldName, Object fieldValue) {
                return null == fieldValue;
            }
        };
        jsonConfig.setJsonPropertyFilter(filter);
    }

    /**
     * 将对象转json
     * @param object  要转json的对象
     * @return
     */
    public static String object2jsonString(Object object){
        return JSONObject.fromObject(object,jsonConfig).toString();
    }

    /**
     * @author yangjiangyun
     * 根据APP_ID、APP_SECRET、TRANS_ID、TIMESTAMP生产token
     * return Token2HeadIn
     */
    public Token2HeadIn GenerateToken(Param2TokenIn param2TokenIn){
        String APP_ID = param2TokenIn.getAPP_ID();
        String APP_SECRET = param2TokenIn.getAPP_SECRET();
        String TIMESTAMP = param2TokenIn.getTIMESTAMP();
        String TRANS_ID = param2TokenIn.getTRANS_ID();
        Date date = new Date();
        if(TIMESTAMP == null || param2TokenIn.getTIMESTAMP() == ""){
            // timestamp: 将上面生成的时间格式化成 yyyy-MM-dd HH:mm:ss SSS
            TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(date);
        }

        if(TRANS_ID == null || TRANS_ID == ""){
            // timestamp: 将上面生成的时间格式化成 yyyyMMddHHmmssSSS接六位随机数
            TRANS_ID = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(date) + (int)((Math.random()*9+1)*100000);
        }

        System.out.println(TIMESTAMP + "     " + TRANS_ID);
        //APP_ID、TIMESTAMP、TRANS_ID、app_secret拼接成 APP_IDabcTIMESTAMP2016-04-12 15:06:06 100TRANS_ID20160412150606100335423B2732427app_secret
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("APP_ID").append(APP_ID);
        stringBuffer.append("TIMESTAMP").append(TIMESTAMP);
        stringBuffer.append("TRANS_ID").append(TRANS_ID);
        stringBuffer.append(APP_SECRET);

        //调用MD5生成token；
        String token = new Utils().MD5(stringBuffer.toString());

        Token2HeadIn token2HeadIn = new Token2HeadIn();
        token2HeadIn.setAPP_ID(APP_ID);
        token2HeadIn.setTIMESTAMP(TIMESTAMP);
        token2HeadIn.setTRANS_ID(TRANS_ID);
        token2HeadIn.setTOKEN(token);
        return token2HeadIn;
    }

    /**
     * author yangjiangyun
     * MD5生成token的方法
     * @param string
     * @return
     */
    public String MD5(String string){
        String result = "";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            md5.update((string).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte b[] = md5.digest();

        int i;
        StringBuffer buf = new StringBuffer("");

        for(int offset=0; offset<b.length; offset++){
            i = b[offset];
            if(i<0){
                i+=256;
            }
            if(i<16){
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }

        result = buf.toString();
        System.out.println("result = " + result);
        return result;
    }

}
