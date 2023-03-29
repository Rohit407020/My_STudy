package com.string;

import java.util.Arrays;

//WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "HELLO$WORLD";
//       String[] ns = s.split();
//       System.out.println(Arrays.toString(ns));
//       char ch[] = s.toCharArray();
       String ns ="";
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)=='$') {
    		 ns = s.replace("$", " ");
    		  
    		  
    	   }
    	  
       }
       String[] a = ns.split(" ");
       System.out.println(Arrays.toString(a));
     
	}

}
