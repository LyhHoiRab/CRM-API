package com.crm.api.core.statistic.entity;

import com.crm.api.core.log.entity.WechatFriendLogger;
import com.crm.api.core.wechat.entity.Wechat;
import com.crm.api.core.wechat.entity.WechatFriend;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FansDetailsStatistic{

    private String             loggerId;
    private Wechat             wechat;
    private WechatFriend       friend;
    private WechatFriendLogger logger;
}
