package com.encapsulation;

import java.util.Scanner;

public class StudentDetails {
    public static String grade(int s1,int s2, int s3) {
    	float total,per;
    	String mGrade = null;
    	total = s1+s2+s3;
    	per = (total/3)*100;
    	
    	if(per>80) {
    		mGrade = "A";
    	}
    	if(per>60) {
    		mGrade = "B";
    	}
    	else {
    		mGrade = "C";
    	}
    	return mGrade;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Name :");
		String name = scan.next();
		s1.setName(name);
		System.out.println("Enter Age :");
		int age = scan.nextInt();
		s1.setAge(age);
		System.out.println("Enter Subject 1 Marks :");
		int mark1 = scan.nextInt();
		s1.setS1(mark1);
		System.out.println("Enter Subject 2 Marks :");
		int mark2 = scan.nextInt();
		s1.setS2(mark2);
		System.out.println("Enter Subject 3 Marks :");
		int mark3 = scan.nextInt();
		s1.setS3(mark3);
		
		String g = grade(mark1,mark2,mark3);
		System.out.println(s1.toString()+" Grade: "+g);
	  
		
		
	}

}
