package com.crm.api.core.risk.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;

@Setter
@Getter
public class PhoneCallRecord extends Entity implements Createable {
    private  String     imei;
    private  String     phoneNum;
    // 呼入呼出 true 呼出 false 呼入
    private  Boolean    type;
    private  Date       starTime;
    private  Date       endTime;
    private  String     recordingFile;
    //是否删除 true 已删除 false 否
    private  Boolean    isDelete;
    private  Date       createTime;
}
