import java.text.DecimalFormat;
   /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   

public class JumpingBunny extends Bunny {

//instances 
   private double trainingCost;
   /**
   *static value.
   */
   public static final double BASE_COST = 2.50;

//constructor

/**
*@param nameIn name.
*@param breedIn breed.
*@param weightIn weight.
*@param trainingCostIn train.
*/

   public JumpingBunny(String nameIn, 
                   String breedIn, 
                   double weightIn, 
                   double trainingCostIn) {
                   
      super(nameIn, breedIn, weightIn);
      trainingCost = trainingCostIn;
                   
                   
                   
   }
   
   /**
   *@return trainingCost double.
   */
   
   public double getTrainingCost() {
      return trainingCost;
         
   }
   /**
   *@param trainingCostIn trainingcost.
   */
   public void setTrainingCost(double trainingCostIn) {
      trainingCost = trainingCostIn;
   } 
   
   /**
   *@return double double.
   */
   public double estimatedMonthlyCost() {
   
      return BASE_COST * weight + trainingCost;
   }
    /**
    *@return String string.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0#"); 
    
      return name 
           + " (JumpingBunny)   " 
           + "Breed: " 
           + breed 
           + "   Weight: " 
           + weight 
           + "\n" 
           + "Estimated Monthly Cost: $" 
           + df.format(estimatedMonthlyCost())
           + " (includes $25.00 for training)";
   }               
}
