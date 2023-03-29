package com.encapsulation;
//Create a class named Student with private fields name, age, and grades (an array of integers).
//Provide public getter and setter methods for name and age, 
//but make grades private and only provide a public method addGrade to add a grade to the array. 
//Then, create a Main class and use it to create an instance of Student,
//set its name and age using the setters, add some grades using the addGrade method,
//and print the name, age, and average grade using the getters.
public class Student {
	private String name;
	private int age;
	private int s1;
	private int s2;
	private int s3;
	
	public Student() {
		
	}
	public Student(String name, int age, int s1, int s2, int s3) {
		
		this.name = name;
		this.age = age;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
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
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}


}
