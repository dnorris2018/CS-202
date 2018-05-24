/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program10
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     11/24/2014

 DOCUMENTATION
 -------------
   This program is going to use five methods one for displaying the instructions,
   two for entering the number of hits and number of at bats, one method for the 
   calculation, and one to display the average.  This program is finding a
   batting average.
 ******************************************************************************/

import java.util.Scanner;

public class program10
{
   public static void main(String[] args)
   {
      int    hits,
             atBats;
      double average;            

      displayInstructions();
      hits    = getHits();
      atBats  = getAtBats();
      average = calculateAverage(hits, atBats);
      displayResults(average);
   }

   public static void displayInstructions()
   {
      System.out.println("\n\n               Batting Average");
      System.out.println("*************************************************");
      System.out.println("This program will take the number times a player");
      System.out.println("hits the ball and divide it by number times a");
      System.out.println("player is at bat then display the average.");
   }
   
   public static int getHits()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\n\nPlease enter the number of hits: ");
      return keyboard.nextInt();     
   }

   public static int getAtBats()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nPlease enter the number of times at bat: ");
      return keyboard.nextInt();
   }
   
   public static double calculateAverage(int hits, int atBats)
   {
      return (double) hits / atBats;
   }

   public static void displayResults(double average)
   {
      System.out.printf("\n\nThe batting average is %.3f\n\n", average);      
   }
}
