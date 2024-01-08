package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 厂端代创客户订单DTO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "OemRetailOrderCreateDTO", description = "厂端代创客户订单DTO")
public class OemRetailOrderCreateDTO {

    @ApiModelProperty(value = "销售模式")
    private Integer strongWeakAgent;

    @ApiModelProperty(value = "订车门店")
    private String deliveryOwnerCode;

    @ApiModelProperty(value = "配置")
    private String fourName;

    @ApiModelProperty(value = "年款")
    private String thirdName;

    @ApiModelProperty(value = "车型")
    private String secondName;

    @ApiModelProperty(value = "客户ID")
    private String customerId;

    @ApiModelProperty(value = "客户编号")
    private String customerNo;

    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @ApiModelProperty(value = "联系人电话")
    private String contactPhone;

    @ApiModelProperty(value = "证件类型")
    private Integer customerCtCode;

    @ApiModelProperty(value = "证件号码")
    private String customerCertificateNo;

    @ApiModelProperty(value = "联系地址")
    private String customerAddress;

    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    @ApiModelProperty("商机id")
    private String customerBusinessId;

    @ApiModelProperty(value = "订单创建-市场活动")
    private String activityId;

    @ApiModelProperty(value = "订单创建-市场活动(集客)")
    private String customerActivityId;

}
