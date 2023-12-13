package cn.link.swagger.newbie.retail.deliver;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 整车销售订单
 * </p>
 *
 * @author renwd
 * @since 2019-08-22
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@ApiModel("整车销售订单DTO")
public class SalesOrdersDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 销售订单ID
     */
    @ApiModelProperty(value = "销售订单ID", name = "soNoId")
    private Long soNoId;

    /**
     * 公司代码
     */
    @ApiModelProperty(value = "公司代码", name = "companyCode")
    private String companyCode;

    /**
     * 经销商代码
     */
    @ApiModelProperty(value = "经销商代码", name = "ownerCode")
    private String ownerCode;

    /**
     * 组织id
     */
    @ApiModelProperty(value = "组织id", name = "orgId")
    private String orgId;

    /**
     * 商机id
     */
    @ApiModelProperty(value = "商机id", name = "customerBusinessId")
    private Long customerBusinessId;

    /**
     * 潜客id
     */
    @ApiModelProperty(value = "潜客id", name = "customerId")
    private Long customerId;

    /**
     * 线索来源id
     */
    @ApiModelProperty(value = "线索来源id", name = "clueSource")
    private String clueSource;


    @ApiModelProperty(value = "是否APP/PC", name = "isApp")
    private Integer isApp;

    /**
     * 开票人id(dmo返回)
     */
    @ApiModelProperty(value = "开票人id(dmo返回)", name = "drawerId")
    private String drawerId;

    /**
     * 销售订单号
     */
    @ApiModelProperty(value = "销售订单号", name = "soNo")
    private String soNo;

    /**
     * 原销售订单号
     */
    @ApiModelProperty(value = "原销售订单号", name = "oldSoNo")
    private String oldSoNo;

    /**
     * 一般销售、受托交车、销售退货
     */
    @ApiModelProperty(value = "一般销售、受托交车、销售退货", name = "businessType")
    private Integer businessType;

    /**
     * 是否大客户
     */
    @ApiModelProperty(value = "是否大客户", name = "isBigCustomer")
    private Integer isBigCustomer;

    /**
     * 开单日期
     */


    @ApiModelProperty(value = "开单日期", name = "sheetCreateDate")
    private LocalDateTime sheetCreateDate;

    /**
     * 开单人
     */
    @ApiModelProperty(value = "开单人", name = "sheetCreatedBy")
    private String sheetCreatedBy;

    /**
     * 签约日期
     */


    @ApiModelProperty(value = "签约日期", name = "contractDate")
    private LocalDateTime contractDate;

    /**
     * 合约编号
     */
    @ApiModelProperty(value = "合约编号", name = "contractNo")
    private String contractNo;

    /**
     * 定金/违约金
     */
    @ApiModelProperty(value = "定金/违约金", name = "contractEarnest")
    private Double contractEarnest;

    /**
     * 订单状态(1404)
     */
    @ApiModelProperty(value = "订单状态(1404)", name = "soStatus")
    private Integer soStatus;

    /**
     * 销售顾问ID
     */
    @ApiModelProperty(value = "销售顾问ID", name = "consultant")
    private String consultant;

    /**
     * 退单原因
     */
    @ApiModelProperty(value = "退单原因", name = "returnReason")
    private String returnReason;

    /**
     * 最新审核人员
     */
    @ApiModelProperty(value = "最新审核人员", name = "auditedManager")
    private String auditedManager;

    /**
     * 最新审核通过日期
     */


    @ApiModelProperty(value = "最新审核通过日期", name = "auditedByManagerDate")
    private LocalDateTime auditedByManagerDate;

    /**
     * 业务线下交车确认日期
     */
    @ApiModelProperty(value = "业务线下交车确认日期")


    private LocalDateTime confirmedDate;
    /**
     * 最新审核意见
     */
    @ApiModelProperty(value = "最新审核意见", name = "auditedManagerRemark")
    private String auditedManagerRemark;

    /**
     * 交车方式(1428)
     */
    @ApiModelProperty(value = "交车方式(1428)", name = "deliveryMode")
    private Integer deliveryMode;

    /**
     * 开票方式(1429)
     */
    @ApiModelProperty(value = "开票方式(1429)", name = "invoiceMode")
    private Long invoiceMode;

    /**
     * 交车状态
     */
    @ApiModelProperty(value = "交车状态", name = "handCarStatus")
    private Integer handCarStatus;

    /**
     * 是否结清
     */
    @ApiModelProperty(value = "是否结清", name = "isClearing")
    private Integer isClearing;

    /**
     * 提交时间
     */


    @ApiModelProperty(value = "提交时间", name = "submitTime")
    private LocalDateTime submitTime;

    /**
     * 是否置换
     */
    @ApiModelProperty(value = "是否置换", name = "whetherToReplace")
    private Integer whetherToReplace;

    /**
     * 是否本店投保
     */
    @ApiModelProperty(value = "是否本店投保", name = "isOurStore")
    private Integer isOurStore;

    /**
     * 是否交订金
     */
    @ApiModelProperty(value = "是否交订金", name = "isDeposit")
    private Integer isDeposit;

    /**
     * 订单备注
     */
    @ApiModelProperty(value = "订单备注", name = "remark")
    private String remark;

    /**
     * 价格备注
     */
    @ApiModelProperty(value = "价格备注", name = "priceRemark")
    private String priceRemark;

    /**
     * 订单创建-市场活动
     */
    @ApiModelProperty(value = "订单创建-市场活动")
    private String activityId;

    /**
     * 新车确认交付单
     */
    @ApiModelProperty(value = "新车确认交付单")
    private String carUUID;

    /**
     * 三包凭证
     */
    @ApiModelProperty(value = "三包凭证")
    private String imgUUID;

    /**
     * phev
     */
    @ApiModelProperty(value = "phev上传")
    private String phevUUID;

    /**
     * 实际交车时间
     */


    @ApiModelProperty(value = "实际交车时间", name = "actualTime")
    private LocalDateTime actualTime;


    @ApiModelProperty(value = "里程数")
    private Double mileage;

    /**
     * 合同：1004001：电子，10041002：纸质
     */
    @ApiModelProperty(value = "合同权限")
    private Integer isCarElectronic;

    @ApiModelProperty(value = "订单车辆表id")
    private Long soVinId;
    /**
     * 交车联系人电话
     */
    @ApiModelProperty("交车联系人电话")
    private String deliveryContactPhone;
    /**
     * 是否质损
     */
    @ApiModelProperty("是否质损")
    private Integer isPoorQuality;
    /**
     * 沃世界账号
     */
    @ApiModelProperty("沃世界账号")
    private String volvoWorldAccount;
    /**
     * 新车交付确认单（客户签署）
     */
    @ApiModelProperty("新车交付确认单（客户签署）")
    private String deliveryConfirmCustomerUuid;
    /**
     * 新车交付确认单（顾问上传）
     */
    @ApiModelProperty("新车交付确认单（顾问上传）")
    private String deliveryConfirmConsultantUuid;
    /**
     * 交车委托书
     */
    @ApiModelProperty("交车委托书")
    private String deliveryAuthorizationUuid;
    /**
     * 交车仪式照片
     */
    @ApiModelProperty("交车仪式照片")
    private String deliveryCeremonyUuid;
    /**
     * 交车检查清单
     */
    @ApiModelProperty("交车检查清单")
    private String deliveryChecklistUuid;
    /**
     * 其他附件
     */
    @ApiModelProperty("其他附件")
    private String otherAttachmentUuid;
    /**
     * 客户维修告知书
     */
    @ApiModelProperty("客户维修告知书")
    private String customerRepairNoticeUuid;

}
