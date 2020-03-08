package com.test.word.composite.work;

public class Test {

    public static void main(String[] args) {
        Features features1 = new Features("动态");
        Features features2 = new Features("回答");
        Features features3 = new Features("提问");
        Features features4 = new Features("文章");
        Features features5 = new Features("题库");


        Menu menu1 = new Menu("问答",2);
        Menu menu2 = new Menu("文章",2);
        Menu menu3 = new Menu("作业",2);
        Menu menu4 = new Menu("题库",2);
        Menu menu5 = new Menu("成长墙",2);

        Menu systems = new Menu("咕泡https://gper.club/",1);

        menu3.add(features1);
        menu3.add(features2);
        menu3.add(features3);
        menu3.add(features4);
        menu3.add(features5);

        systems.add(menu1);
        systems.add(menu2);
        systems.add(menu3);
        systems.add(menu4);
        systems.add(menu5);

        systems.show();
    }
}
