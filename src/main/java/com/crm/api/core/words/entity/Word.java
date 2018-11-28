package com.crm.api.core.words.entity;

import com.crm.api.core.group.entity.Groups;
import com.crm.api.core.words.consts.WordType;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Word extends Entity implements Createable, Updateable{

    private String     content;
    private String     companyId;
    private WordType   type;
    private Boolean    global;
    private Date       createTime;
    private Date       updateTime;

    private List<Groups> wechatGroups;
    private List<String> wechatGroupIds;
}
