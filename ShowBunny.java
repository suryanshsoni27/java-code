import java.text.DecimalFormat;
 
   /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   
public class ShowBunny extends Bunny {

//instances 
   private double groomingCost;
   /**
   *static value.
   */
   public static final double BASE_COST = 2.75;

//constructor 
/**
*@param nameIn name.
*@param breedIn breed.
*@param weightIn weight.
*@param groomingCostIn groomingcost.
*/

   public ShowBunny(String nameIn, 
                 String breedIn, 
                 double weightIn, 
                 double groomingCostIn) {
                 
      super(nameIn, breedIn, weightIn);
      groomingCost = groomingCostIn;
   }
/**
*@return groomingCost groomingCost.
*/         
   public double getGroomingCost() {
      return groomingCost;
   
   }

/**
*@param groomingCostIn groomingcost.
*/   
   public void setGroomingCost(double groomingCostIn) {
      groomingCost = groomingCostIn;
   }

/**
*@return double double.
*/
   public double estimatedMonthlyCost() {
      return BASE_COST * weight + groomingCost;
   }

/**
*@return String strinng.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0#"); 
   
      return (name 
         + " (ShowBunny)   " 
         + "Breed: " 
         + breed 
         + "   Weight: " 
         + weight 
         + "\n" 
         + "Estimated Monthly Cost: $"
         + df.format(estimatedMonthlyCost()) 
         + " (includes $22.00 for grooming)"); 
   } 
}
                             
