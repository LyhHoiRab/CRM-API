package com.crm.api.core.group.entity;

import com.crm.api.core.device.entity.Device;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupsDevice {

    private String groupsId;
    private String groupsName;
    private List<Device> devices;
}
