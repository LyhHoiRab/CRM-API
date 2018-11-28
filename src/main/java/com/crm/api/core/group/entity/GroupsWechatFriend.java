package com.crm.api.core.group.entity;

import com.crm.api.core.wechat.entity.WechatFriend;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GroupsWechatFriend{

    private String groupsId;
    private String groupsName;
    private List<WechatFriend> friends;

    private Long newFriends = 0L;
}
