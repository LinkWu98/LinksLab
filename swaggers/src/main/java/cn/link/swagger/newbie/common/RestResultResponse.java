//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.common;

public class RestResultResponse<T> extends ResultBean {
    T data;
    boolean success;

    public RestResultResponse() {
    }

    public RestResultResponse(Integer resultCode, String errMsg) {
        this.setResultCode(resultCode);
        this.setErrMsg(errMsg);
        this.setSuccess(false);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public RestResultResponse success(boolean success) {
        this.setSuccess(success);
        return this;
    }

    public RestResultResponse data(T data) {
        this.setResultCode(200);
        this.setSuccess(true);
        this.setData(data);
        return this;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
