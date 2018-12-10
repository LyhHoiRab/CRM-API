package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WechatMessageType{

    @SerializedName("1")
    TEXT("1", "文本"),

    @SerializedName("3")
    IMAGE("3", "图片"),

    @SerializedName("34")
    VOICE("34", "语音"),

    @SerializedName("43")
    VIDEO("43", "视频"),

    @SerializedName("42")
    PERSON_CARD("42", "个人名片"),

    @SerializedName("47")
    EMOTICONS("47", "动画图片"),

    @SerializedName("48")
    LOCATION("48", "地理位置分享"),

    @SerializedName("49")
    SHARE("49", "分享"),

    @SerializedName("50")
    ONLINE_TALK("50", "视频/语音聊天"),

    @SerializedName("10000")
    SYSTEM("10000", "系统消息"),

    @SerializedName("436207665")
    LUCKY_PACKAGE("436207665", "收到红包"),

    @SerializedName("436207668")
    LUCKY_PACKAGE_SEND("436207668", "发红包"),

    @SerializedName("419430449")
    TRANSFER("419430449", "收到转账"),

    @SerializedName("2000")
    TRANSFER_CONFIRM("2000", "确认转账"),

    @SerializedName("2001")
    TRANSFER_SEND("2001", "发转账"),

    @SerializedName("419430452")
    TRANSFER_DRAW("419430452", "转账被领取"),

    @SerializedName("55535")
    LUCKY_PACKAGE_TRANSFER_CONFIRM("55535", "确认红包"),

    @SerializedName("100")
    NEW_FRIEND("100", "自动通过好友"),

    @SerializedName("101")
    DELETE_FRIEND("101", "删除好友"),

    @SerializedName("102")
    MANUAL_NEW_FRIEND("102", "手动通过好友"),

    @SerializedName("103")
    FRIEND_ADVICE("103", "好友申请"),

    @SerializedName("104")
    FRIEND_ADD("104", "主动加好友"),

    @SerializedName("111")
    SHOW_PHONE("111", "显示电话开关"),

    @SerializedName("112")
    RECEIPT("112", "能否收款开关"),

    @SerializedName("113")
    DELETE_FRIENDS("113", "删除好友开关"),

    @SerializedName("114")
    DELETE_CHAT_RECORD("114", "删除聊天记录开关"),

    @SerializedName("115")
    SETTING("115", "微信设置开关"),

    @SerializedName("116")
    SHOW_WXNO("116", "显示微信号开关"),

    @SerializedName("117")
    SCAN("117", "微信扫一扫开关"),

    @SerializedName("118")
    PASS_NEW_FRIEND_SWITCH("118", "好友通过开关"),

    @SerializedName("119")
    LUCKY_PACKAGE_SWITCH("119", "自动收款开关"),

    @SerializedName("200")
    MOMENTS("200", "朋友圈"),

    @SerializedName("201")
    ADDCONTACTS("201", "添加好友"),

    @SerializedName("202")
    WECHAT_SWITCH("202", "微信权限开关"),

    @SerializedName("203")
    APP_UPGRADE("203", "APP热更新"),

    @SerializedName("204")
    APPS_UPGRADE("204", "手机应用更新"),

    @SerializedName("205")
    WORD_CHANGE("205", "敏感词更新"),

    @SerializedName("206")
    REMARK("207", "修改备注"),

    @SerializedName("207")
    PHONE("208", "修改电话号码"),

    @SerializedName("208")
    REPEAT_FRIEND("208", "重复好友通知"),

    @SerializedName("209")
    FRIEND_GROUP_CHANGE("209", "好友分组更改通知"),

    @SerializedName("210")
    ZOMBIE_FAN_CHECK("210", "僵尸粉查询"),

    //保留211
    @SerializedName("212")
    DEVICE_SETTING("212", "设备设置开关"),

    @SerializedName("213")
    DEVICE_BACK_TO_DESKTOP("213", "设备返回桌面设置"),

    @SerializedName("999")
    UNKNOWN("999", "未知");

    private String id;
    private String description;

    public static WechatMessageType getById(String id){
        if(StringUtils.isBlank(id)){
            return UNKNOWN;
        }

        for(WechatMessageType type : WechatMessageType.values()){
            if(type.id.equals(id)){
                return type;
            }
        }

        return UNKNOWN;
    }
}
