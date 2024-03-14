package cn.link.swagger.newbie.retail;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 小订流程启用配置表VO
 */
@ApiModel("小订流程启用配置表VO")
@Data
public class SmallOrderEnableVO {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("订单类型代码")
    private Integer saleType;

    @ApiModelProperty("订单类型名称")
    private String saleTypeName;

    @ApiModelProperty("是否启用")
    private Integer isValid;

    @ApiModelProperty("意向金金额")
    private BigDecimal intentionAmount;

    @ApiModelProperty("小订开始时间")


    private LocalDateTime smallOrderBeginTime;

    @ApiModelProperty("小订结束时间")


    private LocalDateTime smallOrderEndTime;

    @ApiModelProperty("大订开始时间")


    private LocalDateTime bigOrderBeginTime;

    @ApiModelProperty("活动结束时间")


    private LocalDateTime eventEndTime;

    @ApiModelProperty("是否不校验配置外色内饰选装包")
    private Integer paramCheckDisable;

    @ApiModelProperty("包装价格启用开始时间")


    private LocalDateTime wrapPriceStartTime;

    @ApiModelProperty("包装价格启用结束时间")


    private LocalDateTime wrapPriceEndTime;

    @ApiModelProperty("车型ID")
    private Integer modelId;

    @ApiModelProperty(value = "是否小订期间，1004")
    private Integer smallDepositPeriod;

    @ApiModelProperty(value = "是否大定期间，1004")
    private Integer largeDepositPeriod;

    @ApiModelProperty(value = "当前时间是否任意活动的小定期间，1004（与当前车型的预售配置不一定相关，所有查询到的数据中，是否有在小订期间）")
    private Integer currentDuringSmallDepositPeriod;

    @ApiModelProperty(value = "当前时间是否任意活动的小定期间，1004（与当前车型的预售配置不一定相关，所有查询到的数据中，是否有在大定期间）")
    private Integer currentDuringLargeDepositPeriod;

}