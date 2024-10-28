package com.learn.payilagam;



public class Employee {
    String name;
    int id,exp,salary;
    public Employee(String name, int id, int exp, int salary) {
        this.name = name;
        this.id = id;
        this.exp = exp;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    

}
