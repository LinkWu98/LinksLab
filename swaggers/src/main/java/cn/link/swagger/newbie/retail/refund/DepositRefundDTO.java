package cn.link.swagger.newbie.retail.refund;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("意向金退款DTO")
public class DepositRefundDTO {

    @ApiModelProperty(value = "客户订单Id")
    private String soNoId;

    @ApiModelProperty(value = "客户订单编号")
    private String soNo;

    @ApiModelProperty(value = "审批意见")
    private String submitAuditDetail;

    @ApiModelProperty(value = "强弱代理")
    private String strongWeakAgent;

    @ApiModelProperty(value = "财务审批类型")
    private String financeAuditType;

    @ApiModelProperty(value = "订单类型")
    private String saleType;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "手机号")
    private String customerTel;

    @ApiModelProperty(value = "业务单号")
    private String businessNo;

    @ApiModelProperty(value = "业务类型")
    private Integer businessType;

    @ApiModelProperty(value = "菜单ID用于权限查询拼接")
    private String menuId;

    @ApiModelProperty(value = "退款审核结果")
    private Integer refundStatus;

    @ApiModelProperty(value = "提交时间")
    private String commitTime;

    @ApiModelProperty(value = "客户订单列表查询 1：直售客户订单查询；2：客户订单查询")
    private Integer directRetailFlag;

    @ApiModelProperty(value = "提交人")
    private String submitBy;

    @ApiModelProperty(value = "排序方式")
    private String sort;

    @ApiModelProperty(value = "提交时间起")
    private String commitTimeStart;

    @ApiModelProperty(value = "提交时间止")
    private String commitTimeEnd;

    @ApiModelProperty(value = "订单编号List_批量查詢")
    private List<String> businessNoList;

    @ApiModelProperty(value = "当前页")
    private Long current;

    @ApiModelProperty(value = "分页大小")
    private Long limit;

    @ApiModelProperty(value = "订车门店")
    private List<String> deliveryOwnerCodes;

    @ApiModelProperty(value = "交车经销商")
    private List<String> orderOwnerCodes;

    @ApiModelProperty(value = "开单日期(开始)")
    private String sheetCreateDateStart;

    @ApiModelProperty(value = "开单日期(结束)")
    private String sheetCreateDateEnd;

    @ApiModelProperty(value = "预交车时间")
    private String deliveringDate;

    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    @ApiModelProperty(value = "订单状态：1404")
    private String soStatus;

}
