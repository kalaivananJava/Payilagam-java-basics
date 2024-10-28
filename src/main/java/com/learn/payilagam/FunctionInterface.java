package com.learn.payilagam;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
public class FunctionInterface {
   public static void main(String[] args) {
    Function<String,Integer> f = (name) -> name.length();
    System.out.println(f.apply("Kalaivanan"));

    //forEach();
    List<Integer> ar =  Arrays.asList(1,2,3,4,5,6,78);
 // ar.forEach(n -> System.out.println(n));
   ar.forEach(new Consumer<Integer>(){
    public void accept(Integer i){
        System.out.println(i);
    }
   });


   }
    
  
}
