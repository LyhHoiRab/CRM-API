package com.crm.api.core.wechat.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Chatroom extends Entity implements Createable, Updateable{

    private String  wechatId;
    private String  roomid;
    private String  owner;
    private String  name;
    private Date    createTime;
    private Date    updateTime;
    private String  memberString;

    private List<ChatroomMember> members;
    private Wechat               wechat;
}
