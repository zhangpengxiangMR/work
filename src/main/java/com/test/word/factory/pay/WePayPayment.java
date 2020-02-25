package com.test.word.factory.pay;

public class WePayPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("国内微信支付付款");
    }
}
