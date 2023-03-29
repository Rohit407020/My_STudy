package com.practice;
import java.util.*;
public class DayWeekYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int d = scan.nextInt();
     
     int year = d/365;
     d = d%365;
     System.out.println("Number of Year :"+year);
     
     int week = d/7;
     d = d%7;
     System.out.println("Number of week :"+week);
     
     int days = d;
     System.out.println("Number of Day :"+days);
	}

}
