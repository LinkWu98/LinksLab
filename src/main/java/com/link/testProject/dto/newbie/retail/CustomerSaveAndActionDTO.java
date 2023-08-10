//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.link.testProject.dto.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(
        value = "潜客跟进保存并跟进DTO",
        description = "潜客跟进保存并跟进DTO"
)
public class CustomerSaveAndActionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("oneId")
    private Long oneId;
    @ApiModelProperty("跟进Id")
    private Long actionId;
    @ApiModelProperty("潜客Id")
    private Long potentialCustomersId;
    @ApiModelProperty("商机Id")
    private Long customerBusinessId;
    @ApiModelProperty("区分保存并跟进")
    private Long isFollow;
    @ApiModelProperty("潜客编号")
    private String potentialCustomersNo;

    public CustomerSaveAndActionDTO() {
    }

    public Long getOneId() {
        return this.oneId;
    }

    public void setOneId(Long oneId) {
        this.oneId = oneId;
    }

    public Long getIsFollow() {
        return this.isFollow;
    }

    public void setIsFollow(Long isFollow) {
        this.isFollow = isFollow;
    }

    public Long getActionId() {
        return this.actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public Long getPotentialCustomersId() {
        return this.potentialCustomersId;
    }

    public void setPotentialCustomersId(Long potentialCustomersId) {
        this.potentialCustomersId = potentialCustomersId;
    }

    public Long getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getPotentialCustomersNo() {
        return this.potentialCustomersNo;
    }

    public void setPotentialCustomersNo(String potentialCustomersNo) {
        this.potentialCustomersNo = potentialCustomersNo;
    }

    public String toString() {
        return "CustomerSaveAndActionDTO{oneId=" + this.oneId + ", actionId=" + this.actionId + ", potentialCustomersId=" + this.potentialCustomersId + ", customerBusinessId=" + this.customerBusinessId + ", isFollow=" + this.isFollow + ", potentialCustomersNo='" + this.potentialCustomersNo + '\'' + '}';
    }
}
