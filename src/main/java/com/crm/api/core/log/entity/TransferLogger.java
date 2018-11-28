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
public class TransferLogger extends Entity implements Createable, Updateable{

    private String            wechatId;
    private String            wxid;
    private String            messageId;
    private Double            amount;
    private WechatMessageType type;
    private Date              conversationTime;
    private Date              createTime;
    private Date              updateTime;
}
