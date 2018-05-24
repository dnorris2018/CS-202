/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program05
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     10/15/2014

 DOCUMENTATION
 -------------
   This program will take the weight, height, age, and gender of a individual
   to calculate the total number of calories consumed by a individual in one
   day based on the BMR system.    
 ******************************************************************************/

import java.util.Scanner;

public class program05
{
   public static void main(String[] args)
   {
      double weight,
             calories;
      int    age,
             height;
      char   gender;
      
      Scanner keyboard = new Scanner(System.in);

      System.out.println("\n\n                 Calories Calculator");
      System.out.println("******************************************************");
      System.out.println("This program will take the weight, height, age, and");
      System.out.println("gender of a individual to calculate the number of");
      System.out.println("calories that is recommended to be consumed");

      System.out.println("\nEnter your weight in pounds and press enter:");
      weight = keyboard.nextDouble();

      System.out.println("Enter your height in inches and press enter:");
      height = keyboard.nextInt();

      System.out.println("Enter your age:");
      age    = keyboard.nextInt();

      System.out.println("Enter your gender:");
      gender = keyboard.next().toUpperCase().charAt(0);

      if (gender == 'M')
         calories = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
      else
         calories = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

      System.out.printf("Calories equal %.2f\n\n", calories);
   }
}

