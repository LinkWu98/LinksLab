package cn.link.swagger.utils;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void test(){

    }
}
