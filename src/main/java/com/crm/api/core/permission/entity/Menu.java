package com.crm.api.core.permission.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class Menu extends Entity implements Createable, Updateable{

    private String  name;
    private String  url;
    private Boolean allowAllot;
    private Date    createTime;
    private Date    updateTime;
}
