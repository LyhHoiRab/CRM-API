package com.crm.api.core.statistic.entity;

import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.entity.User;

@Getter
@Setter
public class WordRecordStatistic{

    private Long   total;
    private String date;
    private String wechatId;
    private String sellerId;

    private Wechat wechat;
    private User   seller;
}
