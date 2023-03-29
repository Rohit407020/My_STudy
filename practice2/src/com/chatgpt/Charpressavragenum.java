package com.chatgpt;

import java.util.Scanner;

public class Charpressavragenum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    System.out.print("Enter an integer (or 'q' to quit): ");
    while (input.hasNextInt()) {
      int number = input.nextInt();
      sum += number;
      count++;
      System.out.print("Enter an integer (or 'q' to quit): ");
    }
    input.close();
    if (count == 0) {
      System.out.println("No integers were entered.");
    } else {
      double average = (double) sum / count;
      System.out.println("The average of the integers is: " + average);
    }
  }
}


