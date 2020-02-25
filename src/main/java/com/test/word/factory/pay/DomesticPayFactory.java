package com.test.word.factory.pay;

/**
 * 国内支付
 */
public class DomesticPayFactory extends Pay  {

    @Override
    protected Collection createCollection(Class<? extends Collection> clazz)  {
        //判断选择哪个支付
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (o instanceof AliPayCollection) {
            return new AliPayCollection();
        }else if(o instanceof WePayCollection){
            return new WePayCollection();
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
        if (o instanceof AliPayCollection) {
            return new AliPayPayment();
        }else if(o instanceof WePayCollection){
            return new WePayPayment();
        }
        return null;
    }
}
