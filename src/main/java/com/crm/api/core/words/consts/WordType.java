package com.crm.api.core.words.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WordType implements EnumType{

    @SerializedName("0")
    NOTICE(0, "通知"),

    @SerializedName("1")
    INTERCEPT(1, "拦截");

    private int    id;
    private String description;

    public static WordType getById(int id){
        for(WordType type : WordType.values()){
            if(type.id == id){
                return type;
            }
        }

        return NOTICE;
    }
}
