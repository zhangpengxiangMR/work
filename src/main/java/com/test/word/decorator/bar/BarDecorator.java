package com.test.word.decorator.bar;

/**
 * 装饰器
 */
public  class BarDecorator extends Bar {

    private Bar bar;

    public BarDecorator(Bar bar) {
        this.bar = bar;
    }

    @Override
    protected String bar() {
        return this.bar.bar();
    }
}
