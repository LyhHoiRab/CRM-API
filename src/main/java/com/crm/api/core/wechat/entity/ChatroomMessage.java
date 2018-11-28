package com.crm.api.core.wechat.entity;

import com.crm.api.core.wechat.consts.WechatMessageStatus;
import com.crm.api.core.wechat.consts.WechatMessageType;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.User;

import java.util.Date;

@Getter
@Setter
public class ChatroomMessage extends Entity implements Createable, Updateable{

    @SerializedName(value = "wechatId", alternate = "token")
    private String              wechatId;
    @SerializedName(value = "roomid", alternate = "username")
    private String              roomid;
    @SerializedName(value = "type", alternate = "msgType")
    private WechatMessageType   type;
    private String              sellerId;
    private String              sender;
    private String              content;
    private String              extract;
    private String              msgId;
    private WechatMessageStatus status;
    private Date                conversationTime;
    private Boolean             hasWord;
    private String              words;
    private Boolean             loaded;
    private Date                createTime;
    private Date                updateTime;

    private ChatroomMember member;
    private User           seller;
}
