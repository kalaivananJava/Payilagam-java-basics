package com.learn.payilagam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
class Person{
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    };

    
}
public class Training {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35),
                new Person("David", 40),
                new Person("Eve", 45),
                new Person("Frank", 50),
                new Person("Grace", 55),
                new Person("Henry", 60),
                new Person("Isaac", 65),
                new Person("John", 70)
        );

        // Stream<Person> nameendsWithe = persons.stream().filter(x->x.getName().endsWith("e"));
        // nameendsWithe.filter(x->x.getAge()>50).map(n -> n.getName())
        // .forEach(System.out::println);

        persons.stream().filter(n -> n.getName().endsWith("e")).filter(a -> a.getAge()>30).map(name -> name.getName())
        .forEach(System.out::println);
        System.out.println("-----------------------");
        
        persons.stream().max(Comparator.comparing(Person::getName)).ifPresent(System.out::println);
        

    }
}
