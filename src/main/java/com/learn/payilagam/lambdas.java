package com.learn.payilagam;

interface Contract{
    public int rule(int a,int b);
    public static void stat(){
System.out.println("static");
    }
    default void defs(){
System.out.println("default");
    }
}

// class Obey implements Contract{
//     public void rule(int a ,int b){
//         System.out.println("Obey rules");
//     }
// }
public class lambdas {
    public static void main(String[] args) {
       Contract ob = (a,b) -> a+b;
 System.out.println(ob.rule(10,20 ));

 Thread t=new Thread( () -> {
        System.out.println("hjk");
    }
 );
        t.start();

    //predicate
    


    } 
}
