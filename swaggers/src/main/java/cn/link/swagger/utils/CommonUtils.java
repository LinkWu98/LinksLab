package cn.link.swagger.utils;

import cn.hutool.core.util.ObjectUtil;

import java.util.Collections;
import java.util.List;

public class CommonUtils {

    public static <T> List<T> manualPagination(List<T> pageRecords, long pageNum, long pageSize) {
        if (ObjectUtil.isEmpty(pageRecords) || pageSize <= 0 || pageNum <= 0) {
            return Collections.emptyList();
        }

        long startIndex = (pageNum - 1) * pageSize;
        long endIndex = Math.min(startIndex + pageSize, pageRecords.size());

        //超过边界
        if (startIndex > pageRecords.size() - 1) {
            return Collections.emptyList();
        }

        return pageRecords.subList(Long.valueOf(startIndex).intValue(), Long.valueOf(endIndex).intValue());
    }

}
