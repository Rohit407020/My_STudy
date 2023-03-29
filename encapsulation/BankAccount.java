package com.encapsulation;
//Create a class named BankAccount with private fields balance and ownerName. 
//Provide public getter and setter methods for ownerName, 
//but make balance private and only provide a public method deposit to add funds to the account.
//Then, create a Main class and use it to create an instance of BankAccount, 
//set its owner name using the setter, deposit some funds using the deposit method, 
//and print the owner name and balance using the getters.
public class BankAccount {
  private float balance;
  private String ownerName;
  
  BankAccount(){
	 balance = 1000.0f;
  }
  BankAccount(String ownerName){
	 this();
	 this.ownerName = ownerName;
  }
 
  
  //getter Setter
  public float getBalance() {
	  return this.balance;
  }
  public void setBalance(float balance) {
	  this.balance = balance;
  }
  public String getOwnerName() {
	  return this.ownerName;
  }
  public void setOwnerName(String ownerName) {
	  this.ownerName = ownerName;
  }
  ////
  public double deposite(float d) {
	  double balance = this.balance + d;
	  return balance;
  }
  public String toString() {
	  return "Owner Name:"+ownerName+"New Balance"+balance;
  }
}
  
  
