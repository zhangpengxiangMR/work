package com.test.word.proxy.test.cilent;


public class Zhangsan implements IPerson {
    @Override
    public void findlove(byte a, short b, int c, long d, float e, double f, char g, boolean h) {
        System.out.println("张三找对象"+ a + "----" + b +"----" + c +"----" +d +"----" + e + "----" + f + "----" + g + "-----" + h);
    }

    @Override
    public void buyInsure(String name,String names,int age,int ages) {
        System.out.println("100W" + name + "----" + names +"----" + age +"----" +ages);
    }
}
