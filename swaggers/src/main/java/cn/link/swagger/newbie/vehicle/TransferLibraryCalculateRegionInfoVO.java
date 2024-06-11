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
@ApiModel("分转仓智能补库大区明细VO")
public class TransferLibraryCalculateRegionInfoVO {

    @ApiModelProperty("销售大区codeId")
    private String regionalCodeId;

    @ApiModelProperty("销售大区名称")
    private String regionalName;

    @ApiModelProperty(value = "智能补库明细 - 当前大区总计VO", name = "regionTotalInfoVO")
    private TransferLibraryCalculateRegionCommonVO regionalTotalVO;

    /**
     * 一个外色单选或全选内饰，只会有一条外色数据，内饰名称不展示，其余会一条条排列
     */
    @ApiModelProperty("分转仓智能补库当前大区计算详情VO")
    private List<TransferLibraryCalculateRegionColorDetailVO> regionalColorDetailList;

}
