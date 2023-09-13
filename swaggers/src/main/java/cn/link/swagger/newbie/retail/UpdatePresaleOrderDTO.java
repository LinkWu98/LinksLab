package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 预售订单完善信息DTO
 *
 * @author link
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "UpdatePresaleOrderDTO", description = "预售订单完善信息DTO")
public class UpdatePresaleOrderDTO {

    @ApiModelProperty(value = "订单id",required = true)
    @NotBlank(message = "订单id不能为空")
    private String soNoId;

    @ApiModelProperty(value = "订单购买类型", required = true)
    @NotNull(message = "购买类型不能为空")
    private Integer purchassCode;

    @ApiModelProperty(value = "付款方式 1426", required = true)
    @NotNull(message = "付款方式不能为空")
    private Integer payMode;

    @ApiModelProperty(value = "开票人类型", name = "drawerCtcode", required = true)
    @NotNull(message = "开票人类型不能为空")
    private Integer drawerCtcode;

    @ApiModelProperty(value = "开票人姓名", name = "drawerName", required = true)
    @NotBlank(message = "开票人不能为空")
    private String drawerName;

    @ApiModelProperty(value = "开票人电话", name = "drawerTel", required = true)
    @NotBlank(message = "开票人电话不能为空")
    private String drawerTel;

    @ApiModelProperty(value = "开票人证件类型", required = true)
    @NotNull(message = "开票人证件类型不能为空")
    private Integer drawerNewCtcode;

    @ApiModelProperty(value = "开票人证件号码", name = "drawerCertificateNo", required = true)
    @NotBlank(message = "开票人证件号码不能为空")
    private String drawerCertificateNo;

    @ApiModelProperty(value = "交车经销商代码", name = "deliveryOwnerCode", required = true)
    @NotBlank(message = "交车经销商代码不能为空")
    private String deliveryOwnerCode;

    @ApiModelProperty(value = "C端权益包集合参数", required = true)
    @NotNull(message = "权益包不能为空")
    private List<EquityPackageDTO> equityPackageAddList;

    @ApiModelProperty(value = "第二级ID（series）", name = "secondId")
    @NotBlank(message = "车型不能为空")
    private String secondId;

    @ApiModelProperty(value = "第三级ID", name = "thirdId")
    @NotBlank(message = "年款不能为空")
    private String thirdId;

    @ApiModelProperty(value = "第四级ID", name = "fourId")
    @NotBlank(message = "配置不能为空")
    private String fourId;

    @ApiModelProperty(value = "轮毂")
    @NotBlank(message = "轮毂不能为空")
    private String remark;

    @ApiModelProperty(value = "精品/包", name = "salesOptionList")
    @NotNull(message = "选装包不能为空")
    private List<SalesOptionDTO> salesOptionList;

    @ApiModelProperty(value = "补贴价")
    private Double subsidyPrice;

    @ApiModelProperty(value = "车厂指导价")
    @NotNull(message = "车厂指导价不能为空")
    private Double vehicleRetailAllAmount;

    @ApiModelProperty(value = "抵扣金额")
    private Double deductibleAmount;
}
