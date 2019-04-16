import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
 
 /**.
* the purpose of this code is to print ticket
*
*project 3 
*@author suryansh soni COMP1210 005
*@1/29/2018
*/ 


public class TimeTravel {
 /**
     * the code to convert ticket.
     *
     *@param args Command Line arguments (not used)
     */




   public static void main(String[] args) {
      DecimalFormat df = new DecimalFormat("$0,000.00#");
      Scanner  userInput = new Scanner(System.in);
      String ticketcode = "";
      String time = "";
      String date = "";
      String seat = "";
      double cost;
      String price = "";
      double pricec;
      char category;
      int strln;
      String itinerary = "";
      
      
      
      
      System.out.print("Enter ticket code: ");
      ticketcode = userInput.nextLine();
      ticketcode = ticketcode.trim();
      System.out.print("\n");
      
      strln = ticketcode.length();
      if (strln >= 27) {
         time = ticketcode.substring(0, 4);
         System.out.print("Time: " + time.substring(0, 2) 
                    + ":" + time.substring(2, 4) + "   ");
      
         date = ticketcode.substring(4, 12);
         System.out.print("Date: " + date.substring(0, 2)
                                   + "/" 
                                   + date.substring(2, 4) 
                                   + "/" + date.substring(4, 8) 
                                   + "   ");
      
        
         seat = ticketcode.substring(22, 25);
         System.out.println("Seat: " + seat);
         
         
         itinerary = ticketcode.substring(25, strln);
         System.out.println("Itinerary: " + itinerary);
          
         
         
         
         price = ticketcode.substring(14, 22);
         
         pricec = Double.parseDouble(price);
         
         pricec = pricec / 100;
         
         System.out.print("Price: "  +  df.format(pricec) + "   ");
         
        
         
         
      
          
         category = ticketcode.charAt(12);
         
         
         if (category == 's')
         { cost = 0.5 * pricec; }
         else if (category == 'e')
         { cost = 0.75 * pricec; }
         else
         { cost = pricec; }
              
         System.out.print(" Cost: " + df.format(cost) + "   ");
         
         System.out.println("Category: " + category);
         
         Random rand = new Random();
         int prizenum = rand.nextInt(10000);
         if (prizenum / 1000 != 0) {
            System.out.println("Prize Number: " + prizenum); }
         else if (prizenum / 100 != 0) {
            System.out.println("Prize Number: " + "0" + prizenum); }
         else if (prizenum / 10 != 0) {
            System.out.println("Prize Number: " + "00" + prizenum); }
         else {
            System.out.println("Prize Number: " + "000" + prizenum); }
         
      
         
         
      }
      
      else {
         System.out.print("*** Invalid ticket code ***" 
                         + "Ticket code must have at least 26 characters.\n"); }
      
      
      
      
      
      
     
      
      
      
     
      
      
     
      
      
      
      
      
   }
}
