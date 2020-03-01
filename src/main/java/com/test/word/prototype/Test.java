package com.test.word.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ConcretPrototype concretPrototype = new ConcretPrototype();
        concretPrototype.setName("张鹏祥");
        concretPrototype.setAge(18);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        concretPrototype.setList(list);

        ConcretPrototype clone = concretPrototype.deepCloneJSON();
        clone.getList().add("3");
        System.out.println("克隆对象：" +clone);
        System.out.println("原对象：" +concretPrototype);
        System.out.println(concretPrototype == clone);
        System.out.println(concretPrototype.getList() == clone.getList());
    }

}
