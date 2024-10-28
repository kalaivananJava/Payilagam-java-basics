package com.learn.payilagam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamsss {
    public static void loop(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int[] ar = { 10, 2, 3, 2, 1, 90 };
        System.out.println(ar.length);
       System.out.println( Arrays.stream(ar).sum());

       System.out.println("----------------");
        // Stream code to count
        // IntStream s = Arrays.stream(ar);
       // long l = s.count();
        // System.out.println(l);
      //stream sort
        //  s=s.sorted();
        //  s.forEach(System.out::println);
       //real stream code
       Arrays.stream(ar)//Intermediate operation
       .sorted()//Intermediate operations
       .forEach(System.out::println);//Terminal operations
       System.out.println(Arrays.stream(ar).count());
       
       //to find average in stream ,it produces optionalDouble[answer]
       OptionalDouble od =Arrays.stream(ar).average();
       System.out.println(od.getAsDouble());

       //to find max value
       OptionalInt oi= Arrays.stream(ar).max();
       System.out.println(oi.getAsInt());

       //to find min
       OptionalInt oii=Arrays.stream(ar).min();
        System.out.println(oii.getAsInt());

        //to find firstVAlue n array
        OptionalInt fst=Arrays.stream(ar).findFirst();
        System.out.println(fst.getAsInt());

        //to give random number in array
        System.out.println("findAny()");
        OptionalInt fr =Arrays.stream(ar).findAny();
        System.out.println(fr.getAsInt());

        //to find arr count 
        long cnt =Arrays.stream(ar).count();
        System.out.println(cnt);

        //to find unique elements in array
        Arrays.stream(ar).distinct().forEach(System.out::println);

        //filter records filter take predicate object so return true or false 
        // to find even numbers
        Arrays.stream(ar).filter(i -> i%2==0).forEach(System.out::println);

        // Streams in collection

        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
       
        // to find count 
        System.out.println(l.stream().count());

        //to find unique values;
       l.stream().distinct().forEach(System.out::println);
       
    // to find sorted and unique values
      l.stream().distinct().sorted().forEach(System.out::println);
  
    //for custom ordering we have comparator interface
    System.out.println("Stream sorting ");
    List<String> ls=Arrays.asList("abcdefgh","bcdeccccccc","efghqqqqqq","cdsdsdvdef","dxyz","eqrs");
    // ls.stream().sorted((s1,s2) ->{ if(s1.length() == s2.length())return 0;
    //     else if(s1.length() > s2.length())return -1;
    //     return 1;
    // }
    // ).forEach(System.out::println);
    ls.stream().sorted((s1,s2) -> s2.length()-s1.length()).forEach(System.out::println);
   //ascending order also => ls.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);
ls.stream().sorted().forEach(System.out::println);


//Descending order also =>
System.out.println("mr");
 ls.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(Streamsss::loop);

//Map in stream
ls.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
System.out.println("MAps");
List<Integer> ml= Arrays.asList(10,20,30,40);
ml.stream().map(n -> n/2)
.forEach(System.out::println);

List<String> mS=Arrays.asList("Kavin","Viyan","Arul");

mS.stream().map(n ->n+" B.E..,").forEach(System.out::println);

mS.stream().map(n -> n.toLowerCase()).forEach(System.out::println);
  HashSet<Integer> hs = new HashSet<>();
  hs.add(10);
  hs.add(20);
  hs.add(30);
  hs.add(40);
  hs.add(50);
  //takes limited value
l.stream().limit(3).forEach(System.out::println);
//skips value
l.stream().skip(2).forEach(System.out::println);
//limit 3 and skip 1
l.stream().limit(3).skip(1).forEach(System.out::println);

//terminal operations
//to find total
Optional<Integer> res=l.stream().reduce((n1,n2)->n1+n2);
System.out.println(res.get());

//to convert arraylist to arrays
 Object[] ob= l.stream().toArray();
 for(Object o:ob){System.out.println(o);}

 // to get max value of arrayList
 Optional<Integer> result=l.stream().max((e1,e2) -> e1.compareTo(e2));
 System.out.println(result.get());

 l.stream().forEach(System.out::println);
 l.stream().forEachOrdered(System.out::println);

 l.stream().isParallel();
 l.stream().parallel().forEachOrdered(System.out::println);

 HashMap<String,Integer> hm = new HashMap<>();
 hm.put("C Viyan", 100);
 hm.put("A kavin",200);
 hm.put("B Iyal",300);
 hm.put("D Pari",123);
 System.out.println("map");
 hm.keySet().stream().forEach(System.out::println);
 System.out.println("map2");
hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
System.out.println("map3");
hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//to convert keyset to arrayList
List<String> lst_Str=hm.keySet().stream().collect(Collectors.toList());
// to 
// hm.entrySetSet().stream().collect(Collectors.)
//
//  lst_Str.stream().anyMatch((name -> name.endsWith("n"))).forEach(System.out::println);
    }

}
