package com.test.word.decorator.bar;

/**
 * 具体装饰器
 */
public class LoginDecorator extends BarDecorator {

    public LoginDecorator(Bar bar) {
        super(bar);
    }

    @Override
    protected String bar() {
        return super.bar() + "、作业、题库、成长墙";
    }
}
