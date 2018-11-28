package com.crm.api.core.wechat.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WechatPermission{

    private String permission;
    private String name;
    private Long   total;
}
