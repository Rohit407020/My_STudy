package com.practice;
import java.util.*;
public class factori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = scan.nextInt();
     //5! = 1x2x3x4x5
     int fact =1;
     int i = 1;
     while(num>=i) {
    	 fact =fact*i;
    	i++;
     }
     System.out.println(fact);
	}

}
