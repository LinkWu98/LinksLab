package cn.link.swagger.newbie.retail.importClazz;

public class DataImportDto {
    private Integer rowNO;
    private String errorMsg;

    public DataImportDto() {
    }

    public Integer getRowNO() {
        return this.rowNO;
    }

    public void setRowNO(Integer rowNO) {
        this.rowNO = rowNO;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
