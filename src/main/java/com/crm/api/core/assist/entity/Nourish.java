package com.crm.api.core.assist.entity;

import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Nourish extends Entity implements Createable {
    private String              wechatIds;
    private String              operator;
    private String              companyId;
    private Boolean             action;
    private Date                createTime;

    private List<Wechat>        wechats;
}
