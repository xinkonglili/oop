package com.jinli.oop.demo05;

public class Student extends Person{

    private String name = "oo";
    Student(){
        //super();//必须放到第一行，这里会默认调用父类的构造方法，如果父类的构造方法被重载了，那么super就要显示的调用
        super("pp");//调用的是父类重载的构造方法
        //this(); 子类调用自己的有参构造器，也必须放到第一行,会与super()冲突
        System.out.println("子类构造方法被调用了");
    }

    Student(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Student");
    }

    public void test(){
        print();//Student
        this.print();//Student
        super.print();//Person
    }

    public void test1(String name){
        System.out.println(name);//瑾里
        System.out.println(this.name);//oo
        System.out.println(super.name);//jinli
    }
}
