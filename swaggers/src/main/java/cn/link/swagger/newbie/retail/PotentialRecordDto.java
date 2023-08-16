package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@ApiModel(
        value = "潜客DTO",
        description = "潜客对象"
)
public class PotentialRecordDto implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("唯一id")
    private Long oneId;
    @ApiModelProperty("操作类型1：网销顾问新增页面，2：销售顾问客流建档页面，3：PC页面网销经理或网销顾问新增页面，4：PC页面销售经理或销售顾问新增页面，5：PC页面客流建档页面，6：基盘续购页面")
    private Integer operateType;
    @ApiModelProperty("经销商code")
    private String ownerCode;
    @ApiModelProperty("潜客id，新增潜客时不需要传值")
    private Long potentialCustomersId;
    @ApiModelProperty("商机id")
    private Long customerBusinessId;
    @ApiModelProperty("客流id，直接建档时不需要传值")
    private Long passengerFlowId;
    @ApiModelProperty("客户类型:个人、公司")
    private Integer customerType;
    @ApiModelProperty("客户名称")
    private String customerName;
    @ApiModelProperty("联系人名称")
    private String contactName;
    @ApiModelProperty("性别，tc_code类型为1002")
    private Integer gender;
    @ApiModelProperty("手机号码")
    private String mobilePhone;
    @ApiModelProperty("联系方式二 固定电话")
    private String phone;
    @ApiModelProperty("省")
    private String province;
    @ApiModelProperty("市")
    private String city;
    @ApiModelProperty("区")
    private String area;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("省名称")
    private String provinceName;
    @ApiModelProperty("市名称")
    private String cityName;
    @ApiModelProperty("区名称")
    private String areaName;
    @ApiModelProperty("客户来源")
    private String customerFrom;
    @ApiModelProperty("线索来源")
    private String clueSourceId;
    @ApiModelProperty("意向品牌")
    private Integer intentBrand;
    @ApiModelProperty("意向车系")
    private Integer intentSeries;
    @ApiModelProperty("意向车型")
    private Integer intentModel;
    @ApiModelProperty("意向配置")
    private Integer intentPackage;
    @ApiModelProperty("意向颜色")
    private Integer intentColor;
    @ApiModelProperty("意向级别")
    private Integer intentLevel;
    @ApiModelProperty("购买方式 购买类型 （首购、增购、置换）7015")
    private Integer buyType;
    @ApiModelProperty("付款方式 按揭、全款 1426")
    private Integer paymentMethod;
    @ApiModelProperty("竞争品牌")
    private String competitor;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("线索id，查重时如果返回线索信息，需要传")
    private Integer clueRecordId;
    @ApiModelProperty("预约id，客流页面搜索预约信息并点击建档时需要传，当预约跳转到建档编辑页面时需要传")
    private Long taskId;
    @ApiModelProperty("RECORD_VERSION")
    private Integer recordVersion;
    @ApiModelProperty("C端IM编号")
    private Long imClueRecordId;
    @ApiModelProperty("预计购车日期")
    private LocalDateTime bookingDate;
    @ApiModelProperty("已购买车型")
    private String boughtCars;
    @ApiModelProperty("已购车龄")
    private String boughtCarsAge;
    @ApiModelProperty("意向车型")
    private List<IntentDTO> intentDTOList;
    @ApiModelProperty("保有车辆")
    private List<KeepingVehiclesDTO> keepingVehiclesDTOList;
    @ApiModelProperty("竞品信息")
    private List<CompetitorDTO> competitorDTOList;
    @ApiModelProperty("联系人信息")
    private List<CustomerContactinfoDTO> customerContactinfoDTOList;
    @ApiModelProperty("邮编")
    private String zipCode;
    @ApiModelProperty("E_MAIL")
    private String eMail;
    @ApiModelProperty("证件类型：身份证、护照、机构代码、军官证、士兵证、警官证、其他 1508")
    private Integer ctCode;
    @ApiModelProperty("证件号码")
    private String certificateNo;
    @ApiModelProperty("专属销售顾问")
    private String consultant;
    @ApiModelProperty("组织ID")
    private String orgId;
    @ApiModelProperty("是否大客户")
    private Integer isBigCustomer;
    @ApiModelProperty("QQ")
    private String qq;
    @ApiModelProperty("微信")
    private String wechat;
    @ApiModelProperty(
            value = "客户标签ID",
            name = "tagId",
            example = "1254361885753331713,1254362934794899457"
    )
    private String tagId;
    @ApiModelProperty("微信")
    private String wechart;
    @ApiModelProperty("微信ID")
    private String openId;
    @ApiModelProperty("微信号")
    private String openidName;
    @ApiModelProperty("家庭情况")
    private String familyCon;
    @ApiModelProperty("职业 7031")
    private String postName;
    @ApiModelProperty("兴趣爱好 7032")
    private String avocation;
    @ApiModelProperty("IM渠道编号")
    private String imChannel;
    private Boolean isDeleted;
    private Integer isDormant;
    @ApiModelProperty("出生日期")
    private LocalDateTime birthday;
    @ApiModelProperty("教育水平:小学、初中、高中/中专/技校、大专、本科、硕士及以上 7027")
    private Integer educationalLevel;
    @ApiModelProperty("婚姻状况:未婚、已婚、离异 7028")
    private Integer maritalStatus;
    @ApiModelProperty("家庭人数 正整数")
    private Integer familyNum;
    @ApiModelProperty("家庭年收入（万元）正整数")
    private Integer familyInCome;
    @ApiModelProperty("企业性质 机关、事业、企业、运营、公检司法、其它。7029")
    private Integer enterpriseType;
    @ApiModelProperty("所属行业:互联网/IT/电子/通信；广告/传媒/文化/体育；金融；教育培训；制药/医疗；交通/物流/贸易/零售；专业服务；房地产/建筑；汽车；机械/制造；消费品；服务业；能源/化工/环保；政府/非盈利机构/其他 7030")
    private Integer industry;
    @ApiModelProperty("是否吸烟 1004")
    private Integer smokingOrNot;
    @ApiModelProperty("钟爱饮料 7033")
    private Integer favoriteDrinks;
    @ApiModelProperty("转介绍客户(选取已成交的客户)")
    private Long introducCustomerId;
    @ApiModelProperty("购车因素")
    private List<Long> buyCarFactorList;
    @ApiModelProperty("了解途径")
    private String waysToRoad;
    @ApiModelProperty("商机分析,以逗号分割")
    private String businessAnaly;
    @ApiModelProperty("购车用途 1514")
    private Long buyCarUse;
    @ApiModelProperty("来源备注")
    private String clueSourceRemark;
    @ApiModelProperty("线索热度 7018")
    private Long temperature;
    @ApiModelProperty("线索类型 7019")
    private Integer clueEnterType;
    @ApiModelProperty("业务分类")
    private Integer businessClassify;
    @ApiModelProperty("期望用车日期")
    private LocalDateTime expectedCarDate;
    @ApiModelProperty("购买台次")
    private Integer buyNum;
    @ApiModelProperty("购车预算")
    private Integer carBudget;
    @ApiModelProperty("日常驾乘人数")
    private Integer drivingNumber;
    @ApiModelProperty("是否有子女 10041001")
    private String haveChildren;
    @ApiModelProperty("子女数量")
    private Integer childrenNumber;
    @ApiModelProperty("居住地类型")
    private Integer liveType;
    @ApiModelProperty("工作地类型")
    private Integer workPlaceType;
    @ApiModelProperty("置换信息")
    private String displacementInfo;
    @ApiModelProperty("喜欢的联系方式")
    private Integer likeContactWay;
    @ApiModelProperty("区分保存并跟进")
    private Long isFollow;
    @ApiModelProperty("客流接待顾问")
    private String receptionConsultant;
    @ApiModelProperty("客流接待顾问")
    private String receptionConsultantOrgId;
    @ApiModelProperty("市场活动")
    private String marketActivity;
    @ApiModelProperty("市场活动")
    private String marketActivityId;
    @ApiModelProperty("到店时间")
    private LocalDateTime arriveDate;
    @ApiModelProperty("第一次下单时间")
    private LocalDateTime firstOrderTime;

    public PotentialRecordDto() {
    }

    public static long getSerialVersionUID() {
        return 1L;
    }

    public String getTagId() {
        return this.tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getWechart() {
        return this.wechart;
    }

    public void setWechart(String wechart) {
        this.wechart = wechart;
    }

    @ApiModelProperty("是否休眠客户")
    public Integer getIsDormant() {
        return this.isDormant;
    }

    public void setIsDormant(Integer isDormant) {
        this.isDormant = isDormant;
    }

    public LocalDateTime getFirstOrderTime() {
        return this.firstOrderTime;
    }

    public void setFirstOrderTime(LocalDateTime firstOrderTime) {
        this.firstOrderTime = firstOrderTime;
    }

    public LocalDateTime getArriveDate() {
        return this.arriveDate;
    }

    public void setArriveDate(LocalDateTime arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getReceptionConsultant() {
        return this.receptionConsultant;
    }

    public void setReceptionConsultant(String receptionConsultant) {
        this.receptionConsultant = receptionConsultant;
    }

    public String getReceptionConsultantOrgId() {
        return this.receptionConsultantOrgId;
    }

    public void setReceptionConsultantOrgId(String receptionConsultantOrgId) {
        this.receptionConsultantOrgId = receptionConsultantOrgId;
    }

    public Integer getBusinessClassify() {
        return this.businessClassify;
    }

    public void setBusinessClassify(Integer businessClassify) {
        this.businessClassify = businessClassify;
    }

    public LocalDateTime getExpectedCarDate() {
        return this.expectedCarDate;
    }

    public void setExpectedCarDate(LocalDateTime expectedCarDate) {
        this.expectedCarDate = expectedCarDate;
    }

    public Integer getCarBudget() {
        return this.carBudget;
    }

    public void setCarBudget(Integer carBudget) {
        this.carBudget = carBudget;
    }

    public Integer getDrivingNumber() {
        return this.drivingNumber;
    }

    public void setDrivingNumber(Integer drivingNumber) {
        this.drivingNumber = drivingNumber;
    }

    public String getHaveChildren() {
        return this.haveChildren;
    }

    public void setHaveChildren(String haveChildren) {
        this.haveChildren = haveChildren;
    }

    public Integer getChildrenNumber() {
        return this.childrenNumber;
    }

    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public Integer getLiveType() {
        return this.liveType;
    }

    public void setLiveType(Integer liveType) {
        this.liveType = liveType;
    }

    public Integer getWorkPlaceType() {
        return this.workPlaceType;
    }

    public void setWorkPlaceType(Integer workPlaceType) {
        this.workPlaceType = workPlaceType;
    }

    public String getDisplacementInfo() {
        return this.displacementInfo;
    }

    public void setDisplacementInfo(String displacementInfo) {
        this.displacementInfo = displacementInfo;
    }

    public Integer getLikeContactWay() {
        return this.likeContactWay;
    }

    public void setLikeContactWay(Integer likeContactWay) {
        this.likeContactWay = likeContactWay;
    }

    public List<Long> getBuyCarFactorList() {
        return this.buyCarFactorList;
    }

    public void setBuyCarFactorList(List<Long> buyCarFactorList) {
        this.buyCarFactorList = buyCarFactorList;
    }

    public Long getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getWaysToRoad() {
        return this.waysToRoad;
    }

    public void setWaysToRoad(String waysToRoad) {
        this.waysToRoad = waysToRoad;
    }

    public String getOwnerCode() {
        return this.ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Long getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Integer getClueEnterType() {
        return this.clueEnterType;
    }

    public void setClueEnterType(Integer clueEnterType) {
        this.clueEnterType = clueEnterType;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getOperateType() {
        return this.operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getClueSourceRemark() {
        return this.clueSourceRemark;
    }

    public void setClueSourceRemark(String clueSourceRemark) {
        this.clueSourceRemark = clueSourceRemark;
    }

    public Integer getBuyNum() {
        return this.buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public List<IntentDTO> getIntentDTOList() {
        return this.intentDTOList;
    }

    public void setIntentDTOList(List<IntentDTO> intentDTOList) {
        this.intentDTOList = intentDTOList;
    }

    public LocalDateTime getBookingDate() {
        return this.bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBoughtCars() {
        return this.boughtCars;
    }

    public void setBoughtCars(String boughtCars) {
        this.boughtCars = boughtCars;
    }

    public String getBoughtCarsAge() {
        return this.boughtCarsAge;
    }

    public void setBoughtCarsAge(String boughtCarsAge) {
        this.boughtCarsAge = boughtCarsAge;
    }

    public Long getImClueRecordId() {
        return this.imClueRecordId;
    }

    public void setImClueRecordId(Long imClueRecordId) {
        this.imClueRecordId = imClueRecordId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getImChannel() {
        return this.imChannel;
    }

    public void setImChannel(String imChannel) {
        this.imChannel = imChannel;
    }

    public Long getPassengerFlowId() {
        return this.passengerFlowId;
    }

    public void setPassengerFlowId(Long passengerFlowId) {
        this.passengerFlowId = passengerFlowId;
    }

    public Integer getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerFrom() {
        return this.customerFrom;
    }

    public void setCustomerFrom(String customerFrom) {
        this.customerFrom = customerFrom;
    }

    public Integer getIntentBrand() {
        return this.intentBrand;
    }

    public void setIntentBrand(Integer intentBrand) {
        this.intentBrand = intentBrand;
    }

    public Integer getIntentSeries() {
        return this.intentSeries;
    }

    public void setIntentSeries(Integer intentSeries) {
        this.intentSeries = intentSeries;
    }

    public Integer getIntentModel() {
        return this.intentModel;
    }

    public void setIntentModel(Integer intentModel) {
        this.intentModel = intentModel;
    }

    public Integer getIntentPackage() {
        return this.intentPackage;
    }

    public void setIntentPackage(Integer intentPackage) {
        this.intentPackage = intentPackage;
    }

    public Integer getIntentColor() {
        return this.intentColor;
    }

    public void setIntentColor(Integer intentColor) {
        this.intentColor = intentColor;
    }

    public Integer getIntentLevel() {
        return this.intentLevel;
    }

    public void setIntentLevel(Integer intentLevel) {
        this.intentLevel = intentLevel;
    }

    public Integer getBuyType() {
        return this.buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public Integer getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCompetitor() {
        return this.competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getClueRecordId() {
        return this.clueRecordId;
    }

    public void setClueRecordId(Integer clueRecordId) {
        this.clueRecordId = clueRecordId;
    }

    public Long getPotentialCustomersId() {
        return this.potentialCustomersId;
    }

    public void setPotentialCustomersId(Long potentialCustomersId) {
        this.potentialCustomersId = potentialCustomersId;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getRecordVersion() {
        return this.recordVersion;
    }

    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getCtCode() {
        return this.ctCode;
    }

    public void setCtCode(Integer ctCode) {
        this.ctCode = ctCode;
    }

    public String getCertificateNo() {
        return this.certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getConsultant() {
        return this.consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public Integer getIsBigCustomer() {
        return this.isBigCustomer;
    }

    public void setIsBigCustomer(Integer isBigCustomer) {
        this.isBigCustomer = isBigCustomer;
    }

    public String getQq() {
        return this.qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return this.wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getOpenidName() {
        return this.openidName;
    }

    public void setOpenidName(String openidName) {
        this.openidName = openidName;
    }

    public String getFamilyCon() {
        return this.familyCon;
    }

    public void setFamilyCon(String familyCon) {
        this.familyCon = familyCon;
    }

    public String getPostName() {
        return this.postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getAvocation() {
        return this.avocation;
    }

    public void setAvocation(String avocation) {
        this.avocation = avocation;
    }

    public Boolean getDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        this.isDeleted = deleted;
    }

    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getEducationalLevel() {
        return this.educationalLevel;
    }

    public void setEducationalLevel(Integer educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getFamilyNum() {
        return this.familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public Integer getFamilyInCome() {
        return this.familyInCome;
    }

    public void setFamilyInCome(Integer familyInCome) {
        this.familyInCome = familyInCome;
    }

    public Integer getIndustry() {
        return this.industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public Integer getSmokingOrNot() {
        return this.smokingOrNot;
    }

    public void setSmokingOrNot(Integer smokingOrNot) {
        this.smokingOrNot = smokingOrNot;
    }

    public Integer getFavoriteDrinks() {
        return this.favoriteDrinks;
    }

    public void setFavoriteDrinks(Integer favoriteDrinks) {
        this.favoriteDrinks = favoriteDrinks;
    }

    public String getClueSourceId() {
        return this.clueSourceId;
    }

    public void setClueSourceId(String clueSourceId) {
        this.clueSourceId = clueSourceId;
    }

    public List<KeepingVehiclesDTO> getKeepingVehiclesDTOList() {
        return this.keepingVehiclesDTOList;
    }

    public void setKeepingVehiclesDTOList(List<KeepingVehiclesDTO> keepingVehiclesDTOList) {
        this.keepingVehiclesDTOList = keepingVehiclesDTOList;
    }

    public List<CompetitorDTO> getCompetitorDTOList() {
        return this.competitorDTOList;
    }

    public void setCompetitorDTOList(List<CompetitorDTO> competitorDTOList) {
        this.competitorDTOList = competitorDTOList;
    }

    public List<CustomerContactinfoDTO> getCustomerContactinfoDTOList() {
        return this.customerContactinfoDTOList;
    }

    public void setCustomerContactinfoDTOList(List<CustomerContactinfoDTO> customerContactinfoDTOList) {
        this.customerContactinfoDTOList = customerContactinfoDTOList;
    }

    public Long getIntroducCustomerId() {
        return this.introducCustomerId;
    }

    public void setIntroducCustomerId(Long introducCustomerId) {
        this.introducCustomerId = introducCustomerId;
    }

    public Long getBuyCarUse() {
        return this.buyCarUse;
    }

    public void setBuyCarUse(Long buyCarUse) {
        this.buyCarUse = buyCarUse;
    }

    public Integer getEnterpriseType() {
        return this.enterpriseType;
    }

    public void setEnterpriseType(Integer enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getBusinessAnaly() {
        return this.businessAnaly;
    }

    public void setBusinessAnaly(String businessAnaly) {
        this.businessAnaly = businessAnaly;
    }

    public Long getIsFollow() {
        return this.isFollow;
    }

    public void setIsFollow(Long isFollow) {
        this.isFollow = isFollow;
    }

    public String getMarketActivity() {
        return this.marketActivity;
    }

    public void setMarketActivity(String marketActivity) {
        this.marketActivity = marketActivity;
    }

    public Long getOneId() {
        return this.oneId;
    }

    public void setOneId(Long oneId) {
        this.oneId = oneId;
    }

    public String getMarketActivityId() {
        return this.marketActivityId;
    }

    public void setMarketActivityId(String marketActivityId) {
        this.marketActivityId = marketActivityId;
    }

    public String toString() {
        return "PotentialRecordDto{oneId=" + this.oneId + ", operateType=" + this.operateType + ", ownerCode='" + this.ownerCode + '\'' + ", potentialCustomersId=" + this.potentialCustomersId + ", customerBusinessId=" + this.customerBusinessId + ", passengerFlowId=" + this.passengerFlowId + ", customerType=" + this.customerType + ", customerName='" + this.customerName + '\'' + ", contactName='" + this.contactName + '\'' + ", gender=" + this.gender + ", mobilePhone='" + this.mobilePhone + '\'' + ", phone='" + this.phone + '\'' + ", province='" + this.province + '\'' + ", city='" + this.city + '\'' + ", area='" + this.area + '\'' + ", address='" + this.address + '\'' + ", provinceName='" + this.provinceName + '\'' + ", cityName='" + this.cityName + '\'' + ", areaName='" + this.areaName + '\'' + ", customerFrom='" + this.customerFrom + '\'' + ", clueSourceId='" + this.clueSourceId + '\'' + ", intentBrand=" + this.intentBrand + ", intentSeries=" + this.intentSeries + ", intentModel=" + this.intentModel + ", intentPackage=" + this.intentPackage + ", intentColor=" + this.intentColor + ", intentLevel=" + this.intentLevel + ", buyType=" + this.buyType + ", paymentMethod=" + this.paymentMethod + ", competitor='" + this.competitor + '\'' + ", remark='" + this.remark + '\'' + ", clueRecordId=" + this.clueRecordId + ", taskId=" + this.taskId + ", recordVersion=" + this.recordVersion + ", imClueRecordId=" + this.imClueRecordId + ", bookingDate=" + this.bookingDate + ", boughtCars='" + this.boughtCars + '\'' + ", boughtCarsAge='" + this.boughtCarsAge + '\'' + ", intentDTOList=" + this.intentDTOList + ", keepingVehiclesDTOList=" + this.keepingVehiclesDTOList + ", competitorDTOList=" + this.competitorDTOList + ", customerContactinfoDTOList=" + this.customerContactinfoDTOList + ", zipCode='" + this.zipCode + '\'' + ", eMail='" + this.eMail + '\'' + ", ctCode=" + this.ctCode + ", certificateNo='" + this.certificateNo + '\'' + ", consultant='" + this.consultant + '\'' + ", orgId='" + this.orgId + '\'' + ", isBigCustomer=" + this.isBigCustomer + ", qq='" + this.qq + '\'' + ", wechat='" + this.wechat + '\'' + ", tagId='" + this.tagId + '\'' + ", wechart='" + this.wechart + '\'' + ", openId='" + this.openId + '\'' + ", openidName='" + this.openidName + '\'' + ", familyCon='" + this.familyCon + '\'' + ", postName='" + this.postName + '\'' + ", avocation='" + this.avocation + '\'' + ", imChannel='" + this.imChannel + '\'' + ", isDeleted=" + this.isDeleted + ", isDormant=" + this.isDormant + ", birthday=" + this.birthday + ", educationalLevel=" + this.educationalLevel + ", maritalStatus=" + this.maritalStatus + ", familyNum=" + this.familyNum + ", familyInCome=" + this.familyInCome + ", enterpriseType=" + this.enterpriseType + ", industry=" + this.industry + ", smokingOrNot=" + this.smokingOrNot + ", favoriteDrinks=" + this.favoriteDrinks + ", introducCustomerId=" + this.introducCustomerId + ", buyCarFactorList=" + this.buyCarFactorList + ", waysToRoad='" + this.waysToRoad + '\'' + ", businessAnaly='" + this.businessAnaly + '\'' + ", buyCarUse=" + this.buyCarUse + ", clueSourceRemark='" + this.clueSourceRemark + '\'' + ", temperature=" + this.temperature + ", clueEnterType=" + this.clueEnterType + ", businessClassify=" + this.businessClassify + ", expectedCarDate=" + this.expectedCarDate + ", buyNum=" + this.buyNum + ", carBudget=" + this.carBudget + ", drivingNumber=" + this.drivingNumber + ", haveChildren='" + this.haveChildren + '\'' + ", childrenNumber=" + this.childrenNumber + ", liveType=" + this.liveType + ", workPlaceType=" + this.workPlaceType + ", displacementInfo='" + this.displacementInfo + '\'' + ", likeContactWay=" + this.likeContactWay + ", isFollow=" + this.isFollow + ", receptionConsultant='" + this.receptionConsultant + '\'' + ", receptionConsultantOrgId='" + this.receptionConsultantOrgId + '\'' + ", marketActivity='" + this.marketActivity + '\'' + ", marketActivityId='" + this.marketActivityId + '\'' + ", arriveDate=" + this.arriveDate + ", firstOrderTime=" + this.firstOrderTime + '}';
    }
}
