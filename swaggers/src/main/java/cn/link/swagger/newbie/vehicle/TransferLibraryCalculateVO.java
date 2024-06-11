package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分转仓智能补库明细看板VO")
public class TransferLibraryCalculateVO {

    @ApiModelProperty("车型名称")
    private String modelName;

    @ApiModelProperty("配置名称")
    private String configName;

    @ApiModelProperty("配置id")
    private Long configId;

    @ApiModelProperty("零售支持度深度标准")
    private BigDecimal currentRetailSupport;

    @ApiModelProperty("智能补库明细 - 总部库VO")
    private TransferLibraryHeadStockInfoVO headStockInfoVO;

    @ApiModelProperty("智能补库明细 - 总计VO")
    private TransferLibraryCalculateRegionCommonVO totalVO;

    @ApiModelProperty("智能补库明细 - 各大区计算明细List")
    private List<TransferLibraryCalculateRegionInfoVO> regionalDetailList;


}
