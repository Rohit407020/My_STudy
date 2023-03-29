package com.string;
//String create with new operator and without new
//2.	Compare string using == when we create without new see same reference is there
//3.	Compare string using new operator when new is present see different reference is there.
//Write a Java program to copy one string to another string.
public class StringCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "Rohit";
       String s2 = "Rohit";
       String s3 = new String("Rohit");
       
       System.out.println(s1==s2);
       System.out.println(s1 == s2);
       
       String ns = "";
       for(int i=0;i<s1.length();i++) {
    	   ns = ns + s1.charAt(i);
       }
       System.out.println(ns);
	}

}
