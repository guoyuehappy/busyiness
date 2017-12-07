package com.chinaunicom.oneKeyAccount.utils;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

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
}
