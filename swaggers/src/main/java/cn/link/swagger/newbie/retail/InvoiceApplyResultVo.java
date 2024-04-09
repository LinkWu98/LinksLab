package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author: zsw
 * @date: 2023-09-11
 * @description: 开票申请出参VO
 */

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "InvoiceApplyResultVo", description = "开票申请出参VO")
public class InvoiceApplyResultVo {

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long soNoId;

    @ApiModelProperty(value = "订单编号")
    private String soNo;

    @ApiModelProperty(value = "销售模式")
    private Integer strongWeakAgent;

    @ApiModelProperty(value = "销售模式名称")
    private String strongWeakAgentName;

    @ApiModelProperty(value = "订单总金额(元)")
    private String orderAllAmount;

    @ApiModelProperty(value = "整车开票金额(元)")
    private String vehicleInvoiceAmount;

    @ApiModelProperty(value = "购买人名称")
    private String buyerName;

    @ApiModelProperty(value = "购买人证件类型编码")
    private Integer drawerNewCtcode;

    @ApiModelProperty(value = "购买人证件号码")
    private String buyerCertificateNo;

    @ApiModelProperty(value = "购买人电话")
    private String buyerPhone;

    @ApiModelProperty(value = "申请类型")
    private Integer applyType;

    @ApiModelProperty(value = "申请类型名称")
    private String applyTypeName;

    @ApiModelProperty(value = "开票类型")
    private Integer invoiceType;

    @ApiModelProperty(value = "开票类型名称")
    private String invoiceTypeName;

    @ApiModelProperty(value = "开票状态")
    private Integer invoiceStatus;

    @ApiModelProperty(value = "开票状态名称")
    private String invoiceStatusName;

    @ApiModelProperty(value = "开票状态")
    private Integer appInvoiceStatus;

    @ApiModelProperty(value = "app开票状态名称")
    private String appInvoiceStatusName;

    @ApiModelProperty(value = "VIN")
    private String vin;

    @ApiModelProperty(value = "订车门店")
    private String deliveryOwnerCode;

    @ApiModelProperty(value = "订车门店名称")
    private String deliveryOwnerCodeName;

    @ApiModelProperty(value = "交车经销商")
    private String orderOwnerCode;

    @ApiModelProperty(value = "交车经销商名称")
    private String orderOwnerCodeName;

    @ApiModelProperty(value = "销售顾问")
    private String consultantId;

    @ApiModelProperty(value = "销售顾问名称")
    private String consultantName;

    @ApiModelProperty(value = "客户发票获取方式")
    private Integer fetchMethod;

    @ApiModelProperty(value = "客户发票获取方式名称")
    private String fetchMethodName;

    @ApiModelProperty(value = "收件人")
    private String recipientName;

    @ApiModelProperty(value = "收件人电话")
    private String recipientPhone;

    @ApiModelProperty(value = "收件地址")
    private String recipientAddress;

    @ApiModelProperty(value = "快递单号")
    private String courierNumber;

    @ApiModelProperty(value = "提交时间")
    private String submissionTime;

    @ApiModelProperty(value = "审批通过时间")
    private String approvalTime;

    @ApiModelProperty(value = "开票日期")
    private String invoiceTime;

    @ApiModelProperty(value = "PDS检测状态")
    private Integer pdsStatus;

    @ApiModelProperty(value = "申请特殊开票原因")
    private String specialInvoiceReason;

    @ApiModelProperty(value = "增值税专用发票已开具状态")
    private Integer vatInvoiceIssuedStatus;

    @ApiModelProperty(value = "增值税专用发票已开具状态名称")
    private String vatInvoiceIssuedStatusName;

    @ApiModelProperty(value = "增票开票日期")
    private String vatInvoiceDatetime;

    @ApiModelProperty(value = "增票发票号码")
    private String vatInvoiceEncoding;

    @ApiModelProperty(value = "是否可开具机动车统一销售发票-10041001:是,10041002:否")
    private Integer saleInvoiceEnable;

    @ApiModelProperty(value = "是否可开具增值税专用发票-10041001:是,10041002:否")
    private Integer vatInvoiceEnable;

    @ApiModelProperty(value = "特殊申请附件信息")
    private List<SoInvoiceUrlDTO> specialAttachmentList;

    @ApiModelProperty(value = "订单关联soVinId")
    private Long soVinId;

    @ApiModelProperty(value = "合格证快递单号")
    private String cocCourierNumber;
}
