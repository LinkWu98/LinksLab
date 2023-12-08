package cn.link.swagger.newbie.retail.deliver;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 交车管理DTO
 *
 * @author xuxiaoyang
 * @since 15:00 2020-06-29
 */
@ApiModel("交车管理DTO")
public class DeliveryManageAppDTO implements Serializable {
    @ApiModelProperty(value = "销售模式")
    private String strongWeakAgent;

    @ApiModelProperty(value = "预计交车日期，今日0，明日1，将来2")
    private Integer deliveringDate;

    @ApiModelProperty(value = "菜单ID用于权限查询拼接")
    private String menuId;

    @ApiModelProperty(value = "顾问id用于权限查询")
    private String consultant;
    @ApiModelProperty(value = "是否上牌")
    private Integer isVehicleLicense;

    @ApiModelProperty(value = "是否交车")
    private Integer isInTheCar;

    @ApiModelProperty(value = "第二级ID（series）", name = "secondId")
    private String secondId;

    @ApiModelProperty(value = "第三级ID", name = "thirdId")
    private String thirdId;

    @ApiModelProperty(value = "第四级ID", name = "fourId")
    private String fourId;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "手机号")
    private String mobilePhone;

    @ApiModelProperty(value = "订单类型")
    private String saleType;

    @ApiModelProperty(value = "订单状态")
    private String soStatus;

    @ApiModelProperty(value = "预交车开始时间")
    private String deliveringDateStart;

    @ApiModelProperty(value = "预交车结束时间")
    private String deliveringDateEnd;

    @ApiModelProperty(value = "评价分数")
    private Integer evaluationScore;

    @ApiModelProperty(value = "交车上报日期(开始)")
    private String handVehicleDateStart;

    @ApiModelProperty(value = "交车上报日期(结束)")
    private String handVehicleDateEnd;

    @ApiModelProperty(value = "订单状态")
    private String orderStatus;

    @ApiModelProperty(value = "是否开票")
    private Integer isInvoice;

    @ApiModelProperty(value = "大区id")
    private Integer bigAreaId;
    @ApiModelProperty(value = "小区id")
    private Integer oemOrgId;
    @ApiModelProperty(value = "经销商代码")
    private String ownerCodes;

    @ApiModelProperty(value = "vin")
    private String vin;

    @ApiModelProperty(value = "vinList_批量查询")
    private List<String> vinList;

    private String formCreatedAtStart;

    private String formCreatedAtEnd;

    private String invoiceDateStart;

    private String invoiceDateEnd;

    @ApiModelProperty(value = "客户订单列表查询 1：直售客户订单查询；2：客户订单查询")
    private Integer directRetailFlag;

    @ApiModelProperty(value = "订车门店")
    private String deliveryOwnerCode;

    @ApiModelProperty(value = "交车经销商")
    private String orderOwnerCode;

    @ApiModelProperty(value = "订车门店查询集合")
    private List<String> deliveryOwnerCodes;

    @ApiModelProperty(value = "交车经销商查询集合")
    private List<String> orderOwnerCodes;

    @ApiModelProperty("是否结清")
    private Integer isClearing;

    @ApiModelProperty("交车资料审核状态")
    private Integer deliverInfoAuditStatus;
    @ApiModelProperty(value = "订单编号筛选")
    private String soNoList;
    @ApiModelProperty(value = "所属经销商筛选")
    private String dealerList;
    private Long current;
    private Long size;

    public Integer getDeliverInfoAuditStatus() {
        return deliverInfoAuditStatus;
    }

    public void setDeliverInfoAuditStatus(Integer deliverInfoAuditStatus) {
        this.deliverInfoAuditStatus = deliverInfoAuditStatus;
    }

    public Integer getIsClearing() {
        return isClearing;
    }

    public void setIsClearing(Integer isClearing) {
        this.isClearing = isClearing;
    }

    public List<String> getDeliveryOwnerCodes() {
        return deliveryOwnerCodes;
    }

    public void setDeliveryOwnerCodes(List<String> deliveryOwnerCodes) {
        this.deliveryOwnerCodes = deliveryOwnerCodes;
    }

    public List<String> getOrderOwnerCodes() {
        return orderOwnerCodes;
    }

    public void setOrderOwnerCodes(List<String> orderOwnerCodes) {
        this.orderOwnerCodes = orderOwnerCodes;
    }

    public String getDeliveryOwnerCode() {
        return deliveryOwnerCode;
    }

    public void setDeliveryOwnerCode(String deliveryOwnerCode) {
        this.deliveryOwnerCode = deliveryOwnerCode;
    }

    public String getOrderOwnerCode() {
        return orderOwnerCode;
    }

    public void setOrderOwnerCode(String orderOwnerCode) {
        this.orderOwnerCode = orderOwnerCode;
    }

    public String getSoNoList() {
        return soNoList;
    }

    public void setSoNoList(String soNoList) {
        this.soNoList = soNoList;
    }

    public String getDealerList() {
        return dealerList;
    }

    public void setDealerList(String dealerList) {
        this.dealerList = dealerList;
    }

    public Integer getDirectRetailFlag() {
        return directRetailFlag;
    }

    public void setDirectRetailFlag(Integer directRetailFlag) {
        this.directRetailFlag = directRetailFlag;
    }

    public String getInvoiceDateStart() {
        return invoiceDateStart;
    }

    public void setInvoiceDateStart(String invoiceDateStart) {
        this.invoiceDateStart = invoiceDateStart;
    }

    public String getInvoiceDateEnd() {
        return invoiceDateEnd;
    }

    public void setInvoiceDateEnd(String invoiceDateEnd) {
        this.invoiceDateEnd = invoiceDateEnd;
    }

    @Override
    public String toString() {
        return "DeliveryManageAppDTO{" +
                "deliveringDate=" + deliveringDate +
                ", menuId='" + menuId + '\'' +
                ", consultant='" + consultant + '\'' +
                ", isVehicleLicense=" + isVehicleLicense +
                ", isInTheCar=" + isInTheCar +
                ", secondId='" + secondId + '\'' +
                ", thirdId='" + thirdId + '\'' +
                ", fourId='" + fourId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", saleType='" + saleType + '\'' +
                ", soStatus='" + soStatus + '\'' +
                ", deliveringDateStart='" + deliveringDateStart + '\'' +
                ", deliveringDateEnd='" + deliveringDateEnd + '\'' +
                ", evaluationScore=" + evaluationScore +
                ", handVehicleDateStart='" + handVehicleDateStart + '\'' +
                ", handVehicleDateEnd='" + handVehicleDateEnd + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", isInvoice=" + isInvoice +
                ", bigAreaId=" + bigAreaId +
                ", oemOrgId=" + oemOrgId +
                ", ownerCodes='" + ownerCodes + '\'' +
                ", vin='" + vin + '\'' +
                ", formCreatedAtStart='" + formCreatedAtStart + '\'' +
                ", formCreatedAtEnd='" + formCreatedAtEnd + '\'' +
                ", current=" + current +
                ", size=" + size +
                ", directRetailFlag=" + directRetailFlag +
                ", vinList=" + vinList +
                '}';
    }

    public String getFormCreatedAtStart() {
        return formCreatedAtStart;
    }

    public void setFormCreatedAtStart(String formCreatedAtStart) {
        this.formCreatedAtStart = formCreatedAtStart;
    }

    public String getFormCreatedAtEnd() {
        return formCreatedAtEnd;
    }

    public void setFormCreatedAtEnd(String formCreatedAtEnd) {
        this.formCreatedAtEnd = formCreatedAtEnd;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getBigAreaId() {
        return bigAreaId;
    }

    public void setBigAreaId(Integer bigAreaId) {
        this.bigAreaId = bigAreaId;
    }

    public Integer getOemOrgId() {
        return oemOrgId;
    }

    public void setOemOrgId(Integer oemOrgId) {
        this.oemOrgId = oemOrgId;
    }

    public String getOwnerCodes() {
        return ownerCodes;
    }

    public void setOwnerCodes(String ownerCodes) {
        this.ownerCodes = ownerCodes;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getHandVehicleDateStart() {
        return handVehicleDateStart;
    }

    public void setHandVehicleDateStart(String handVehicleDateStart) {
        this.handVehicleDateStart = handVehicleDateStart;
    }

    public String getHandVehicleDateEnd() {
        return handVehicleDateEnd;
    }

    public void setHandVehicleDateEnd(String handVehicleDateEnd) {
        this.handVehicleDateEnd = handVehicleDateEnd;
    }

    public Integer getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(Integer evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

    public String getDeliveringDateStart() {
        return deliveringDateStart;
    }

    public void setDeliveringDateStart(String deliveringDateStart) {
        this.deliveringDateStart = deliveringDateStart;
    }

    public String getDeliveringDateEnd() {
        return deliveringDateEnd;
    }

    public void setDeliveringDateEnd(String deliveringDateEnd) {
        this.deliveringDateEnd = deliveringDateEnd;
    }

    public String getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(String soStatus) {
        this.soStatus = soStatus;
    }

    public String getSecondId() {
        return secondId;
    }

    public void setSecondId(String secondId) {
        this.secondId = secondId;
    }

    public String getThirdId() {
        return thirdId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    public String getFourId() {
        return fourId;
    }

    public void setFourId(String fourId) {
        this.fourId = fourId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Integer getIsInTheCar() {
        return isInTheCar;
    }

    public void setIsInTheCar(Integer isInTheCar) {
        this.isInTheCar = isInTheCar;
    }

    public Integer getIsVehicleLicense() {
        return isVehicleLicense;
    }

    public void setIsVehicleLicense(Integer isVehicleLicense) {
        this.isVehicleLicense = isVehicleLicense;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public Integer getDeliveringDate() {
        return deliveringDate;
    }

    public void setDeliveringDate(Integer deliveringDate) {
        this.deliveringDate = deliveringDate;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getStrongWeakAgent() {
        return strongWeakAgent;
    }

    public void setStrongWeakAgent(String strongWeakAgent) {
        this.strongWeakAgent = strongWeakAgent;
    }

    public List<String> getVinList() {
        return vinList;
    }

    public void setVinList(List<String> vinList) {
        this.vinList = vinList;
    }
}

