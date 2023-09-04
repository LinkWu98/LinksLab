package cn.link.swagger.newbie.retail.slDeposit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("小大定相关dto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SmallLargeDepositDTO {

    @ApiModelProperty(value = "是否小订期间，1004")
    private Integer smallDepositPeriod;

    @ApiModelProperty(value = "是否大定期间，1004")
    private Integer largeDepositPeriod;

}
