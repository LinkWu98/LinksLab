package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 销售模式配置表
 * @author liuyazhou
 * @since 2023-04-04
 */
@Data
@ApiModel(value = "强弱代理配置表")
public class TcStrongWeakAgentVO {

    /**
     * 主键id
     */
    @ApiModelProperty(value = "id",name = "主键id")
    private Long id;

    /**
     * 经销商代码
     */
    @ApiModelProperty(value = "ownerCode",name = "经销商代码")
    private String ownerCode;

    /**
     * 车型
     */
    @ApiModelProperty(value = "modelId",name = "车型")
    private Integer modelId;

    /**
     * 年款
     */
    @ApiModelProperty(value = "modeYear",name = "年款")
    private Integer modeYear;

    /**
     * 配置
     */
    @ApiModelProperty(value = "configId",name = "配置")
    private Integer configId;

    /**
     * 销售模式(87811001:强代理;87811002:弱代理;87811003:批零制)
     */
    @ApiModelProperty(value = "salesMode",name = "销售模式")
    private Integer salesMode;

}
