package com.topicclearnace;

import java.util.Scanner;

public class ShivsenaFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		****
//      ***
//      **
//      *
//		**
//		***
//		****
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n  = scan.nextInt();
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=(n-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++) {
			 if(i==0) {
				 continue;
			 }
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
