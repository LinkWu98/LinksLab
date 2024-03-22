package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * MaterialVO
 *
 * @author renwd
 * @since 2020/3/24
 */
@ApiModel(value = "VehicleProductBrandVO", description = "条件查询的品牌数据VO")
public class MaterialVO implements Serializable,Comparable<MaterialVO> {

    @ApiModelProperty(value = "物料id")
    private String materialId;

    @ApiModelProperty(value = "物料级别")
    private Integer materialLevel;

    @ApiModelProperty(value = "物料代码(可能是组合代码)，唯一索引")
    private String materialCode;

    @ApiModelProperty(value = "物料代码")
    private String materialShortCode;

    @ApiModelProperty(value = "物料中文名称")
    private String materialNameZh;

    @ApiModelProperty(value = "物料英文名称")
    private String materialNameEn;

    @ApiModelProperty(value = "物料年款", name = "materialYear")
    private String materialYear;

    @ApiModelProperty(value="基础数据Id")
    private String basedataId;

    @ApiModelProperty(value = "数据来源(1045)")
    private Integer dataSources;

    @ApiModelProperty(value = "是否有效")
    private Integer isValid;

    @ApiModelProperty(value = "是否整车物料")
    private Integer isPreSale;

    @ApiModelProperty(value = "是否售后物料")
    private Integer isAfterSale;

    @ApiModelProperty(value = "燃料类型(4106)")
    private Integer fuelType;

    @ApiModelProperty(value = "车厂零售指导价")
    private Double oemDirectivePrice;

    @ApiModelProperty(value = "含税采购价")
    private Double taxPurchasePrice;

    @ApiModelProperty(value = "采购单价(不含税)")
    private Double purchasePrice;

    @ApiModelProperty(value = "上级ID")
    private String parentMaterialId;

    @ApiModelProperty(value = "车辆来源")
    private Integer vehicleSources;

    @ApiModelProperty(value = "是否二手车", name = "isUsedCar")
    private Integer isUsedCar;

    @ApiModelProperty(value = "是否在售", name = "onSale")
    private Integer onSale;

    @ApiModelProperty(value = "是否直售", name = "isDirectModel")
    private Integer isDirectModel;

    public Integer getIsUsedCar() {
        return isUsedCar;
    }

    public void setIsUsedCar(Integer isUsedCar) {
        this.isUsedCar = isUsedCar;
    }

    public String getBasedataId() {
        return basedataId;
    }

    public void setBasedataId(String basedataId) {
        this.basedataId = basedataId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Integer getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(Integer materialLevel) {
        this.materialLevel = materialLevel;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialShortCode() {
        return materialShortCode;
    }

    public void setMaterialShortCode(String materialShortCode) {
        this.materialShortCode = materialShortCode;
    }

    public String getMaterialNameZh() {
        return materialNameZh;
    }

    public void setMaterialNameZh(String materialNameZh) {
        this.materialNameZh = materialNameZh;
    }

    public String getMaterialNameEn() {
        return materialNameEn;
    }

    public void setMaterialNameEn(String materialNameEn) {
        this.materialNameEn = materialNameEn;
    }

    public Integer getDataSources() {
        return dataSources;
    }

    public void setDataSources(Integer dataSources) {
        this.dataSources = dataSources;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsPreSale() {
        return isPreSale;
    }

    public void setIsPreSale(Integer isPreSale) {
        this.isPreSale = isPreSale;
    }

    public Integer getIsAfterSale() {
        return isAfterSale;
    }

    public void setIsAfterSale(Integer isAfterSale) {
        this.isAfterSale = isAfterSale;
    }

    public Integer getFuelType() {
        return fuelType;
    }

    public void setFuelType(Integer fuelType) {
        this.fuelType = fuelType;
    }

    public Double getOemDirectivePrice() {
        return oemDirectivePrice;
    }

    public void setOemDirectivePrice(Double oemDirectivePrice) {
        this.oemDirectivePrice = oemDirectivePrice;
    }

    public Double getTaxPurchasePrice() {
        return taxPurchasePrice;
    }

    public void setTaxPurchasePrice(Double taxPurchasePrice) {
        this.taxPurchasePrice = taxPurchasePrice;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getParentMaterialId() {
        return parentMaterialId;
    }

    public void setParentMaterialId(String parentMaterialId) {
        this.parentMaterialId = parentMaterialId;
    }

    public Integer getVehicleSources() {
        return vehicleSources;
    }

    public void setVehicleSources(Integer vehicleSources) {
        this.vehicleSources = vehicleSources;
    }

    public Integer getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

    public String getMaterialYear() {
        return materialYear;
    }

    public void setMaterialYear(String materialYear) {
        this.materialYear = materialYear;
    }

    public Integer getIsDirectModel() {
        return isDirectModel;
    }

    public void setIsDirectModel(Integer isDirectModel) {
        this.isDirectModel = isDirectModel;
    }


    @Override
    public int compareTo(MaterialVO o) {
        return this.materialNameZh.compareTo(o.materialNameZh);
    }

    @Override
    public String toString() {
        return "MaterialVO{" +
                "materialId='" + materialId + '\'' +
                ", materialLevel=" + materialLevel +
                ", materialCode='" + materialCode + '\'' +
                ", materialShortCode='" + materialShortCode + '\'' +
                ", materialNameZh='" + materialNameZh + '\'' +
                ", materialNameEn='" + materialNameEn + '\'' +
                ", materialYear='" + materialYear + '\'' +
                ", basedataId='" + basedataId + '\'' +
                ", dataSources=" + dataSources +
                ", isValid=" + isValid +
                ", isPreSale=" + isPreSale +
                ", isAfterSale=" + isAfterSale +
                ", fuelType=" + fuelType +
                ", oemDirectivePrice=" + oemDirectivePrice +
                ", taxPurchasePrice=" + taxPurchasePrice +
                ", purchasePrice=" + purchasePrice +
                ", parentMaterialId='" + parentMaterialId + '\'' +
                ", vehicleSources=" + vehicleSources +
                ", isUsedCar=" + isUsedCar +
                ", onSale=" + onSale +
                ", isDirectModel=" + isDirectModel +
                '}';
    }
}
