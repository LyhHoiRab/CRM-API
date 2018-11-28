package com.crm.api.core.statistic.entity;

import com.crm.api.core.wechat.consts.AddFromType;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.entity.consts.Sex;

@Getter
@Setter
public class WechatFriendStatistic{

    //次数
    private Long total;
    //性别
    private Sex sex;
    //地区
    private String region;
    //省
    private String province;
    //市
    private String city;
    //来源
    private AddFromType addFrom;
    //微信ID
    private String wechatId;
    //微信名
    private String wechatNickname;
    //微信号
    private String wechatWxno;
}
