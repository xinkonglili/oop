package com.jinli.oop.demo01;

import java.io.IOException;

//一个类里面有很多方法
public class Demo01 {
    public static void main(String[] args) {

    }
    /*修饰符 返回值类型 方法名(参数列表){
    方法体;
    return 返回值；
    }*/
    public String hello01(){
        return "hello,world";
    }

    public void hello(){
        return; //方法的返回值类型为void，直接return
    }

    public int min(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public boolean max(int a,int b){
        boolean target = true;
        if(a<b){
            return true;
        }else{
            return false;
        }
    }

   //arrayindexoutofbounds
    public void readFile(String File) throws IOException {

    }
}
