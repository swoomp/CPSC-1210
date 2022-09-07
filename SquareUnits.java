import java.util.Scanner;
/**
 * A program that displays maximized values for acres, square yards,
 * square feet, and square inches based on user input
 * 
 * If input value exceeds 1000000000 square inches program will display 
 * "Limit of 1,000,000,000 square inches exceeded!".
 *
 * CPSC 1210: CSPC Project 2
 * @author Kenneth Will
 * @version 8/26/2022  
 */
public class SquareUnits
{
/**
 * Calculates variable values based on user input.
 * Input can not exceed 1000000000 square inches.
 *
 * @param args Command Line arguments (not used).
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      int inputValue = 0;
      int acres = 0;
      int squareYards = 0;
      int squareFeet = 0;
      int squareInches = 0;
      
      System.out.print("Enter the area in square inches: ");
      //Prompt user for value,
      inputValue = userInput.nextInt();
      
      if (inputValue > 1000000000)
      {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      
      else
      {
         acres = inputValue / 6272640;
         squareInches = inputValue % 6272640;
         
         squareYards = squareInches / 1296;
         squareInches = squareInches % 1296;
         
         squareFeet = squareInches / 144;
         squareInches = squareInches % 144;
         
         System.out.println("Number of Units:");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + squareYards);
         System.out.println("\tSquare Feet: " + squareFeet);
         System.out.println("\tSquare Inches: " + squareInches);
      }
      
      
      
      
    
            
              
         
            
      
      
      
      
      
      
   }
}

