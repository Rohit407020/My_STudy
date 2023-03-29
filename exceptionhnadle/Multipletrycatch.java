package com.exceptionhnadle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multipletrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size");
        try {
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter Element");
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
        	arr[i] = scan.nextInt();
        	sum = sum + arr[i];
        }
        System.out.println(sum);
        }
        catch(ArithmeticException e) {
        	System.out.println(e.getClass());
        	System.out.println(e.getMessage());
        	
        }
        catch(InputMismatchException e) {
        	System.out.println(e.getClass());
        	System.out.println(e.getMessage());
        	System.out.println(e.getCause());
        }
	}

}
