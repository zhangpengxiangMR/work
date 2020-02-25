package com.test.word.factory.pay;

public class Test {

    public static void main(String[] args) {
        Pay domesticPay = new DomesticPayFactory();
        Collection domesticCollection = domesticPay.createCollection(AliPayCollection.class);
        domesticCollection.collection();

        Pay foreignPayFactory = new ForeignPayFactory();
        Collection foreignCollection = foreignPayFactory.createCollection(ApplePayCollection.class);
        foreignCollection.collection();

    }

}
