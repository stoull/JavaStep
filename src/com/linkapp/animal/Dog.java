package com.linkapp.animal;
public class Dog{
    public int dogAge;
    public int getAge(){
        System.out.println("The dog age :" + dogAge);
        return dogAge;
    }
    public void setAge(int age){
        dogAge = age;
    }
    
    public static void main (String[] args){
        Dog puddy = new Dog();
        puddy.setAge(25);
        int puddysAge = puddy.getAge();
    }
}
