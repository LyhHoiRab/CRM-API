package com.crm.api.core.log.entity;

import com.crm.api.core.wechat.consts.WechatMessageType;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class WechatFriendLogger extends Entity implements Createable, Updateable{

    private String                 wechatId;
    private String                 wxid;
    private WechatMessageType      type;
    private Date                   createTime;
    private Date                   updateTime;
    private Date                   applyTime;
}
