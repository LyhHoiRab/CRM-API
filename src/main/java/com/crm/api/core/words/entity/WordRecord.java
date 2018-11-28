package com.crm.api.core.words.entity;

import com.crm.api.core.wechat.entity.Wechat;
import com.crm.api.core.wechat.entity.WechatFriend;
import com.crm.api.core.words.consts.WordRecordState;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.User;

import java.util.Date;

@Getter
@Setter
public class WordRecord extends Entity implements Createable, Updateable{

    private String          messageId;
    private String          words;
    private String          operatorId;
    private WordRecordState state;
    private Date            createTime;
    private Date            updateTime;

    private Wechat       wechat;
    private WechatFriend friend;
    private User         seller;
    private User         operator;
}
