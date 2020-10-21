package com.wow.tast;

import java.util.function.Consumer;

public class MyFunctionTest {

    // 测试了一下 函数式接口传参的方法
    private static void doTest(Consumer<String> fun){
        String tes= "HHHHH";
        //这里 accept 会调用传入方法的 内部方法， 比如 传入的testFun 的 test(a,a,a) 方法
        fun.accept(tes);
    }

    private static void test(String a,String b,String c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        String b = "1";
        String c = "2";
        Consumer<String> testFun = (param) -> test((String) param, b, c);
        doTest(testFun);
    }
}
