package com.crm.api.core.log.entity;

import com.crm.api.core.log.consts.ChatRecordType;
import com.crm.api.core.wechat.entity.Wechat;
import com.crm.api.core.wechat.entity.WechatFriend;
import com.crm.api.core.wechat.entity.WechatMessage;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.User;

import java.util.Date;

@Getter
@Setter
public class ChatRecordLogger extends Entity implements Createable, Updateable{

    private String wechatId;
    private String wxid;
    private String msgId;
    private String content;
    private Date   createTime;
    private Date   updateTime;

    private ChatRecordType type;

    private Wechat        wechat;
    private WechatFriend  friend;
    private User          seller;
    private WechatMessage message;
}
