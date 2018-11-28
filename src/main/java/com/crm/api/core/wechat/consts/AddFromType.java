package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AddFromType{

    @SerializedName(value = "3", alternate = "1000003")
    WECHAT("3", "微信号"),

    @SerializedName(value = "15", alternate = "1000015")
    PHONE("15", "手机号码"),

    @SerializedName(value = "30", alternate = "1000030")
    SCAN("30", "扫一扫"),

    @SerializedName(value = "14", alternate = "1000014")
    CHAT_ROOM("14", "群聊"),

    @SerializedName(value = "17", alternate = "1000017")
    PERSON_CARD("17", "名片"),

    @SerializedName(value = "18", alternate = "1000018")
    NEARBY("18", "附近的人"),

    @SerializedName("48")
    RADAR("48", "雷达"),

    @SerializedName("999")
    UNKNOWN("999", "未知");

    private String id;
    private String description;

    public static AddFromType getById(String id){
        for(AddFromType type : AddFromType.values()){
            if(type.id.equals(id)){
                return type;
            }
        }

        return UNKNOWN;
    }
}
