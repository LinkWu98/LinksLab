package cn.link.swagger.newbie.retail.deliver;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * DeliveryManageVO
 *
 * @author dengqiang
 * @since 2019/11/27
 */
public class DeliveryManageVO {

    /**
     * 销售模式
     */
    @ApiModelProperty(value = "销售模式")
    private String strongWeakAgent;

    /**
     * 销售订单id
     */
    @ApiModelProperty(value = "销售订单id")
    private Long soVinId;

    /**
     * 销售订单号
     */
    @ApiModelProperty(value = "销售订单号")
    private String viNo;

    @ApiModelProperty(value = "销售订单号")
    private String soNoId;

    /**
     * 客户名称
     */
    @ApiModelProperty(value = "客户名称")
    private String customerName;


    /**
     * 客户名称
     */
    @ApiModelProperty(value = "商机Id")
    private Long customerBusinessId;


    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobilePhone;


    private String desensitization;

    /**
     * 订单类型
     */
    @ApiModelProperty(value = "订单类型")
    private String saleType;

    /**
     * 销售顾问
     */
    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    /**
     * 订单车辆类型
     */
    @ApiModelProperty(value = "订单车辆类型-1511")
    private Long vehiclePurpose;

    /**
     * 交车地点
     */
    @ApiModelProperty(value = "交车地点")
    private Integer confirmedAddress;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer gender;

    /**
     * 车辆信息（拼接）
     */
    @ApiModelProperty(value = "车辆信息（拼接）")
    private String productConfig;

    /**
     * 订单状态
     */
    @ApiModelProperty(value = "订单状态")
    private Integer orderStatus;
    /**
     * VIN
     */
    @ApiModelProperty(value = "VIN")
    private String salesVin;

    @ApiModelProperty(value = "车系")
    private String seriesName;

    @ApiModelProperty(value = "外色", name = "colorId")
    private String colorId;

    private String colorName;

    @ApiModelProperty(value = "内饰")
    private String trimColorId;

    private String trimColorName;

    @ApiModelProperty(value = "选装包")
    private String packageId;

    private String packageName;

    @ApiModelProperty(value = "车型")
    private String modelName;


    @ApiModelProperty(value = "预计交车日期开始--时间戳")
    private LocalDateTime deliveringDateStart;


    @ApiModelProperty(value = "预计交车日期结束--时间戳")
    private LocalDateTime deliveringDateEnd;


    @ApiModelProperty(value = "预计交车日期")
    private LocalDateTime deliveringDate;


    @ApiModelProperty(value = "订单提交日期")
    private LocalDateTime submitTime;

    @ApiModelProperty(value = "交车日期")
    private String handVehicleDate;


    @ApiModelProperty(value = "RECORD_VERSION")
    private Integer recordVersion;

    /**
     * 潜客id
     */
    @ApiModelProperty(value = "潜客id")
    private Long customerId;

    /**
     * 产品ID
     */
    @ApiModelProperty(value = "产品ID")
    private String productId;

    @ApiModelProperty(value = "车牌号")
    private String licensePlateNumber;

    @ApiModelProperty(value = "第一级ID(如：品牌)", name = "firstId")
    private String firstId;

    @ApiModelProperty(value = "第一级名(如：品牌)")
    private String firstName;

    @ApiModelProperty(value = "第二级ID（series）", name = "secondId")
    private String secondId;

    @ApiModelProperty(value = "第二级名")
    private String secondName;

    @ApiModelProperty(value = "第三级ID", name = "thirdId")
    private String thirdId;

    @ApiModelProperty(value = "第三级名")
    private String thirdName;

    @ApiModelProperty(value = "第四级ID", name = "fourId")
    private String fourId;

