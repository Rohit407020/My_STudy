package com.contentment;

public class Student {
	private int sRoll;
	private String name;
	private Course c;
	
	public Student(){
		
	}
	public Student(int sRoll, String name, Course c) {
		
		this.sRoll = sRoll;
		this.name = name;
		this.c = c;
	}
	public int getsRoll() {
		return sRoll;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [sRoll=" + sRoll + ", name=" + name + ", c=" + c + "]";
	}
	
	
}
