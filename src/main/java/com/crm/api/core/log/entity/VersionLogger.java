package com.crm.api.core.log.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class VersionLogger extends Entity implements Createable, Updateable{

    private String  content;
    private String  applyVersion;
    private String  patchVersion;
    private String  versionName;
    private Integer versionCode;
    private Date    createTime;
    private Date    updateTime;
}
