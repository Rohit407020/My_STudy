package com.bankaccountinheritance;
//Create a class BankAccount with methods deposit() and withdraw(). 
//Create a subclass SavingsAccount which has an additional property interestRate
//and a method calculateInterest() which calculates the interest earned by the account.
//Override the toString() method in both classes to print their respective properties. 
//Create objects of both classes and test their methods.
public class BankAccount {
  
	private String name;
	private int accountNo;
	private int balance;
	private final int pin = 123;
	
	public BankAccount() {
		this.balance = 100;
	}
	public BankAccount(String name, int accountNo, int balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	
	public int deposite(int d) {
		balance = balance + d;
		return balance;
	}
	public void withdrow(int w) {
		if(balance<w) {
			System.out.println("You have low balance");
		
		}
		else {
			balance = balance - w;
			System.out.println("Your Withdrawl Amount is "+w);
			System.out.println("Your Current Balance is "+balance);
		}
		
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + ", pin=" + pin + "]";
	}
	
	
}
