package com.test.word.factory.pay;

public class AliPayPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("国内阿里支付付款");
    }
}
