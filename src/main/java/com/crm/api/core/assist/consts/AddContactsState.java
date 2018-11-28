package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AddContactsState implements EnumType {

    @SerializedName("0")
    EXECUTORY(0, "执行中"),

    @SerializedName("1")
    SUCCESS(1, "成功"),

    @SerializedName("2")
    FAILED(2, "失败"),

    @SerializedName("9")
    UNKNOWN(9, "未知");

    private int    id;
    private String description;

    public static AddContactsState getById(int id){
        for(AddContactsState state : AddContactsState.values()){
            if(state.id == id){
                return state;
            }
        }

        return UNKNOWN;
    }
}
