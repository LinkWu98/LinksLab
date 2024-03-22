package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * MaterialDTO 物料DTO
 */
@ApiModel(value = "MaterialDTO", description = "物料DTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialDTO {

    @ApiModelProperty(value = "物料id", name = "materialId")
    private String materialId;

    @ApiModelProperty(value = "物料级别", name = "materialLevel")
    private Integer materialLevel;

    @ApiModelProperty(value = "查询范围：0：售前有效+售后所有 1：售后有效 2：售前所有 3：售前有效", name = "queryScope")
    private Integer queryScope;

    @ApiModelProperty(value = "父类id", name = "parentMaterialId")
    private Long parentMaterialId;

    @ApiModelProperty(value = "售前", name = "isPreSale")
    private Integer isPreSale;

    @ApiModelProperty(value = "是否有效", name = "isValid")
    private Integer isValid;

    @ApiModelProperty(value = "数据来源", name = "dataSources")
    private Integer dataSources;

    @ApiModelProperty(value = "物料代码", name = "materialCode")
    private String materialCode;

    @ApiModelProperty(value = "物料名称", name = "materialNameZh")
    private String materialNameZh;

    @ApiModelProperty(value = "查询方式：1为精确,2为模糊", name = "queryMode")
    private Integer queryMode;

    @ApiModelProperty(hidden = true)
    private String ownerCode;

    @ApiModelProperty(hidden = true)
    private String groupCode;

    @ApiModelProperty(value = "是否二手车", name = "isUsedCar")
    private Integer isUsedCar;

    @ApiModelProperty(value="父类的父类id",name="grandParentMaterialId")
    private Long grandParentMaterialId;

    @ApiModelProperty(value="是否在售",name="onSale")
    private Integer onSale;

    @ApiModelProperty(value = "是否直售", name = "isDirectModel")
    private Integer isDirectModel;

    @ApiModelProperty(value = "1：直售客户订单查询；2：客户订单查询", name = "directRetailFlag")
    private Integer directRetailFlag;

    @ApiModelProperty(value = "订单id", name = "soNoId")
    private Long soNoId;

    @ApiModelProperty(value = "销售类型", name = "saleType")
    private Integer saleType;
}
