package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分转仓智能补库明细通用VO")
public class TransferLibraryCalculateRegionCommonVO {

    @ApiModelProperty("当前库存情况-分转库")
    private BigDecimal transferSum;

    @ApiModelProperty("当前库存情况-经销商库存")
    private BigDecimal dealerSum;

    @ApiModelProperty("当前库存情况-总库存")
    private BigDecimal inventorySum;

    @ApiModelProperty("实销-月均实销")
    private BigDecimal averageMonthlySales;

    @ApiModelProperty("实销-销量占比")
    private BigDecimal salesProportion;

    @ApiModelProperty("分转前库存满足度-总库存")
    private BigDecimal beforeInventorySum;

    @ApiModelProperty("分转前库存满足度-分转库")
    private BigDecimal beforeTransferSum;

    @ApiModelProperty("零售支持度-库存测算总库存")
    private BigDecimal inventoryCalculationSum;

    @ApiModelProperty("零售支持度-待转运")
    private BigDecimal awaitingTransshipment;

    @ApiModelProperty("零售支持度-零售支持度深度标准")
    private BigDecimal currentRetailSupport;

    @ApiModelProperty("零售支持度-手工调整")
    private BigDecimal manualAdjustment;

    @ApiModelProperty("零售支持度-转运量")
    private BigDecimal transshipmentVolume;

    @ApiModelProperty("分转后库存-分转库库存")
    private BigDecimal afterTransferSum;

    @ApiModelProperty("分转后库存-总库存")
    private BigDecimal afterInventorySum;

    @ApiModelProperty("分转后零售支持度-手工调整前总库存")
    private BigDecimal afterAdjustmentSum;

    @ApiModelProperty("分转后零售支持度-手工调整前分转库")
    private BigDecimal afterAdjustmentTransferSum;

    @ApiModelProperty("分转后零售支持度-总库存零售支持度")
    private BigDecimal afterSaleSum;

    @ApiModelProperty("分转后零售支持度-分转库零售支持度")
    private BigDecimal afterSaleTransferSum;

}
