function submitCheck() {
    //alert("hehe");
    var CHANNEL_ID = $("#CHANNEL_ID").val();
    var STAFF_ID = $("#STAFF_ID").val();
    var SERIAL_NUMBER = $("#SERIAL_NUMBER").val();
    var ICCID = $("#ICCID").val();
    var IMSI = $("#IMSI").val();
    var REQ_NO = $("#REQ_NO").val();
    var SYS_CODE = $("#SYS_CODE").val();
    var PROVINCE_CODE = $("#PROVINCE_CODE").val();
    var CITY_CODE = $("#CITY_CODE").val();
    //alert(CHANNEL_ID+STAFF_ID+SERIAL_NUMBER+ICCID+IMSI+SYS_CODE+PROVINCE_CODE+CITY_CODE);
    $.post(
        "/oneKeyAccount/occupyNum",
        {
            CHANNEL_ID:CHANNEL_ID,STAFF_ID:STAFF_ID,SERIAL_NUMBER:SERIAL_NUMBER,
            ICCID:ICCID,IMSI:IMSI,REQ_NO:REQ_NO,SYS_CODE:SYS_CODE,PROVINCE_CODE:PROVINCE_CODE,
            CITY_CODE:CITY_CODE
        },
        function(data,status){
            //alert(data.UNI_BSS_BODY.IDENTITY_CHECK_RSP);
            $("#occupyNumRsp").html("");
            //alert(data.UNI_BSS_BODY.IDENTITY_CHECK_RSP.RESP_DESC)
            var nlptRsp = data.UNI_BSS_HEAD;
            var businessRsp = data.UNI_BSS_BODY.OCCUPY_NUM_RSP;
            var div = "";
            if((nlptRsp.RESP_CODE =="0000"||nlptRsp.RESP_CODE == "00000") && businessRsp.RESP_CODE == "0000"){
            div = div + "<thead><tr>";
            div = div + "<th>RESP_CODE(响应编码)</th>";
            div = div + "<th>RESP_DESC(响应描述)</th>";
            div = div + "<th>SERIAL_NUMBER(业务号码)</th>";
            div = div + "</tr></thead><tbody>";
            var rsp = data.UNI_BSS_BODY.OCCUPY_NUM_RSP;
            div = div + "<tr>";
            div = div + "<td>" + rsp.RESP_CODE + "</td>";
            div = div + "<td>" + rsp.RESP_DESC + "</td>";
            div = div + "<td>" + rsp.SERIAL_NUMBER + "</td></tr>";
            div = div + "</tbody>";
            }else{
            div = "<tr><td>"+ businessRsp.RESP_DESC +"</td></tr>";
            }
            $("#occupyNumRsp").append(div);
        },
        'json'
    );
}