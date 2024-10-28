package com.learn.payilagam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A{
    default void a(){
        System.out.println("A");
    }
    public static void stats(){
        System.out.println("stats");
    }
}
interface B{
    default void a(){
        System.out.println("B");
    }
    public static void stats(){

    }
}
public class defs implements A,B{
    public void a(){
        System.out.println("defs");
    }
    public static void main(String[] args) {
        defs ob = new defs();
        ob.a();   


       List<Integer> al = Arrays.asList(10,12,12,778,1111);

       al.forEach(i -> {System.out.println(i*2);});

    }
}
