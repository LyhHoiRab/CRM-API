package com.crm.api.core.log.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ChatRecordType implements EnumType{

    @SerializedName("0")
    RETRACT(0, "撤回"),

    @SerializedName("1")
    DELETE(1, "删除"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int    id;
    private String description;

    public static ChatRecordType getById(int id){
        for(ChatRecordType type : ChatRecordType.values()){
            if(type.id == id){
                return type;
            }
        }

        return UNKNOWN;
    }
}
