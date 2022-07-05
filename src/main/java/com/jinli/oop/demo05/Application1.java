package com.jinli.oop.demo05;

public class Application1 {
    public static void main(String[] args) {
        /*// 静态方法的调用只和左边定义的数据类型有关
        A a = new A();
        a.test();//A-->test

        //父类的引用指向子类的对象
        B b = new A();
        b.test();//B--->test*/

        //非静态方法的调用和对象有关，静态方法是跟着对象加载的,结果都是调用new出来的对象的方法
        //非静态：重写 重写的方法必须是public，不能是private
        //重写要有父子关系，只能重写方法，不能重写属性
        A a = new A();
        a.test();//A--->test

        B b = new A();
        b.test();//A--->test

    }

}
