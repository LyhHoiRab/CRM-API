package com.crm.api.core.log.entity;

import com.crm.api.core.log.consts.RedistributeType;
import com.crm.api.core.wechat.entity.WechatFriend;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.entity.User;

import java.util.Date;

@Getter
@Setter
public class RedistributeLogger extends Entity implements Createable{

    private String           wechatId;
    private String           wxid;
    private String           sellerId;
    private RedistributeType type;
    private Date             createTime;

    private WechatFriend friend;
    private User         seller;
}
