/******************************************************************************
 CLASS INFORMATION
 -----------------
   Program Name: program08
   Programmer:   David Norris
   Instructor:   Mr. Geary for CS 202-1, Introduction to Programming
   Date Due:     11/10/2014

 DOCUMENTATION
 -------------
   This program will determine where heads won or tails won for a 100 coin
   tosses. Then it will display the number of times heads won and will display 
   the number of times tails won. Also it will display each one as a percentage.
 ******************************************************************************/

public class program08
{
   public static final int HEADS = 0;
   public static final int TAILS = 1;
   public static void main(String[] args)
   {
      int tossResult;
      double numberOfHeads = 0,
             numberOfTails = 0;
      
      System.out.println("\n\n               Heads or Tails");
      System.out.println("***************************************************");
      System.out.println("This program will determine where heads won or");
      System.out.println("tails won for a 100 coin tosses. Then it will");
      System.out.println("display the number of times heads won and will");
      System.out.println("display the number of times tails won. Also it will");
      System.out.println("display each one as a percentage.\n\n");
      
      for (int count = 1; count <= 100; count++)
      {
         tossResult = (int) (2 * Math.random());
         
         if (tossResult == HEADS)
            numberOfHeads++;
         else
            numberOfTails++;
      }

      System.out.printf("The number of times heads won is %1.0f\n", numberOfHeads); 
      System.out.printf("The number of times tails won is %1.0f\n", numberOfTails);
      System.out.printf("The heads won percentage is %.1f\n", numberOfHeads);
      System.out.printf("The tails won percentage is %.1f\n\n", numberOfTails);
   }
}
