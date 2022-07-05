package com.jinli.oop.demo05;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        /*
        1、子类继承父类，优先调用父类的构造方法
         *  父类构造方法被调用了
            子类构造方法被调用了
            Student
            Student
            Person */
        //student.test();
        student.test1("瑾里");

    }
}
