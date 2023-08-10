//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.link.testProject.dto.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

public class CustomerContactinfoDTO {
    @ApiModelProperty("联系人id")
    private Long contactId;
    private Long potentialCustomersId;
    @ApiModelProperty("联系人")
    private String contactName;
    @ApiModelProperty("男，女, 未知")
    private Integer gender;
    @ApiModelProperty("联系类型（回访联系人、用车联系人、开票联系人、提车联系人、合同联系人） 7034")
    private Integer contactType;
    @ApiModelProperty("联系人电话")
    private String contactorPhone;
    @ApiModelProperty("联系人手机")
    private String contactorMobile;
    @ApiModelProperty("联系方式（手机、固话、微信、QQ、E-mail、上门拜访）")
    private Integer contactMethod;
    @ApiModelProperty("联系时间（上午、中午、下午、傍晚）")
    private Integer contactTime;
    @ApiModelProperty("联系人关系（夫妻、父子、母女、姐妹、兄弟、老板、员工）")
    private Integer contactRelation;
    @ApiModelProperty("联系人备注")
    private String contactRemark;
    @ApiModelProperty("是否删除：否0，是1 默认0")
    private Boolean isDeleted;
    @ApiModelProperty("是否主联系人")
    private Integer isMain;
    @ApiModelProperty("商机id")
    private Long customerBusinessId;

    public CustomerContactinfoDTO() {
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

    public Long getContactId() {
        return this.contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getContactType() {
        return this.contactType;
    }

    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    public String getContactorPhone() {
        return this.contactorPhone;
    }

    public void setContactorPhone(String contactorPhone) {
        this.contactorPhone = contactorPhone;
    }

    public String getContactorMobile() {
        return this.contactorMobile;
    }

    public void setContactorMobile(String contactorMobile) {
        this.contactorMobile = contactorMobile;
    }

    public Integer getContactMethod() {
        return this.contactMethod;
    }

    public void setContactMethod(Integer contactMethod) {
        this.contactMethod = contactMethod;
    }

    public Integer getContactTime() {
        return this.contactTime;
    }

    public void setContactTime(Integer contactTime) {
        this.contactTime = contactTime;
    }

    public Integer getContactRelation() {
        return this.contactRelation;
    }

    public void setContactRelation(Integer contactRelation) {
        this.contactRelation = contactRelation;
    }

    public String getContactRemark() {
        return this.contactRemark;
    }

    public void setContactRemark(String contactRemark) {
        this.contactRemark = contactRemark;
    }

    public Boolean getDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        this.isDeleted = deleted;
    }

    public Integer getIsMain() {
        return this.isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String toString() {
        return "CustomerContactinfoDTO{contactId=" + this.contactId + ", potentialCustomersId=" + this.potentialCustomersId + ", contactName='" + this.contactName + '\'' + ", gender=" + this.gender + ", contactType=" + this.contactType + ", contactorPhone='" + this.contactorPhone + '\'' + ", contactorMobile='" + this.contactorMobile + '\'' + ", contactMethod=" + this.contactMethod + ", contactTime=" + this.contactTime + ", contactRelation=" + this.contactRelation + ", contactRemark='" + this.contactRemark + '\'' + ", isDeleted=" + this.isDeleted + ", isMain=" + this.isMain + ", customerBusinessId=" + this.customerBusinessId + '}';
    }
}
