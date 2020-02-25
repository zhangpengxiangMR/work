package com.test.word.factory.pay;

public class ApplePayPayment implements Payment {
    @Override
    public void payment() {
        System.out.println("国外苹果支付付款");
    }
}
