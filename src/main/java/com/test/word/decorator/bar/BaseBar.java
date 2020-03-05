package com.test.word.decorator.bar;

/**
 * 标配
 */
public class BaseBar extends Bar {

    @Override
    protected String bar() {
        return "问答、文章、精品课、冒泡、商城";
    }
}
