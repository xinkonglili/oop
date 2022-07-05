package com.jinli.oop.demo05;

public class Person {
    protected String name = "jinli";
    int age;
    Person(){
        System.out.println("父类构造方法被调用了");
    }
    Person(String name){
        System.out.println("重载的父类构造方法被调用了");
    }

    /*
    //子类无法通过super关键字调用父类的私有方法，但是子类是默认继承父类所有的方法和属性，包括私有的；
    //私有的属性可以通过set和get方法获得，但是私有的方法如何获得，要通过反射
    private void print(){
        System.out.println("Person");
    }*/

    public void print(){
        System.out.println("Person");
    }
}
