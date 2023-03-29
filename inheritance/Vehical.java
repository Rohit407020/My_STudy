package com.inheritance;
//Create a class Vehicle with a drive() method. 
//Create two subclasses Car and Motorcycle, which override drive() 
//to print "Driving a car" and "Riding a motorcycle" respectively. 
//Create objects of both subclasses and call their drive() methods.
 class VehicalDetail {
    
	public void drive(){
		System.out.println("This is Vehical class");
	}
 }
	class Car extends VehicalDetail{
		
		  public void drive() {
			  System.out.println("Driving Car");
		  }
	}
	class Motorcycle extends VehicalDetail{
			public void drive() {
				  System.out.println("Riding a motorcycle");
			  }
	}
	
	public class Vehical {
		public static void main(String args[]) {
			Car c1 = new Car();
			c1.drive();
			Motorcycle m1 = new Motorcycle();
			m1.drive();
		
	}
}
