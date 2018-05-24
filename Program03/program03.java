/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: progam03
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     10/1/2014

 DOCUMENTATION
 -------------
   This program will that a Fehrenheit dregee and convert it to a Celsius degree.
 ******************************************************************************/

import java.util.Scanner;

public class program03
{
   public static void main(String[] args)
   {
      int fehrenheit;
      double celsius;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("This program will convert fehrenheit to celsius.");

      System.out.println("Enter fehrenheit");
      fehrenheit = keyboard.nextInt();

      celsius = 5.0 * (fehrenheit - 32) / 9;
 
      System.out.printf("Celsius:%.1f", celsius);
      System.out.println("degrees");     
   }
}
