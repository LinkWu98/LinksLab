package cn.link.swagger.newbie.retail.refund;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 订单选装表
 * </p>
 *
 * @author chenzb
 * @since 2020-03-20
 */
@TableName("tt_sales_option")
public class SalesOptionPO {

    private static final long serialVersionUID = 1L;

    /**
     * 订单选装id
     */
    @TableId(value = "SALES_OPTION_ID")
    @ApiModelProperty("订单选装id")
    private Long salesOptionId;

    /**
     * 订单产品列表ID
     */
    @TableField("SO_VIN_ID")
    @ApiModelProperty("订单产品列表ID")
    private Long soVinId;

    /**
     * 选装ID
     */
    @TableField("OPTION_ID")
    @ApiModelProperty("选装ID")
    private String optionId;

    /**
     * 选装类型(包括产品选择属性，精品包)
     */
    @TableField("OPTION_TYPE")
    @ApiModelProperty("选装类型(包括产品选择属性，精品包)")
    private Integer optionType;

    /**
     * 选装价格
     */
    @TableField("OPTION_PRICE")
    @ApiModelProperty("选装价格")
    private BigDecimal optionPrice;

    /**
     * 选装数量
     */
    @TableField("OPTION_QUANTITY")
    @ApiModelProperty("选装数量")
    private BigDecimal optionQuantity;

    /**
     * 选装报价
     */
    @TableField("OPTION_AMOUNT")
    @ApiModelProperty("选装报价")
    private BigDecimal optionAmount;

    /**
     * 父类id(如果是套餐包中的套餐则该字段有值)
     */
    @TableField("PARENT_OPTION_ID")
    @ApiModelProperty("父类id(如果是套餐包中的套餐则该字段有值)")
    private Long parentOptionId;

    /**
     * 销售、免费赠送、车价已包含
     */
    @TableField("ACCOUNT_MODE")
    @ApiModelProperty("销售、免费赠送、车价已包含")
    private Integer accountMode;


    public SalesOptionPO() {
        super();
    }

    public Long getSalesOptionId() {
        return salesOptionId;
    }

    public void setSalesOptionId(Long salesOptionId) {
        this.salesOptionId = salesOptionId;
    }

    public Long getSoVinId() {
        return soVinId;
    }

    public void setSoVinId(Long soVinId) {
        this.soVinId = soVinId;
    }

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public Integer getOptionType() {
        return optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(BigDecimal optionPrice) {
        this.optionPrice = optionPrice;
    }

    public BigDecimal getOptionQuantity() {
        return optionQuantity;
    }

    public void setOptionQuantity(BigDecimal optionQuantity) {
        this.optionQuantity = optionQuantity;
    }

    public BigDecimal getOptionAmount() {
        return optionAmount;
    }

    public void setOptionAmount(BigDecimal optionAmount) {
        this.optionAmount = optionAmount;
    }

    public Long getParentOptionId() {
        return parentOptionId;
    }

    public void setParentOptionId(Long parentOptionId) {
        this.parentOptionId = parentOptionId;
    }

    public Integer getAccountMode() {
        return accountMode;
    }

    public void setAccountMode(Integer accountMode) {
        this.accountMode = accountMode;
    }

    @Override
    public String toString() {
        return "SalesOptionPO{" +
                "salesOptionId=" + salesOptionId +
                ", soVinId=" + soVinId +
                ", optionId='" + optionId + '\'' +
                ", optionType=" + optionType +
                ", optionPrice=" + optionPrice +
                ", optionQuantity=" + optionQuantity +
                ", optionAmount=" + optionAmount +
                ", parentOptionId=" + parentOptionId +
                ", accountMode=" + accountMode +
                '}';
    }


}
