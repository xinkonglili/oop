package com.jinli.oop.demo01;

public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo05.change(person);
        System.out.println(person.name);//jinli
    }

    public static void change(Person person){
        person.name = "jinli";
    }

}


class Person{
    String name;
}
