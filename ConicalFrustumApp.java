import java.util.Scanner;
/**.
* the purpose of this code is to create a class
*project 4
*@author suryansh soni COMP1210 005
*@2/7/2018
*/ 


public class ConicalFrustumApp {
/**
  * the code to class.
  *
  *@param args Command Line arguments (not used)
  */



   public static void main(String[] args)
   {
      Scanner userPrompt = new Scanner(System.in);
      
   
      String label = "";
      double radius1;
      double radius2;
      double height;
      
   
      System.out.println("Enter label, " 
         + "radius1, radius2, and height for a conical frustum.");
   
      System.out.print("\tlabel: ");
      label = userPrompt.nextLine();
      
      System.out.print("\tradius1: ");
      radius1 = userPrompt.nextDouble();
      if (radius1 <= 0) {
         System.out.println("Error: radius1 must be non-negative.");
         return; }
       
      System.out.print("\tradius2: ");
      radius2 = userPrompt.nextDouble();
      if (radius2 <= 0) {
         System.out.println("Error: radius2 must be non-negative.");
         return;}
         
      System.out.print("\theight: ");
      height = userPrompt.nextDouble();
      if (height <= 0) {
         System.out.println("Error: height must be non-negative.");
         return;  }  
   
         
       
      
      ConicalFrustum user = new ConicalFrustum(label, radius1,
                                               radius2, height);
               
      System.out.println(user.toString());
   
   
   }
}