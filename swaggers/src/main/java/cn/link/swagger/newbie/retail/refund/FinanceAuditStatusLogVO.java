package cn.link.swagger.newbie.retail.refund;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 订单状态变更对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "意向金退款状态变更对象", description = "意向金退款状态变更对象")
public class FinanceAuditStatusLogVO {

    @ApiModelProperty(value = "财务退款状态变更ID")
    private Long refundStatusId;

    @ApiModelProperty(value = "单据类型(审批、订单历史等)")
    private Integer billType;

    @ApiModelProperty(value = "变更状态")
    private Integer changeStatus;

    @ApiModelProperty(value = "变更人员")
    private String changeBy;

    @ApiModelProperty(value = "变更意见")
    private String changePostil;

    @ApiModelProperty(value = "变更日期")
    private LocalDateTime changeDate;

    @ApiModelProperty(value = "变更时间")
    private LocalDateTime changeTime;

    @ApiModelProperty(value = "附件URL")
    private String fileUrl;

    @ApiModelProperty("审核驳回原因")
    private String returnReason;
}

