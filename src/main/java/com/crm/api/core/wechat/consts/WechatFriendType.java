package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WechatFriendType implements EnumType{

    @SerializedName("0")
    FRIEND(0, "好友"),

    @SerializedName("1")
    HELPER(1, "微信助手"),

    @SerializedName("2")
    SUBSCRIPTION(2, "公众号"),

    @SerializedName("3")
    SELF(3, "本人"),

    @SerializedName("4")
    ZOMBIE_FAN(4, "僵尸粉"),

    @SerializedName("5")
    APPLY(5, "好友申请"),

    @SerializedName("6")
    APP(6, "小程序"),

    @SerializedName("7")
    DELETED(7, "已删除的好友"),

    @SerializedName("8")
    WAIT_FOR_PASS(8, "等待通过的好友"),

    @SerializedName("999")
    OTHER(999, "其他");

    private int    id;
    private String description;

    public static WechatFriendType getById(int id){
        for(WechatFriendType type : WechatFriendType.values()){
            if(type.id == id){
                return type;
            }
        }

        return OTHER;
    }
}
