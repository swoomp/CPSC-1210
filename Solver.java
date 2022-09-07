import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import java.text.DecimalFormat;
 /**
  *
  * A program that solves for the result of expression: 
  * sqrt(11x^4 + 9x^3 + 7x^2 + 5x + 4) / (2x + 4) based on user input for (x).
  * 
  * CPSC 1210: Project 
  * @author Kenneth Will
  * @version 9/2/2022
  */
public class Solver
{ 
     /**
      * Prompt user for (x). Display result, # of chars left of decimal point, 
      * # of characters right of decimal point, and formatted result.
      * Result is formatted so that right of the decimal there are 
      * at most four digits and to the left of the decimal 
      * each group of three digits is separated by a comma.
      * 
      * @param args Command Line arguments (not used)
      */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0####");
      String resultStr;
      double x = 0;
      double result = 0;
      int leftOfDecimal = 0;
      int rightOfDecimal = 0;
      int decimalPos = 0;
      int resultLength = 0;
      
      // Prompt user for value of (x).
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // Solve equation based on user input.
      double numerator = 11 * Math.pow(x, 4) + 9 * Math.pow(x, 3) 
         + (7 * Math.pow(x, 2) + 5 * x + 4);   
      double denominator = (2 * x + 4);
      result = sqrt(abs(numerator)) / denominator;
      
      // Print Result: (result)
      System.out.println("Result: " + result);
      
      // Find values for characters left of decimal and right of decimals.
      resultStr = Double.toString(result);
      resultLength = resultStr.length();
      decimalPos = resultStr.indexOf(".");
      leftOfDecimal = decimalPos;
      rightOfDecimal = resultLength - ++decimalPos;
         
      // Print values for leftOfDecimal rightOfDecimal
      System.out.println("# of characters to left of decimal point: " 
         + leftOfDecimal);
      System.out.println("# of characters to right of decimal point: " 
         + rightOfDecimal);
      
      // Format result to decimal format then print result.
      System.out.println("Formatted Result: " + decimalFormat.format(result));
   } 
}