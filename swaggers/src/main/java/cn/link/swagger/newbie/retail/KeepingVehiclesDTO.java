//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

public class KeepingVehiclesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("保有车辆ID")
    private Long keepVehiclesId;
    @ApiModelProperty("商机ID")
    private Long customerBusinessId;
    @ApiModelProperty("品牌")
    private String keepVehiclesBrand;
    @ApiModelProperty("车系")
    private String keepVehiclesSeries;
    @ApiModelProperty("车型")
    private String keepVehiclesModel;
    @ApiModelProperty("VIN")
    private String vin;
    @ApiModelProperty("购买日期")
    private LocalDateTime buyDate;
    @ApiModelProperty("已购车龄")
    private String boughtCarsAge;
    @ApiModelProperty("行驶里程")
    private String drivingMileage;
    @ApiModelProperty("备注")
    private String keepingRemark;
    private Boolean isDeleted;

    public KeepingVehiclesDTO() {
    }

    public Long getKeepVehiclesId() {
        return this.keepVehiclesId;
    }

    public void setKeepVehiclesId(Long keepVehiclesId) {
        this.keepVehiclesId = keepVehiclesId;
    }

    public Long getCustomerBusinessId() {
        return this.customerBusinessId;
    }

    public void setCustomerBusinessId(Long customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getKeepVehiclesBrand() {
        return this.keepVehiclesBrand;
    }

    public void setKeepVehiclesBrand(String keepVehiclesBrand) {
        this.keepVehiclesBrand = keepVehiclesBrand;
    }

    public String getKeepVehiclesSeries() {
        return this.keepVehiclesSeries;
    }

    public void setKeepVehiclesSeries(String keepVehiclesSeries) {
        this.keepVehiclesSeries = keepVehiclesSeries;
    }

    public String getKeepVehiclesModel() {
        return this.keepVehiclesModel;
    }

    public void setKeepVehiclesModel(String keepVehiclesModel) {
        this.keepVehiclesModel = keepVehiclesModel;
    }

    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public LocalDateTime getBuyDate() {
        return this.buyDate;
    }

    public void setBuyDate(LocalDateTime buyDate) {
        this.buyDate = buyDate;
    }

    public String getBoughtCarsAge() {
        return this.boughtCarsAge;
    }

    public void setBoughtCarsAge(String boughtCarsAge) {
        this.boughtCarsAge = boughtCarsAge;
    }

    public String getDrivingMileage() {
        return this.drivingMileage;
    }

    public void setDrivingMileage(String drivingMileage) {
        this.drivingMileage = drivingMileage;
    }

    public String getKeepingRemark() {
        return this.keepingRemark;
    }

    public void setKeepingRemark(String keepingRemark) {
        this.keepingRemark = keepingRemark;
    }

    public Boolean getDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String toString() {
        return "KeepingVehiclesDTO{keepVehiclesId=" + this.keepVehiclesId + ", customerBusinessId=" + this.customerBusinessId + ", keepVehiclesBrand=" + this.keepVehiclesBrand + ", keepVehiclesSeries=" + this.keepVehiclesSeries + ", keepVehiclesModel=" + this.keepVehiclesModel + ", vin=" + this.vin + ", buyDate=" + this.buyDate + ", boughtCarsAge=" + this.boughtCarsAge + ", drivingMileage=" + this.drivingMileage + ", keepingRemark=" + this.keepingRemark + ", isDeleted=" + this.isDeleted + "}";
    }
}
