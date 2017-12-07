package com.chinaunicom.oneKeyAccount.controller;

import com.chinaunicom.oneKeyAccount.entity.IdentityCheckIn;
import com.chinaunicom.oneKeyAccount.entity.Token2HeadIn;
import com.chinaunicom.oneKeyAccount.utils.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

@RequestMapping("/oneKeyAccount")
@Controller
public class OneKeyAccountController {
    @Value("${nlpt.address}")
    private  String vistAddress;

    @RequestMapping("/index")
    public String index(){
        return "identityCheck";
    }

    @RequestMapping(value="/identityCheck",method = RequestMethod.POST)
    @ResponseBody
    public  String identityCheck(IdentityCheckIn identityCheckIn, Token2HeadIn token2HeadIn, Model model) {
        /*identityCheckIn.setCERT_NAME("赵昕");
        identityCheckIn.setCERT_NUM("622102199005240617");
        identityCheckIn.setCERT_TYPE("01");
        identityCheckIn.setSYS_CODE("9900");
        identityCheckIn.setPROVINCE_CODE("81");
        identityCheckIn.setEPARCHY_CODE("810");
        identityCheckIn.setID_TYPE("3");*/
        token2HeadIn.setAPP_ID("qJvt7XIWKN");
        token2HeadIn.setTIMESTAMP("2017-12-05 16:32:21 229");
        token2HeadIn.setTRANS_ID("20171205031982040028");
        token2HeadIn.setTOKEN("61f73c1bbe340519754415e4009f3ee9");
        String reqString  = buildReqString(identityCheckIn,token2HeadIn,"IDENTITY_CHECK_REQ");
        String url = vistAddress+"api/naturePersonCenter/faceRecognition/identityCheck/v1";
        return httpPost(reqString,url);
    }

    public String httpPost(String reqString,String requestUrl){
        StringBuffer sbf = new StringBuffer();
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            /* 设置请求报文的参数类型，若不写则出现415错误（不接受的类型） */
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            byte[]param = reqString.getBytes();
            /*输入参数以字节流的形式传递*/
            conn.getOutputStream().write(param);
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String output;

            while ((output = br.readLine()) != null) {
                sbf.append(output);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sbf.toString();
    }

    /**
     *
     * @param param2bodyReq  //业务参数实体
     * @param token2HeadIn   //系统参数实体
     * @param whatReq         //UNI_BSS_BODY中的req层级名称
     * @return
     */
    public  String buildReqString(Object param2bodyReq, Token2HeadIn token2HeadIn,String whatReq){
        String ret = null;
        Map< String, Object > req = new LinkedHashMap< String, Object >();
        Map<String, Object> UNI_BSS_BODY = new LinkedHashMap<String, Object>();
        req.put("UNI_BSS_HEAD",token2HeadIn);
        UNI_BSS_BODY.put(whatReq,param2bodyReq);
        req.put("UNI_BSS_BODY",UNI_BSS_BODY);
        return Utils.object2jsonString(req);
    }
}