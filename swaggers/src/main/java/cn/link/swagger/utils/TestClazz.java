package cn.link.swagger.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.link.swagger.newbie.retail.CompetitorDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestClazz {

    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            objects.add(i+"");
        }
        List<String> strings = CommonUtils.manualPagination(objects, 1, 10);
        System.out.println(strings);
    }

    @Test
    public void test() {
        Integer a = 70961001;
        Map<String, String> tcCodeMap = new HashMap<>();
        tcCodeMap.put("70961001", "退款受理");
        tcCodeMap.put("70961002", "退款中");
        tcCodeMap.put("10041001", "是");
        tcCodeMap.put("10041002", "否");
        //设置是否支付定金
            if(Objects.nonNull(a)){
                String isDepositStr;
                System.out.println((ObjectUtil.isEmpty(isDepositStr = tcCodeMap.get(a.toString()))
                        //写死的字典
                        ? (a == 10421008 ? "未付意向金" : "已付意向金")
                        : isDepositStr));
            }
    }
}
