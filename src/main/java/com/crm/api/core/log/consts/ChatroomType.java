package com.crm.api.core.log.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ChatroomType implements EnumType{

    @SerializedName("0")
    CREATE(0, "创建"),

    @SerializedName("1")
    DELETE(1, "删除"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int    id;
    private String description;

    public static ChatroomType getById(int id){
        for(ChatroomType type : ChatroomType.values()){
            if(type.id == id){
                return type;
            }
        }

        return UNKNOWN;
    }
}
