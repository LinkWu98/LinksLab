package cn.link.swagger.newbie.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 调配申请单表
 */
@ApiModel("调配申请单表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleTransferApplyInfoDTO {

    /**
     * 申请单id
     */
    @ApiModelProperty("申请单id")
    private Long id;

    /**
     * 申请单号
     */
    @ApiModelProperty("申请单号")
    private String applyNo;

    /**
     * 申请单状态，96001001待确认，96001002审核中，96001003已通过，96001004已完成(已反馈VISTA处理结果),96001005已驳回：确认驳回/审核驳回,96001006已取消：撤回/自动取消
     */
    @ApiModelProperty("申请单状态，96001001待确认，96001002审核中，96001003已通过，96001004已完成(已反馈VISTA处理结果),96001005已驳回：确认驳回/审核驳回,96001006已取消：撤回/自动取消")
    private Integer applyStatus;

    /**
     * vista处理状态，10041001成功，10041002失败
     */
    @ApiModelProperty("vista处理状态，10041001成功，10041002失败")
    private Integer vistaStatus;

    /**
     * vista处理反馈
     */
    @ApiModelProperty("vista处理反馈")
    private String vistaMessage;

    /**
     * 申请方经销商代码
     */
    @ApiModelProperty("申请方经销商代码")
    private String applyOwnerCode;

    /**
     * 申请方车辆vin码
     */
    @ApiModelProperty("申请方车辆vin码")
    private String applyVin;

    /**
     * 申请方普通订单号
     */
    @ApiModelProperty("申请方普通订单号")
    private String applyGeneralOrderno;

    /**
     * 申请方车型ID
     */
    @ApiModelProperty("申请方车型ID")
    private Integer applyModelId;

    /**
     * 申请方年款
     */
    @ApiModelProperty("申请方年款")
    private Integer applyModelYear;

    /**
     * 申请方配置ID
     */
    @ApiModelProperty("申请方配置ID")
    private Integer applyConfigId;

    /**
     * 申请方颜色ID
     */
    @ApiModelProperty("申请方颜色ID")
    private Integer applyColorId;

    /**
     * 申请方内饰ID
     */
    @ApiModelProperty("申请方内饰ID")
    private Integer applyTrimId;

    /**
     * 申请方选装包id，逗号分隔
     */
    @ApiModelProperty("申请方选装包id，逗号分隔")
    private String applyOptionPackageIds;

    /**
     * 申请方选装包中文
     */
    @ApiModelProperty("申请方选装包中文")
    private String applyOptionPackageNames;

    /**
     * 确认方经销商代码
     */
    @ApiModelProperty("确认方经销商代码")
    private String confirmOwnerCode;

    /**
     * 确认方车辆vin码
     */
    @ApiModelProperty("确认方车辆vin码")
    private String confirmVin;

    /**
     * 确认方普通订单号
     */
    @ApiModelProperty("确认方普通订单号")
    private String confirmGeneralOrderno;

    /**
     * 确认方车型ID
     */
    @ApiModelProperty("确认方车型ID")
    private Integer confirmModelId;

    /**
     * 确认方年款
     */
    @ApiModelProperty("确认方年款")
    private Integer confirmModelYear;

    /**
     * 确认方配置ID
     */
    @ApiModelProperty("确认方配置ID")
    private Integer confirmConfigId;

    /**
     * 确认方颜色ID
     */
    @ApiModelProperty("确认方颜色ID")
    private Integer confirmColorId;

    /**
     * 确认方内饰ID
     */
    @ApiModelProperty("确认方内饰ID")
    private Integer confirmTrimId;

    /**
     * 确认方选装包id，逗号分隔
     */
    @ApiModelProperty("确认方选装包id，逗号分隔")
    private String confirmOptionPackageIds;

    /**
     * 确认方选装包中文
     */
    @ApiModelProperty("确认方选装包中文")
    private String confirmOptionPackageNames;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 申请完成时间
     */
    @ApiModelProperty("申请完成时间")
    private LocalDateTime applyCompleteAt;

    /**
     * 申请取消时间
     */
    @ApiModelProperty("申请取消时间")
    private LocalDateTime applyCancelAt;

    /**
     * 是否跨区，10041001是，10041002否
     */
    @ApiModelProperty("是否跨区，10041001是，10041002否")
    private Integer crossRegionint;

    /**
     * 申请方pod是否审批确认
     */
    @ApiModelProperty("申请方pod是否审批确认")
    private String applyPodApproval;

    /**
     * 确认方pod是否审批确认
     */
    @ApiModelProperty("确认方pod是否审批确认")
    private String confirmPodApproval;

}