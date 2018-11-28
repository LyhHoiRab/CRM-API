package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.entity.consts.Sex;

@Getter
@Setter
public class FansIncreaseStatistic{

    private String wechatId;
    private String wxno;
    private String nickname;
    private String headImgUrl;
    private Long   total;
    private Sex    sex;

    private Long male;
    private Long female;
    private Long unknown;
}
