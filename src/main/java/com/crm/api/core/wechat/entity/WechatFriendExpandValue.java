package com.crm.api.core.wechat.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class WechatFriendExpandValue extends Entity implements Createable, Updateable{

    private String expandId;
    private String friendId;
    private String value;
    private Date   createTime;
    private Date   updateTime;

    private WechatFriendExpand expand;
}
