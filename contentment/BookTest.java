package com.contentment;

import java.util.Scanner;

public class BookTest {
	static Scanner scan = new Scanner(System.in);
//    public static void addbook(BookArray[] b1) {
//    	for(int i=0;i<b1.length;i++) {
//    		System.out.println("Enter  Book Id");
//        	int bid = scan.nextInt();
//        	b1[i].setBId(i);
//	    	System.out.println("Enter  Book Name");
//	    	String bk1 = scan.next();
//	    	b1[i].setBName(bk1);
//    	}
//    	
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AuthorArray a1 = new AuthorArray(101,"Leomord");
     
     BookArray[] b1 = new BookArray[3]; //array create
      for(int i=0;i<b1.length;i++) {
    	
//    	  addbook(b1);
    	  System.out.println("Enter  Book Id");
      	int bid = scan.nextInt();
      	
	    	System.out.println("Enter  Book Name");
	    	String bk1 = scan.next();
	    	
	    	
	    	BookArray b = new BookArray(bid,bk1,a1);
	    	b1[i] = b;
      }
      for(int i=0;i<b1.length;i++) {
    	  System.out.println(b1[i].toString());
      }
      
      
      
	}

}
