package com.crm.api.core.assist.entity;

import com.crm.api.core.assist.consts.AddContactsState;
import com.crm.api.core.assist.consts.AddContactsWhyLose;
import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AddContacts extends Entity implements Createable {
    private String              wechatId;
    private String              addNo;
    private String              msg;
    private String              operator;
    private String              remark;
    private String              companyId;
    private Date                createTime;
    private AddContactsState    state;
    private AddContactsWhyLose  whyLose;
    private String              callbackMsg;

    private List<String>        wechatIdList;
    private List<AddContacts>   addContactsList;
    private Wechat              wechat;
    private Integer             type;
}
