//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PcBasedataDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("基础数据ID")
    private Long basedataId;
    @ApiModelProperty("经销商代码")
    private String dealerCode;
    @ApiModelProperty("基础数据代码")
    private String basedataCode;
    @ApiModelProperty("基础数据名称")
    private String basedataName;
    @ApiModelProperty("基础数据关联ID")
    private Long basedataRelateId;
    @ApiModelProperty("数据来源")
    private Long dataSources;
    @ApiModelProperty("是否有效")
    private Integer isValid;
    @ApiModelProperty("基础数据描述")
    private String basedataDescribe;
    @ApiModelProperty("基础数据类型 1234 购车因素  1608 了解途径")
    private Integer basedataType;
    @ApiModelProperty("是否删除")
    private Boolean isDeleted;

    public PcBasedataDTO() {
    }

    public Long getBasedataId() {
        return this.basedataId;
    }

    public void setBasedataId(Long basedataId) {
        this.basedataId = basedataId;
    }

    public String getDealerCode() {
        return this.dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getBasedataCode() {
        return this.basedataCode;
    }

    public void setBasedataCode(String basedataCode) {
        this.basedataCode = basedataCode;
    }

    public String getBasedataName() {
        return this.basedataName;
    }

    public void setBasedataName(String basedataName) {
        this.basedataName = basedataName;
    }

    public Long getBasedataRelateId() {
        return this.basedataRelateId;
    }

    public void setBasedataRelateId(Long basedataRelateId) {
        this.basedataRelateId = basedataRelateId;
    }

    public Long getDataSources() {
        return this.dataSources;
    }

    public void setDataSources(Long dataSources) {
        this.dataSources = dataSources;
    }

    public Integer getIsValid() {
        return this.isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getBasedataDescribe() {
        return this.basedataDescribe;
    }

    public void setBasedataDescribe(String basedataDescribe) {
        this.basedataDescribe = basedataDescribe;
    }

    public Integer getBasedataType() {
        return this.basedataType;
    }

    public void setBasedataType(Integer basedataType) {
        this.basedataType = basedataType;
    }

    public Boolean getDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String toString() {
        return "PcBasedataDTO{basedataId=" + this.basedataId + ", dealerCode=" + this.dealerCode + ", basedataCode=" + this.basedataCode + ", basedataName=" + this.basedataName + ", basedataRelateId=" + this.basedataRelateId + ", dataSources=" + this.dataSources + ", isValid=" + this.isValid + ", basedataDescribe=" + this.basedataDescribe + ", basedataType=" + this.basedataType + ", isDeleted=" + this.isDeleted + "}";
    }
}
