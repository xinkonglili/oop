package com.jinli.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {
        //静态方法:可以直接通过类名调用
        Students.sleep();
        //非静态方法：不可以直接通过类名调用，就要实例化对象，通过对象去调用
        Students s1 = new Students();
        s1.say();
        s1.sleep();

    }



    //-------------1、static调用非static方法---出错-----------------
    //static方法是跟着类一起加载的
    public static void a(){
        //b(); //出错
    }
    //是跟着对象一起加载的，static修饰的方法去调用非static方法是会出错的
    public void b(){

    }



    //-------------2、非static调用非static方法-----ok------------
    public void c(){
        d();
    }
    public void d(){
        c();
    }

    //-------------3、static调用static方法-----ok------------
    public static void e(){
        f();
    }

    public static void f(){
        e();
    }

    //静态方法


    //非静态方法
}
