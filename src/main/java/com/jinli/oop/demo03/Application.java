package com.jinli.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setMoney(10000000);
        p1.setAge(22);
        System.out.println(p1.getMoney()+ " "+p1.getAge());

    }
}
