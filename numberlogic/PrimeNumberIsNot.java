package com.numberlogic;

public class PrimeNumberIsNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 11;
       int flag = 0;
       if(n == 1 || n == 2) {
    	   System.out.println("Not Prime");
       }
       for(int i=2; i<=n/2;i++) {
    	   if(n%i == 0) {
    		   flag = 1;
    		   break;
    	   }
       }
       if(flag == 0) {
    	   System.out.println(n+" is prime");
       }
       else {
    	   System.out.println(n+" not prime");
       }
	}

}
