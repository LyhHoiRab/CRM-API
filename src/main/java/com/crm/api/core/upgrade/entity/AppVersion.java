package com.crm.api.core.upgrade.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class AppVersion extends Entity implements Createable, Updateable{

    //版本名
    private String  version;
    //版本号
    private Integer versionCode;
    //更新内容
    private String  content;
    //路径
    private String  url;
    private Date    createTime;
    private Date    updateTime;
}
