package com.crm.api.core.log.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum LoginStatus implements EnumType{

    @SerializedName("0")
    TRY(0, "尝试登录"),

    @SerializedName("1")
    SUCCESS(1, "登录成功"),

    @SerializedName("2")
    FAIL(2, "登录失败"),

    @SerializedName("999")
    UNKNOWN(999, "未知");

    private int    id;
    private String description;

    public static LoginStatus getById(int id){
        for(LoginStatus status : LoginStatus.values()){
            if(status.id == id){
                return status;
            }
        }

        return UNKNOWN;
    }
}
