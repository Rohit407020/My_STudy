package com.exceptionhnadle;

public class HandleExcceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 10;
		int b = 0;    // b = 2;
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Not divede by zero");
		}
		System.out.println("Done");
		
		// e refferance 

	}

}
