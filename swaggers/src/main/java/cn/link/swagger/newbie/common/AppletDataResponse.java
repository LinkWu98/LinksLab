package cn.link.swagger.newbie.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author GuoXuanLe
 * @date 2022年03月30日 9:45
 */
@ApiModel(value = "AppletDataResponse", description = "直售响应对象")
public class AppletDataResponse {
    @ApiModelProperty(value = "code 0-更新成功 1-更新失败")
    private int returnCode;
    @ApiModelProperty(value = "消息 更新成功/更新失败")
    private String returnMessage;

    public AppletDataResponse(int returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }
}
