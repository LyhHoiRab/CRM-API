package com.crm.api.core.device.entity;

import com.crm.api.core.group.entity.Groups;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.User;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Device extends Entity implements Createable, Updateable{

    private String       accountId;
    private String       companyId;
    private String       phone;
    private String       imei;
    private String       meid;
    private String       remark;
    private Integer      energy;
    private String       manufacturer;
    private String       appVersion;
    private Integer      patchCode;
    private String       androidVersion;
    private String       model;
    private Date         createTime;
    private Date         updateTime;
    private Boolean      setting;

    private List<Groups> groups;
    private User         user;
}
