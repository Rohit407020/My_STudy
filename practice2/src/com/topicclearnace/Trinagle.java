package com.topicclearnace;

import java.util.Scanner;

public class Trinagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         *
//        * *
//       * * *
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
