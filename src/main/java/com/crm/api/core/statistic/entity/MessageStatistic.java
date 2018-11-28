package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageStatistic{

    //次数
    private Long total;
    //销售ID
    private String sellerId;
    //销售名称
    private String sellerName;
    //销售账号
    private String username;
}
