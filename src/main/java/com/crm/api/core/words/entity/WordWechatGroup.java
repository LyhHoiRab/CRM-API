package com.crm.api.core.words.entity;

import com.crm.api.core.group.entity.Groups;
import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WordWechatGroup{

    private Word word;
    private List<Groups> wechatGroups;
    private List<Wechat> wechats;
}
