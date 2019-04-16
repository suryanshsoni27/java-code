
import java.util.Scanner;
/**
* The purpse of this code is to give money in form of 20 10 5 1
* 
*
* project 2.
* @author suryansh soni – COMP1210 - 005 
* @1/22/2018
*/
public class ATM {
   /**
    * its code of atm machine.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int amount;
      int amount1;
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      amount1 = amount;
      
      if (amount > 300)
      { System.out.println("Limit of $300 exceeded!"); }
      
      
      else { 
         int twen = amount / 20;
         amount = amount % 20;
         int ten = amount / 10;
         amount = amount % 10;
         int fiv = amount / 5;
         amount = amount % 5;
         int one = amount;
         System.out.println("Bills by denomination:");
         System.out.println("\t$20: " + twen);
         System.out.println("\t$10: " + ten);
         System.out.println("\t$5: " + fiv);
         System.out.println("\t$1: " + one);
         System.out.print("$"  +  amount1  
                          + " = (" 
                          + twen
                          + " *" 
                          + " $20" 
                          + ") +" 
                          + " (" 
                          + ten 
                          + " *" 
                          + " $10" 
                          + ") +" 
                          + " (" 
                          + fiv 
                          + " *" 
                          + " $5" 
                          + ") +" 
                          + " (" 
                          + one 
                          + " *" 
                          + " $1)"); 
       
       
       
      }
   }

}