    @ApiModelProperty(value = "第四级名")
    private String fourName;


    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "是否上牌")
    private Integer isVehicleLicense;

    @ApiModelProperty(value = "是否交车")
    private Integer isInTheCar;

    @ApiModelProperty(value = "是否配车")
    private Integer dispatchedStatus;

    @ApiModelProperty(value = "拼接好的选装包名")
    private String optionNames;

    @ApiModelProperty(value = "开票人姓名")
    private String drawerName;

    @ApiModelProperty(value = "交车上报日期(开始)")
    private String handVehicleDateStart;

    @ApiModelProperty(value = "交车上报日期(结束)")
    private String handVehicleDateEnd;

    /**
     * 新车确认交付单
     */
    @TableField("CAR_UUID")
    private String carUUID;

    /**
     * 三包凭证
     */
    @TableField("IMG_UUID")
    private String imgUUID;

    /**
     * phev
     */
    @TableField("PHEV_UUID")
    private String phevUUID;

    /**
     * 实际交车时间
     */


    @ApiModelProperty(value = "实际交车时间", name = "actualTime")
    private LocalDateTime actualTime;

    @ApiModelProperty(value = "是否开票")
    private Integer isInvoice;

    @ApiModelProperty(value = "里程数")
    private Double mileage;

    @ApiModelProperty(value = "经销商代码")
    private String ownerCode;

    private String bigAreaName;

    private String oemOrgName;

    private String dealerName;


    private LocalDateTime invoiceDate;

    private String evaluationTag;

    private String vin;

    @ApiModelProperty("预约单提交时间")


    private LocalDateTime formCreatedAt;

    @ApiModelProperty(value = "订车门店")
    private String deliveryOwnerCode;

    @ApiModelProperty(value = "订车门店名称")
    private String deliveryCompanyName;

    @ApiModelProperty(value = "订车门店地址")
    private String deliveryAddress;


    @ApiModelProperty(value = "交车经销商")
    private String orderOwnerCode;

    @ApiModelProperty(value = "交车经销商名称")
    private String orderCompanyName;

    @ApiModelProperty(value = "交车经销商地址")
    private String orderAddress;

    @ApiModelProperty("是否结清")
    private Integer isClearing;

    @ApiModelProperty("C端可交车状态")
    private Integer deliverableStatus;

    @ApiModelProperty("交车资料审核状态")
    private Integer deliverInfoAuditStatus;
    @ApiModelProperty(value = "与deliveryOwnerCode区分,用于交车管理相关展示,订车门店/所属经销商code")
    private String deliveryOwnerCodeV2;
    @ApiModelProperty(value = "与deliveryCompanyName区分,用于交车管理相关展示,订车门店/所属经销商名称")
    private String deliveryCompanyNameV2;

    public Integer getDeliverableStatus() {
        return deliverableStatus;
    }

    public void setDeliverableStatus(Integer deliverableStatus) {
        this.deliverableStatus = deliverableStatus;
    }

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

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderCompanyName() {
        return orderCompanyName;
    }

    public void setOrderCompanyName(String orderCompanyName) {
        this.orderCompanyName = orderCompanyName;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getDeliveryCompanyNameV2() {
        return deliveryCompanyNameV2;
    }

    public void setDeliveryCompanyNameV2(String deliveryCompanyNameV2) {
        this.deliveryCompanyNameV2 = deliveryCompanyNameV2;
    }

    public String getDeliveryOwnerCodeV2() {
        return deliveryOwnerCodeV2;
    }

    public void setDeliveryOwnerCodeV2(String deliveryOwnerCodeV2) {
        this.deliveryOwnerCodeV2 = deliveryOwnerCodeV2;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getCarUUID() {
        return carUUID;
    }

    public void setCarUUID(String carUUID) {
        this.carUUID = carUUID;
    }

    public String getPhevUUID() {
        return phevUUID;
    }

    public void setPhevUUID(String phevUUID) {
        this.phevUUID = phevUUID;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getImgUUID() {
        return imgUUID;
    }

    public void setImgUUID(String imgUUID) {
        this.imgUUID = imgUUID;
    }

    public LocalDateTime getActualTime() {
        return actualTime;
    }

    public void setActualTime(LocalDateTime actualTime) {
        this.actualTime = actualTime;
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

    public String getHandVehicleDate() {
        return handVehicleDate;
    }

    public void setHandVehicleDate(String handVehicleDate) {
        this.handVehicleDate = handVehicleDate;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }

    public String getOptionNames() {
        return optionNames;
    }

    public void setOptionNames(String optionNames) {
        this.optionNames = optionNames;
    }

    public Integer getIsInTheCar() {
        return isInTheCar;
    }

    public void setIsInTheCar(Integer isInTheCar) {
        this.isInTheCar = isInTheCar;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondId() {
        return secondId;
    }

    public void setSecondId(String secondId) {
        this.secondId = secondId;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdId() {
        return thirdId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getFourId() {
        return fourId;
    }

    public void setFourId(String fourId) {
        this.fourId = fourId;
    }

    public String getFourName() {
        return fourName;
    }

    public void setFourName(String fourName) {
        this.fourName = fourName;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getTrimColorId() {
        return trimColorId;
    }

    public void setTrimColorId(String trimColorId) {
        this.trimColorId = trimColorId;
    }

    public String getTrimColorName() {
        return trimColorName;
    }

    public void setTrimColorName(String trimColorName) {
        this.trimColorName = trimColorName;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Integer getIsVehicleLicense() {
        return isVehicleLicense;
    }

    public void setIsVehicleLicense(Integer isVehicleLicense) {
        this.isVehicleLicense = isVehicleLicense;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getSoVinId() {
        return soVinId;
    }

    public void setSoVinId(Long soVinId) {
        this.soVinId = soVinId;
    }

    public String getViNo() {
        return viNo;
    }

    public void setViNo(String viNo) {
        this.viNo = viNo;
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
        this.desensitization = mobilePhone;
        this.mobilePhone = mobilePhone;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public Long getVehiclePurpose() {
        return vehiclePurpose;
    }

    public void setVehiclePurpose(Long vehiclePurpose) {
        this.vehiclePurpose = vehiclePurpose;
    }

    public Integer getConfirmedAddress() {
        return confirmedAddress;
    }

    public void setConfirmedAddress(Integer confirmedAddress) {
        this.confirmedAddress = confirmedAddress;
    }

    public String getSalesVin() {
        return salesVin;
    }

    public void setSalesVin(String salesVin) {
        this.salesVin = salesVin;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public LocalDateTime getDeliveringDateStart() {
        return deliveringDateStart;
    }

    public void setDeliveringDateStart(LocalDateTime deliveringDateStart) {
        this.deliveringDateStart = deliveringDateStart;
    }

    public LocalDateTime getDeliveringDateEnd() {
        return deliveringDateEnd;
    }

    public void setDeliveringDateEnd(LocalDateTime deliveringDateEnd) {
        this.deliveringDateEnd = deliveringDateEnd;
    }

    public Integer getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProductConfig() {
        return productConfig;
    }

    public void setProductConfig(String productConfig) {
        this.productConfig = productConfig;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getDeliveringDate() {
        return deliveringDate;
    }

    public void setDeliveringDate(LocalDateTime deliveringDate) {
        this.deliveringDate = deliveringDate;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getDesensitization() {
        return desensitization;
    }

    public void setDesensitization(String desensitization) {
        this.desensitization = desensitization;
    }

    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public String getSoNoId() {
        return soNoId;
    }

    public void setSoNoId(String soNoId) {
        this.soNoId = soNoId;
    }

    public Long getCustomerBusinessId() {
        return customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public Integer getDispatchedStatus() {
        return dispatchedStatus;
    }

    public void setDispatchedStatus(Integer dispatchedStatus) {
        this.dispatchedStatus = dispatchedStatus;
    }

    @Override
    public String toString() {
        return "DeliveryManageVO{" +
                "soVinId=" + soVinId +
                ", viNo='" + viNo + '\'' +
                ", soNoId='" + soNoId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerBusinessId=" + customerBusinessId +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", desensitization='" + desensitization + '\'' +
                ", saleType='" + saleType + '\'' +
                ", consultant='" + consultant + '\'' +
                ", vehiclePurpose=" + vehiclePurpose +
                ", confirmedAddress=" + confirmedAddress +
                ", gender=" + gender +
                ", productConfig='" + productConfig + '\'' +
                ", orderStatus=" + orderStatus +
                ", salesVin='" + salesVin + '\'' +
                ", seriesName='" + seriesName + '\'' +
                ", colorId='" + colorId + '\'' +
                ", colorName='" + colorName + '\'' +
                ", trimColorId='" + trimColorId + '\'' +
                ", trimColorName='" + trimColorName + '\'' +
                ", packageId='" + packageId + '\'' +
                ", packageName='" + packageName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", deliveringDateStart=" + deliveringDateStart +
                ", deliveringDateEnd=" + deliveringDateEnd +
                ", deliveringDate=" + deliveringDate +
                ", submitTime=" + submitTime +
                ", handVehicleDate='" + handVehicleDate + '\'' +
                ", recordVersion=" + recordVersion +
                ", customerId=" + customerId +
                ", productId='" + productId + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", firstId='" + firstId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondId='" + secondId + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdId='" + thirdId + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", fourId='" + fourId + '\'' +
                ", fourName='" + fourName + '\'' +
                ", createdAt=" + createdAt +
                ", isVehicleLicense=" + isVehicleLicense +
                ", isInTheCar=" + isInTheCar +
                ", dispatchedStatus=" + dispatchedStatus +
                ", optionNames='" + optionNames + '\'' +
                ", drawerName='" + drawerName + '\'' +
                ", handVehicleDateStart='" + handVehicleDateStart + '\'' +
                ", handVehicleDateEnd='" + handVehicleDateEnd + '\'' +
                ", carUUID='" + carUUID + '\'' +
                ", imgUUID='" + imgUUID + '\'' +
                ", phevUUID='" + phevUUID + '\'' +
                ", actualTime=" + actualTime +
                ", isInvoice=" + isInvoice +
                ", mileage=" + mileage +
                ", ownerCode='" + ownerCode + '\'' +
                ", bigAreaName='" + bigAreaName + '\'' +
                ", oemOrgName='" + oemOrgName + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", invoiceDate=" + invoiceDate +
                ", evaluationTag='" + evaluationTag + '\'' +
                ", vin='" + vin + '\'' +
                ", formCreatedAt=" + formCreatedAt +
                '}';
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getEvaluationTag() {
        return evaluationTag;
    }

    public void setEvaluationTag(String evaluationTag) {
        this.evaluationTag = evaluationTag;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public LocalDateTime getFormCreatedAt() {
        return formCreatedAt;
    }

    public void setFormCreatedAt(LocalDateTime formCreatedAt) {
        this.formCreatedAt = formCreatedAt;
    }

    public String getBigAreaName() {
        return bigAreaName;
    }

    public void setBigAreaName(String bigAreaName) {
        this.bigAreaName = bigAreaName;
    }

    public String getOemOrgName() {
        return oemOrgName;
    }

    public void setOemOrgName(String oemOrgName) {
        this.oemOrgName = oemOrgName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getStrongWeakAgent() {
        return strongWeakAgent;
    }

    public void setStrongWeakAgent(String strongWeakAgent) {
        this.strongWeakAgent = strongWeakAgent;
    }
}
