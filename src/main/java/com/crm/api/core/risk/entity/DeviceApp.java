package com.crm.api.core.risk.entity;

import com.crm.api.core.device.entity.Device;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DeviceApp {
    private String          sequence;
    private String          deviceId;
    private String          appId;

    private Device          device;
    private List<String>    deviceIdList;
}
