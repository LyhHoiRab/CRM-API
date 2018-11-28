package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensitiveStatistic{

    //发名片
    private Long sendPersonCard;
    //收名片
    private Long receivePersonCard;
    //发转账
    private Long sendTransfer;
    //收转账
    private Long receiveTransfer;
    //发红包
    private Long sendLuckyPackage;
    //收红包
    private Long receiveLuckyPackage;
    //发地理位置
    private Long sendLocation;
    //收地理位置
    private Long receiveLocation;
    //敏感消息
    private Long sensitiveWordMessage;
    //删除联系人
    private Long deleteFriend;
    //删除聊天记录
    private Long deleteChat;
    //创建群
    private Long createChatroom;
}
