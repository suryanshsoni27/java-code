import java.text.DecimalFormat;
  /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   
public class HouseBunny extends PetBunny {

//instances 
   private double wearAndTear; 
   /**
   *static value.
   */
   public static final double BASE_COST = 2.25;


//constructor 
/**
*@param nameIn name.
*@param breedIn breed.
*@param weightIn weight.
*@param wearAndTearIn wearandtear.
*/

   public HouseBunny(String nameIn,
                     String breedIn,
                     double weightIn,
                     double wearAndTearIn) {
                 
      super(nameIn, breedIn, weightIn);  
      wearAndTear = wearAndTearIn;
              
   
   
   }

//methods 

/**
*@return wearAndTear WEARTEAR.
*/
   public double getWearAndTear() {
      return wearAndTear;
   }
   
/**
*@param wearAndTearIn weartear.
*
*/   
   public void setWearAndTear(double  wearAndTearIn) {
      wearAndTear = wearAndTearIn;
   }   
   
/**
*@return double double.
*/   
   public double estimatedMonthlyCost() {
      return (BASE_COST * weight * (1 + wearAndTear));
   }
   
   /**
   *@return String string.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0#"); 
      return (name 
           + " (HouseBunny)   " 
           + "Breed: " 
           + breed 
           + "   Weight: " 
           + weight 
           + "\n" 
           + "Estimated Monthly Cost: $" 
           + df.format(estimatedMonthlyCost()) 
           + " (includes 15.0% for wear and tear)");
   }
   
   
}