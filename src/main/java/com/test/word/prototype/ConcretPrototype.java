package com.test.word.prototype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;

/**
 * 简单的原型模式
 */
public class ConcretPrototype implements Iprototype,Cloneable,Serializable {



    private int age;

    private String name;

    private List<String> list;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 浅克隆
     * @return
     */
    @Override
    public ConcretPrototype clone() {
        try {
            return (ConcretPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("异常.....");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆
     * @return
     */
    public ConcretPrototype deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos= new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ConcretPrototype)ois.readObject();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretPrototype deepCloneJSON(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(this);
            return mapper.readValue(jsonString, ConcretPrototype.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretPrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
