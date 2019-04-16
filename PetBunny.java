import java.text.DecimalFormat;
   
   /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   
public class PetBunny extends Bunny {

//instances 
/**
*static value.
*/
   public static final double BASE_COST = 1.85;

//constructor
/**
*@param nameIn name.
*@param breedIn breed.
*@param weightIn weight.
*/
   public PetBunny (String nameIn, String breedIn, double weightIn) {
     
     try {
      super(nameIn, breedIn, weightIn);
      }
      
   
      if(weight < 0) {
         throw new IllegalArgumentException("Negative value");
      }
               
   }

//methods

/**
*@return double double value.
*/
   public double estimatedMonthlyCost() {
      return BASE_COST * weight;
   }
  
  
  /**
  *@return String string.
  */ 
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0#");  
      return (name 
         + " (PetBunny)   " 
         + "Breed: " 
         + breed 
         + "   Weight: " 
         + weight 
         + "\n" 
         + "Estimated Monthly Cost: $" 
         + df.format(estimatedMonthlyCost()));
   }
}