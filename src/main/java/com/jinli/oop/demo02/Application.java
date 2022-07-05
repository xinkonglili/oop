package com.jinli.oop.demo02;

public class Application {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "jinli";
        s1.age = 22;
        s2.name = "jinli01";
        s2.age = 18;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);*/


        Person p1 = new Person("oo",22);
        //调用的是有参构造器
        System.out.println(p1.name +"  "+p1.age ); //oo  22
        Person p2 = new Person();
        System.out.println(p2.name);//null,调用的是无参构造器



    }
}
