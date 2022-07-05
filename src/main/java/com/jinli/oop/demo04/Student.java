package com.jinli.oop.demo04;

//继承：java中只有单继承，没有多继承；一个子类只有一个父类，但是一个父亲可以有多个儿子、女儿
//ctrl+h:可以查看继承关系
public class Student extends Person{
    public static void main(String[] args) {
        Student student = new Student();
        //如果子类没有重写父类的方法，那么就会调用父类的方法，因为子类会继承父类的所有的public的属性和方法
        student.setMoney(2000000000);
        System.out.println(student.getMoney());//2000000000
        //set方法要输出，不然不会显示
        student.setNameFirst("jin");
        System.out.println(student.getNameFirst());//jin
        student.makeMoney();

    }

    //子类重写父类的方法
    public void makeMoney(){
        System.out.println("我也有很强的商业头脑");
    }
}
