package com.linkapp.person;
public class Employee {
    public int age;
    public String name;
    public String destination;
    public double salary;
    
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void printEmployee(){
        System.out.println("Age :" + age);
        System.out.println("Nam :" + name);
        System.out.println("des :" + destination);
        System.out.println("sal :" + salary);
    }
}
