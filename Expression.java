import java.util.Scanner;
/**
 * A program that recieves input values of type double for x and y, 
 * and solves for the result of the indicated expression when 
 * x or y is not equal to 0.
 * 
 * If xy = 0 the program will print the that the result is undefined.
 * 
 * CPSC 1210: Project 2
 * @author Kenneth Will
 * @version 8/25/2022
 */
public class Expression
{
   /**
    * Calculates expresssion and provides a value for result or 
    * responds with the statement: result is "undefined" if xy = 0.
    *
    * @param args Command Line arguments (not used)
    */
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double result = 0;
      
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //Prompt user for value of x:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
         
      //Prompt user for value of y:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //Solve expression for user input x and y values:
      if (x * y == 0) { //The result is undefined if xy = 0.
         System.out.print("result is \"undefined\"");
      }   
      else { //If xy does not = 0 result is calculated via the expression.
         System.out.println("result = " 
            + (double) (10 * x + 32.6) * (5 * y - 1.567) / (x * y));
      }
   }
         
      
     
         
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}

