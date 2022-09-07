import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
   /**
    * 
    * A program that recieves an input code from user for date, time, price, 
    * discount, section, row, seat, followed by a decription of the event.
    *
    * CPSC 1201: Project 3
    * @author Kenneth Will
    * @version 9/3/2022
    */
public class Event
{
      /**
       * Prompt user for coded event information. Print event information and
       * price w/ discount and an rng prize total 1 to 9999 in 4 digit format.
       * If input code is < 26 characters provide message (Invalid Event Code).
       *
       * @param args Command Line arguments (not used) 
       */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      DecimalFormat decimalFormatPrize = new DecimalFormat("0000");
      DecimalFormat decimalFormatPrice = new DecimalFormat("$#,##0.00");
      DecimalFormat discountPercentage = new DecimalFormat("0%");
      
      String code = "";
      String date = "";
      String time = "";
      double price = 0;
      double discount = 0;
      double cost = 0;
      int prize = 0;
      String section = "";
      String row = "";
      String seat = "";
      String description = "";
       
       // Prompt user for event code.
      System.out.print("Enter your event code: ");
      code = userInput.nextLine();
      System.out.println("");
      
      // Trim off whitespace
      code = code.trim();
      
      //If user input code < 26 characters print error message. 
      if (code.length() < 26) {
         System.out.println("Invalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      }
      //Print and format
      else {
         // Print event.
         System.out.print("Event: " + code.substring(25, 38)); 
        
         // Print date. 
         System.out.print("   Date: " + code.substring(0, 2)
            + "/" + code.substring(2, 4) + "/" + code.substring(4, 8));
        
         // Print time. 
         System.out.println("   Time: " + code.substring(8, 10) + ":" 
            + code.substring(10, 12));
         
         // Print section.
         System.out.print("Section: " + code.substring(19, 21));
         
         // Print row.
         System.out.print("   Row: " + code.substring(21, 23));
         
         // Print seat.
         System.out.println("   Seat: " + code.substring(23, 25));
         
         // Print price.
         price = Double.parseDouble(code.substring(12, 17)) / 100;
         System.out.print("Price: " + decimalFormatPrice.format(price));
         
         // Print discount.
         discount = Double.parseDouble(code.substring(16, 19)) / 100;
         System.out.print("   Discount: " 
            + discountPercentage.format(discount));
         
         // Print total cost after discount.
         cost = (price * discount);
         System.out.println("   Cost: " 
            + decimalFormatPrice.format(price - cost));
            
         //Roll random number and print prize number
         prize = (int) (Math.random() * 9998 + 1);
         System.out.println("Prize Number: " 
            + decimalFormatPrize.format(prize));
      }
   }
}
      
           
       
