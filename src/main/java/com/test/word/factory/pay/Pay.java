package com.test.word.factory.pay;

public abstract class Pay {


    public void init() {
        System.out.println("基础数据");
    }

    protected abstract  Collection createCollection(Class<? extends Collection> clazz);

    protected abstract Payment createPayment(Class<? extends Payment> clazz);

}
