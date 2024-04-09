package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author: zsw
 * @date: 2023-09-11
 * @description: 开票申请查询DTO
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "InvoiceApplyQueryDTO", description = "开票申请查询DTO")
public class InvoiceApplyQueryDTO implements Serializable {

    @ApiModelProperty(value = "查询标记：1->经销商端列表查询 2->经销商端增票申请查询 3->VVD端列表查询 4->VVD端特殊申请列表查询")
    private String queryTag;

    @ApiModelProperty(value = "购买人（购买人名称/电话/身份证号码）")
    private String buyerInfo;

    @ApiModelProperty(value = "销售顾问id")
    private String consultantId;

    @ApiModelProperty(value = "vin集合")
    private List<String> vinList;

    @ApiModelProperty(value = "订单编号集合")
    private List<String> soNoList;

    @ApiModelProperty(value = "vin")
    private String vin;

    @ApiModelProperty(value = "订单编号")
    private String soNo;

    @ApiModelProperty(value = "开票状态")
    private List<Integer> invoiceStatusList;

    @ApiModelProperty(value = "申请类型")
    private Integer applyType;

    @ApiModelProperty(value = "开票类型")
    private Integer invoiceType;

    @ApiModelProperty(value = "车型id")
    private Integer modelId;

    @ApiModelProperty(value = "年款")
    private String modelYear;

    @ApiModelProperty(value = "配置id")
    private String configId;

    @ApiModelProperty(value = "提交时间-开始")
    private String submitTimeBegin;

    @ApiModelProperty(value = "提交时间-结束")
    private String submitTimeEnd;

    @ApiModelProperty(value = "审批通过时间-开始")
    private String approvalTimeBegin;

    @ApiModelProperty(value = "审批通过时间-结束")
    private String approvalTimeEnd;

    @ApiModelProperty(value = "订车门店经销代码集合")
    private List<String> deliveryOwnerCodeList;

    @ApiModelProperty(value = "交车经销代码集合")
    private List<String> orderDealerCodeList;

    @ApiModelProperty(value = "开票日期-开始")
    private String invoiceTimeBegin;

    @ApiModelProperty(value = "开票日期-结束")
    private String invoiceTimeEnd;

    @ApiModelProperty(value = "销售模式")
    private List<Integer> strongWeakAgentList;

    @ApiModelProperty(value = "PDS是否检测通过")
    private Integer pdsStatus;

    @ApiModelProperty(value = "订单经销商代码")
    private String soOwnerCode = "VVD";

    @ApiModelProperty(value = "菜单id")
    private Integer menuId;

    @ApiModelProperty(value = "菜单类型")
    private String menuType;

    @ApiModelProperty(value = "分页页数")
    private Integer pageNum;

    @ApiModelProperty(value = "分页数量")
    private Integer pageSize;


}
