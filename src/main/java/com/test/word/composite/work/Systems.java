package com.test.word.composite.work;

/**
 * 抽象根节点
 */
public abstract class Systems {

    protected String name;

    public Systems(String name) {
        this.name = name;
    }

    public abstract void show();
}
