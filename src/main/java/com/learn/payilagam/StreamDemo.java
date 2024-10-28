package com.learn.payilagam;

import java.util.ArrayList;

public class StreamDemo {
       public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Employee e1 =new Employee("Raja",101,5,50000);
        Employee e2 =new Employee("BAla",102,7,70000);
        Employee e3 =new Employee("Rani",103,2,30000);
        
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        empList.stream().map(emp -> emp.getName()).forEach(System.out::println);
        System.out.println("----------------------------");
        empList.stream().filter(emp -> emp.getSalary()>40000).map(n -> n.getName())
        .forEach(System.out::println);

        




    }
}
