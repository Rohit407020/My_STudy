package com.topicclearnace;

import java.util.Scanner;

public class InverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * *
//		 * *
//		  * 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++){	
				System.out.print(" ");
				}	
			for(int k =1;k<=(n-i);k++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}
 
}
