package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author GuoXuanLe
 * @date 2022年03月28日 11:09
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "C端权益包对象", description = "C端权益包对象")
public class EquityPackageDTO {
    @ApiModelProperty(hidden = true)
    private Long soVinId;
    @ApiModelProperty(value = "权益包id", name = "serviceId")
    private String serviceId;
    @ApiModelProperty(value = "权益包代码", name = "serviceCode")
    private String serviceCode;
    @ApiModelProperty(value = "权益包名称", name = "serviceName")
    private String serviceName;
    @ApiModelProperty(value = "权益包费用类型", name = "serviceType")
    private Integer serviceType;
    @ApiModelProperty(value = "权益包价格", name = "servicePrice")
    private Double servicePrice;
    @ApiModelProperty(name = "feeCalcMethod", value = "权益计算方式 按比例:91261001 或 按金额:91261002")
    private Integer feeCalcMethod;
    @ApiModelProperty(name = "equityPackageCategory", value = "权益包类型 增值型:91271001或 折扣型:91271002")
    private Integer equityPackageCategory;
    @ApiModelProperty(name = "costRatio", value = "费用比例%，当费用计算方式为按比例时使用")
    private BigDecimal costRatio;
    @ApiModelProperty(value = "匹配类型(按vin:91281001 按车型:91281002)")
    private Integer matchType;

}
