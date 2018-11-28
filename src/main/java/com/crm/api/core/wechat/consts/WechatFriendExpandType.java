package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;
import org.wah.doraemon.security.exception.UnknownEnumTypeException;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WechatFriendExpandType implements EnumType{

    @SerializedName("0")
    CHECKBOX(0, "多选"),

    @SerializedName("1")
    RADIO(1, "单选"),

    @SerializedName("2")
    VARCHAR(2, "单行文本"),

    @SerializedName("3")
    TEXT(3, "多行文本"),

    @SerializedName("4")
    DATE(4, "日期"),

    @SerializedName("5")
    DATETIME(5, "日期时间"),

    @SerializedName("6")
    NUMBER(6, "数字");

    private int    id;
    private String description;

    public static WechatFriendExpandType getById(int id){
        for(WechatFriendExpandType type : WechatFriendExpandType.values()){
            if(type.id == id){
                return type;
            }
        }

        throw new UnknownEnumTypeException("未知的微信用户扩展字段类型常量ID[{0}]", id);
    }
}
