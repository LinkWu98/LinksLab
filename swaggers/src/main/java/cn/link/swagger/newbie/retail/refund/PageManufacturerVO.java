package cn.link.swagger.newbie.retail.refund;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@ApiModel(value = "列表-销售订单VO", description = "列表-销售订单")
@Data
public class PageManufacturerVO {

    @ApiModelProperty(value = "销售模式")
    private String strongWeakAgent;

    @ApiModelProperty(value = "销售模式")
    private Integer strongWeakAgentStatus;

    @ApiModelProperty(value = "客户订单id")
    private String soNoId;

    @ApiModelProperty(value = "销售订单id")
    private String soVinId;

    @ApiModelProperty(value = "客户订单编号")
    private String soNo;

    @ApiModelProperty(value = "选装包金额")
    private Double delicateTotalPrice;

    @ApiModelProperty(value = "VIN 底盘号")
    private String vin;

    @ApiModelProperty(value = "VIN 底盘号")
//    @SensitiveInfo(SensitiveType.VIN)
    private String visibleVin;

    @ApiModelProperty(value = "库存ID")
    private String vsStockId;

    @ApiModelProperty(value = "订单状态：1404")
    private Integer soStatus;
    @ApiModelProperty(value = "订单状态")
    private String soStatusCn;

    @ApiModelProperty(value = "订单辅助状态：1400")
    private Integer soSecondStatus;

