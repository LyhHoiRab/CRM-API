package com.crm.api.core.risk.entity;


import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class PhoneWord extends Entity implements Createable, Updateable {
    private String       word;
    private String       accountId;
    private Date         createTime;
    private Date         updateTime;

    private String       userName;
    private String       groupsName;
    private List<String> groupsIds;

}
