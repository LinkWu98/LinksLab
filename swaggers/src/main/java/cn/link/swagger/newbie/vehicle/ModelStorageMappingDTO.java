package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ApiModel("车型与总部库位对应关系DTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModelStorageMappingDTO {

    @NotNull(message = "车型不能为空")
    @ApiModelProperty("车型ID")
    private Integer modelId;

    @NotBlank(message = "总部库不能为空")
    @ApiModelProperty("总部库（合作伙伴ID），逗号分隔")
    private String partners;

    @ApiModelProperty("车型id，逗号分隔")
    private String modelIds;

    @ApiModelProperty(value = "每页数量", name = "size")
    private Long size;

    @ApiModelProperty(value = "当前页", name = "current")
    private Long current;

}
