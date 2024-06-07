package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 可批售车辆资源备注表
 */
@ApiModel("可批售车辆资源备注")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleRemarkVO {

    @ApiModelProperty("车辆vin码")
    private String vin;

    @ApiModelProperty("普通订单号")
    private String generalOrderno;

    @ApiModelProperty("经销商代码")
    private String ownerCode;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("车型ID")
    private Integer modelId;

    @ApiModelProperty("年款")
    private Integer modelYear;

    @ApiModelProperty("配置ID")
    private Integer configId;

    @ApiModelProperty("颜色ID")
    private Integer colorId;

    @ApiModelProperty("内饰ID")
    private Integer trimId;

    @ApiModelProperty("是否有冬季选装包10041001有，10041002无")
    private Integer optionPackageId;

    @ApiModelProperty("备注车型年款配置选装包的中文内容，示例：“需要：车型年款配置颜色内饰；有冬季选装包；备注：备注123”")
    private String remarkDesc;

    @ApiModelProperty("创建sql人")
    private String createSqlby;

    @ApiModelProperty("更新人sql人")
    private String updateSqlby;

}