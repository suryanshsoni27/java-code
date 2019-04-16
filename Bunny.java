import java.util.NegativeValueException;
   
 /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/ 

public abstract class Bunny implements Comparable <Bunny> {

//instances
   protected String name = "";
   protected String breed = "";
   protected double weight;

   protected static int bunnyCount = 0;
 
 //constructor
 /**
 *@param nameIn name.
 *@param breedIn breed.
 *@param weightIn weight. 
 */
   public Bunny (String nameIn, String breedIn, double weightIn)
    throws NegativeValueException{
    
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
         
      if(weight < 0) {
         throw new  NegativeValueException();
      }
   
         
    
      
     
     
      bunnyCount++;
   }
 
 //methods
 /**
 *@return name name.
 */
   public String getName() {
      return name;
   }
 
 /**
 *@param nameIn ownername.
 */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
  /**
  *@return breed breed.
  */  
   public String getBreed() {
      return breed;
   }
  
  /**
  *@param breedIn breed.
  */
   public void setBreed(String breedIn) {
      breed = breedIn;
   }
  
  /**
  *
  *@return weight weight.
  */
  
   public double getWeight() {
      return weight;
   }
  
  /**
  *@param weightIn weoght.
  */
  
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
  
  /**
  *@return bunnyCount bunny counts.
  *
  */
   public static int getBunnyCount() {
      return bunnyCount;
   }
  
  /**
  *sets to zero.
  */
   public static void resetBunnyCount() {
      bunnyCount = 0;
   }
  /**
  *abstract method.
  */
   abstract double estimatedMonthlyCost();
  
  /**
  *@return String string.
  */
   public String toString() {
      return (name 
             + " (PetBunny)   " 
             + "Breed: " 
             + breed 
             + "   Weight: " 
             + weight);
   }
   
   /**
   *@param obj obj.
   *@return boolean returns boolean.
   *
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Bunny)) {
         return false;
      }
      else {
         Bunny b = (Bunny) obj;
         return (name.equalsIgnoreCase(b.getName())
              && breed.equalsIgnoreCase(b.getBreed())
              && Math.abs(weight - b.getWeight()) < .000001);
      }
   }
   
   /**
   *@return int int.
   */
   public int hashCode() {
   
      return 0;
   }
   
   /**
   *@param obj onj.
   *@return int int. 
   */
   
   public int compareTo(Bunny obj) {
      
      return this.getName().compareTo(obj.getName());
   }
   
   
   
   
 
}
 
  



