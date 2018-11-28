package com.crm.api.core.assist.entity;

import com.crm.api.core.assist.consts.ZombieFanState;
import com.crm.api.core.wechat.entity.Wechat;
import com.crm.api.core.wechat.entity.WechatFriend;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ZombieFan extends Entity implements Createable, Updateable {
    private String                  wechatId;
    private ZombieFanState          state;
    private String                  companyId;
    private Date                    updateTime;
    private Date                    createTime;
    private Wechat                  wechat;
    private List<String>            wxids;
    private List<WechatFriend>      zombieFans;
    private WechatFriend            wechatFriend;
    private Date                    lastMessageTime;
    private String                  userId;
}
