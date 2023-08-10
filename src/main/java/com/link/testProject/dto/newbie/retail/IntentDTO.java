package com.link.testProject.dto.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

public class IntentDTO implements Serializable {
    @ApiModelProperty("商机id")
    private Long customerBusinessId;
    @ApiModelProperty("意向车型 id")
    private Long clueIntentId;
    @ApiModelProperty("第一级id:意向品牌")
    private String firstId;
    @ApiModelProperty("意向品牌名称")
    private String firstNameZh;
    @ApiModelProperty("第二级id:意向车系")
    private String secondId;
    @ApiModelProperty("意向车系名称")
    private String secondNameZh;
    @ApiModelProperty("第三级id:意向车型")
    private String thirdId;
    @ApiModelProperty("意向车型名称")
    private String thirdNameZh;
    @ApiModelProperty("第四级id:意向配置")
    private String fourthId;
    @ApiModelProperty("意向配置名称")
    private String fourthNameZh;
    @ApiModelProperty("第五级id:意向配置")
    private String fiveId;
    @ApiModelProperty("第五级名称")
    private String fiveNameZh;
    @ApiModelProperty("物料级别")
    private Integer level;
    @ApiModelProperty("物料id")
    private String materialId;
    @ApiModelProperty("物料名称")
    private String materialNameZh;
    @ApiModelProperty("是否主意向：1004")
    private Integer isMainIntent;
    @ApiModelProperty("拼接的车系名称")
    private String fullName;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("外色")
    private String colorId;
    @ApiModelProperty("外色名称")
    private String colorNameZh;
    @ApiModelProperty("外色名称")
    private String colorName;
    @ApiModelProperty("内饰")
    private String trimId;
    @ApiModelProperty("内饰名称")
    private String trimNameZh;
    @ApiModelProperty("内饰名称")
    private String trimName;
    @ApiModelProperty("选装包")
    private List<String> optionId;
    @ApiModelProperty("选装包名称拼接")
    private String optionNameZh;
    @ApiModelProperty("选装包名称拼接")
    private String optionName;
    @ApiModelProperty("意向选装")
    private List<SalesOptionDTO> salesOptionDTOS;
    @ApiModelProperty("所有者代码")
    private String ownerCode;
    @ApiModelProperty("是否删除")
    private Integer isDeleted;

    public IntentDTO(final Long customerBusinessId, final Long clueIntentId, final String firstId, final String firstNameZh, final String secondId, final String secondNameZh, final String thirdId, final String thirdNameZh, final String fourthId, final String fourthNameZh, final String fiveId, final String fiveNameZh, final Integer level, final String materialId, final String materialNameZh, final Integer isMainIntent, final String fullName, final String remark, final String colorId, final String colorNameZh, final String colorName, final String trimId, final String trimNameZh, final String trimName, final List<String> optionId, final String optionNameZh, final String optionName, final List<SalesOptionDTO> salesOptionDTOS, final String ownerCode, final Integer isDeleted) {
        this.customerBusinessId = customerBusinessId;
        this.clueIntentId = clueIntentId;
        this.firstId = firstId;
        this.firstNameZh = firstNameZh;
        this.secondId = secondId;
        this.secondNameZh = secondNameZh;
        this.thirdId = thirdId;
        this.thirdNameZh = thirdNameZh;
        this.fourthId = fourthId;
        this.fourthNameZh = fourthNameZh;
        this.fiveId = fiveId;
        this.fiveNameZh = fiveNameZh;
        this.level = level;
        this.materialId = materialId;
        this.materialNameZh = materialNameZh;
        this.isMainIntent = isMainIntent;
        this.fullName = fullName;
        this.remark = remark;
        this.colorId = colorId;
        this.colorNameZh = colorNameZh;
        this.colorName = colorName;
        this.trimId = trimId;
        this.trimNameZh = trimNameZh;
        this.trimName = trimName;
        this.optionId = optionId;
        this.optionNameZh = optionNameZh;
        this.optionName = optionName;
        this.salesOptionDTOS = salesOptionDTOS;
        this.ownerCode = ownerCode;
        this.isDeleted = isDeleted;
    }

