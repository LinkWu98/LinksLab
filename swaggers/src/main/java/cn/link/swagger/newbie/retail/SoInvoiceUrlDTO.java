package cn.link.swagger.newbie.retail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 开票登记文件地址DTO - PC订单服务附件通用DTO
 *
 * @author Tansj
 * @since 16:00 2019-12-18
 */
@ApiModel(value = "SoInvoiceUrlDTO", description = "开票登记文件地址DTO - PC订单服务附件通用DTO")
public class SoInvoiceUrlDTO implements Serializable {

    @ApiModelProperty(value = "文件名称")
    private String name;

    @ApiModelProperty(value = "文件状态")
    private String status;

    @ApiModelProperty(value = "文件地址")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SoInvoiceUrlDTO{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
