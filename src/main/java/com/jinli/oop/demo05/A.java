package com.jinli.oop.demo05;

//重写都是方法的重写，和属性无关
public class A extends B{
    //写个方法
    /*public static void test(){
        System.out.println("A-->test");
    }*/

    @Override
    public void test() {
        System.out.println("A--->test");
    }
}
