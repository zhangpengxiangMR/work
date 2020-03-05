package com.test.word.proxy.cilent;

public class Dog implements Animal {

    @Override
    public void findlove(String name,String names,int age,int ages) {
        System.out.println("狗在找对象" +name +"-" +names + "-" +age+ "-" + ages);
    }
}
