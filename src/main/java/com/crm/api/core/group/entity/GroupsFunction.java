package com.crm.api.core.group.entity;

import com.crm.api.core.permission.entity.Function;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupsFunction{

    private String groupsId;
    private String groupsName;
    private List<Function> functions;
}
