package com.jinli.oop.demo06;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Son run");
    }

    public void eat(){
        System.out.println("Son eat");
    }
}
