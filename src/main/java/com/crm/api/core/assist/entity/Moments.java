package com.crm.api.core.assist.entity;

import com.crm.api.core.assist.consts.MomentsState;
import com.crm.api.core.assist.consts.MomentsType;
import com.crm.api.core.assist.consts.ShareTo;
import com.crm.api.core.wechat.entity.Wechat;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Moments extends Entity implements Createable {
    private String        wechatId;
    private String        content;
    private String        fodderUrl;
    private String        location;
    private ShareTo       shareTo;
    private String        mention;
    private String        comment;
    private String        companyId;
    private Boolean       like;
    private Date          operateTime;
    private String        operator;
    private MomentsType   type;
    private MomentsState  state;
    // true:PC端发送   false：移动端
    private Boolean       terminal;
    private String        momentsId;
    private Date          createTime;

    private List<String>  wechatIds;
    private Wechat        wechat;
}
