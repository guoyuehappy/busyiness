function submitCheck() {
    //alert("hehe");
    var CERT_NAME = $("#CERT_NAME").val();
    var CERT_NUM = $("#CERT_NUM").val();
    var ID_TYPE = $("#ID_TYPE").val();
    var CERT_TYPE = $("#CERT_TYPE").val();
    var SYS_CODE = $("#SYS_CODE").val();
    var PROVINCE_CODE = $("#PROVINCE_CODE").val();
    var EPARCHY_CODE = $("#EPARCHY_CODE").val();
    //alert(CERT_NAME+CERT_NUM+ID_TYPE+CERT_TYPE+SYS_CODE+PROVINCE_CODE+EPARCHY_CODE);
    $.post(
        "/oneKeyAccount/identityCheck",
        {
            CERT_NAME:CERT_NAME,CERT_NUM:CERT_NUM,ID_TYPE:ID_TYPE,
            CERT_TYPE:CERT_TYPE,SYS_CODE:SYS_CODE,PROVINCE_CODE:PROVINCE_CODE,
            EPARCHY_CODE:EPARCHY_CODE
        },
        function(data,status){
            //alert(data.UNI_BSS_BODY.IDENTITY_CHECK_RSP);
            $("#idetityCheckRsp").html("");
            var nlptRsp = data.UNI_BSS_HEAD;
            var businessRsp = data.UNI_BSS_BODY.IDENTITY_CHECK_RSP;
            var div = "";
            if((nlptRsp.RESP_CODE =="0000"||nlptRsp.RESP_CODE == "00000") && businessRsp.RESP_CODE == "0000") {
                div = div + "<thead><tr>";
                div = div + "<th>RESP_CODE(响应编码)</th>";
                div = div + "<th>RESP_DESC(响应描述)</th>";
                div = div + "<th>CERT_PHOTO(证件照片)</th>";
                div = div + "</tr></thead><tbody>";
                var rsp = data.UNI_BSS_BODY.IDENTITY_CHECK_RSP;
                div = div + "<tr>";
                div = div + "<td>" + rsp.RESP_CODE + "</td>";
                div = div + "<td>" + rsp.RESP_DESC + "</td>";
                div = div + '<td><img src="data:image/png;base64,' + rsp.CERT_PHOTO + '"></img></td></tr>';
                div = div + "</tbody>";
            }else{
                div = "<tr><td>"+ businessRsp.RESP_DESC +"</td></tr>";
            }
            $("#idetityCheckRsp").append(div);
        },
        'json'
    );
}