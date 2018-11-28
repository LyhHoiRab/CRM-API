package com.crm.api.core.statistic.entity;

import com.crm.api.core.wechat.consts.WechatMessageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendStatistic{

    //次数
    private Long total;
    //类型
    private WechatMessageType type;
    //时间
    private String date;
    //微信ID
    private String wechatId;
    //微信名
    private String wechatNickname;
    //微信号
    private String wechatWxno;
}
