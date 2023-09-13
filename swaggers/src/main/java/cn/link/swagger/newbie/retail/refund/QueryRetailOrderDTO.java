package cn.link.swagger.newbie.retail.refund;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


/**
 * <p>
 * 查询客户订单DTO
 * </p>
 *
 * @author chenzb
 * @since 2020-03-26
 */
public class QueryRetailOrderDTO implements Serializable {

    @ApiModelProperty(value = "直售页面标识")
    private Integer directRetailFlag;
    @ApiModelProperty(value = "销售模式")
    private String strongWeakAgent;

    @ApiModelProperty(value = "客户订单Id")
    private String soNoId;

    @ApiModelProperty(value = "客户订单编号")
    private String soNo;

    @ApiModelProperty(value = "销售订单id")
    private Long soVinId;

    @ApiModelProperty(value = "菜单ID用于权限查询拼接")
    private String menuId;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "OWNER_CODE")
    private String ownerCode;

    @ApiModelProperty(value = "潜客电话")
    private String customerTel;

    @ApiModelProperty(value = "销售顾问--APP/PC")
    private String consultant;

    @ApiModelProperty(value = "pc端搜索")
    private String searchText;

    @ApiModelProperty(value = "APP端搜索")
    private String searchTextApp;
    @ApiModelProperty(value = "订单创建时间")
    private String createdAt;

    @ApiModelProperty(value = "订单提交开始时间")
    private String submitTimeStart;

    @ApiModelProperty(value = "订单提交结束时间")
    private String submitTimeEnd;

    @ApiModelProperty(value = "订单审批通过开始时间")
    private String auditedByManagerDateStart;

    @ApiModelProperty(value = "订单审批通过结束时间")
    private String auditedByManagerDateEnd;

    @ApiModelProperty(value = "预交车开始时间")
    private String deliveringDateStart;

    @ApiModelProperty(value = "预交车结束时间")
    private String deliveringDateEnd;

    @ApiModelProperty(value = "销售类型(2014 - BMW)")
    private String saleType;

    @ApiModelProperty(value = "配车状态")
    private String dispatchedStatus;

    @ApiModelProperty(value = "第一级ID(如：品牌)", name = "firstId")
    private String firstId;

    @ApiModelProperty(value = "第二级ID（series）", name = "secondId")
    private String secondId;

    @ApiModelProperty(value = "第三级ID", name = "thirdId")
    private String thirdId;

    @ApiModelProperty(value = "第四级ID", name = "fourId")
    private String fourId;

    @ApiModelProperty(value = "第五级ID", name = "fiveId")
    private String fiveId;

    @ApiModelProperty(value = "第六级ID", name = "sixthId")
    private String sixthId;

    @ApiModelProperty(value = "第七级ID", name = "seventhId")
    private String seventhId;

    @ApiModelProperty(value = "第八级ID", name = "eighthId")
    private String eighthId;

    @ApiModelProperty(value = "物料ID（variantID）", name = "materialId")
    private String materialId;

    @ApiModelProperty(value = "物料级别", name = "materialLevel")
    private Integer materialLevel;

    @ApiModelProperty(value = "开单日期(开始)")
    private String sheetCreateDateStart;

    @ApiModelProperty(value = "开单日期(结束)")
    private String sheetCreateDateEnd;

    @ApiModelProperty(value = "订单状态：1404")
    private String soStatus;

    @ApiModelProperty("IS_DEPOSIT")
    private Integer isDeposit;

    @ApiModelProperty("isSubmit")
    private Integer isSubmit;

    @ApiModelProperty(value = "VIN 底盘号")
    private String vin;

    @ApiModelProperty(value = "车辆用途：1511--APP/PC")
    private Integer vehicleUse;

    @ApiModelProperty(value = "互联驾驶验证码")
    private String drivingVerificationCode;

    @ApiModelProperty(value = "车牌号")
    private String licensePlateNumber;

    @ApiModelProperty(value = "行驶证号")
    private String registrationNo;

    @ApiModelProperty(value = "行驶证注册日期")
    private LocalDateTime registrationCreatedAt;

    @ApiModelProperty(value = "是否结清：1004")
    private Integer isClearing;

    @ApiModelProperty(value = "驾照号")
    private String drivingLicenseNo;

    @ApiModelProperty(value = "专属服务顾问")
    private String serviceConsultant;

    @ApiModelProperty(value = "入参文本-取消、变更原因")
    private String textDetail;

    @ApiModelProperty(value = "入参数附件地址")
    private String textUrls;

    @ApiModelProperty(value = "取消原因类别")
    private Integer cancelType;

    @ApiModelProperty(value = "市场活动")
    private String activityId;

    @ApiModelProperty(value = "排序方式")
    private String sort;

    @ApiModelProperty(value = "市场活动(集客)")
    private String customerActivityId;

    @ApiModelProperty(value = "交车上报日期(开始)")
    private String handVehicleDateStart;

    @ApiModelProperty(value = "交车上报日期(结束)")
    private String handVehicleDateEnd;

    @ApiModelProperty(value = "订单取消时间(开始)")
    private String cancelTimeStart;

    @ApiModelProperty(value = "订单取消时间(结束)")
    private String cancelTimeEnd;

    @ApiModelProperty(value = "是否分配")
    private String isDistribution;

    @ApiModelProperty("大区id")
    private String bigAreaId;
    @ApiModelProperty("小区id")
    private String oemOrgId;
    @ApiModelProperty("集团id")
    private String groupCompanyId;

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市")
    private String city;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty(value = "maxId，导出时使用", hidden = true)
    private Long maxId;

    @ApiModelProperty("置换类型")
    private Integer replacementType;

    @ApiModelProperty(value = "点评评分评星")
    private String evaluationScore;

    @ApiModelProperty(value = "点评内容")
    private String evaluationTag;

    @ApiModelProperty("补充内容")
    private String evaluationContent;

    @ApiModelProperty(value = "交车单备注")
    private String handoverCarRemark;

    @ApiModelProperty(value = "顾问备注")
    private String adviserRemark;

    @ApiModelProperty(value = "交车单确认时间")
    private LocalDateTime handoverCarAffirmTime;

    @ApiModelProperty(value = "交车单确认状态")
    private String handoverCarAffirmStatus;

    @ApiModelProperty(value = "交车单链接")
    private String handoverCarUrl;

    @ApiModelProperty(value = "交车单是否推送")
    private Integer isHandoverCarPush;

    @ApiModelProperty(value = "市场活动")
    private String marketActivityIds;

    @ApiModelProperty("是否脱敏")
    private Integer desensitization;

    @ApiModelProperty(value = "金额退回方式（转款，退款）")
    private Integer returnType;

    @ApiModelProperty(value = "是否原路退回")
    private Integer returnOriginal;

    @ApiModelProperty(value = "线上收款时间")
    private LocalDateTime receiveTimeOnlion;

    @ApiModelProperty(value = "账户")
    private String bankAccountNo;

    @ApiModelProperty(value = "开户行")
    private String bankAccountAddress;

    @ApiModelProperty(value = "姓名")
    private String bankAccountName;

    @ApiModelProperty(value = "金额")
    private Double refundAmount;

    @ApiModelProperty(value = "优惠券金额")
    private Double couponAmount;

    @ApiModelProperty(value = "订单申请修改备注")
    private String modifyRemark;

    @ApiModelProperty(value = "活动部门", name = "createTeamCode", example = "活动部门")
    private String createTeamCode;
    @ApiModelProperty(value = "活动部门", name = "createTeamName", example = "活动部门")
    private String createTeamName;

    @ApiModelProperty(value = "活动部门(促单)", name = "cdCreateTeamCode", example = "活动部门(促单)")
    private String cdCreateTeamCode;
    @ApiModelProperty(value = "活动部门(促单)", name = "cdCreateTeamName", example = "活动部门(促单)")
    private String cdCreateTeamName;
    @ApiModelProperty(value = "是否开票")
    private Integer isInvoice;

    @ApiModelProperty(value = "创建方式")
    private String isApps;

    @ApiModelProperty(value = "发票开始时间")
    private String invoiceDateStart;

    @ApiModelProperty(value = "发票结束时间")
    private String invoiceDateEnd;

    @ApiModelProperty(value = "是否超收")
    private Integer overchargeStatus;

    @ApiModelProperty(value = "超收确认")
    private Integer confirmOverchargeStatus;

    @ApiModelProperty("是否可开票")
    private Integer isBill;

    /**
     * 工厂订单号
     */
    @ApiModelProperty(value = "工厂订单号")
    private String generalOrderno;


    @ApiModelProperty(value = "是否上传定金支付凭证 10041001 10041002")
    private Integer hasDepositAttachment;

    @ApiModelProperty(value = "客户订单编号_批量查询")
    private List<String> soNoList;

    @ApiModelProperty(value = "vin_批量查询")
    private List<String> vinList;

    @ApiModelProperty("当前页")
    private Long pageNum;

    @ApiModelProperty("分页大小")
    private Long limit;

    @ApiModelProperty(value = "订车门店代码")
    private List<String> deliveryOwnerCodes;

    @ApiModelProperty(value = "交车经销商代码")
    private List<String> orderOwnerCodes;

    @ApiModelProperty(value = "订单审批状态集合（9058）")
    private List<Integer> approvalStatusList;
    @ApiModelProperty(value = "是否上传分期凭证（1004）")
    private Integer isInstallment;
    @ApiModelProperty(value = "贷款期限（7090）")
    private Integer loanTerm;

    public List<Integer> getApprovalStatusList() {
        return approvalStatusList;
    }

    public void setApprovalStatusList(List<Integer> approvalStatusList) {
        this.approvalStatusList = approvalStatusList;
    }

    public Integer getIsInstallment() {
        return isInstallment;
    }

    public void setIsInstallment(Integer isInstallment) {
        this.isInstallment = isInstallment;
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
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

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public List<String> getSoNoList() {
        return soNoList;
    }

    public void setSoNoList(List<String> soNoList) {
        this.soNoList = soNoList;
    }

    public List<String> getVinList() {
        return vinList;
    }

    public void setVinList(List<String> vinList) {
        this.vinList = vinList;
    }

    public String getGeneralOrderno() {
        return generalOrderno;
    }

    public void setGeneralOrderno(String generalOrderno) {
        this.generalOrderno = generalOrderno;
    }


    public Integer getHasDepositAttachment() {
        return hasDepositAttachment;
    }

    public void setHasDepositAttachment(Integer hasDepositAttachment) {
        this.hasDepositAttachment = hasDepositAttachment;
    }

    public Integer getOverchargeStatus() {
        return overchargeStatus;
    }

    public void setOverchargeStatus(Integer overchargeStatus) {
        this.overchargeStatus = overchargeStatus;
    }

    public Integer getConfirmOverchargeStatus() {
        return confirmOverchargeStatus;
    }

    public void setConfirmOverchargeStatus(Integer confirmOverchargeStatus) {
        this.confirmOverchargeStatus = confirmOverchargeStatus;
    }

    public Integer getIsBill() {
        return isBill;
    }

    public void setIsBill(Integer isBill) {
        this.isBill = isBill;
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

    public String getIsApps() {
        return isApps;
    }

    public void setIsApps(String isApps) {
        this.isApps = isApps;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getModifyRemark() {
        return modifyRemark;
    }

    public void setModifyRemark(String modifyRemark) {
        this.modifyRemark = modifyRemark;
    }

    public String getCdCreateTeamCode() {
        return cdCreateTeamCode;
    }

    public void setCdCreateTeamCode(String cdCreateTeamCode) {
        this.cdCreateTeamCode = cdCreateTeamCode;
    }

    public String getCdCreateTeamName() {
        return cdCreateTeamName;
    }

    public void setCdCreateTeamName(String cdCreateTeamName) {
        this.cdCreateTeamName = cdCreateTeamName;
    }

    public String getAdviserRemark() {
        return adviserRemark;
    }

    public void setAdviserRemark(String adviserRemark) {
        this.adviserRemark = adviserRemark;
    }

    public String getCreateTeamCode() {
        return createTeamCode;
    }

    public void setCreateTeamCode(String createTeamCode) {
        this.createTeamCode = createTeamCode;
    }

    public String getCreateTeamName() {
        return createTeamName;
    }

    public void setCreateTeamName(String createTeamName) {
        this.createTeamName = createTeamName;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Integer getReturnOriginal() {
        return returnOriginal;
    }

    public void setReturnOriginal(Integer returnOriginal) {
        this.returnOriginal = returnOriginal;
    }

    public LocalDateTime getReceiveTimeOnlion() {
        return receiveTimeOnlion;
    }

    public void setReceiveTimeOnlion(LocalDateTime receiveTimeOnlion) {
        this.receiveTimeOnlion = receiveTimeOnlion;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountAddress() {
        return bankAccountAddress;
    }

    public void setBankAccountAddress(String bankAccountAddress) {
        this.bankAccountAddress = bankAccountAddress;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Long getMaxId() {
        return maxId;
    }

    public void setMaxId(Long maxId) {
        this.maxId = maxId;
    }

    public String getMarketActivityIds() {
        return marketActivityIds;
    }

    public void setMarketActivityIds(String marketActivityIds) {
        this.marketActivityIds = marketActivityIds;
    }

    public Integer getIsHandoverCarPush() {
        return isHandoverCarPush;
    }

    public void setIsHandoverCarPush(Integer isHandoverCarPush) {
        this.isHandoverCarPush = isHandoverCarPush;
    }

    public String getHandoverCarUrl() {
        return handoverCarUrl;
    }

    public void setHandoverCarUrl(String handoverCarUrl) {
        this.handoverCarUrl = handoverCarUrl;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public String getHandoverCarRemark() {
        return handoverCarRemark;
    }

    public void setHandoverCarRemark(String handoverCarRemark) {
        this.handoverCarRemark = handoverCarRemark;
    }

    public LocalDateTime getHandoverCarAffirmTime() {
        return handoverCarAffirmTime;
    }

    public void setHandoverCarAffirmTime(LocalDateTime handoverCarAffirmTime) {
        this.handoverCarAffirmTime = handoverCarAffirmTime;
    }

    public String getHandoverCarAffirmStatus() {
        return handoverCarAffirmStatus;
    }

    public void setHandoverCarAffirmStatus(String handoverCarAffirmStatus) {
        this.handoverCarAffirmStatus = handoverCarAffirmStatus;
    }

    public String getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(String evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

    public String getEvaluationTag() {
        return evaluationTag;
    }

    public void setEvaluationTag(String evaluationTag) {
        this.evaluationTag = evaluationTag;
    }

    public Long getSoVinId() {
        return soVinId;
    }

    public void setSoVinId(Long soVinId) {
        this.soVinId = soVinId;
    }

    public Integer getReplacementType() {
        return replacementType;
    }

    public void setReplacementType(Integer replacementType) {
        this.replacementType = replacementType;
    }

    public String getCancelTimeStart() {
        return cancelTimeStart;
    }

    public void setCancelTimeStart(String cancelTimeStart) {
        this.cancelTimeStart = cancelTimeStart;
    }

    public String getCancelTimeEnd() {
        return cancelTimeEnd;
    }

    public void setCancelTimeEnd(String cancelTimeEnd) {
        this.cancelTimeEnd = cancelTimeEnd;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getIsDistribution() {
        return isDistribution;
    }

    public void setIsDistribution(String isDistribution) {
        this.isDistribution = isDistribution;
    }

    public String getBigAreaId() {
        return bigAreaId;
    }

    public void setBigAreaId(String bigAreaId) {
        this.bigAreaId = bigAreaId;
    }

    public String getOemOrgId() {
        return oemOrgId;
    }

    public void setOemOrgId(String oemOrgId) {
        this.oemOrgId = oemOrgId;
    }

    public String getGroupCompanyId() {
        return groupCompanyId;
    }

    public void setGroupCompanyId(String groupCompanyId) {
        this.groupCompanyId = groupCompanyId;
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

    public String getCustomerActivityId() {
        return customerActivityId;
    }

    public void setCustomerActivityId(String customerActivityId) {
        this.customerActivityId = customerActivityId;
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

    public String getAuditedByManagerDateStart() {
        return auditedByManagerDateStart;
    }

    public void setAuditedByManagerDateStart(String auditedByManagerDateStart) {
        this.auditedByManagerDateStart = auditedByManagerDateStart;
    }

    public String getAuditedByManagerDateEnd() {
        return auditedByManagerDateEnd;
    }

    public void setAuditedByManagerDateEnd(String auditedByManagerDateEnd) {
        this.auditedByManagerDateEnd = auditedByManagerDateEnd;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Integer getCancelType() {
        return cancelType;
    }

    public void setCancelType(Integer cancelType) {
        this.cancelType = cancelType;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
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

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getSheetCreateDateStart() {
        return sheetCreateDateStart;
    }

    public void setSheetCreateDateStart(String sheetCreateDateStart) {
        this.sheetCreateDateStart = sheetCreateDateStart;
    }

    public Integer getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Integer isDeposit) {
        this.isDeposit = isDeposit;
    }

    public String getSheetCreateDateEnd() {
        return sheetCreateDateEnd;
    }

    public void setSheetCreateDateEnd(String sheetCreateDateEnd) {
        this.sheetCreateDateEnd = sheetCreateDateEnd;
    }

    public String getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(String soStatus) {
        this.soStatus = soStatus;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getVehicleUse() {
        return vehicleUse;
    }

    public void setVehicleUse(Integer vehicleUse) {
        this.vehicleUse = vehicleUse;
    }

    public String getDrivingVerificationCode() {
        return drivingVerificationCode;
    }

    public void setDrivingVerificationCode(String drivingVerificationCode) {
        this.drivingVerificationCode = drivingVerificationCode;
    }

    public String getDispatchedStatus() {
        return dispatchedStatus;
    }

    public void setDispatchedStatus(String dispatchedStatus) {
        this.dispatchedStatus = dispatchedStatus;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }


    public String getSoNoId() {
        return soNoId;
    }

    public void setSoNoId(String soNoId) {
        this.soNoId = soNoId;
    }

    public LocalDateTime getRegistrationCreatedAt() {
        return registrationCreatedAt;
    }

    public void setRegistrationCreatedAt(LocalDateTime registrationCreatedAt) {
        this.registrationCreatedAt = registrationCreatedAt;
    }

    public String getServiceConsultant() {
        return serviceConsultant;
    }

    public void setServiceConsultant(String serviceConsultant) {
        this.serviceConsultant = serviceConsultant;
    }

    public String getTextDetail() {
        return textDetail;
    }

    public void setTextDetail(String textDetail) {
        this.textDetail = textDetail;
    }

    public String getTextUrls() {
        return textUrls;
    }

    public void setTextUrls(String textUrls) {
        this.textUrls = textUrls;
    }


    public String getFiveId() {
        return fiveId;
    }

    public void setFiveId(String fiveId) {
        this.fiveId = fiveId;
    }

    public String getSixthId() {
        return sixthId;
    }

    public void setSixthId(String sixthId) {
        this.sixthId = sixthId;
    }

    public String getSeventhId() {
        return seventhId;
    }

    public void setSeventhId(String seventhId) {
        this.seventhId = seventhId;
    }

    public String getEighthId() {
        return eighthId;
    }

    public void setEighthId(String eighthId) {
        this.eighthId = eighthId;
    }

    public Integer getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(Integer materialLevel) {
        this.materialLevel = materialLevel;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public Integer getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(Integer isSubmit) {
        this.isSubmit = isSubmit;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getSubmitTimeStart() {
        return submitTimeStart;
    }

    public void setSubmitTimeStart(String submitTimeStart) {
        this.submitTimeStart = submitTimeStart;
    }

    public String getSubmitTimeEnd() {
        return submitTimeEnd;
    }

    public void setSubmitTimeEnd(String submitTimeEnd) {
        this.submitTimeEnd = submitTimeEnd;
    }

    public String getSearchTextApp() {
        return searchTextApp;
    }

    public void setSearchTextApp(String searchTextApp) {
        this.searchTextApp = searchTextApp;
    }

    public Integer getDesensitization() {
        return desensitization;
    }

    public void setDesensitization(Integer desensitization) {
        this.desensitization = desensitization;
    }

    public Integer getIsClearing() {
        return isClearing;
    }

    public void setIsClearing(Integer isClearing) {
        this.isClearing = isClearing;
    }

    @Override
    public String toString() {
        return "QueryRetailOrderDTO{" +
                "soNoId='" + soNoId + '\'' +
                ", soNo='" + soNo + '\'' +
                ", soVinId=" + soVinId +
                ", menuId='" + menuId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", ownerCode='" + ownerCode + '\'' +
                ", customerTel='" + customerTel + '\'' +
                ", consultant='" + consultant + '\'' +
                ", searchText='" + searchText + '\'' +
                ", searchTextApp='" + searchTextApp + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", submitTimeStart='" + submitTimeStart + '\'' +
                ", submitTimeEnd='" + submitTimeEnd + '\'' +
                ", auditedByManagerDateStart='" + auditedByManagerDateStart + '\'' +
                ", auditedByManagerDateEnd='" + auditedByManagerDateEnd + '\'' +
                ", deliveringDateStart='" + deliveringDateStart + '\'' +
                ", deliveringDateEnd='" + deliveringDateEnd + '\'' +
                ", saleType='" + saleType + '\'' +
                ", dispatchedStatus='" + dispatchedStatus + '\'' +
                ", firstId='" + firstId + '\'' +
                ", secondId='" + secondId + '\'' +
                ", thirdId='" + thirdId + '\'' +
                ", fourId='" + fourId + '\'' +
                ", fiveId='" + fiveId + '\'' +
                ", sixthId='" + sixthId + '\'' +
                ", seventhId='" + seventhId + '\'' +
                ", eighthId='" + eighthId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", materialLevel=" + materialLevel +
                ", sheetCreateDateStart='" + sheetCreateDateStart + '\'' +
                ", sheetCreateDateEnd='" + sheetCreateDateEnd + '\'' +
                ", soStatus='" + soStatus + '\'' +
                ", isDeposit=" + isDeposit +
                ", isSubmit=" + isSubmit +
                ", vin='" + vin + '\'' +
                ", vehicleUse=" + vehicleUse +
                ", drivingVerificationCode='" + drivingVerificationCode + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", registrationCreatedAt=" + registrationCreatedAt +
                ", isClearing=" + isClearing +
                ", drivingLicenseNo='" + drivingLicenseNo + '\'' +
                ", serviceConsultant='" + serviceConsultant + '\'' +
                ", textDetail='" + textDetail + '\'' +
                ", textUrls='" + textUrls + '\'' +
                ", cancelType=" + cancelType +
                ", activityId='" + activityId + '\'' +
                ", sort='" + sort + '\'' +
                ", customerActivityId='" + customerActivityId + '\'' +
                ", handVehicleDateStart='" + handVehicleDateStart + '\'' +
                ", handVehicleDateEnd='" + handVehicleDateEnd + '\'' +
                ", cancelTimeStart='" + cancelTimeStart + '\'' +
                ", cancelTimeEnd='" + cancelTimeEnd + '\'' +
                ", isDistribution='" + isDistribution + '\'' +
                ", bigAreaId='" + bigAreaId + '\'' +
                ", oemOrgId='" + oemOrgId + '\'' +
                ", groupCompanyId='" + groupCompanyId + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", maxId=" + maxId +
                ", replacementType=" + replacementType +
                ", evaluationScore='" + evaluationScore + '\'' +
                ", evaluationTag='" + evaluationTag + '\'' +
                ", evaluationContent='" + evaluationContent + '\'' +
                ", handoverCarRemark='" + handoverCarRemark + '\'' +
                ", adviserRemark='" + adviserRemark + '\'' +
                ", handoverCarAffirmTime=" + handoverCarAffirmTime +
                ", handoverCarAffirmStatus='" + handoverCarAffirmStatus + '\'' +
                ", handoverCarUrl='" + handoverCarUrl + '\'' +
                ", isHandoverCarPush=" + isHandoverCarPush +
                ", marketActivityIds='" + marketActivityIds + '\'' +
                ", desensitization=" + desensitization +
                ", returnType=" + returnType +
                ", returnOriginal=" + returnOriginal +
                ", receiveTimeOnlion=" + receiveTimeOnlion +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", bankAccountAddress='" + bankAccountAddress + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", refundAmount=" + refundAmount +
                ", couponAmount=" + couponAmount +
                ", modifyRemark='" + modifyRemark + '\'' +
                ", createTeamCode='" + createTeamCode + '\'' +
                ", createTeamName='" + createTeamName + '\'' +
                ", cdCreateTeamCode='" + cdCreateTeamCode + '\'' +
                ", cdCreateTeamName='" + cdCreateTeamName + '\'' +
                ", isInvoice=" + isInvoice +
                ", isApps='" + isApps + '\'' +
                ", invoiceDateStart='" + invoiceDateStart + '\'' +
                ", invoiceDateEnd='" + invoiceDateEnd + '\'' +
                ", overchargeStatus=" + overchargeStatus +
                ", confirmOverchargeStatus=" + confirmOverchargeStatus +
                ", isBill=" + isBill +
                ", generalOrderno='" + generalOrderno + '\'' +
                ", soNoList='" + soNoList + '\'' +
                ", vinList='" + vinList + '\'' +
                ", pageNum='" + pageNum + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

    public Integer getDirectRetailFlag() {
        return directRetailFlag;
    }

    public void setDirectRetailFlag(Integer directRetailFlag) {
        this.directRetailFlag = directRetailFlag;
    }

    public String getStrongWeakAgent() {
        return strongWeakAgent;
    }

    public void setStrongWeakAgent(String strongWeakAgent) {
        this.strongWeakAgent = strongWeakAgent;
    }
}
