package com.crm.api.core.wechat.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Chatroom extends Entity implements Createable, Updateable{

    private String  wechatId;
    @SerializedName(value = "headImgUrl", alternate = "chatroomHeadPic")
    private String  headImgUrl;
    @SerializedName(value = "roomid", alternate = "chatroomId")
    private String  roomid;
    @SerializedName(value = "owner", alternate = "chatroomOwner")
    private String  owner;
    @SerializedName(value = "name", alternate = "nickName")
    private String  name;
    @SerializedName(value = "remarkname", alternate = "conRemark")
    private String  remarkname;
    private Date    createTime;
    private Date    updateTime;
    private String  memberString;

    private List<ChatroomMember> members;
    private Wechat               wechat;

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object != null && object.getClass() == this.getClass()){
            Chatroom entity = (Chatroom) object;

            if(StringUtils.isNotBlank(entity.roomid)
                && StringUtils.isNotBlank(entity.wechatId)
                && StringUtils.isNotBlank(this.roomid)
                && StringUtils.isNotBlank(this.wechatId)){

                return (entity.roomid.equals(this.roomid) && entity.wechatId.equals(this.wechatId));
            }
        }

        return false;
    }
}
