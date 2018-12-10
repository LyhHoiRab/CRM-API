package com.crm.api.core.organization.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Company extends Entity implements Createable, Updateable{

    private String name;
    private String address;
    private String phone;
    //营业执照注册号
    private String licenseNumber;
    //法定代表人
    private String legalPerson;

    private Date   createTime;
    private Date   updateTime;

    //剩余用时长
    private Long totalMins;
    //总通话时长
    private Long limitMins;
    //同时在线微信数量
    private Long wechatTotal;
    //客服数量
    private Long sellerTotal;
    //呼叫号码
    private String callNumber;
    //设备数量
    private Long deviceTotal;

    private List<Department> departments;
}
