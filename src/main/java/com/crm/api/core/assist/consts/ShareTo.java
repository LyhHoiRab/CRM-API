package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ShareTo implements EnumType {

    @SerializedName("0")
    PUBLIC(0, "公开"),

    @SerializedName("1")
    PRIVATE(1, "私密"),

    @SerializedName("2")
    SHARE_LIST(2, "部分可见"),

    @SerializedName("3")
    DO_NOT_SHARE_LIST(3, "不给谁看"),

    @SerializedName("4")
    UNKNOWN(4, "未知");

    private int    id;
    private String description;

    public static ShareTo getById(int id){
        for(ShareTo shareTo : ShareTo.values()){
            if(shareTo.id == id){
                return shareTo;
            }
        }

        return UNKNOWN;
    }
}
