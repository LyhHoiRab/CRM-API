package com.crm.api.core.wechat.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;

@Getter
@Setter
public class ChatroomMember extends Entity implements Createable, Updateable{

    private String  wechatId;
    private String  chatroomId;
    private String  wxid;
    private String  nickname;
    private Boolean isIn;
    private String  headImgUrl;
    private Date    createTime;
    private Date    updateTime;

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object != null && this.getClass() == object.getClass()){
            ChatroomMember entity = (ChatroomMember) object;

            if(StringUtils.isNotBlank(this.wxid)
                && StringUtils.isNotBlank(entity.wxid)
                && this.wxid.equals(entity.wxid)){

                return true;
            }
        }

        return false;
    }
}
