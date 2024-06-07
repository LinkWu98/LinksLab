package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("车型与总部库位对应关系DTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelStorageMappingVO {

    @ApiModelProperty("车型ID")
    private Integer modelId;

    @ApiModelProperty("车型名称")
    private String modelName;

    @ApiModelProperty("总部库（合作伙伴ID），逗号分隔")
    private String partners;

}
