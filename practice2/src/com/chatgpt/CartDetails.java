package com.chatgpt;

public class CartDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Items i1 = new Items(101,"Car",980.0f,2);
	 Items i2 = new Items(102,"Pen",9.0f,5);
	 Items i3 = new Items(103,"Mobile",11980.0f,4);
	 
     MarketCart m1 = new MarketCart(001,i1);
     
     System.out.println("=======+++++++=======");
     System.out.println(m1);
     
      
     
	}

}
