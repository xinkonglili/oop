package com.jinli.oop.demo06;

/*多态可以让程序变的更加灵活：
1、同一个方法可以根据发送对象的不同而产生不同的行为方式；
2、 一个对象的实际类型是确定的，但是指向这个对象的引用类型可以有很多
3、instanceof关键字用来测试，左边的对象是否是它右边类的实例
*/

/*
多态之所以存在就是因为方法重写，没有方法的重写，哪里来的多态呢
1、被final修饰的无法重写
2、私有的方法也不能重写
3、static方法也不能重写，因为该方法是属于类的
*/
public class Application {
    public static void main(String[] args) {
        //1、new对象的实际类型是确定的
        //new Student()
        //new Person()

        Student s1 = new Student();
        Person s2 = new Student();//父类的引用指向子类的对象
        Object s3 = new Student();
        /*
         *1、父类Person里面没有eat方法，但是子类里面有eat方法，父类类型的对象调用eat方法的时候需要强制转换成子类的对象
         * 2、对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
         * 3、父类型可以指向子类，但是不能调用子类的独有的方法,如果要调用的话，需要强转成子类型
         * 4、如果子类和父类都有相同的方法，那么调用的是子类的方法
         * */

        s1.run();//Son run
        s2.run();// Son run   父类的引用指向子类的对象，但是父类和子类都有run方法，那么调用的就是子类的run方法


        ((Student) s2).eat();
        s1.eat();

    }
}
