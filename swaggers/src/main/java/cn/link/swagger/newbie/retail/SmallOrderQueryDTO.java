package cn.link.swagger.newbie.retail;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("车型ID查询销售类型对应配置的DTO")
public class SmallOrderQueryDTO {

    @ApiParam("车型idList")
    private List<Integer> modelIdList;

    @ApiModelProperty(value = "下单人手机号")
    private String purchasePhone;

    @ApiModelProperty("经销商代码")
    private String ownerCode;

    @ApiModelProperty("订单销售类型")
    private Integer saleType;

}
