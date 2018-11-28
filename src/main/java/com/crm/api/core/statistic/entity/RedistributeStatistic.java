package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedistributeStatistic{

    //分配人数
    private Long total;
    //销售
    private String sellerId;
    //销售名称
    private String sellerName;
    //销售账号
    private String username;
}
