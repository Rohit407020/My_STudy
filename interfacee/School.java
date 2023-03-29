package com.interfacee;

public class School implements Student,Teacher {
	@Override
	public void lecture() {
		System.out.println("Teacher in Lecture");
		
	}
	@Override
	public void grade() {
		System.out.println("Teacher Gives Grade");
		
	}
	@Override
	public void attemtclass() {
		System.out.println("Student Attempt Class");
		
	}
	@Override
	public void writehomework() {
		System.out.println("Student do homework");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        School s1 = new School();
        s1.attemtclass();
        s1.grade();
        
	}
	

}
