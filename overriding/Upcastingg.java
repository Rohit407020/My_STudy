package com.overriding;
class Bike{  
	  void run(){
		  System.out.println("running");
		  }  
	}  
	class Splendor extends Bike{  
	  void run(){
		  System.out.println("running safely with 60km");
	  }  
	  }
public class Upcastingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Splendor();//upcasting  
	    b.run();  
	}

}
