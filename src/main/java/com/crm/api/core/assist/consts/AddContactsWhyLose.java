package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AddContactsWhyLose implements EnumType {

    @SerializedName("0")
    NOTHING(0, "无"),

    @SerializedName("1")
    EXIST(1, "已存在"),

    @SerializedName("2")
    NOT_FOUNT(2, "账号不存在"),

    @SerializedName("3")
    FREQUENT_OPERATION(3, "操作频繁"),

    @SerializedName("9")
    UNKNOWN(9, "未知");

    private int    id;
    private String description;

    public static AddContactsWhyLose getById(int id){
        for(AddContactsWhyLose whyLose : AddContactsWhyLose.values()){
            if(whyLose.id == id){
                return whyLose;
            }
        }

        return UNKNOWN;
    }
}
