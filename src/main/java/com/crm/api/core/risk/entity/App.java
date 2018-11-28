package com.crm.api.core.risk.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Setter
@Getter
public class App extends Entity implements Createable, Updateable {
    private String  name;
    private String  packageName;
    // true 自定义 false 系统
    private Boolean type;
    private Date    createTime;
    private Date    updateTime;

    private Long addDevice;
}
