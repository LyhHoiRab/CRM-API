package com.crm.api.core.group.entity;

import com.crm.api.core.permission.entity.Menu;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupsMenu{

    private String groupsId;
    private String groupsName;
    private List<Menu> menus;
}
