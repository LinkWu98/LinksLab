//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail;

import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModelProperty;

public class CustomerContactinfoVO {
    private static final long serialVersionUID = 1L;
    private Long contactId;
    @ApiModelProperty("潜客ID")
    private Long potentialCustomersId;
    @ApiModelProperty("联系人")
    private String contactName;
    @ApiModelProperty("第一联系电话")
    private String contactorPhone;
    @ApiModelProperty("第二联系电话")
    private String contactorMobile;
    @ApiModelProperty("男，女, 未知")
    private Integer gender;
    @ApiModelProperty("联系方式（手机、固话、微信、QQ、E-mail、上门拜访）")
    private Integer contactMethod;
    @ApiModelProperty("联系时间（上午、中午、下午、傍晚）")
    private Integer contactTime;
    @ApiModelProperty("联系人关系（本人、夫妻、父子、母女、姐妹、兄弟、老板、员工）1534")
    private Integer contactRelation;
    @ApiModelProperty("备注")
    private String contactRemark;
    @Version
    private Boolean isDeleted;
    @ApiModelProperty("是否主联系人")
    private Integer isMain;
    @ApiModelProperty("回访联系人、提车联系人、合同联系人")
    private Integer contactType;

    public CustomerContactinfoVO() {
    }

    public Long getContactId() {
        return this.contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getPotentialCustomersId() {
        return this.potentialCustomersId;
    }

    public void setPotentialCustomersId(Long potentialCustomersId) {
        this.potentialCustomersId = potentialCustomersId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsMain() {
        return this.isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public Integer getContactType() {
        return this.contactType;
    }

    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String toString() {
        return "CustomerContactinfoPO{contactId=" + this.contactId + ", potentialCustomersId=" + this.potentialCustomersId + ", contactName='" + this.contactName + '\'' + ", contactorPhone='" + this.contactorPhone + '\'' + ", contactorMobile='" + this.contactorMobile + '\'' + ", gender=" + this.gender + ", contactMethod=" + this.contactMethod + ", contactTime=" + this.contactTime + ", contactRelation=" + this.contactRelation + ", contactRemark='" + this.contactRemark + '\'' + ", isDeleted=" + this.isDeleted + ", isMain=" + this.isMain + ", contactType=" + this.contactType + '}';
    }
}
