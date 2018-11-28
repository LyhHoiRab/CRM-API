package com.crm.api.core.words.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum WordRecordState implements EnumType{

    @SerializedName("0")
    HANDLE(0, "处理"),

    @SerializedName("1")
    UNHANDLE(1, "未处理"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int id;
    private String description;

    public static WordRecordState getById(int id){
        for(WordRecordState state : WordRecordState.values()){
            if(state.id == id){
                return state;
            }
        }

        return UNKNOWN;
    }
}
