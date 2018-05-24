/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program06
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     10/27/2014

 DOCUMENTATION
 -------------
   This program will allow two users to play "ROCK PAPER SCISSORS" and will 
   display the win base on what letter each user puts in.
 ******************************************************************************/

import java.util.Scanner;

public class program06
{
   public static final char ROCK     = 'R';
   public static final char PAPER    = 'P';
   public static final char SCISSORS = 'S';
   public static void main(String[] args)
   {
      char chuckNorris,
           bruceLee;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("\n\n              ROCK PAPER SCISSORS");
      System.out.println("****************************************************");
      System.out.println("This program will allow two users to play");
      System.out.println("'ROCK PAPER SCISSORS' and will display the winner");
      System.out.println("base on what letter each user puts in.");
      System.out.println("****************************************************");

      System.out.println("\n\nChuck Norris would you be so kind to choose one of");
      System.out.println("these three letters 'R', 'P', or 'S'. THEN PRESS ENTER");
      chuckNorris = keyboard.nextLine().toUpperCase().charAt(0);

      if ((chuckNorris != ROCK) && (chuckNorris != PAPER) && (chuckNorris != SCISSORS))
      {
         System.out.println("\n\nERROR. Did not enter one of the right letters.");
         System.exit(0);
      }
      else
      {
         System.out.println("\n\nBruce Lee would you be so kind to choose one of");
         System.out.println("these three letters 'R', 'P', or 'S'. THEN PRESS ENTER");
         bruceLee = keyboard.nextLine().toUpperCase().charAt(0);
         
         if ((bruceLee != ROCK) && (bruceLee != PAPER) && (bruceLee != SCISSORS))
         {
            System.out.println("\n\nERROR. Did not enter one of the right letters.");
            System.exit(0);
         }
         else if (chuckNorris == bruceLee)
            System.out.println("\n\nTIE. Chuck Norris and Bruce Lee are equal.");
         else if ((chuckNorris == ROCK) && (bruceLee == SCISSORS))
         {
            System.out.println("\n\nChuck Norris beats Bruce Lee.");
            System.out.println("Since rock crushes paper.");
         }
         else if ((chuckNorris == ROCK) && (bruceLee == PAPER))
         {
            System.out.println("\n\nBruce Lee beats Chuck Norris only in a dream.");
            System.out.println("Since paper covers rock.");
         }
         else if ((chuckNorris == PAPER) && (bruceLee == ROCK))
         {
            System.out.println("\n\nChuck Norris beats Bruce Lee.");
            System.out.println("Since paper covers rock.");
         }
         else if ((chuckNorris == PAPER) && (bruceLee == SCISSORS))
         {
            System.out.println("\n\nBruce Lee beats Chuck Norris only in a dream.");
            System.out.println("Since scissors cuts paper.");
         }
         else if ((chuckNorris == SCISSORS) && (bruceLee == PAPER))
         {
            System.out.println("\n\nChuck Norris beat Bruce Lee.");
            System.out.println("Since scissors cuts paper.");
         }
         else
         {
            System.out.println("\n\nBruce Lee beats Chuck Norris only in a dream.");
            System.out.println("Since rock crushes scissors.");
         }      
      }

      System.out.println("\n\nChuck Norris always wins in this game of ");
      System.out.println("'ROCK PAPER SCISSORS' so Bruce Lee go home.");
   }
}
