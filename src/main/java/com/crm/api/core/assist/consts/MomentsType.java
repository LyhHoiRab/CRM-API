package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum MomentsType implements EnumType{
    @SerializedName("0")
    IMAGE(0, "图文"),

    @SerializedName("1")
    VIDEO(1, "视频"),

    @SerializedName("2")
    TEXT(2, "文本"),

    @SerializedName("3")
    LINK(3, "链接"),

    @SerializedName("99")
    UNKNOWN(99, "未知");

    private int    id;
    private String description;

    public static MomentsType getById(int id){
        for(MomentsType type : MomentsType.values()){
            if(type.id == id){
                return type;
            }
        }

        return UNKNOWN;
    }
}
