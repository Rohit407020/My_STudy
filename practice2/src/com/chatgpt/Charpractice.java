package com.chatgpt;

import java.util.Scanner;

public class Charpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter integer(q for quit)");
      
      int sum = 0;
      int count=0;
      
      while(scan.hasNextInt()) {
    	  int n = scan.nextInt();
    	  sum = sum+n;
    	  count++;
    	  System.out.println("Enter integer(q for quit)");
      }
      float avg = sum/count;
      System.out.println("Avrage = "+avg);
      
	}

}
