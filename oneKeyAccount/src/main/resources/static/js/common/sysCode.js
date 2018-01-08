var sysCodeList = {
    "ps":[
        {
            "scode":"0001",
            "sname":"总部CRM平台"
        },
        {
            "scode":"0002",
            "sname":"总部VASP平台"
        },
        {
            "scode":"9900",
            "sname":"cBSS系统"
        }
    ]
};
$(function(){
    for(var i=0;i<sysCodeList.ps.length;i++){
        $("#SYS_CODE").append("<option value='"+sysCodeList.ps[i].scode+"'>"+sysCodeList.ps[i].sname+"</option>");
    }
});