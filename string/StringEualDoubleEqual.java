package com.string;

public class StringEualDoubleEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Java";
        String s2 = "Java";
        
        if(s1==s2) {
        	System.out.println("Equal ");
        }
        if(s1.equals(s2)) {
        	System.out.println("Equal");
        }
        //
        String s3 = new String("Java");
        String s4 = new String("Java");
        
        if(s3.equals(s4)) {
        	System.out.println("equal");
        }
        if(s3==s4) {
        	System.out.println("double qual true");
        }
        else {
        	System.out.println("double equal flase");
        }
	}

}