    public IntentDTO() {
    }

    public Long getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(final Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public Long getClueIntentId() {
        return this.clueIntentId;
    }

    public void setClueIntentId(final Long clueIntentId) {
        this.clueIntentId = clueIntentId;
    }

    public String getFirstId() {
        return this.firstId;
    }

    public void setFirstId(final String firstId) {
        this.firstId = firstId;
    }

    public String getFirstNameZh() {
        return this.firstNameZh;
    }

    public void setFirstNameZh(final String firstNameZh) {
        this.firstNameZh = firstNameZh;
    }

    public String getSecondId() {
        return this.secondId;
    }

    public void setSecondId(final String secondId) {
        this.secondId = secondId;
    }

    public String getSecondNameZh() {
        return this.secondNameZh;
    }

    public void setSecondNameZh(final String secondNameZh) {
        this.secondNameZh = secondNameZh;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public void setThirdId(final String thirdId) {
        this.thirdId = thirdId;
    }

    public String getThirdNameZh() {
        return this.thirdNameZh;
    }

    public void setThirdNameZh(final String thirdNameZh) {
        this.thirdNameZh = thirdNameZh;
    }

    public String getFourthId() {
        return this.fourthId;
    }

    public void setFourthId(final String fourthId) {
        this.fourthId = fourthId;
    }

    public String getFourthNameZh() {
        return this.fourthNameZh;
    }

    public void setFourthNameZh(final String fourthNameZh) {
        this.fourthNameZh = fourthNameZh;
    }

    public String getFiveId() {
        return this.fiveId;
    }

    public void setFiveId(final String fiveId) {
        this.fiveId = fiveId;
    }

    public String getFiveNameZh() {
        return this.fiveNameZh;
    }

    public void setFiveNameZh(final String fiveNameZh) {
        this.fiveNameZh = fiveNameZh;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(final Integer level) {
        this.level = level;
    }

    public String getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(final String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialNameZh() {
        return this.materialNameZh;
    }

    public void setMaterialNameZh(final String materialNameZh) {
        this.materialNameZh = materialNameZh;
    }

    public Integer getIsMainIntent() {
        return this.isMainIntent;
    }

    public void setIsMainIntent(final Integer isMainIntent) {
        this.isMainIntent = isMainIntent;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(final String remark) {
        this.remark = remark;
    }

    public String getColorId() {
        return this.colorId;
    }

    public void setColorId(final String colorId) {
        this.colorId = colorId;
    }

    public String getColorNameZh() {
        return this.colorNameZh;
    }

    public void setColorNameZh(final String colorNameZh) {
        this.colorNameZh = colorNameZh;
    }

    public String getColorName() {
        return this.colorName;
    }

    public void setColorName(final String colorName) {
        this.colorName = colorName;
    }

    public String getTrimId() {
        return this.trimId;
    }

    public void setTrimId(final String trimId) {
        this.trimId = trimId;
    }

    public String getTrimNameZh() {
        return this.trimNameZh;
    }

    public void setTrimNameZh(final String trimNameZh) {
        this.trimNameZh = trimNameZh;
    }

    public String getTrimName() {
        return this.trimName;
    }

    public void setTrimName(final String trimName) {
        this.trimName = trimName;
    }

    public List<String> getOptionId() {
        return this.optionId;
    }

    public void setOptionId(final List<String> optionId) {
        this.optionId = optionId;
    }

    public String getOptionNameZh() {
        return this.optionNameZh;
    }

    public void setOptionNameZh(final String optionNameZh) {
        this.optionNameZh = optionNameZh;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(final String optionName) {
        this.optionName = optionName;
    }

    public List<SalesOptionDTO> getSalesOptionDTOS() {
        return this.salesOptionDTOS;
    }

    public void setSalesOptionDTOS(final List<SalesOptionDTO> salesOptionDTOS) {
        this.salesOptionDTOS = salesOptionDTOS;
    }

    public String getOwnerCode() {
        return this.ownerCode;
    }

    public void setOwnerCode(final String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(final Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof IntentDTO)) {
            return false;
        } else {
            IntentDTO other = (IntentDTO) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$customerBusinessId = this.getCustomerBusinessId();
                Object other$customerBusinessId = other.getCustomerBusinessId();
                if (this$customerBusinessId == null) {
                    if (other$customerBusinessId != null) {
                        return false;
                    }
                } else if (!this$customerBusinessId.equals(other$customerBusinessId)) {
                    return false;
                }

                Object this$clueIntentId = this.getClueIntentId();
                Object other$clueIntentId = other.getClueIntentId();
                if (this$clueIntentId == null) {
                    if (other$clueIntentId != null) {
                        return false;
                    }
                } else if (!this$clueIntentId.equals(other$clueIntentId)) {
                    return false;
                }

                Object this$firstId = this.getFirstId();
                Object other$firstId = other.getFirstId();
                if (this$firstId == null) {
                    if (other$firstId != null) {
                        return false;
                    }
                } else if (!this$firstId.equals(other$firstId)) {
                    return false;
                }

                label350:
                {
                    Object this$firstNameZh = this.getFirstNameZh();
                    Object other$firstNameZh = other.getFirstNameZh();
                    if (this$firstNameZh == null) {
                        if (other$firstNameZh == null) {
                            break label350;
                        }
                    } else if (this$firstNameZh.equals(other$firstNameZh)) {
                        break label350;
                    }

                    return false;
                }

                label343:
                {
                    Object this$secondId = this.getSecondId();
                    Object other$secondId = other.getSecondId();
                    if (this$secondId == null) {
                        if (other$secondId == null) {
                            break label343;
                        }
                    } else if (this$secondId.equals(other$secondId)) {
                        break label343;
                    }

                    return false;
                }

                Object this$secondNameZh = this.getSecondNameZh();
                Object other$secondNameZh = other.getSecondNameZh();
                if (this$secondNameZh == null) {
                    if (other$secondNameZh != null) {
                        return false;
                    }
                } else if (!this$secondNameZh.equals(other$secondNameZh)) {
                    return false;
                }

                label329:
                {
                    Object this$thirdId = this.getThirdId();
                    Object other$thirdId = other.getThirdId();
                    if (this$thirdId == null) {
                        if (other$thirdId == null) {
                            break label329;
                        }
                    } else if (this$thirdId.equals(other$thirdId)) {
                        break label329;
                    }

                    return false;
                }

                label322:
                {
                    Object this$thirdNameZh = this.getThirdNameZh();
                    Object other$thirdNameZh = other.getThirdNameZh();
                    if (this$thirdNameZh == null) {
                        if (other$thirdNameZh == null) {
                            break label322;
                        }
                    } else if (this$thirdNameZh.equals(other$thirdNameZh)) {
                        break label322;
                    }

                    return false;
                }

                Object this$fourthId = this.getFourthId();
                Object other$fourthId = other.getFourthId();
                if (this$fourthId == null) {
                    if (other$fourthId != null) {
                        return false;
                    }
                } else if (!this$fourthId.equals(other$fourthId)) {
                    return false;
                }

                Object this$fourthNameZh = this.getFourthNameZh();
                Object other$fourthNameZh = other.getFourthNameZh();
                if (this$fourthNameZh == null) {
                    if (other$fourthNameZh != null) {
                        return false;
                    }
                } else if (!this$fourthNameZh.equals(other$fourthNameZh)) {
                    return false;
                }

                label301:
                {
                    Object this$fiveId = this.getFiveId();
                    Object other$fiveId = other.getFiveId();
                    if (this$fiveId == null) {
                        if (other$fiveId == null) {
                            break label301;
                        }
                    } else if (this$fiveId.equals(other$fiveId)) {
                        break label301;
                    }

                    return false;
                }

                label294:
                {
                    Object this$fiveNameZh = this.getFiveNameZh();
                    Object other$fiveNameZh = other.getFiveNameZh();
                    if (this$fiveNameZh == null) {
                        if (other$fiveNameZh == null) {
                            break label294;
                        }
                    } else if (this$fiveNameZh.equals(other$fiveNameZh)) {
                        break label294;
                    }

                    return false;
                }

                Object this$level = this.getLevel();
                Object other$level = other.getLevel();
                if (this$level == null) {
                    if (other$level != null) {
                        return false;
                    }
                } else if (!this$level.equals(other$level)) {
                    return false;
                }

                label280:
                {
                    Object this$materialId = this.getMaterialId();
                    Object other$materialId = other.getMaterialId();
                    if (this$materialId == null) {
                        if (other$materialId == null) {
                            break label280;
                        }
                    } else if (this$materialId.equals(other$materialId)) {
                        break label280;
                    }

                    return false;
                }

                Object this$materialNameZh = this.getMaterialNameZh();
                Object other$materialNameZh = other.getMaterialNameZh();
                if (this$materialNameZh == null) {
                    if (other$materialNameZh != null) {
                        return false;
                    }
                } else if (!this$materialNameZh.equals(other$materialNameZh)) {
                    return false;
                }

                label266:
                {
                    Object this$isMainIntent = this.getIsMainIntent();
                    Object other$isMainIntent = other.getIsMainIntent();
                    if (this$isMainIntent == null) {
                        if (other$isMainIntent == null) {
                            break label266;
                        }
                    } else if (this$isMainIntent.equals(other$isMainIntent)) {
                        break label266;
                    }

                    return false;
                }

                Object this$fullName = this.getFullName();
                Object other$fullName = other.getFullName();
                if (this$fullName == null) {
                    if (other$fullName != null) {
                        return false;
                    }
                } else if (!this$fullName.equals(other$fullName)) {
                    return false;
                }

                Object this$remark = this.getRemark();
                Object other$remark = other.getRemark();
                if (this$remark == null) {
                    if (other$remark != null) {
                        return false;
                    }
                } else if (!this$remark.equals(other$remark)) {
                    return false;
                }

                Object this$colorId = this.getColorId();
                Object other$colorId = other.getColorId();
                if (this$colorId == null) {
                    if (other$colorId != null) {
                        return false;
                    }
                } else if (!this$colorId.equals(other$colorId)) {
                    return false;
                }

                label238:
                {
                    Object this$colorNameZh = this.getColorNameZh();
                    Object other$colorNameZh = other.getColorNameZh();
                    if (this$colorNameZh == null) {
                        if (other$colorNameZh == null) {
                            break label238;
                        }
                    } else if (this$colorNameZh.equals(other$colorNameZh)) {
                        break label238;
                    }

                    return false;
                }

                label231:
                {
                    Object this$colorName = this.getColorName();
                    Object other$colorName = other.getColorName();
                    if (this$colorName == null) {
                        if (other$colorName == null) {
                            break label231;
                        }
                    } else if (this$colorName.equals(other$colorName)) {
                        break label231;
                    }

                    return false;
                }

                Object this$trimId = this.getTrimId();
                Object other$trimId = other.getTrimId();
                if (this$trimId == null) {
                    if (other$trimId != null) {
                        return false;
                    }
                } else if (!this$trimId.equals(other$trimId)) {
                    return false;
                }

                label217:
                {
                    Object this$trimNameZh = this.getTrimNameZh();
                    Object other$trimNameZh = other.getTrimNameZh();
                    if (this$trimNameZh == null) {
                        if (other$trimNameZh == null) {
                            break label217;
                        }
                    } else if (this$trimNameZh.equals(other$trimNameZh)) {
                        break label217;
                    }

                    return false;
                }

                label210:
                {
                    Object this$trimName = this.getTrimName();
                    Object other$trimName = other.getTrimName();
                    if (this$trimName == null) {
                        if (other$trimName == null) {
                            break label210;
                        }
                    } else if (this$trimName.equals(other$trimName)) {
                        break label210;
                    }

                    return false;
                }

                Object this$optionId = this.getOptionId();
                Object other$optionId = other.getOptionId();
                if (this$optionId == null) {
                    if (other$optionId != null) {
                        return false;
                    }
                } else if (!this$optionId.equals(other$optionId)) {
                    return false;
                }

                Object this$optionNameZh = this.getOptionNameZh();
                Object other$optionNameZh = other.getOptionNameZh();
                if (this$optionNameZh == null) {
                    if (other$optionNameZh != null) {
                        return false;
                    }
                } else if (!this$optionNameZh.equals(other$optionNameZh)) {
                    return false;
                }

                label189:
                {
                    Object this$optionName = this.getOptionName();
                    Object other$optionName = other.getOptionName();
                    if (this$optionName == null) {
                        if (other$optionName == null) {
                            break label189;
                        }
                    } else if (this$optionName.equals(other$optionName)) {
                        break label189;
                    }

                    return false;
                }

                label182:
                {
                    Object this$salesOptionDTOS = this.getSalesOptionDTOS();
                    Object other$salesOptionDTOS = other.getSalesOptionDTOS();
                    if (this$salesOptionDTOS == null) {
                        if (other$salesOptionDTOS == null) {
                            break label182;
                        }
                    } else if (this$salesOptionDTOS.equals(other$salesOptionDTOS)) {
                        break label182;
                    }

                    return false;
                }

                Object this$ownerCode = this.getOwnerCode();
                Object other$ownerCode = other.getOwnerCode();
                if (this$ownerCode == null) {
                    if (other$ownerCode != null) {
                        return false;
                    }
                } else if (!this$ownerCode.equals(other$ownerCode)) {
                    return false;
                }

                Object this$isDeleted = this.getIsDeleted();
                Object other$isDeleted = other.getIsDeleted();
                if (this$isDeleted == null) {
                    if (other$isDeleted != null) {
                        return false;
                    }
                } else if (!this$isDeleted.equals(other$isDeleted)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IntentDTO;
    }

    public String toString() {
        return "IntentDTO(customerBusinessId=" + this.getCustomerBusinessId() + ", clueIntentId=" + this.getClueIntentId() + ", firstId=" + this.getFirstId() + ", firstNameZh=" + this.getFirstNameZh() + ", secondId=" + this.getSecondId() + ", secondNameZh=" + this.getSecondNameZh() + ", thirdId=" + this.getThirdId() + ", thirdNameZh=" + this.getThirdNameZh() + ", fourthId=" + this.getFourthId() + ", fourthNameZh=" + this.getFourthNameZh() + ", fiveId=" + this.getFiveId() + ", fiveNameZh=" + this.getFiveNameZh() + ", level=" + this.getLevel() + ", materialId=" + this.getMaterialId() + ", materialNameZh=" + this.getMaterialNameZh() + ", isMainIntent=" + this.getIsMainIntent() + ", fullName=" + this.getFullName() + ", remark=" + this.getRemark() + ", colorId=" + this.getColorId() + ", colorNameZh=" + this.getColorNameZh() + ", colorName=" + this.getColorName() + ", trimId=" + this.getTrimId() + ", trimNameZh=" + this.getTrimNameZh() + ", trimName=" + this.getTrimName() + ", optionId=" + this.getOptionId() + ", optionNameZh=" + this.getOptionNameZh() + ", optionName=" + this.getOptionName() + ", salesOptionDTOS=" + this.getSalesOptionDTOS() + ", ownerCode=" + this.getOwnerCode() + ", isDeleted=" + this.getIsDeleted() + ")";
    }
}
