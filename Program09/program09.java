/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program09
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     11/17/2014

 DOCUMENTATION
 -------------
   This program is going to ask the user to enter the number of runs for both 
   teams in each inning in a baseball game then add it to the previous inning, 
   and it will also display who is winning or if its a tie at the end of each 
   inning.  It will do this for nine innings, and if its a tie at the end of 
   the ninth inning then it will go through  one or more innings until one of
   the teams wins.  Then display which team won and the score of both teams.
 ******************************************************************************/

import java.util.Scanner;

public class program09
{
   public static void main(String[] args)
   {
      int score,
          innings,
          giants = 0,
          royals = 0;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("\n\n\n\n\n\n\n\n\n\n");
      System.out.println("\n\n\t\t\t                World Series Game");            
      System.out.print("\t\t***********************************************");
      System.out.println("*****************");
      System.out.print("\t\tThe program is going to ask the user to enter ");
      System.out.print("the number of runs\n\t\tfor both teams in each ");
      System.out.print("inning in a baseball game then add it to\n\t\tthe ");
      System.out.print("previous inning, and it will also display who is ");  
      System.out.print("winning or\n\t\tif its a tie at the end of each ");  
      System.out.print("inning. It will do this for nine\n\t\tinnings, and ");
      System.out.print("if its a tie at the end of the ninth inning then it");
      System.out.print("\n\t\twill go through one or more innings until one ");
      System.out.print("of the teams wins.\n\t\tThen display which team won "); 
      System.out.println("and the score of both teams.");
      System.out.print("\t\t***********************************************");
      System.out.println("*****************");

      for (innings = 1; innings <=9; innings++)
      {
         System.out.print("\n\t\t\tEnter number of runs for the Giants ");
         System.out.print("in inning " + innings + ": ");
         score = keyboard.nextInt();
         giants += score;

         System.out.print("\t\t\tEnter number of runs for the Royals ");
         System.out.print("in inning " + innings + ": ");
         score = keyboard.nextInt();
         royals += score;

         System.out.print("\t\t********************************************");
         System.out.println("********************");

         if (giants > royals)
         {
            System.out.print("\n\t\t\t\t\tGiants led " + giants + " to ");
            System.out.println(royals + ".");
         }
         else if (royals > giants)
         {
            System.out.print("\n\t\t\t\t\tRoyals led " + royals + " to ");
            System.out.println(giants + ".");            
         }
         else
            System.out.println("\n\t\t\t\t\tIts a tied ball game.");
         
         System.out.print("\t\t********************************************");
         System.out.println("********************"); 
      }

         while (giants == royals)
         {
            System.out.print("\n\t\t\tEnter number of runs for the Giants ");
            System.out.print("in inning " + innings + ": ");
            score = keyboard.nextInt();
            giants += score;

            System.out.print("\t\t\tEnter number of runs for the Royals ");
            System.out.print("in inning " + innings + ": ");
            score = keyboard.nextInt();
            royals += score;

            System.out.print("\t\t********************************************");
            System.out.println("********************");

            if (giants > royals)
            {
               System.out.print("\n\t\t\t\t\tGiants led " + giants + " to ");
               System.out.println(royals + ".");
            }
            else if (royals > giants)
            {
               System.out.print("\n\t\t\t\t\tRoyals led " + royals + " to ");
               System.out.println(giants + ".");            
            }
            else
               System.out.println("\n\t\t\t\t\tIts a tied ball game.");
         
            System.out.print("\t\t********************************************");
            System.out.println("********************");

            innings++;
         }

      System.out.print("\n\t\t\tGiants had " + giants + " runs.");
      System.out.println("\t\tRoyals had " + royals + " runs.");
      System.out.print("\t\t***********************************************");
      System.out.println("*****************");

      if (royals > giants)
      {
         System.out.print("\n\t\t\t\t    --- Royals won " + royals + " to ");
         System.out.println(giants + ".---");
      }
      else
      {
         System.out.print("\n\t\t\t\t    --- Giants won " + giants + " to ");
         System.out.println(royals + ".---");                               
      }   
   }
}
