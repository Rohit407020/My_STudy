package com.customer;
import java.util.*;
public class Customertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
       Customer c1 = new Customer();
       System.out.println("Enter a Customer Id");
       int id = scan.nextInt();
       c1.setCid(id);
       System.out.println("Enter a Customer Name");
       String n = scan.next();
       c1.setName(n);
       System.out.println("Enter a Customer Phone Number");
       String ph = scan.next();
       c1.setPhoneNumber(ph);
       System.out.println("Do You Purchase Any Item (1 -y/0 -n)");
       int q = scan.nextInt();
       
       if(q == 1) {
    	   System.out.println("Enter Item Name");
    	   String in = scan.next();
    	   c1.setItemName(in);
    	   System.out.println("Enter Price");
    	   float p = scan.nextFloat();
    	   c1.setPrice(p);
    	   
    	   System.out.println("Do you want to payment right now 1 -y / 0-n");
    	   System.out.println("Full Payment / Emi");
    	   String ans = scan.next();
    	      		  
        	 
        	   c1.setStatus(ans);
        	   System.out.println(c1.toString()); 
    	   }
       else {
    	  System.out.println(c1.toString()); 
    	  
       }
       
       
	}

}
