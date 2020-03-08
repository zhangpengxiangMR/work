package com.test.word.composite.work;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Systems{

    private List<Systems> systemList;

    private Integer level;

    public Menu(String name,Integer level) {
        super(name);
        this.level = level;
        systemList = new ArrayList<>();
    }


    @Override
    public void show() {
        System.out.println(this.name);
        for (Systems systems :systemList) {
            if(this.level != null ){
                for (int i = 0;i < this.level;i++) {
                    System.out.print("      ");
                }
            }
            systems.show();
        }
    }

    public void add(Systems systems){
        this.systemList.add(systems);
    }

    public void remove(Systems systems){
        this.systemList.remove(systems);
    }

}
