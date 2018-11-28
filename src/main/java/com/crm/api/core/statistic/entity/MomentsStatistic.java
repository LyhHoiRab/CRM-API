package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MomentsStatistic{

    //次数
    private Long total;
    //微信ID
    private String wechatId;
    //微信名
    private String wechatNickname;
    //微信号
    private String wechatWxno;
}
