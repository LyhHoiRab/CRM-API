package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WechatStatus{

    @SerializedName("0")
    ONLINE(0, "在线"),

    @SerializedName("1")
    OFFLINE(1, "离线"),

    @SerializedName("2")
    ABNORMAL(2, "异常"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int    id;
    private String description;

    public static WechatStatus getById(int id){
        for(WechatStatus status : WechatStatus.values()){
            if(status.id == id){
                return status;
            }
        }

        return UNKNOWN;
    }
}
