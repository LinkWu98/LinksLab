//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.link.swagger.newbie.retail.importClazz;

import java.util.List;

public class ImportResultDto<T extends DataImportDto> {
    private static final long serialVersionUID = -5294248904920920280L;
    private boolean isSucess;
    private List<T> dataList;
    private List<T> errorList;

    public ImportResultDto() {
    }

    public boolean isSucess() {
        return this.isSucess;
    }

    public void setSucess(boolean isSucess) {
        this.isSucess = isSucess;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public List<T> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<T> errorList) {
        this.errorList = errorList;
    }
}
