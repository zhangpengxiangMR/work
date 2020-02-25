package com.test.word.factory.pay;

public class WePayCollection implements Collection {
    @Override
    public void collection() {
        System.out.println("国内微信支付收款");
    }
}
