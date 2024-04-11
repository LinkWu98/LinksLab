package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 订单取消原因参数DTO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("订单取消原因参数DTO")
public class OrderCancelReasonsParamDTO {

    @NotNull(message = "订单id不能为空")
    @ApiModelProperty("订单主键")
    private Long soNoId;

    @NotBlank(message = "取消原因不能为空")
    @ApiModelProperty("取消原因CODE，多个取消原因使用英文“,”分割，例如：10011001,10021001,10031001")
    private String cancelCodes;

    @ApiModelProperty("取消原因备注（客户或销售顾问填写的取消原因备注）")
    private String cancelReasonsRemark;

    @NotNull(message = "来源不能为空")
    @ApiModelProperty("来源:B端 - 95231001，C端95231002")
    private Integer cancelSource;

    @NotNull(message = "是否属于申请取消流程不能为空")
    @ApiModelProperty("是否属于申请取消流程（包括申请退款），10041001 - 是，10041002 - 否")
    private Integer isApplyCancel;

}
