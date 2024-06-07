package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 车辆资源备注DTO
 */
@ApiModel("车辆资源备注DTO")
@Data
public class VehicleRemarkDTO {
    /**
     * 普通订单号
     */
    @ApiModelProperty("普通订单号")
    private String generalOrderno;

    /**
     * 经销商代码
     */
    @ApiModelProperty("经销商代码")
    private String ownerCode;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 车型ID
     */
    @ApiModelProperty("车型ID")
    private Integer modelId;

    /**
     * 年款
     */
    @ApiModelProperty("年款")
    private Integer modelYear;

    /**
     * 配置ID
     */
    @ApiModelProperty("配置ID")
    private Integer configId;

    /**
     * 颜色ID
     */
    @ApiModelProperty("颜色ID")
    private Integer colorId;

    /**
     * 内饰ID
     */
    @ApiModelProperty("内饰ID")
    private Integer trimId;

    /**
     * 是否有冬季选装包10041001有，10041002无
     */
    @ApiModelProperty("是否有冬季选装包10041001有，10041002无")
    private Integer optionPackageId;

}