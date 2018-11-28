package com.crm.api.core.upgrade.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class PatchVersion extends Entity implements Createable, Updateable{

    //版本
    private Integer version;
    //适用版本
    private Integer applyTo;
    //更新内容
    private String  content;
    //原始包
    private String  originalUrl;
    //补丁包
    private String  patchUrl;
    private Date    createTime;
    private Date    updateTime;
}
