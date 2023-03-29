package com.arraycontentment;

import java.util.Arrays;

public class Student {
  
	private int id;
	private String name;
	private int marks[];
	private Course c;
	
	    Student(){
	    	
	    }
	    Student(int id,String name,int[] marks,Course c){
	    	this.id = id;
	    	this.name = name;
	    	this.marks = marks;
	    }
	
	
	
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int[] getMarks() {
			return marks;
		}
		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		public Course getC() {
			return c;
		}
		public void setC(Course c) {
			this.c = c;
		}
		//to string
		
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", c=" + c + "]";
		}
		
		

		
		
	  
}
