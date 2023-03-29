package com.abstractionabstractclass;
//create abstract class bike j=having non abstract method running, abstract method discount. two subclass 
//normal bike, raccing bike
public abstract class Bike3 {
     String brand;
    private String maxSpeed;
	abstract void discount(int p);
	
	public Bike3() {
		brand = "TATA KWASAKI BMW";
		maxSpeed ="Avg 70 km/h - 120 km/h";
		System.out.println(brand);
	}
	
	public Bike3(String brand, String maxSpeed) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	 void discription() {
	   System.out.println(brand+" "+maxSpeed);	
	}

	@Override
	public String toString() {
		return "Bike3 [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
	
}
