package com.crm.api.core.wechat.entity;

import com.google.gson.annotations.SerializedName;
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

    private String  chatroomId;
    @SerializedName(value = "wxid", alternate = "wechatId")
    private String  wxid;
    @SerializedName(value = "nickname", alternate = "nickName")
    private String  nickname;
    private Boolean isIn;
    @SerializedName(value = "headImgUrl", alternate = "headPic")
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
                && StringUtils.isNotBlank(this.chatroomId)
                && StringUtils.isNotBlank(entity.chatroomId)){

                return (entity.wxid.equals(this.wxid) && entity.chatroomId.equals(this.chatroomId));
            }
        }

        return false;
    }
}
