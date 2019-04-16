import java.util.Scanner;
import java.text.DecimalFormat;
/**.
* the purpose of this code is to print formatted result and calculate the value
*
*project 3 
*@author suryansh soni COMP1210 005
*@1/29/2018
*/ 

public class ExpressionEvaluator { 

/**
     * the code to convert the result.
     *
     *@param args Command Line arguments (not used)
     */




   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x;
      double result, formatr;
     
      int n;
      int nol;
      int nor;
      int len;
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      result = Math.sqrt(Math.abs(10.4 * (Math.pow(x, 10)) - x + 1))
               / (3.5 * (Math.pow(x, 4)) + 2.5 
               * (Math.pow(x, 2)) + 1.5 * x + 0.5);
      formatr = result;
      System.out.println("Result: " + result);
      String format = Double.toString(result);
      
      n = format.indexOf('.');
      len = format.length();
      
      
      nol = n;
      nor = len - nol - 1;
      
      System.out.println("# digits to left of decimal point: " + nol);
      System.out.println("# digits to right of decimal point: " + nor);
      
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      
      System.out.println("Formatted Result: " + df.format(formatr));
      
      
      
      
      
      
      
      
      
      
      
   
   
   }
   
}