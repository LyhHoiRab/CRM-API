package com.crm.api.core.group.entity;

import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupsWechat{

    private String groupsId;
    private String groupsName;
    private List<Wechat> wechats;
}