    @ApiModelProperty(value = "审批类型状态")
    private Integer changeStatus;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "拼接好的选装包名")
    private String optionNames;

    @ApiModelProperty(value = "商机ID")
    private String customerBusinessId;

    @ApiModelProperty(value = "潜客姓氏")
    private String customerSurnames;

    @ApiModelProperty(value = "潜客名称")
    private String customerName;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "车辆零售总价【【改为车厂指导价】】")
    private Double vehicleRetailAllAmount;

    @ApiModelProperty(value = "车辆成交总价")
    private Double vehicleDealAllAmount;

    @ApiModelProperty(value = "联系人名称")
    private String contactName;

    @ApiModelProperty(value = "退车时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String vehicleReturnDates;

    @ApiModelProperty(value = "退车时间")
    private LocalDateTime vehicleReturnDate;

    @ApiModelProperty(value = "潜客编号")
    private String customerNo;

    @ApiModelProperty(value = "潜客类型")
    private String customerType;

    @ApiModelProperty(value = "潜客电话")
    private String customerTel;

    @ApiModelProperty(value = "潜客电话")
    private String VisibleCustomerTel;

    @ApiModelProperty(value = "潜客证件号码")
    private String customerCertificateNo;

    @ApiModelProperty(value = "库存状态 1413")
    private Integer ownStockStatus;

    @ApiModelProperty(value = "是否配车 1414")
    private Integer dispatchedStatus;

    @ApiModelProperty(value = "开票/联系人姓氏")
    private String drawerSurnames;

    @ApiModelProperty(value = "开票/联系人姓名", name = "drawerName")
    private String drawerName;

    @ApiModelProperty(value = "开票/联系人电话", name = "drawerTel")
    private String drawerTel;

    @ApiModelProperty(value = "开票/联系人电话(加密)", name = "drawerEncryptionTel")
    private String drawerEncryptionTel;

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

    @ApiModelProperty(value = "第五级ID")
    private String fiveId;

    @ApiModelProperty(value = "第五级名")
    private String fiveName;

    @ApiModelProperty(value = "第六级ID", name = "sixthId")
    private String sixthId;

    @ApiModelProperty(value = "第六级名")
    private String sixthName;

    @ApiModelProperty(value = "第七级ID", name = "seventhId")
    private String seventhId;

    @ApiModelProperty(value = "第七级名")
    private String seventhName;

    @ApiModelProperty(value = "第八级ID", name = "eighthId")
    private String eighthId;

    @ApiModelProperty(value = "第八级名")
    private String eighthName;

    @ApiModelProperty(value = "物料ID（variantID）", name = "materialId")
    private String materialId;

    @ApiModelProperty(value = "精品/包,包含内饰，外饰等")
    private List<SalesOptionPO> salesOptionList;

    @ApiModelProperty(value = "外色", name = "colorId")
    private String colorId;

    private String colorName;

    @ApiModelProperty(value = "内饰")
    private String trimColorId;

    private String trimColorName;

    @ApiModelProperty(value = "内饰")
    private String packageId;

    private String packageName;

    @ApiModelProperty(value = "物料名")
    private String materialName;

    @ApiModelProperty(value = "物料级别", name = "materialLevel")
    private Integer materialLevel;

    @ApiModelProperty(value = "订单销售类型-tc_code:2014 bmw用 通用1404")
    private Integer saleType;

    @ApiModelProperty(value = "订单销售类型")
    private String saleTypeCn;

    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    @ApiModelProperty(value = "订单创建-市场活动")
    private String activityName;

    @ApiModelProperty("市场活动名称")
    private String marketActivityName;

    @ApiModelProperty("市场活动code")
    private String marketActivityCode;

    @ApiModelProperty(value = "订单创建-市场活动-代码")
    private String activityId;

    @ApiModelProperty("市场活动名称(集客)")
    private String customerMarketActivityName;

    @ApiModelProperty("市场活动名称(集客)")
    private String customerMarketActivityCode;

    @ApiModelProperty(value = "是否支付订金1004")
    private Integer isDeposit;

    @ApiModelProperty(value = "是否支付订金中文")
    private String isDeposits;

    @ApiModelProperty(value = "是否结清：1004")
    private Integer isClearing;

    @ApiModelProperty(value = "分期全款")
    private String payMode;

    @ApiModelProperty(value = "分期全款(导出使用)")
    private String payModes;

    @ApiModelProperty(value = "首付金额")
    private Double initialPayment;

    @ApiModelProperty(value = "创建时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String createdAts;

    // TODO 订单提交时加入提交时间字段
    @ApiModelProperty(value = "提交时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String submitTimes;

    // TODO 订单最新审核通过时间的
    @ApiModelProperty(value = "订单最新审核通过时间的(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String auditedByManagerDates;

    @ApiModelProperty(value = "预计交车时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String deliveringDates;

    @ApiModelProperty(value = "开票时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String invoiceDates;

    @ApiModelProperty(value = "开票时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String invoiceDateTimes;

    @ApiModelProperty(value = "开票时间")
    private String invoiceDateTime;

    @ApiModelProperty(value = "配车时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String dispatchedDate;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    // TODO 订单提交时加入提交时间字段
    @ApiModelProperty(value = "提交时间")
    private LocalDateTime submitTime;

    // TODO 订单最新审核通过时间的
    @ApiModelProperty(value = "订单最新审核通过时间的")
    private LocalDateTime auditedByManagerDate;

    @ApiModelProperty(value = "预计交车时间")
    private LocalDateTime deliveringDate;


    @ApiModelProperty(value = "开票时间")
    private LocalDateTime invoiceDate;

    @ApiModelProperty(value = "SMM订单ID")
    private String smmOrderId;

    @ApiModelProperty(value = "客户订单总金额")
    private Double orderAllAmount;

    @ApiModelProperty(value = "裸车报价-销售顾问填写的成交价")
    private Double vehiclePrice;

    @ApiModelProperty(value = "抵扣/优惠金额")
    private Double offsetAmount;

    @ApiModelProperty(value = "创建方式:是否是app")
    private Integer isApp;

    @ApiModelProperty(value = "创建方式")
    private String exisApp;

    @ApiModelProperty(value = "状态标记")
    private Integer statusMark;

    @ApiModelProperty(value = "开单人")
    private String sheetCreatedBy;

    @ApiModelProperty(value = "车辆基础信息")
    private String carDetail;

//    @ApiModelProperty(value = "从clue返回的浅客信息及关联的联系人信息")
//    private PotentialCustomersVO potentialCustomer;
//
//    @ApiModelProperty(value = "从clue返回的商机信息")
//    private CustomerBusinessDTO customerBusiness;

    @ApiModelProperty(value = "市场活动(集客)")
    private String customerActivityId;

    @ApiModelProperty(value = "交车时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String handVehicleDates;

    @ApiModelProperty(value = "订单取消时间(导出)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String cancelTimes;

    @ApiModelProperty(value = "交车时间")
    private LocalDateTime handVehicleDate;

    @ApiModelProperty(value = "订单取消时间")
    private LocalDateTime cancelTime;

    private String ownerCode;
    @ApiModelProperty("经销商公司名称")
    private String companyName;

    @ApiModelProperty("大区名称")
    private String bigAreaName;
    @ApiModelProperty("小区名称")
    private String oemOrgName;
    @ApiModelProperty("集团名称")
    private String groupCompanyName;
    @ApiModelProperty("公司名称简称")
    private String companyShortNameCn;

    @ApiModelProperty("来源渠道ID")
    private String clueSourceId;

    @ApiModelProperty("来源渠道名称")
    private String clueSourceName;

    @ApiModelProperty(value = "省名称")
    private String provinceName;

    @ApiModelProperty(value = "城名称")
    private String cityName;

    @ApiModelProperty(value = "区名称")
    private String districtName;

    @ApiModelProperty("置换类型")
    private Integer replacementType;

    @ApiModelProperty("置换类型")
    private String replacementTypeCn;

    @ApiModelProperty("点评评分评星")
    private String evaluationScore;

    @ApiModelProperty(value = "是否评价")
    private Integer isReview;

    @ApiModelProperty("点评内容")
    private String evaluationTag;

    @ApiModelProperty("补充内容")
    private String evaluationContent;

    @ApiModelProperty("是否保险")
    private Integer isInsurance;

    @ApiModelProperty(value = "电子签状态")
    private String signatureStatus;

    @ApiModelProperty(value = "电子签状态(导出使用)")
    private String signatureStatusReport;

    @ApiModelProperty(value = "流程ID")
    private String signatureId;

    @ApiModelProperty(value = "电子签URL")
    private String signatureUrl;

    @ApiModelProperty(value = "电子签签约完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String signatureDate;

    @ApiModelProperty(value = "是否电子签")
    private String isElectronic;

    @ApiModelProperty(value = "活动部门", name = "createTeamCode", example = "活动部门")
    private String createTeamCode;
    @ApiModelProperty(value = "活动部门", name = "createTeamName", example = "活动部门")
    private String createTeamName;

    @ApiModelProperty(value = "活动部门(促单)", name = "createTeamCode", example = "活动部门(促单)")
    private String cdCreateTeamCode;
    @ApiModelProperty(value = "活动部门(促单)", name = "createTeamName", example = "活动部门(促单)")
    private String cdCreateTeamName;

    @ApiModelProperty(value = "配车状态cn")
    private String ex_dispatchedStatus;

    @ApiModelProperty(value = "是否电子签cn")
    private String ex_isElectronic;


    @ApiModelProperty("第二级物料code")
    private String secondCode;

    @ApiModelProperty("第四级物料code")
    private String fourCode;

    @ApiModelProperty("选装包中文名")
    private String personalityOptionsName;

    @ApiModelProperty("第三级物料code")
    private String thirdCode;

    @ApiModelProperty("外色代码")
    private String colorCode;

    @ApiModelProperty("内饰色代码")
    private String trimColorCode;

    @ApiModelProperty("选装代码")
    private String personalityOptionsCode;

    @ApiModelProperty("贷款金额")
    private Double loanAmounts;

    @ApiModelProperty(value = "定金")
    private Double contractEarnest;

    @ApiModelProperty(value = "开票人证件类型")
    private Integer drawerNewCtcode;

    @ApiModelProperty(value = "开票人证件号码")
    private String drawerCertificateNo;

    @ApiModelProperty(value = "是否开票")
    private String isInvoiceCn;

    @ApiModelProperty(value = "市场活动")
    private String marketActivity;

    @ApiModelProperty(value = "是否高亮显示（针对直售）")
    private Integer highlight;


    @ApiModelProperty(value = "潜客证件类型")
    private Integer customerCtCode;

    @ApiModelProperty(value = "潜客地址")
    private String customerAddress;

    @ApiModelProperty(value = "服务项目总金额")
    private Double serviceSum;

    @ApiModelProperty("订车门店名称")
    private String deliveryCompanyName;

    @ApiModelProperty("订车门店地址")
    private String deliveryAddress;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty(value = "合约编号", name = "contractNo")
    private String contractNo;

    @ApiModelProperty(value = "作废合约编号预备")
    private String newContractNo;

    @ApiModelProperty("合同备注")
    private String contractRemark;

    @ApiModelProperty("国补价")
    private Double subsidyPrice;

    @ApiModelProperty("订车门店")
    private String deliveryOwnerCode;

    @ApiModelProperty("权益包")
    private String rightsPackage;

    @ApiModelProperty("开票人证件类型")
    private Integer drawerCtcode;

    @ApiModelProperty("交车经销商代码")
    private String orderOwnerCode;

    @ApiModelProperty("交车经销商名称")
    private String orderCompanyName;

    @ApiModelProperty("交车经销商地址")
    private String orderAddress;

    @ApiModelProperty(value = "是否超收")
    private Integer overchargeStatus;

    @ApiModelProperty(value = "超收确认")
    private Integer confirmOverchargeStatus;

    @ApiModelProperty(value = "实际价")
    private Double actualTotalPrice;
    @ApiModelProperty("订单取消理由")
    private String textDetail;

    @ApiModelProperty("是否评价")
    private String ex_isReview;

    @ApiModelProperty("是否可开票")
    private Integer isBill;

    @ApiModelProperty("手机号密文")
    private String customerTelEncode;

    @ApiModelProperty("开票人手机号密文")
    private String drawerTelEncode;

    @ApiModelProperty(value = "是否上传订金凭证中文")
    private String hasDepositAttachmentText;

    @ApiModelProperty(value = "凭证上传时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime depositAttachmentCreatedTime;

    @ApiModelProperty(value = "凭证上传时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String depositAttachmentCreatedTimeStr;

    /**
     * 工厂订单号
     */
    @ApiModelProperty(value = "工厂订单号")
    private String generalOrderno;

    @ApiModelProperty(value = "订单配车辅助状态")
    private Integer auxiliaryStatus;

    @ApiModelProperty(value = "订单审批状态（9058）")
    private Integer approvalStatus;

    @ApiModelProperty(value = "订单审批状态名称")
    private String approvalStatusName;
    @ApiModelProperty(value = "是否小订期间，1004")
    private Integer smallDepositPeriod;
    @ApiModelProperty(value = "是否大定期间，1004")
    private Integer largeDepositPeriod;
    @ApiModelProperty(value = "分期凭证上传时间")
    private LocalDateTime installmentUploadTime;
    @ApiModelProperty(value = "是否上传分期凭证（1004）")
    private Integer isInstallment;
    @ApiModelProperty(value = "是否上传分期凭证名称")
    private String isInstallmentName;
    @ApiModelProperty(value = "贷款期限（7090）")
    private Integer loanTerm;
    @ApiModelProperty(value = "贷款期限名称")
    private String loanTermName;
    @ApiModelProperty(value = "金融机构")
    private String financialInstitutions;
    @ApiModelProperty("交车经销商名称ToPc")
    private String orderCompanyNameToPc;
    @ApiModelProperty("订车门店名称ToPc")
    private String deliveryCompanyNameToPc;
    @ApiModelProperty(value = "有效期24小时")
    private String depositAttachmentUploadValidDate;

    public String getApprovalStatusName() {
        return approvalStatusName;
    }

    public void setApprovalStatusName(String approvalStatusName) {
        this.approvalStatusName = approvalStatusName;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getSmallDepositPeriod() {
        return smallDepositPeriod;
    }

    public void setSmallDepositPeriod(Integer smallDepositPeriod) {
        this.smallDepositPeriod = smallDepositPeriod;
    }

    public Integer getLargeDepositPeriod() {
        return largeDepositPeriod;
    }

    public void setLargeDepositPeriod(Integer largeDepositPeriod) {
        this.largeDepositPeriod = largeDepositPeriod;
    }

    public Integer getAuxiliaryStatus() {
        return auxiliaryStatus;
    }

    public void setAuxiliaryStatus(Integer auxiliaryStatus) {
        this.auxiliaryStatus = auxiliaryStatus;
    }

    public String getOrderCompanyNameToPc() {
        return orderCompanyNameToPc;
    }

    public void setOrderCompanyNameToPc(String orderCompanyNameToPc) {
        this.orderCompanyNameToPc = orderCompanyNameToPc;
    }

    public String getDeliveryCompanyNameToPc() {
        return deliveryCompanyNameToPc;
    }

    public void setDeliveryCompanyNameToPc(String deliveryCompanyNameToPc) {
        this.deliveryCompanyNameToPc = deliveryCompanyNameToPc;
    }

    public String getGeneralOrderno() {
        return generalOrderno;
    }

    public void setGeneralOrderno(String generalOrderno) {
        this.generalOrderno = generalOrderno;
    }

    public String getDepositAttachmentCreatedTimeStr() {
        return depositAttachmentCreatedTimeStr;
    }

    public void setDepositAttachmentCreatedTimeStr(String depositAttachmentCreatedTimeStr) {
        this.depositAttachmentCreatedTimeStr = depositAttachmentCreatedTimeStr;
    }

    public String getDepositAttachmentUploadValidDate() {
        return depositAttachmentUploadValidDate;
    }

    public void setDepositAttachmentUploadValidDate(String depositAttachmentUploadValidDate) {
        this.depositAttachmentUploadValidDate = depositAttachmentUploadValidDate;
    }

    public LocalDateTime getDepositAttachmentCreatedTime() {
        return depositAttachmentCreatedTime;
    }

    public void setDepositAttachmentCreatedTime(LocalDateTime depositAttachmentCreatedTime) {
        this.depositAttachmentCreatedTime = depositAttachmentCreatedTime;
    }

    public String getHasDepositAttachmentText() {
        return hasDepositAttachmentText;
    }

    public void setHasDepositAttachmentText(String hasDepositAttachmentText) {
        this.hasDepositAttachmentText = hasDepositAttachmentText;
    }

    public String getCustomerTelEncode() {
        return customerTelEncode;
    }

    public void setCustomerTelEncode(String customerTelEncode) {
        this.customerTelEncode = customerTelEncode;
    }

    public String getDrawerTelEncode() {
        return drawerTelEncode;
    }

    public void setDrawerTelEncode(String drawerTelEncode) {
        this.drawerTelEncode = drawerTelEncode;
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

    public String getIsDeposits() {
        return isDeposits;
    }

    public void setIsDeposits(String isDeposits) {
        this.isDeposits = isDeposits;
    }

    public Integer getIsBill() {
        return isBill;
    }

    public void setIsBill(Integer isBill) {
        this.isBill = isBill;
    }


    public String getTextDetail() {
        return textDetail;
    }

    public void setTextDetail(String textDetail) {
        this.textDetail = textDetail;
    }

    public String getEx_isReview() {
        return ex_isReview;
    }

    public void setEx_isReview(String ex_isReview) {
        this.ex_isReview = ex_isReview;
    }

    public Double getActualTotalPrice() {
        return actualTotalPrice;
    }

    public void setActualTotalPrice(Double actualTotalPrice) {
        this.actualTotalPrice = actualTotalPrice;
    }

    public String getRightsPackage() {
        return rightsPackage;
    }

    public void setRightsPackage(String rightsPackage) {
        this.rightsPackage = rightsPackage;
    }

    public Integer getDrawerCtcode() {
        return drawerCtcode;
    }

    public void setDrawerCtcode(Integer drawerCtcode) {
        this.drawerCtcode = drawerCtcode;
    }

    public String getDeliveryOwnerCode() {
        return deliveryOwnerCode;
    }

    public void setDeliveryOwnerCode(String deliveryOwnerCode) {
        this.deliveryOwnerCode = deliveryOwnerCode;
    }

    public String getNewContractNo() {
        return newContractNo;
    }

    public void setNewContractNo(String newContractNo) {
        this.newContractNo = newContractNo;
    }

    public Integer getCustomerCtCode() {
        return customerCtCode;
    }

    public void setCustomerCtCode(Integer customerCtCode) {
        this.customerCtCode = customerCtCode;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Double getServiceSum() {
        return serviceSum;
    }

    public void setServiceSum(Double serviceSum) {
        this.serviceSum = serviceSum;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getContractRemark() {
        return contractRemark;
    }

    public void setContractRemark(String contractRemark) {
        this.contractRemark = contractRemark;
    }

    public Double getSubsidyPrice() {
        return subsidyPrice;
    }

    public void setSubsidyPrice(Double subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }


    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public String getSignatureStatusReport() {
        return signatureStatusReport;
    }

    public void setSignatureStatusReport(String signatureStatusReport) {
        this.signatureStatusReport = signatureStatusReport;
    }

    public String getExisApp() {
        return exisApp;
    }

    public void setExisApp(String exisApp) {
        this.exisApp = exisApp;
    }

    public String getMarketActivity() {
        return marketActivity;
    }

    public void setMarketActivity(String marketActivity) {
        this.marketActivity = marketActivity;
    }

    public String getIsInvoiceCn() {
        return isInvoiceCn;
    }

    public void setIsInvoiceCn(String isInvoiceCn) {
        this.isInvoiceCn = isInvoiceCn;
    }

    public String getVehicleReturnDates() {
        return vehicleReturnDates;
    }

    public void setVehicleReturnDates(String vehicleReturnDates) {
        this.vehicleReturnDates = vehicleReturnDates;
    }

    public String getCreatedAts() {
        return createdAts;
    }

    public void setCreatedAts(String createdAts) {
        this.createdAts = createdAts;
    }

    public String getSubmitTimes() {
        return submitTimes;
    }

    public void setSubmitTimes(String submitTimes) {
        this.submitTimes = submitTimes;
    }

    public String getAuditedByManagerDates() {
        return auditedByManagerDates;
    }

    public void setAuditedByManagerDates(String auditedByManagerDates) {
        this.auditedByManagerDates = auditedByManagerDates;
    }

    public String getDeliveringDates() {
        return deliveringDates;
    }

    public void setDeliveringDates(String deliveringDates) {
        this.deliveringDates = deliveringDates;
    }

    public String getInvoiceDates() {
        return invoiceDates;
    }

    public void setInvoiceDates(String invoiceDates) {
        this.invoiceDates = invoiceDates;
    }

    public String getInvoiceDateTimes() {
        return invoiceDateTimes;
    }

    public void setInvoiceDateTimes(String invoiceDateTimes) {
        this.invoiceDateTimes = invoiceDateTimes;
    }

    public String getHandVehicleDates() {
        return handVehicleDates;
    }

    public void setHandVehicleDates(String handVehicleDates) {
        this.handVehicleDates = handVehicleDates;
    }

    public String getCancelTimes() {
        return cancelTimes;
    }

    public void setCancelTimes(String cancelTimes) {
        this.cancelTimes = cancelTimes;
    }

    public String getDrawerCertificateNo() {
        return drawerCertificateNo;
    }

    public void setDrawerCertificateNo(String drawerCertificateNo) {
        this.drawerCertificateNo = drawerCertificateNo;
    }

    public Integer getDrawerNewCtcode() {
        return drawerNewCtcode;
    }

    public void setDrawerNewCtcode(Integer drawerNewCtcode) {
        this.drawerNewCtcode = drawerNewCtcode;
    }

    public Double getLoanAmounts() {
        return loanAmounts;
    }

    public void setLoanAmounts(Double loanAmounts) {
        this.loanAmounts = loanAmounts;
    }

    public Double getContractEarnest() {
        return contractEarnest;
    }

    public void setContractEarnest(Double contractEarnest) {
        this.contractEarnest = contractEarnest;
    }

    public Double getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(Double initialPayment) {
        this.initialPayment = initialPayment;
    }

    public String getReplacementTypeCn() {
        return replacementTypeCn;
    }

    public void setReplacementTypeCn(String replacementTypeCn) {
        this.replacementTypeCn = replacementTypeCn;
    }

    public String getPersonalityOptionsCode() {
        return personalityOptionsCode;
    }

    public void setPersonalityOptionsCode(String personalityOptionsCode) {
        this.personalityOptionsCode = personalityOptionsCode;
    }

    public String getPersonalityOptionsName() {
        return personalityOptionsName;
    }

    public void setPersonalityOptionsName(String personalityOptionsName) {
        this.personalityOptionsName = personalityOptionsName;
    }

    public String getSoStatusCn() {
        return soStatusCn;
    }

    public void setSoStatusCn(String soStatusCn) {
        this.soStatusCn = soStatusCn;
    }

    public String getTrimColorCode() {
        return trimColorCode;
    }

    public void setTrimColorCode(String trimColorCode) {
        this.trimColorCode = trimColorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getFourCode() {
        return fourCode;
    }

    public void setFourCode(String fourCode) {
        this.fourCode = fourCode;
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode;
    }

    public String getEx_isElectronic() {
        return ex_isElectronic;
    }

    public void setEx_isElectronic(String ex_isElectronic) {
        this.ex_isElectronic = ex_isElectronic;
    }

    public String getEx_dispatchedStatus() {
        return ex_dispatchedStatus;
    }

    public void setEx_dispatchedStatus(String ex_dispatchedStatus) {
        this.ex_dispatchedStatus = ex_dispatchedStatus;
    }

    public Double getDelicateTotalPrice() {
        return delicateTotalPrice;
    }

    public void setDelicateTotalPrice(Double delicateTotalPrice) {
        this.delicateTotalPrice = delicateTotalPrice;
    }

    public String getSmmOrderId() {
        return smmOrderId;
    }

    public void setSmmOrderId(String smmOrderId) {
        this.smmOrderId = smmOrderId;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
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

    public String getCustomerMarketActivityCode() {
        return customerMarketActivityCode;
    }

    public void setCustomerMarketActivityCode(String customerMarketActivityCode) {
        this.customerMarketActivityCode = customerMarketActivityCode;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getIsElectronic() {
        return isElectronic;
    }

    public void setIsElectronic(String isElectronic) {
        this.isElectronic = isElectronic;
    }

    public String getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(String signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public String getSignatureUrl() {
        return signatureUrl;
    }

    public void setSignatureUrl(String signatureUrl) {
        this.signatureUrl = signatureUrl;
    }

    public Integer getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(Integer isInsurance) {
        this.isInsurance = isInsurance;
    }

    public String getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(String evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

    public Integer getIsReview() {
        return isReview;
    }

    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
    }

    public String getEvaluationTag() {
        return evaluationTag;
    }

    public void setEvaluationTag(String evaluationTag) {
        this.evaluationTag = evaluationTag;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public Integer getReplacementType() {
        return replacementType;
    }

    public void setReplacementType(Integer replacementType) {
        this.replacementType = replacementType;
    }

    public String getVsStockId() {
        return vsStockId;
    }

    public void setVsStockId(String vsStockId) {
        this.vsStockId = vsStockId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getClueSourceId() {
        return clueSourceId;
    }

    public void setClueSourceId(String clueSourceId) {
        this.clueSourceId = clueSourceId;
    }

    public String getClueSourceName() {
        return clueSourceName;
    }

    public void setClueSourceName(String clueSourceName) {
        this.clueSourceName = clueSourceName;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getGroupCompanyName() {
        return groupCompanyName;
    }

    public void setGroupCompanyName(String groupCompanyName) {
        this.groupCompanyName = groupCompanyName;
    }

    public String getCustomerMarketActivityName() {
        return customerMarketActivityName;
    }

    public void setCustomerMarketActivityName(String customerMarketActivityName) {
        this.customerMarketActivityName = customerMarketActivityName;
    }

    public LocalDateTime getHandVehicleDate() {
        return handVehicleDate;
    }

    public void setHandVehicleDate(LocalDateTime handVehicleDate) {
        this.handVehicleDate = handVehicleDate;
    }

    public String getCustomerActivityId() {
        return customerActivityId;
    }

    public void setCustomerActivityId(String customerActivityId) {
        this.customerActivityId = customerActivityId;
    }


    public Double getVehicleRetailAllAmount() {
        return vehicleRetailAllAmount;
    }

    public void setVehicleRetailAllAmount(Double vehicleRetailAllAmount) {
        this.vehicleRetailAllAmount = vehicleRetailAllAmount;
    }

    public LocalDateTime getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(LocalDateTime cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Double getVehicleDealAllAmount() {
        return vehicleDealAllAmount;
    }

    public void setVehicleDealAllAmount(Double vehicleDealAllAmount) {
        this.vehicleDealAllAmount = vehicleDealAllAmount;
    }

    public String getOptionNames() {
        return optionNames;
    }

    public void setOptionNames(String optionNames) {
        this.optionNames = optionNames;
    }
//
//    public PotentialCustomersVO getPotentialCustomer() {
//        return potentialCustomer;
//    }
//
//    public void setPotentialCustomer(PotentialCustomersVO potentialCustomer) {
//        this.potentialCustomer = potentialCustomer;
//    }
//
//    public CustomerBusinessDTO getCustomerBusiness() {
//        return customerBusiness;
//    }
//
//    public void setCustomerBusiness(CustomerBusinessDTO customerBusiness) {
//        this.customerBusiness = customerBusiness;
//    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSoNoId() {
        return soNoId;
    }

    public void setSoNoId(String soNoId) {
        this.soNoId = soNoId;
    }

    public String getSoVinId() {
        return soVinId;
    }

    public void setSoVinId(String soVinId) {
        this.soVinId = soVinId;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVisibleVin() {
        return visibleVin;
    }

    public void setVisibleVin(String visibleVin) {
        this.visibleVin = visibleVin;
    }

    public Integer getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(Integer soStatus) {
        this.soStatus = soStatus;
    }

    public String getCustomerSurnames() {
        return customerSurnames;
    }

    public void setCustomerSurnames(String customerSurnames) {
        this.customerSurnames = customerSurnames;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getDrawerSurnames() {
        return drawerSurnames;
    }

    public void setDrawerSurnames(String drawerSurnames) {
        this.drawerSurnames = drawerSurnames;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }

    public String getDrawerTel() {
        return drawerTel;
    }

    public void setDrawerTel(String drawerTel) {
        this.drawerTel = drawerTel;
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

    public Integer getDispatchedStatus() {
        return dispatchedStatus;
    }

    public void setDispatchedStatus(Integer dispatchedStatus) {
        this.dispatchedStatus = dispatchedStatus;
    }

    public String getFourName() {
        return fourName;
    }

    public void setFourName(String fourName) {
        this.fourName = fourName;
    }

    public String getFiveId() {
        return fiveId;
    }

    public void setFiveId(String fiveId) {
        this.fiveId = fiveId;
    }

    public String getFiveName() {
        return fiveName;
    }

    public void setFiveName(String fiveName) {
        this.fiveName = fiveName;
    }

    public String getSixthId() {
        return sixthId;
    }

    public void setSixthId(String sixthId) {
        this.sixthId = sixthId;
    }

    public String getSixthName() {
        return sixthName;
    }

    public void setSixthName(String sixthName) {
        this.sixthName = sixthName;
    }

    public String getSeventhId() {
        return seventhId;
    }

    public void setSeventhId(String seventhId) {
        this.seventhId = seventhId;
    }

    public String getSeventhName() {
        return seventhName;
    }

    public void setSeventhName(String seventhName) {
        this.seventhName = seventhName;
    }

    public String getEighthId() {
        return eighthId;
    }

    public void setEighthId(String eighthId) {
        this.eighthId = eighthId;
    }

    public String getEighthName() {
        return eighthName;
    }

    public void setEighthName(String eighthName) {
        this.eighthName = eighthName;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public List<SalesOptionPO> getSalesOptionList() {
        return salesOptionList;
    }

    public void setSalesOptionList(List<SalesOptionPO> salesOptionList) {
        this.salesOptionList = salesOptionList;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Integer getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(Integer materialLevel) {
        this.materialLevel = materialLevel;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public LocalDateTime getAuditedByManagerDate() {
        return auditedByManagerDate;
    }

    public void setAuditedByManagerDate(LocalDateTime auditedByManagerDate) {
        this.auditedByManagerDate = auditedByManagerDate;
    }

    public LocalDateTime getDeliveringDate() {
        return deliveringDate;
    }

    public void setDeliveringDate(LocalDateTime deliveringDate) {
        this.deliveringDate = deliveringDate;
    }

    public Double getOrderAllAmount() {
        return orderAllAmount;
    }

    public void setOrderAllAmount(Double orderAllAmount) {
        this.orderAllAmount = orderAllAmount;
    }

    public Double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(Double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public Double getOffsetAmount() {
        return offsetAmount;
    }

    public void setOffsetAmount(Double offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    public Integer getStatusMark() {
        return statusMark;
    }

    public void setStatusMark(Integer statusMark) {
        this.statusMark = statusMark;
    }

    public Integer getIsApp() {
        return isApp;
    }

    public void setIsApp(Integer isApp) {
        this.isApp = isApp;
    }

    public String getSheetCreatedBy() {
        return sheetCreatedBy;
    }

    public void setSheetCreatedBy(String sheetCreatedBy) {
        this.sheetCreatedBy = sheetCreatedBy;
    }

    public String getCarDetail() {
        return carDetail;
    }

    public void setCarDetail(String carDetail) {
        this.carDetail = carDetail;
    }

    public Integer getIsClearing() {
        return isClearing;
    }

    public void setIsClearing(Integer isClearing) {
        this.isClearing = isClearing;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
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

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getOwnStockStatus() {
        return ownStockStatus;
    }

    public void setOwnStockStatus(Integer ownStockStatus) {
        this.ownStockStatus = ownStockStatus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCustomerBusinessId() {
        return customerBusinessId;
    }

    public void setCustomerBusinessId(String customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompanyShortNameCn() {
        return companyShortNameCn;
    }

    public void setCompanyShortNameCn(String companyShortNameCn) {
        this.companyShortNameCn = companyShortNameCn;
    }

    public String getMarketActivityName() {
        return marketActivityName;
    }

    public void setMarketActivityName(String marketActivityName) {
        this.marketActivityName = marketActivityName;
    }

    public String getMarketActivityCode() {
        return marketActivityCode;
    }

    public void setMarketActivityCode(String marketActivityCode) {
        this.marketActivityCode = marketActivityCode;
    }

    public LocalDateTime getVehicleReturnDate() {
        return vehicleReturnDate;
    }

    public void setVehicleReturnDate(LocalDateTime vehicleReturnDate) {
        this.vehicleReturnDate = vehicleReturnDate;
    }

    public String getVisibleCustomerTel() {
        return VisibleCustomerTel;
    }

    public void setVisibleCustomerTel(String visibleCustomerTel) {
        VisibleCustomerTel = visibleCustomerTel;
    }

    public Integer getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Integer isDeposit) {
        this.isDeposit = isDeposit;
    }

    public String getCustomerCertificateNo() {
        return customerCertificateNo;
    }

    public void setCustomerCertificateNo(String customerCertificateNo) {
        this.customerCertificateNo = customerCertificateNo;
    }

    public String getDrawerEncryptionTel() {
        return drawerEncryptionTel;
    }

    public void setDrawerEncryptionTel(String drawerEncryptionTel) {
        this.drawerEncryptionTel = drawerEncryptionTel;
    }

    public Integer getSoSecondStatus() {
        return soSecondStatus;
    }

    public void setSoSecondStatus(Integer soSecondStatus) {
        this.soSecondStatus = soSecondStatus;
    }

    public Integer getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Integer changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getSaleTypeCn() {
        return saleTypeCn;
    }

    public void setSaleTypeCn(String saleTypeCn) {
        this.saleTypeCn = saleTypeCn;
    }


    public String getInvoiceDateTime() {
        return invoiceDateTime;
    }

    public void setInvoiceDateTime(String invoiceDateTime) {
        this.invoiceDateTime = invoiceDateTime;
    }

    public String getDispatchedDate() {
        return dispatchedDate;
    }

    public void setDispatchedDate(String dispatchedDate) {
        this.dispatchedDate = dispatchedDate;
    }

    public String getPayModes() {
        return payModes;
    }

    public void setPayModes(String payModes) {
        this.payModes = payModes;
    }

    public String getOrderOwnerCode() {
        return orderOwnerCode;
    }

    public void setOrderOwnerCode(String orderOwnerCode) {
        this.orderOwnerCode = orderOwnerCode;
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

    public String getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate;
    }

    public String getStrongWeakAgent() {
        return strongWeakAgent;
    }

    public void setStrongWeakAgent(String strongWeakAgent) {
        this.strongWeakAgent = strongWeakAgent;
    }

    public Integer getStrongWeakAgentStatus() {
        return strongWeakAgentStatus;
    }

    public void setStrongWeakAgentStatus(Integer strongWeakAgentStatus) {
        this.strongWeakAgentStatus = strongWeakAgentStatus;
    }
}
