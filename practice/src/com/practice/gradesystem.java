package com.practice;
import java.util.*;
public class gradesystem {


		   public static void main(String args[]) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter s1:");
		      int s1 = sc.nextInt();
		      System.out.println("Enter s2:");
		      int s2 = sc.nextInt();
		      System.out.println("Enter s3:");
		      int s3 = sc.nextInt();
		      System.out.println("Enter s4:");
		      int s4 = sc.nextInt();
		      System.out.println("Enter s5:");
		      int s5 = sc.nextInt();
		      
		      int total = s1+s2+s3+s4+s5;
		      int average = total/5;
		      char grade;

		      if(average>=80){
		         grade = 'A';
		      }else if(average>=60 && average<80){
		         grade = 'B';
		      }
		      else if(average>=40 && average<60){
		         grade = 'C';
		      }
		      else {
		         grade = 'D';
		      }

		      switch(grade) {
		         case 'A' :
		            System.out.println("Excellent!");
		            break;
		         case 'B' :
		         case 'C' :
		            System.out.println("Well done");
		            break;
		         case 'D' :
		            System.out.println("You passed");
		         case 'F' :
		            System.out.println("Better try again");
		            break;
		         default :
		         System.out.println("Invalid grade");
		      }
		      System.out.println("Your grade is " + grade);
		   }
		}

