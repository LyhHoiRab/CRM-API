package com.crm.api.core.wechat.entity;

import com.crm.api.core.call.entity.Customer;
import com.crm.api.core.group.entity.Groups;
import com.crm.api.core.wechat.consts.AddFromType;
import com.crm.api.core.wechat.consts.WechatFriendType;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.User;
import org.wah.doraemon.entity.consts.Sex;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class WechatFriend extends Entity implements Createable, Updateable{

    private String           wechatId;
    private String           sellerId;
    private String           wxid;
    private String           wxno;
    private String           nickname;
    private String           remarkname;
    private String           headImgUrl;
    private String           phone;
    private WechatFriendType type;
    private Boolean          isRead;
    private Date             createTime;
    private Date             updateTime;
    private String           customerId;
    private String           region;
    private String           province;
    private String           city;
    private Sex              sex;
    private AddFromType      addFrom;

    private Wechat           wechat;
    private User             seller;
    private List<Groups>     groups;
    private Customer         customer;
    private Date             applyTime;

    private Map<String, Object> expandValues;

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object != null && this.getClass() == object.getClass()){
            WechatFriend entity = (WechatFriend) object;

            if(StringUtils.isNotBlank(this.getId()) && StringUtils.isNotBlank(entity.getId())){
                return this.getId().equals(entity.getId());

            }else if(StringUtils.isNotBlank(this.wxid) &&
                     StringUtils.isNotBlank(entity.wxid) &&
                     StringUtils.isNotBlank(this.wechatId) &&
                     StringUtils.isNotBlank(entity.wechatId)){

                return this.wxid.equals(entity.wxid) && this.wechatId.equals(entity.wechatId);
            }
        }

        return false;
    }
}
