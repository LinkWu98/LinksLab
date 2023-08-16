//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SalesOptionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(
            value = "意向选装id",
            name = "salesOptionId"
    )
    private Long salesOptionId;
    @ApiModelProperty(
            value = "意向选装name",
            name = "salesOptionName"
    )
    private String salesOptionName;
    @ApiModelProperty(
            value = "意向列表ID",
            name = "soVinId"
    )
    private Long clueIntentId;
    @ApiModelProperty(
            value = "选装ID",
            name = "optionId"
    )
    private String optionId;
    @ApiModelProperty(
            value = "选装类型(包括产品选择属性，精品包)",
            name = "optionType"
    )
    private Integer optionType;
    @ApiModelProperty(
            value = "选装价格",
            name = "optionPrice"
    )
    private Double optionPrice;
    @ApiModelProperty(
            value = "选装数量",
            name = "optionQuantity"
    )
    private Double optionQuantity;
    @ApiModelProperty(
            value = "选装报价",
            name = "optionAmount"
    )
    private Double optionAmount;
    @ApiModelProperty(
            value = "父类id(如果是套餐包中的套餐则该字段有值)",
            name = "parentOptionId"
    )
    private Long parentOptionId;
    @ApiModelProperty(
            value = "销售、免费赠送、车价已包含",
            name = "accountMode"
    )
    private Integer accountMode;

    public SalesOptionDTO() {
    }

    public Long getSalesOptionId() {
        return this.salesOptionId;
    }

    public void setSalesOptionId(Long salesOptionId) {
        this.salesOptionId = salesOptionId;
    }

    public Long getClueIntentId() {
        return this.clueIntentId;
    }

    public void setClueIntentId(Long clueIntentId) {
        this.clueIntentId = clueIntentId;
    }

    public String getOptionId() {
        return this.optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public Integer getOptionType() {
        return this.optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public Double getOptionPrice() {
        return this.optionPrice;
    }

    public void setOptionPrice(Double optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Double getOptionQuantity() {
        return this.optionQuantity;
    }

    public void setOptionQuantity(Double optionQuantity) {
        this.optionQuantity = optionQuantity;
    }

    public Double getOptionAmount() {
        return this.optionAmount;
    }

    public void setOptionAmount(Double optionAmount) {
        this.optionAmount = optionAmount;
    }

    public Long getParentOptionId() {
        return this.parentOptionId;
    }

    public void setParentOptionId(Long parentOptionId) {
        this.parentOptionId = parentOptionId;
    }

    public Integer getAccountMode() {
        return this.accountMode;
    }

    public void setAccountMode(Integer accountMode) {
        this.accountMode = accountMode;
    }

    public String getSalesOptionName() {
        return this.salesOptionName;
    }

    public void setSalesOptionName(String salesOptionName) {
        this.salesOptionName = salesOptionName;
    }

    public String toString() {
        return "SalesOptionDTO{salesOptionId=" + this.salesOptionId + ", salesOptionName='" + this.salesOptionName + '\'' + ", clueIntentId=" + this.clueIntentId + ", optionId='" + this.optionId + '\'' + ", optionType=" + this.optionType + ", optionPrice=" + this.optionPrice + ", optionQuantity=" + this.optionQuantity + ", optionAmount=" + this.optionAmount + ", parentOptionId=" + this.parentOptionId + ", accountMode=" + this.accountMode + '}';
    }
}
