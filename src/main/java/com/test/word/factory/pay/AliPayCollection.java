package com.test.word.factory.pay;

public class AliPayCollection implements Collection {
    @Override
    public void collection() {
        System.out.println("国内阿里支付收款");
    }
}
