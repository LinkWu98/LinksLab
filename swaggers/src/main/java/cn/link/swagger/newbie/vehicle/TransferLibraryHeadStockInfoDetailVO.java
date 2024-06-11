package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 智能补库明细 - 总部库 - 外色/内饰分转前后明细
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("智能补库明细 - 总部库 - 外色/内饰分转前后明细")
public class TransferLibraryHeadStockInfoDetailVO {

    @ApiModelProperty(value = "外色ID", name = "colorId")
    private Long colorId;

    @ApiModelProperty(value = "外色名称", name = "colorName")
    private String colorName;

    @ApiModelProperty(value = "内饰ID", name = "trimId")
    private Long trimId;

    @ApiModelProperty(value = "内饰名称", name = "trimName")
    private String trimName;

    @ApiModelProperty(value = "分转前总部库统计", name = "beforeTransferSum")
    private BigDecimal beforeTransferSum;

    @ApiModelProperty(value = "分转后总部库统计", name = "afterTransferSum")
    private BigDecimal afterTransferSum;

    @ApiModelProperty(value = "展示顺序，外色会按此排序", name = "displayRank")
    private Integer displayRank;

}