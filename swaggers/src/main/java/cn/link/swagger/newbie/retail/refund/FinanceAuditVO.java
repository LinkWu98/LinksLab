package cn.link.swagger.newbie.retail.refund;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("意向金退款VO")
public class FinanceAuditVO {
    @ApiModelProperty(value = "直售退款审批表ID")
    private Long refundApprovalId;

    @ApiModelProperty(value = "业务单号(订单里对应订单编号)")
    private String businessNo;

    @ApiModelProperty(value = "业务类型")
    private Integer businessType;

    @ApiModelProperty(value = "订单类型")
    private Integer saleType;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "商机ID")
    private Long customerBusinessId;

    @ApiModelProperty(value = "订单状态")
    private Integer soStatus;

    @ApiModelProperty(value = "财务审批类型")
    private Integer financeAuditType;

    @ApiModelProperty(value = "潜客姓氏")
    private String customerSurnames;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "手机号")
    private String customerTel;

    @ApiModelProperty(value = "手机号[非脱敏]")
    private String VisibleCustomerTel;

    @ApiModelProperty(value = "订单辅助状态")
    private Integer soSecondStatus;

    @ApiModelProperty(value = "开单日期")
    private LocalDateTime sheetCreateDate;

    @ApiModelProperty(value = "预计交车时间")
    private LocalDateTime deliveringDate;

    @ApiModelProperty(value = "提交人")
    private String submitBy;

    @ApiModelProperty(value = "审核人员")
    private String auditBy;

    @ApiModelProperty(value = "审批日期")
    private LocalDateTime auditDate;

    @ApiModelProperty(value = "审核结果")
    private Integer refundStatus;

    @ApiModelProperty(value = "审核进度")
    private Integer auditProgress;

    @ApiModelProperty(value = "审批意见")
    private String auditPostil;

    @ApiModelProperty(value = "销售订单ID(业务订单号)")
    private Long soNoId;

    @ApiModelProperty(value = "(审批流传入)角色人员")
    private String candicateGroup;

    @ApiModelProperty(value = "(审批流传入)业务编号")
    private String taskId;

    @ApiModelProperty(value = "(审批流传入)标识")
    private String executionId;

    @ApiModelProperty(value = "(审批流传入)业务关键字")
    private String businessKey;

    @ApiModelProperty(value = "提交时间")
    private LocalDateTime commitTime;

    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    @ApiModelProperty(value = "开单人")
    private String sheetCreatedBy;

    @ApiModelProperty(value = "车辆拼接信息")
    private String carDetail;

    @ApiModelProperty(value = "产品ID")
    private String materialId;

    @ApiModelProperty(value = "订单申请修改备注")
    private String modifyRemark;

    @ApiModelProperty(value = "入参文本-取消、变更原因")
    private String textDetail;

    @ApiModelProperty(value = "强弱代理")
    private Integer strongWeakAgent;

    @ApiModelProperty(value = "强弱代理名称")
    private String strongWeakAgentName;

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
}
