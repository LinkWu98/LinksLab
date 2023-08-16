package cn.link.swagger.newbie.common;

public class ResultBean {
    public static final Integer SUCCESS_CODE = 200;
    public static final Integer VALID_FAILD = 400;
    public static final Integer ERROR_UNKNOWN = 900;
    public static final Integer ERROR_DB = 901;
    private Integer resultCode;
    private String errMsg;
    private long elapsedMilliseconds;

    public ResultBean() {
    }

    public ResultBean(Integer resultCode, String errMsg) {
        this.resultCode = resultCode;
        this.errMsg = errMsg;
    }

    public long getElapsedMilliseconds() {
        return this.elapsedMilliseconds;
    }

    public void setElapsedMilliseconds(long elapsedMilliseconds) {
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public Integer getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
