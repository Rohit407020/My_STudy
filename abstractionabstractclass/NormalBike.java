package com.abstractionabstractclass;

public class NormalBike extends Bike3{
	  int price;
	 String discription;
	 float dicount = 0.02f;
	 float Tdicount;
	 
     void discount(int p) {
    	 this.price = p;
    	 Tdicount = p*dicount; 
     }
     void discription() {
    	 System.out.println("#######Normal Bike#######");
    	 System.out.println("Brand : KAWASAKI");
    	 System.out.println("Max Speed : 70Km/h");
    	 System.out.println("Price :"+price);
    	 System.out.println("Discount :"+Tdicount);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bike3 b1= new NormalBike();
        
         b1.discount(50000);
         b1.discription();
	}

}
