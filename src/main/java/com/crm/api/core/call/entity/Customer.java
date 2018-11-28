package com.crm.api.core.call.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.wah.doraemon.domain.Createable;
import org.wah.doraemon.domain.Entity;
import org.wah.doraemon.domain.Updateable;

import java.util.Date;


@Getter
@Setter
public class Customer extends Entity implements Createable, Updateable {
    private Date createTime;                  //添加时间
    private Date updateTime;                  //修改时间

    private String name;                      //客户姓名
    private String phone;                     //客户电话
    private String wxAccount;                 //客户微信
    private String customerService;           //分配客服
    private String requirement;               //客户需求
    private String comment;                   //备注
    private String companyId;                 //公司id
    private String channel;                   //客户来源

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object != null && this.getClass() == object.getClass()){
            Customer entity = (Customer) object;

            if(StringUtils.isNotBlank(this.getId()) && StringUtils.isNotBlank(entity.getId())){
                return this.getId().equals(entity.getId());

            }else if(StringUtils.isNotBlank(this.phone)
                     && StringUtils.isNotBlank(entity.phone)
                     && StringUtils.isNotBlank(this.companyId)
                     && StringUtils.isNotBlank(entity.companyId)){

                return (this.phone.equals(entity.phone) && this.companyId.equals(entity.companyId));
            }
        }

        return false;
    }
}
