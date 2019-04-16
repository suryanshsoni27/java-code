import java.util.Scanner;
 /**.
* The purpose of this program is to get points from user and find intercepts 
*
*project 2
*@author suryansh soni COMP1210 005
*@1/22/2018
*/
public class SlopeIntercept {
 /**
     * The code to find slope and intercept.
     *
     *@param args Command Line arguments (not used)
     */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int x1;
      int x2;
      int y1;
      int y2;
      double slope;
      double ylinintercept;
      double xlinintercept;
      System.out.println("Enter the X and Y coordinates of starting point:");
      System.out.print("\tx1 = "); 
      x1 = userInput.nextInt();   
      System.out.print("\ty1 = ");
      y1 = userInput.nextInt();
      System.out.println("Enter the X and Y coordinates of ending point:");
      System.out.print("\tx2 = ");
      x2 = userInput.nextInt();
      System.out.print("\ty2 = ");
      y2 = userInput.nextInt();
      
      if (x1 != x2) {
         slope = (y2 - y1) / (x2 - x1);
         System.out.println("Slope: " + slope);
         ylinintercept = y1 - slope * x1;
         if (slope != 0) { 
            xlinintercept = -1 * ylinintercept / slope;
            System.out.println("Y intercept: " + ylinintercept);
            System.out.println("X intercept: " + xlinintercept);
         }
         else {
            System.out.println("Y intercept: " + ylinintercept);
            System.out.println("X intercept: " + '"' + "undefined" + '"');
         }
          
          
      }
      else {
         System.out.println("Slope: " + '"' + "undefined" + '"');
      
      }
   }
}