//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

public class CompetitorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("竞品ID")
    private Long competitorId;
    @ApiModelProperty("商机ID")
    private Long customerBusinessId;
    @ApiModelProperty("战败竞品表ID")
    private String failModelId;
    @ApiModelProperty("竞品分析")
    private String competitorRemark;
    @ApiModelProperty("竞品关注点")
    private String competitorConcerns;
    @ApiModelProperty("String类型的竞品关注点")
    private String competitor;
    @ApiModelProperty("是否有效")
    private String isValid;
    @ApiModelProperty("品牌")
    private String failBrand;
    @ApiModelProperty("车型车系")
    private String failSeries;
    @ApiModelProperty("级别1：品牌，2：车系车型，等等")
    private Integer level;
    @ApiModelProperty("父级id")
    private Long parentId;
    private Boolean isDeleted;
    @ApiModelProperty("竞品关注点LIST")
    private List<PcBasedataDTO> competitorList;

    public CompetitorDTO() {
    }

    public List<PcBasedataDTO> getCompetitorList() {
        return this.competitorList;
    }

    public void setCompetitorList(List<PcBasedataDTO> competitorList) {
        this.competitorList = competitorList;
    }

    public String getCompetitor() {
        return this.competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor;
    }

    public String getIsValid() {
        return this.isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getFailBrand() {
        return this.failBrand;
    }

    public void setFailBrand(String failBrand) {
        this.failBrand = failBrand;
    }

    public String getFailSeries() {
        return this.failSeries;
    }

    public void setFailSeries(String failSeries) {
        this.failSeries = failSeries;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCompetitorConcerns() {
        return this.competitorConcerns;
    }

    public void setCompetitorConcerns(String competitorConcerns) {
        this.competitorConcerns = competitorConcerns;
    }

    public Long getCompetitorId() {
        return this.competitorId;
    }

    public void setCompetitorId(Long competitorId) {
        this.competitorId = competitorId;
    }

    public Long getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getCompetitorRemark() {
        return this.competitorRemark;
    }

    public void setCompetitorRemark(String competitorRemark) {
        this.competitorRemark = competitorRemark;
    }

    public Boolean getDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getFailModelId() {
        return this.failModelId;
    }

    public void setFailModelId(String failModelId) {
        this.failModelId = failModelId;
    }

    public String toString() {
        return "CompetitorDTO{competitorId=" + this.competitorId + ", customerBusinessId=" + this.customerBusinessId + ", failModelId='" + this.failModelId + '\'' + ", competitorRemark='" + this.competitorRemark + '\'' + ", competitorConcerns='" + this.competitorConcerns + '\'' + ", competitor='" + this.competitor + '\'' + ", isValid='" + this.isValid + '\'' + ", failBrand='" + this.failBrand + '\'' + ", failSeries='" + this.failSeries + '\'' + ", level=" + this.level + ", parentId=" + this.parentId + ", isDeleted=" + this.isDeleted + ", competitorList=" + this.competitorList + '}';
    }
}
