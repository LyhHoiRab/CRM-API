package com.crm.api.core.risk.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;

@Getter
@Setter
public class PhonePermission extends Entity implements Createable{
    private Integer type;
    private String  name;
    private Date    createTime;

    private Boolean isSelete;
    private Integer count;
}
