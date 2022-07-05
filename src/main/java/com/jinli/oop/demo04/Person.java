package com.jinli.oop.demo04;

public class Person {
    private long money = 100000000;
    private String nameFirst;

    public void setMoney(long money){
        this.money = money;
    }

    public long  getMoney(){
        return money;
    }

    public void setNameFirst(String nameFirst){
        this.nameFirst = nameFirst;
    }

    public String getNameFirst(){
        return nameFirst;
    }



    public void makeMoney(){
        System.out.println("父亲有很强的商业头脑");
    }
}
