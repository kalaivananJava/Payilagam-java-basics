package com.learn.payilagam;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Amr {
    // public  void display(int a);
    public void display();
}

public class MethodReference {
    public MethodReference(){
        System.out.println("construtor MR no args");
    }
    public MethodReference(int p){
        System.out.println("Consytructor Mr with args"+p);
    }
    public void show(int v){
        System.out.println(v);
    }
    public void sho(){
        System.out.println("sho");
    }
    public static void main(String[] args) {
       
        List<Integer> ar = Arrays.asList(12, 131, 123, 9, 11);
        ar.forEach(System.out::println);

        ar.forEach(MethodReference::prnt);
        
     //  A ob = a -> System.out.println(a);
        // MethodReference mr = new MethodReference();
//definition namma kudukrakku bathila namma kitta already irrukra method la irukkra definition kudutharrom.
    //    A ob =mr::show;
    //and also
    System.out.println("shoooo");
     Amr ob = new MethodReference()::sho;
     ob.display();
    //    ob.display(10); 

    // for static method reference calling.
    Amr staticMethodReference = MethodReference::d;
    staticMethodReference.display();
    Amr constructorMethodReference = MethodReference::new;
    constructorMethodReference.display();
    }

    public static void d(){
        System.out.println("static MR");
    }
    public static void prnt(Integer i){
        System.out.println(i);
    }

}
