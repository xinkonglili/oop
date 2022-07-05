package com.jinli.oop.demo01;

public class Demo04 {
    //值传递
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a:"+a);//a:10
        Demo04.change(a);
        System.out.println("a:"+a);// a:10

    }
    public static void change(int a){
        a = 100;
    }
}
