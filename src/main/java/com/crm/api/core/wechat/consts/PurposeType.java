package com.crm.api.core.wechat.consts;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;
import org.wah.doraemon.security.exception.UnknownEnumTypeException;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum PurposeType implements EnumType{

    @SerializedName("0")
    RISK_MANAGE(0, "个人风控管理"),

    @SerializedName("1")
    CENTRALIZED(1, "集中化管理");

    private int    id;
    private String description;

    public static PurposeType getById(int id){
        for(PurposeType type : PurposeType.values()){
            if(type.id == id){
                return type;
            }
        }

        throw new UnknownEnumTypeException("未知的微信用户常量ID[{0}]", id);
    }
}
