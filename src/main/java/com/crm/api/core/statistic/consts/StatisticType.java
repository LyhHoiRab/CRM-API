package com.crm.api.core.statistic.consts;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wah.doraemon.domain.consts.EnumType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StatisticType implements EnumType{

    BY_DATE(0, "%Y-%m-%d"),

    BY_MONTH(1, "%Y-%m"),

    BY_YEAR(2, "%Y");

    private int    id;
    private String description;

    public static StatisticType getById(int id){
        for(StatisticType type : StatisticType.values()){
            if(type.id == id){
                return type;
            }
        }

        return BY_DATE;
    }
}
