package cn.link.swagger.newbie.retail;

import cn.link.swagger.newbie.retail.importClazz.DataImportDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 厂端导入客户订单 excel
 */
@Data
@ToString
public class OemImportSalesOrderExcelVO extends DataImportDto implements Serializable {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 销售模式
     */
    @ApiModelProperty("销售模式")
    private String strongWeakAgent;

    /**
     * 订车门店代码
     */
    @ApiModelProperty("订车门店代码")
    private String deliveryOwnerCode;

    /**
     * 车型
     */
    @ApiModelProperty("车型")
    private String modelName;

    /**
     * 年款
     */
    @ApiModelProperty("年款")
    private String modelYear;

    /**
     * 配置
     */
    @ApiModelProperty("配置")
    private String configName;

    /**
     * 业务配置代码
     */
    @ApiModelProperty("业务配置代码")
    private String configCode;

    /**
     * 客户编号
     */
    @ApiModelProperty("客户编号")
    private String customerNo;

}
