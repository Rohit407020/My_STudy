package com.encapsulation;
//Create a class named Person with private fields name, age, and address.
//Provide public getter and setter methods for each field.
//Then, create a Main class and use it to create an instance of Person,
//set its fields using the setters, and print the values using the getters.
public class Person {
    private String name;
    private int age;
    private String address;
    
    // for access need getter setter;
    
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
    }
    public String getAddress() {
    	return address;
    }
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String toString() {
    	return "Name :"+name+" Age :"+age+" Address :"+address;
    }
}
