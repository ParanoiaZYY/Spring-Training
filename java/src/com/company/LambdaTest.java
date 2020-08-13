package com.company;

import java.util.function.Function;

public class LambdaTest {

    public static void main(String[] args) {
        Function<People, String> function = People::getName;

        People people = new People("wqd1994", 26);

        String name = function.apply(people);

        BigFun
    }
}
