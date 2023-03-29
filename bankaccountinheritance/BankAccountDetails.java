package com.bankaccountinheritance;

import java.util.Scanner;

public class BankAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     SavingAccount s1 = new SavingAccount();
     int ch ;
    
     do {
    	 System.out.println("#####Enter Your Choice#####");
         System.out.println("1. Create Saving Account");
         System.out.println("2. Deposite Money");
         System.out.println("3. Withraw Money");
         System.out.println("4. View Account");
         System.out.println("5. Show Intrest");
         System.out.println("6. Exit");
         System.out.println("###########################");
         ch = scan.nextInt();
     
     switch(ch) {
     		case 1: System.out.println("Enter Account Owner Name :");
     		        String name = scan.next();
     		        s1.setName(name);
     		        System.out.println("Enter Account Number :");
     		        int aNo = scan.nextInt();
     		        s1.setAccountNo(aNo);
//     		        System.out.println("Add Balance :");
//     		        int bal = scan.nextInt();
//     		        s1.setBalance(bal);
     		        break;
     		case 2:  System.out.println("Enter Deposite Money");
     		         int add = scan.nextInt();
     		         System.out.println("Your Balance "+s1.deposite(add));
     		         break;
     		         
     		case 3:  System.out.println("Enter Pin Number");
     		         int pin = scan.nextInt();
     		         if(pin == s1.getPin()) {
     		        	 
     		         
     				 System.out.println("Enter Withraw Money"); 
     		         int with = scan.nextInt();
     		         s1.withdrow(with);
     		         }
     		         else {
     		        	 System.out.println("Pin Not Valid");
     		         }
     		         break;
     		case 4:  System.out.println(s1.toString());
     		         break;
     		case 5:  s1.CalculateIntrest();
     			 	 break;
     		case 6: System.exit(0);	
     }
     System.out.println("You Want Perform More Operation Y - 1/ N - 0");
     ch = scan.nextInt();
     }
     while(ch==1);	          
     
     
	}

}
