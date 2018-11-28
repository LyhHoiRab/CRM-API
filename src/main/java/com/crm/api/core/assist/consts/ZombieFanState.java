package com.crm.api.core.assist.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ZombieFanState implements EnumType {

    @SerializedName("0")
    NOT_QUERY(0, "未查询"),

    @SerializedName("1")
    QUERYING(1, "查询中"),

    @SerializedName("2")
    QUERY_COMPLETED(2, "查询完成"),

    @SerializedName("3")
    QUERY_FAILURE(3, "查询失败"),

    @SerializedName("4")
    NO_ZOMBIEFAN(4, "查询没有僵尸粉"),

    @SerializedName("9")
    UNKNOWN(9, "未知");

    private int    id;
    private String description;

    public static ZombieFanState getById(int id){
        for(ZombieFanState state : ZombieFanState.values()){
            if(state.id == id){
                return state;
            }
        }

        return UNKNOWN;
    }
}
