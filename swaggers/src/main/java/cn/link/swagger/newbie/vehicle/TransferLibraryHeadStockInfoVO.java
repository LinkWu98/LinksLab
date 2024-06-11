package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 智能补库明细 - 总部库
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("智能补库明细 - 总部库")
public class TransferLibraryHeadStockInfoVO {

    @ApiModelProperty("总计 - 分转前总部库统计")
    private BigDecimal beforeTransferSum;

    @ApiModelProperty("总计 - 分转后总部库统计")
    private BigDecimal afterTransferSum;

    @ApiModelProperty("外色/内饰分转前后明细")
    private List<TransferLibraryHeadStockInfoDetailVO> detailList;

}