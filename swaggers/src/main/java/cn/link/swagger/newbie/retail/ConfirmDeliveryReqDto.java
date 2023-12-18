package cn.link.swagger.newbie.retail;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@ApiModel(value = "确认提车")
public class ConfirmDeliveryReqDto {

    @ApiModelProperty(value = "销售订单号", name = "soNo")
    private String soNo;

    @ApiModelProperty(value = "车架号", name = "vin")
    private String vin;

    @ApiModelProperty(value = "会员id", name = "memberId")
    private String memberId;

    @ApiModelProperty(value = "会员手机号", name = "memberPhone")
    private String memberPhone;

    @ApiModelProperty(value = "车型名称", name = "modelName")
    private String modelName;

    @ApiModelProperty(value = "提车地址", name = "deliveryAddress")
    private String deliveryAddress;


    @ApiModelProperty(value = "提车日期", name = "deliveryDate")
    private LocalDateTime deliveryDate;

    @ApiModelProperty(value = "是否满油满电状态 10041001:是 10041002:否", name = "isCompleteOil")
    private Integer isCompleteOil;

    @ApiModelProperty(value = "姓名（正楷）", name = "customerName")
    private String customerName;

    @ApiModelProperty(value = "手机", name = "customerPhone")
    private String customerPhone;

    @ApiModelProperty(value = "签字姓名", name = "signName")
    private String signName;


    @ApiModelProperty(value = "提车确认日期(点击提车确认按钮)", name = "deliveryConfirmDate")
    private LocalDateTime deliveryConfirmDate;

    @ApiModelProperty(value = "是否确认提车 10041001:是 10041002:否", name = "isConfirmDelivery")
    private Integer isConfirmDelivery;
}