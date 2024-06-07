package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分转仓智能补库汇总VO")
public class SmartTransferAggregationVO {

    @ApiModelProperty(value = "车型id", name = "modelId")
    private String modelId;

    @ApiModelProperty(value = "车型名称", name = "modelName")
    private String modelName;

    @ApiModelProperty(value = "智能补库汇总车型详情VO", name = "smartTransferAggregationDetailVO")
    private List<SmartTransferAggregationDetailVO> smartTransferAggregationDetailVO;

}
