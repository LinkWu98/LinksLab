package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sonar
 */
@ApiModel(value = "潜客信息for订单", description = "潜客信息for订单")
public class PotentialForOrderDTO {
    @ApiModelProperty(value = "唯一Id")
    private Long oneId;
    @ApiModelProperty(value = "潜客ID")
    private Long potentialCustomersId;

    @ApiModelProperty(value = "商机ID")
    private Long  customerBusinessId;

    @ApiModelProperty(value="潜客编号")
    private String potentialCustomerNo;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "客户类型")
    private String customerType;

    @ApiModelProperty(value = "客户联系人")
    private String contactName;

    @ApiModelProperty(value = "客户来源")
    private Integer customerFrom;

    @ApiModelProperty(value = "意向级别")
    private Integer intentLevel;
    @ApiModelProperty(value = "手机号脱敏")
    private String mobilePhoneTM;
    @ApiModelProperty(value = "手机号")
    private String mobilePhone;
    @ApiModelProperty(value = "市场活动(集客)")
    private String  customerActivityId;
    @ApiModelProperty(value = "顾问编号")
    private String consultantTeleId;
    @ApiModelProperty(value = "生日")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "行业类型")
    private Integer industry;

    @ApiModelProperty(value = "销售顾问")
    private String consultant;

    @ApiModelProperty(value = "销售顾问编号")
    private String consultantId;
    @ApiModelProperty(value = "销售顾问编号")
    private String consultantIdN;
    @ApiModelProperty(value = "了解途径")
    private String waysToRoad;

    @ApiModelProperty(value = "性别")
    private Integer gender;


    @ApiModelProperty(value = "证件类型")
    private Integer ctCode;
    @ApiModelProperty(value = "证件号码脱敏")
    private String certificateNoTM;
    @ApiModelProperty(value = "证件号码")
    private String certificateNo;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "车辆用途")
    private Integer vehicularApplication;

    @ApiModelProperty(value = "了解途径")
    private String basedataName;

    @ApiModelProperty(value = "客户来源")
    private String clueName;

    @ApiModelProperty(value = "线索来源细分ID")
    private Long clueSourceId;

    @ApiModelProperty(value = "拼接线索来源名称")
    private String clueSourceName;

    @ApiModelProperty(value= "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty("邮编")
    private String zipCode;
    @ApiModelProperty("E_MAIL")
    private String eMail;

    @ApiModelProperty("客户联系信息")
    private List<CustomerContactinfoVO> customerContactinfoVOList;

    @ApiModelProperty("市场活动id（集客）")
    private String  marketActivityId;

    @ApiModelProperty("市场活动名称（集客）")
    private String marketActivityName;

    @ApiModelProperty("orgId")
    private String orgId;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getMarketActivityId() {
        return marketActivityId;
    }

    public void setMarketActivityId(String marketActivityId) {
        this.marketActivityId = marketActivityId;
    }

    public String getMarketActivityName() {
        return marketActivityName;
    }

    public void setMarketActivityName(String marketActivityName) {
        this.marketActivityName = marketActivityName;
    }

    public Long getOneId() {
        return oneId;
    }

    public void setOneId(Long oneId) {
        this.oneId = oneId;
    }

    public Long getPotentialCustomersId() {
        return potentialCustomersId;
    }

    public void setPotentialCustomersId(Long potentialCustomersId) {
        this.potentialCustomersId = potentialCustomersId;
    }

    public Long getCustomerBusinessId() {
        return customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getPotentialCustomerNo() {
        return potentialCustomerNo;
    }

    public void setPotentialCustomerNo(String potentialCustomerNo) {
        this.potentialCustomerNo = potentialCustomerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getCustomerFrom() {
        return customerFrom;
    }

    public void setCustomerFrom(Integer customerFrom) {
        this.customerFrom = customerFrom;
    }

    public Integer getIntentLevel() {
        return intentLevel;
    }

    public void setIntentLevel(Integer intentLevel) {
        this.intentLevel = intentLevel;
    }

    public String getMobilePhoneTM() {
        return mobilePhoneTM;
    }

    public void setMobilePhoneTM(String mobilePhoneTM) {
        this.mobilePhoneTM = mobilePhoneTM;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCustomerActivityId() {
        return customerActivityId;
    }

    public void setCustomerActivityId(String customerActivityId) {
        this.customerActivityId = customerActivityId;
    }

    public String getConsultantTeleId() {
        return consultantTeleId;
    }

    public void setConsultantTeleId(String consultantTeleId) {
        this.consultantTeleId = consultantTeleId;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getConsultantIdN() {
        return consultantIdN;
    }

    public void setConsultantIdN(String consultantIdN) {
        this.consultantIdN = consultantIdN;
    }

    public String getWaysToRoad() {
        return waysToRoad;
    }

    public void setWaysToRoad(String waysToRoad) {
        this.waysToRoad = waysToRoad;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCtCode() {
        return ctCode;
    }

    public void setCtCode(Integer ctCode) {
        this.ctCode = ctCode;
    }

    public String getCertificateNoTM() {
        return certificateNoTM;
    }

    public void setCertificateNoTM(String certificateNoTM) {
        this.certificateNoTM = certificateNoTM;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getVehicularApplication() {
        return vehicularApplication;
    }

    public void setVehicularApplication(Integer vehicularApplication) {
        this.vehicularApplication = vehicularApplication;
    }

    public String getBasedataName() {
        return basedataName;
    }

    public void setBasedataName(String basedataName) {
        this.basedataName = basedataName;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public Long getClueSourceId() {
        return clueSourceId;
    }

    public void setClueSourceId(Long clueSourceId) {
        this.clueSourceId = clueSourceId;
    }

    public String getClueSourceName() {
        return clueSourceName;
    }

    public void setClueSourceName(String clueSourceName) {
        this.clueSourceName = clueSourceName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public List<CustomerContactinfoVO> getCustomerContactinfoVOList() {
        return customerContactinfoVOList;
    }

    public void setCustomerContactinfoVOList(List<CustomerContactinfoVO> customerContactinfoVOList) {
        this.customerContactinfoVOList = customerContactinfoVOList;
    }

    @Override
    public String toString() {
        return "PotentialForOrderDTO{" +
                "oneId=" + oneId +
                ", potentialCustomersId=" + potentialCustomersId +
                ", customerBusinessId=" + customerBusinessId +
                ", potentialCustomerNo='" + potentialCustomerNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerType='" + customerType + '\'' +
                ", contactName='" + contactName + '\'' +
                ", customerFrom=" + customerFrom +
                ", intentLevel=" + intentLevel +
                ", mobilePhoneTM='" + mobilePhoneTM + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", customerActivityId='" + customerActivityId + '\'' +
                ", consultantTeleId='" + consultantTeleId + '\'' +
                ", birthday=" + birthday +
                ", industry=" + industry +
                ", consultant='" + consultant + '\'' +
                ", consultantId='" + consultantId + '\'' +
                ", consultantIdN='" + consultantIdN + '\'' +
                ", waysToRoad='" + waysToRoad + '\'' +
                ", gender=" + gender +
                ", ctCode=" + ctCode +
                ", certificateNoTM='" + certificateNoTM + '\'' +
                ", certificateNo='" + certificateNo + '\'' +
                ", address='" + address + '\'' +
                ", vehicularApplication=" + vehicularApplication +
                ", basedataName='" + basedataName + '\'' +
                ", clueName='" + clueName + '\'' +
                ", clueSourceId=" + clueSourceId +
                ", clueSourceName='" + clueSourceName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", eMail='" + eMail + '\'' +
                ", customerContactinfoVOList=" + customerContactinfoVOList +
                ", marketActivityId='" + marketActivityId + '\'' +
                ", marketActivityName='" + marketActivityName + '\'' +
                ", orgId='" + orgId + '\'' +
                '}';
    }
}
