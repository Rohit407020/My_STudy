package com.practice;
import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // find first 20 even number and odd number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to display");
		int num = scan.nextInt();
		int i =1;
		int temp = num;
		System.out.println("Even number");
		while(2*num>=i) {
		if(i%2==0) {
			//System.out.println("even");
			//skip 6 in even
			if(i!=6) {
			System.out.println(i);
		}
		}
		
		i++;
		}
		int j=1;
		boolean count=true;
		System.out.println("Odd number");
		while(2*temp>=j) {
			
			if(j%2!=0) {
				
				
					System.out.println(j);
				
			}
			
			
			j++;
//			System.out.println("loop "+j);
			}
		
	}

}
