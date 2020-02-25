package com.test.word.factory.pay;

public class ApplePayCollection implements Collection {
    @Override
    public void collection() {
        System.out.println("国外苹果支付收款");
    }
}
