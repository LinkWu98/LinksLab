package cn.link.swagger.newbie.retail.refund;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 查询客户订单DTO
 * </p>
 *
 * @author chenzb
 * @since 2020-03-26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryRetailOrderDTO implements Serializable {

    private Integer directRetailFlag;

    @ApiModelProperty(value = "客户订单Id")
    private String soNoId;

    @ApiModelProperty(value = "客户订单编号")
    private String soNo;

    @ApiModelProperty(value = "销售订单id")
    private Long soVinId;

    @ApiModelProperty(value = "菜单ID用于权限查询拼接")
    private String menuId;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "OWNER_CODE")
    private String ownerCode;

    @ApiModelProperty(value = "潜客电话")
    private String customerTel;

    @ApiModelProperty(value = "销售顾问--APP/PC")
    private String consultant;

    @ApiModelProperty(value = "pc端搜索")
    private String searchText;

    @ApiModelProperty(value = "APP端搜索")
    private String searchTextApp;
    @ApiModelProperty(value = "订单创建时间")
    private String createdAt;

    @ApiModelProperty(value = "订单提交开始时间")
    private String submitTimeStart;

    @ApiModelProperty(value = "订单提交结束时间")
    private String submitTimeEnd;

    @ApiModelProperty(value = "订单审批通过开始时间")
    private String auditedByManagerDateStart;

    @ApiModelProperty(value = "订单审批通过结束时间")
    private String auditedByManagerDateEnd;

    @ApiModelProperty(value = "预交车开始时间")
    private String deliveringDateStart;

    @ApiModelProperty(value = "预交车结束时间")
    private String deliveringDateEnd;

    @ApiModelProperty(value = "销售类型(2014 - BMW)")
    private String saleType;

    @ApiModelProperty(value = "配车状态")
    private String dispatchedStatus;

    @ApiModelProperty(value = "第一级ID(如：品牌)", name = "firstId")
    private String firstId;

    @ApiModelProperty(value = "第二级ID（series）", name = "secondId")
    private String secondId;

    @ApiModelProperty(value = "第三级ID", name = "thirdId")
    private String thirdId;

    @ApiModelProperty(value = "第四级ID", name = "fourId")
    private String fourId;

    @ApiModelProperty(value = "第五级ID", name = "fiveId")
    private String fiveId;

    @ApiModelProperty(value = "第六级ID", name = "sixthId")
    private String sixthId;

    @ApiModelProperty(value = "第七级ID", name = "seventhId")
    private String seventhId;

    @ApiModelProperty(value = "第八级ID", name = "eighthId")
    private String eighthId;

    @ApiModelProperty(value = "物料ID（variantID）", name = "materialId")
    private String materialId;

    @ApiModelProperty(value = "物料级别", name = "materialLevel")
    private Integer materialLevel;

    @ApiModelProperty(value = "开单日期(开始)")
    private String sheetCreateDateStart;

    @ApiModelProperty(value = "开单日期(结束)")
    private String sheetCreateDateEnd;

    @ApiModelProperty(value = "订单状态：1404")
    private String soStatus;

    @ApiModelProperty("IS_DEPOSIT")
    private Integer isDeposit;

    @ApiModelProperty("isSubmit")
    private Integer isSubmit;

    @ApiModelProperty(value = "VIN 底盘号")
    private String vin;

    @ApiModelProperty(value = "车辆用途：1511--APP/PC")
    private Integer vehicleUse;

    @ApiModelProperty(value = "预约单临时交车门店")
    private String drivingVerificationCode;

    @ApiModelProperty(value = "车牌号")
    private String licensePlateNumber;

    @ApiModelProperty(value = "预售单小转大标志位，10041001为用户编辑过配置")
    private String registrationNo;

    @ApiModelProperty(value = "行驶证注册日期")
    private LocalDateTime registrationCreatedAt;

    @ApiModelProperty(value = "是否结清：1004")
    private Integer isClearing;

    @ApiModelProperty(value = "驾照号")
    private String drivingLicenseNo;

    @ApiModelProperty(value = "专属服务顾问")
    private String serviceConsultant;

    @ApiModelProperty(value = "入参文本-取消、变更原因")
    private String textDetail;

    @ApiModelProperty(value = "入参数附件地址")
    private String textUrls;

    @ApiModelProperty(value = "取消原因类别")
    private Integer cancelType;

    @ApiModelProperty(value = "市场活动")
    private String activityId;

    @ApiModelProperty(value = "排序方式")
    private String sort;

    @ApiModelProperty(value = "市场活动(集客)")
    private String customerActivityId;

    @ApiModelProperty(value = "交车上报日期(开始)")
    private String handVehicleDateStart;

    @ApiModelProperty(value = "交车上报日期(结束)")
    private String handVehicleDateEnd;

    @ApiModelProperty(value = "订单取消时间(开始)")
    private String cancelTimeStart;

    @ApiModelProperty(value = "订单取消时间(结束)")
    private String cancelTimeEnd;

    @ApiModelProperty(value = "是否分配")
    private String isDistribution;

    @ApiModelProperty("大区id")
    private String bigAreaId;
    @ApiModelProperty("小区id")
    private String oemOrgId;
    @ApiModelProperty("集团id")
    private String groupCompanyId;

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市")
    private String city;

    @ApiModelProperty("区")
    private String district;

    @ApiModelProperty(value = "maxId，导出时使用", hidden = true)
    private Long maxId;

    @ApiModelProperty("置换类型")
    private Integer replacementType;

    @ApiModelProperty(value = "点评评分评星")
    private String evaluationScore;

    @ApiModelProperty(value = "点评内容")
    private String evaluationTag;

    @ApiModelProperty("补充内容")
    private String evaluationContent;

    @ApiModelProperty(value = "交车单备注")
    private String handoverCarRemark;

    @ApiModelProperty(value = "顾问备注")
    private String adviserRemark;

    @ApiModelProperty(value = "交车单确认时间")
    private LocalDateTime handoverCarAffirmTime;

    @ApiModelProperty(value = "交车单确认状态")
    private String handoverCarAffirmStatus;

    @ApiModelProperty(value = "交车单链接")
    private String handoverCarUrl;

    @ApiModelProperty(value = "交车单是否推送")
    private Integer isHandoverCarPush;

    @ApiModelProperty(value = "市场活动")
    private String marketActivityIds;

    @ApiModelProperty("是否脱敏")
    private Integer desensitization;

    @ApiModelProperty(value = "金额退回方式（转款，退款）")
    private Integer returnType;

    @ApiModelProperty(value = "是否原路退回")
    private Integer returnOriginal;

    @ApiModelProperty(value = "线上收款时间")
    private LocalDateTime receiveTimeOnlion;

    @ApiModelProperty(value = "账户")
    private String bankAccountNo;

    @ApiModelProperty(value = "开户行")
    private String bankAccountAddress;

    @ApiModelProperty(value = "姓名")
    private String bankAccountName;

    @ApiModelProperty(value = "金额")
    private Double refundAmount;

    @ApiModelProperty(value = "优惠券金额")
    private Double couponAmount;

    @ApiModelProperty(value = "订单申请修改备注")
    private String modifyRemark;

    @ApiModelProperty(value = "活动部门", name = "createTeamCode", example = "活动部门")
    private String createTeamCode;
    @ApiModelProperty(value = "活动部门", name = "createTeamName", example = "活动部门")
    private String createTeamName;

    @ApiModelProperty(value = "活动部门(促单)", name = "cdCreateTeamCode", example = "活动部门(促单)")
    private String cdCreateTeamCode;
    @ApiModelProperty(value = "活动部门(促单)", name = "cdCreateTeamName", example = "活动部门(促单)")
    private String cdCreateTeamName;
    @ApiModelProperty(value = "是否开票")
    private String isInvoice;

    @ApiModelProperty(value = "取消原因")
    private String subCodes;

    @ApiModelProperty(value = "取消原因CODE，多个取消原因使用英文“,”分割，例如：10011001,10021001,10031001")
    private String cancelCodes;

    @ApiModelProperty(value = "取消原因备注（客户或销售顾问填写的取消原因备注）")
    private String cancelReasonsRemark;
}
