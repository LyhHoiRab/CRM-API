package com.crm.api.core.log.entity;

import com.crm.api.core.log.consts.LoginStatus;
import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class LoginLogger extends Entity implements Createable, Updateable{

    private String      wechatId;
    private LoginStatus status;
    private Date        createTime;
    private Date        updateTime;

    private Wechat wechat;
}
