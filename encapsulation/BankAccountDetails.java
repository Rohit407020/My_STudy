package com.encapsulation;

public class BankAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount b1 = new BankAccount("Rohit");
      
      System.out.println(b1.toString());
      b1.deposite(500);
      System.out.println(b1.toString());
      
	}

}
