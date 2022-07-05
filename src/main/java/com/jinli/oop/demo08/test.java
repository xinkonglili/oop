package com.jinli.oop.demo08;

import static java.lang.Math.ceil;
/*
* 接口：
* 1、接口可以多继承，一个实现类可以实现（implements）多个接口（一个儿子可以有多个爸爸）
* 2、接口中只能定义约束，不能写方法的具体实现
* 3、接口中默认的方法都是public abstract，默认的常量都是public static final(一般不在接口中定义常量)
* 4、接口不能被实例化，因为它没有构造方法
* 5、锻炼抽象的思维
*
* */
public class test implements Customer,User{
    public static void main(String[] args) {
        test t1 = new test();
        /*  1
            buy
            pay
            backGood
            compare
            3*/
        System.out.println(t1.avg(1,2));
        t1.buy();
        t1.pay();
        t1.backGood();
        t1.compare();
        System.out.println(t1.sum(1,2));


    }
    @Override
    public void buy() {
        System.out.println("buy");
    }

    @Override
    public void pay() {
        System.out.println("pay");
    }

    @Override
    public void backGood() {
        System.out.println("backGood");
    }

    @Override
    public void compare() {
        System.out.println("compare");
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int avg(int c, int d) {
        return (int) ceil((c+d)/2);
    }
}
