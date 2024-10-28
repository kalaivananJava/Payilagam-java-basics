package com.learn.payilagam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateInterface //implements Predicate<Integer>
{

    // public boolean test(Integer age){
    //     return age>60;
    // }
    public static void main(String[] args) {
         
    //    ticket_booking tb=new ticket_booking();
    //    tb.test(60);

    // and also
    // Predicate<Integer> aC=new Predicate<Integer>() {
    //     public boolean test(Integer age){
    //     return age>60;
    // }
    // };
        Predicate<Integer> ob = age -> age>60;
        System.out.println(ob.test(65));

        Predicate<String> name=n -> (n.length()>5);
        System.out.println(name.test("Kalaivanan"));

        ArrayList<Integer> al = new ArrayList<Integer>();
        Predicate<Collection> aL= aa -> aa.size()>0;
        System.out.println(aL.test(al));
         

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Predicate<Integer> arrr=i -> (i%2==0);

        for(int i=0;i<arr.length;i++){
           System.out.println( arrr.test(arr[i]));
        }
     Predicate<Integer> obb=i -> i%2!=0;
       check(obb.negate(),arr);

    }

    private static void check(Predicate<Integer> ob,int arr[]) {
        boolean r;
        for(int i=0;i<arr.length;i++){
            r=ob.test(arr[i]);
            if(r==true){
                System.out.println(arr[i]);
            }
            
         }
    } 
   
}
