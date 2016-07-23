package com.omen.listview01;

/**
 * Created by Administrator on 2016/7/23.
 */


public class Student {
    private String name="";
    private String sex="女";
    private int age=0;
    public Student(String name, String sex, int age) {
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*重写其父类（Object）的toString方法*/
    /*一个类如果它没有直接继承某个具体的类，其父类就是Object*/
    @Override
    public String toString() {
        return name;
    }
}
