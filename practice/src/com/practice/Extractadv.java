package com.practice;
import java.util.*;
public class Extractadv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       /// n = 123456
       int sum = 0;
       while(n!=0) {
    	   int r = n%10;
    	   n = n/10;
    	   if(n%2 == 0) {
    		   System.out.println(r);
    		   
    		   sum = sum + r;
    	   
    	   }
       }
       
	}

}
