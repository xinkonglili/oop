package com.jinli.oop.demo03;

//封装：属性私有，set/get
public class Person {
    private int money;
    private int age;

    public void setMoney(int money){
        this.money = money;

    }

    public int getMoney(){
        return money;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


}
