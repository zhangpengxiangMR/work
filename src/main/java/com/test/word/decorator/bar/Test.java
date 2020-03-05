package com.test.word.decorator.bar;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Bar bar;
        bar = new BaseBar();
        bar = new LoginDecorator(bar);
        System.out.println(bar.bar());
    }

}
