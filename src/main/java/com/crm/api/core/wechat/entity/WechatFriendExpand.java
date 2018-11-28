package com.crm.api.core.wechat.entity;

import com.crm.api.core.wechat.consts.WechatFriendExpandType;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.consts.UsingState;

import java.util.Date;

@Getter
@Setter
public class WechatFriendExpand extends Entity implements Createable, Updateable{

    private String                 companyId;
    private String                 name;
    private String                 value;
    private String                 description;
    private UsingState             state;
    private WechatFriendExpandType type;
    private Integer                sort;
    private Date                   createTime;
    private Date                   updateTime;
}
