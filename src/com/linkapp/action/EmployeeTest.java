package com.linkapp.action;
import com.linkapp.animal.*;
import com.linkapp.person.*;
public class EmployeeTest {
    public static void main (String agrs[]){
        Employee xiao = new Employee("xiao", 25);
        Employee zhao = new Employee("Zhao", 45);
        
        xiao.destination = "Clerk";
        xiao.salary = 65.0;
        
        zhao.destination = "Manager";
        zhao.salary = 12.30;
        
        xiao.printEmployee();
        zhao.printEmployee();
        
        Dog buddy = new Dog();
        buddy.setAge(20);
        System.out.println("Buddy : " + buddy.dogAge);
        System.out.println("Buddy is a Dog!!");
    }
}
