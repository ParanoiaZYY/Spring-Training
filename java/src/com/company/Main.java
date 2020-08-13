package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 泛型Demo
     * @param args
     */
    public static void testT(String[] args) {
        Result<People> result = new Result<>();
        result.setReturnCode(200);
        result.setReturnMsg("创建成功");
        People people = new People("wqd1994", 26);
        result.setReturnData(people);
        System.out.println(result);
    }

    /**
     * 泛型Demo2
     * @param args
     */
    public static void testT2(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A001");
        list.add("A002");
        list.add("A003");
        System.out.println(list);
    }

    /**
     * 泛型通过extends限定T类型
     */
    public static void testTExtend(String[] args) {
        Pair<Integer> pair = new Pair<>();
        pair.setData(10);
    }


}
