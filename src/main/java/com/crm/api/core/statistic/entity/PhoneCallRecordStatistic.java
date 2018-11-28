package com.crm.api.core.statistic.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneCallRecordStatistic{

    private String  imei;
    private Long    duration;
    private Long    total;
    private Boolean type;
}
