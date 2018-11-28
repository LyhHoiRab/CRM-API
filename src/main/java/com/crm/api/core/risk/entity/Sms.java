package com.crm.api.core.risk.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;

@Setter
@Getter
public class Sms extends Entity implements Createable {
    private  String     imei;
    private  String     phone;
    private  String     content;
    //true 发送   false 接收
    private  Boolean    type;
    private  Boolean    isDelete;
    private  Date       time;
    private  Date       createTime;
}
