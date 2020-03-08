package com.test.word.composite.work;

public class Features extends Systems {


    public Features(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
