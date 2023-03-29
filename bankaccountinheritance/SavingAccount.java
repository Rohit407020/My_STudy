package com.bankaccountinheritance;

public class SavingAccount extends BankAccount{
    private float intrestRate = 0.2f;
    float cal;
    public SavingAccount() {
    	
    }
	public SavingAccount(String name, int accountNo, int balance,float intrestRate) {
		super(name,accountNo,balance);
		this.intrestRate = intrestRate;
	}
	public void CalculateIntrest() {
		 cal = (float) getBalance()*intrestRate*365;
		System.out.println("Intrest :"+cal);
	}
	
	
    
    
}
