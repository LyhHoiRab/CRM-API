package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum MomentsState implements EnumType {

    @SerializedName("0")
    UNENFORCED(0, "未执行"),

    @SerializedName("1")
    SUCCESS(1, "执行成功"),

    @SerializedName("2")
    FAILED(2, "执行失败"),

    @SerializedName("9")
    UNKNOWN(9, "未知");

    private int    id;
    private String description;

    public static MomentsState getById(int id){
        for(MomentsState state : MomentsState.values()){
            if(state.id == id){
                return state;
            }
        }

        return UNKNOWN;
    }
}
