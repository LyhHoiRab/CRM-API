package com.crm.api.core.log.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum RedistributeType implements EnumType{

    @SerializedName("0")
    AUTOMATIC(0, "自动"),

    @SerializedName("1")
    ARTIFICIAL(1, "手动"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int    id;
    private String description;

    public static RedistributeType getById(int id){
        for(RedistributeType type : RedistributeType.values()){
            if(type.id == id){
                return type;
            }
        }

        return UNKNOWN;
    }
}
