package com.jinli.oop.demo02;

public class Person {
   /* 1、new对象的本质就是在调用无参构造器，无参构造器和类名相同，并且没有返回值
    2、无参构造器是默认就有的，但是如果重载了构造器，无参构造器就要显示设置*/

    String name;
    int age;

    Person(){
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }


}
