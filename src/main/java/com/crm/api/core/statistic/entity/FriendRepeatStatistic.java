package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class FriendRepeatStatistic{

    private String friendNickname;
    private String friendWxid;
    private String friendWxno;
    private String friendRemarkname;
    private String friendHeadImgUrl;
    private Map<String, Object> wechatInfos;
}
