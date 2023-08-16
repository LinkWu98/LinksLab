package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class BasalDiscParamsDTO {
    @ApiModelProperty("oneID")
    private String oneId;
    @ApiModelProperty("潜客ID")
    private String potentlalCustomersId;
    @ApiModelProperty("商机ID")
    private String customerBusinessId;
    @ApiModelProperty("订单ID")
    private String orderId;
    @ApiModelProperty("顾问ID")
    private String consultant;
    @ApiModelProperty("orgId")
    private String orgId;
    private Integer review;
    @ApiModelProperty("回访记录创建时间")
    private LocalDateTime createdAt;

    public BasalDiscParamsDTO() {
    }

    public String getOneId() {
        return this.oneId;
    }

    public void setOneId(String oneId) {
        this.oneId = oneId;
    }

    public String getConsultant() {
        return this.consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getReview() {
        return this.review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getPotentlalCustomersId() {
        return this.potentlalCustomersId;
    }

    public void setPotentlalCustomersId(String potentlalCustomersId) {
        this.potentlalCustomersId = potentlalCustomersId;
    }

    public String getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(String customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String toString() {
        return "BasalDiscParamsDTO{oneId='" + this.oneId + '\'' + ", potentlalCustomersId='" + this.potentlalCustomersId + '\'' + ", customerBusinessId='" + this.customerBusinessId + '\'' + ", orderId='" + this.orderId + '\'' + ", consultant='" + this.consultant + '\'' + ", orgId='" + this.orgId + '\'' + ", review=" + this.review + ", createdAt=" + this.createdAt + '}';
    }
}
