package com.crm.api.core.wechat.entity;

import com.crm.api.core.device.entity.Device;
import com.crm.api.core.group.entity.Groups;
import com.crm.api.core.wechat.consts.PurposeType;
import com.crm.api.core.wechat.consts.WechatStatus;
import lombok.Getter;
import lombok.Setter;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;
import org.wah.doraemon.entity.consts.UsingState;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Wechat extends Entity implements Createable, Updateable{

    private String       companyId;
    private String       deviceId;
    private String       wxno;
    private String       wxid;
    private String       nickname;
    private String       headImgUrl;
    private Boolean      isValidate;
    private PurposeType  type;
    private WechatStatus status;
    //默认图片
    private String       img;
    //抢红包
    private Boolean      luckyPackage;
    //好友申请通过
    private Boolean      passNewFriend;
    //扫一扫
    private Boolean      scan;
    //显示好友微信号
    private Boolean      showWxno;
    //设置
    private Boolean      setting;
    //删除聊天记录
    private Boolean      deleteChatRecord;
    //删除好友
    private Boolean      deleteFriend;
    //能否收款
    private Boolean      receipt;
    //显示电话号码
    private Boolean      showPhone;
    private Date         createTime;
    private Date         updateTime;
    private Date         synchronizationTime;
    private String       jpush;
    private String       versionName;
    private UsingState   usingState;
    //收款延迟时间
    private Long         delayTime;

    private Device             device;
    private List<WechatFriend> friends;
    private List<Groups>       groups;

    private Long               friendTotal;
    private Long               yesterdayPassFriendTotal;
    private Long               todayPassFriendTotal;
    private Long               momentsTotal;
    private Long               yesterdayMomentsTotal;
    private Long               todayMomentsTotal;
}
