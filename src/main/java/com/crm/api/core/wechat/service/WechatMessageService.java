package com.crm.api.core.wechat.service;

import org.wah.doraemon.entity.consts.UsingState;

public interface WechatMessageService{

    void wechatSwitch(String id, UsingState state);
}
