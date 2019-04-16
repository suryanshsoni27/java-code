import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

 /**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   

public class PetBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

 /**test for gettertest. **/
   @Test public void gettest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
         
      Assert.assertEquals("getname", "Floppy", pb1.getName());
      Assert.assertEquals("getBreed", "Holland Lop", pb1.getBreed());
      Assert.assertEquals("getweight", 3.5, pb1.getWeight(), 0.0001);
   }

/**test for setters . **/
   @Test public void setterstest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      pb1.setName("Floppy");
      pb1.setBreed("Holland Lop");
      pb1.setWeight(3.5);
   }
      

 /**test for estimated cost.**/
   @Test public void estimatedcosttest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
      Assert.assertEquals("estimated cost test",
                          6.475, 
                          pb1.estimatedMonthlyCost(), 0.0001);
   }
   
   /**test for tostring. **/
   @Test public void toStringtest() {
      PetBunny pb1 = new PetBunny("Floppy", "Holland Lop", 3.5);
   
      Assert.assertEquals("toString",
                           true,
                            pb1.toString().contains("Floppy"
                            + " (PetBunny)   "
                            + "Breed: Holland Lop   "
                            + "Weight: 3.5"));
   }


 
}
