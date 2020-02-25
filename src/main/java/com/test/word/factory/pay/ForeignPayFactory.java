package com.test.word.factory.pay;

/**
 * 国外支付
 */
public class ForeignPayFactory extends Pay {
    @Override
    protected Collection createCollection(Class<? extends Collection> clazz) {
        //判断选择哪个支付
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (o instanceof ApplePayCollection) {
            return new ApplePayCollection();
        }
        return null;
    }

    @Override
    protected Payment createPayment(Class<? extends Payment> clazz) {
        //判断选择哪个支付
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (o instanceof ApplePayPayment) {
            return new ApplePayPayment();
        }
        return null;
    }
}
