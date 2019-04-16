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

public class JumpingBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


 
   /**test for gettertest. **/
   @Test public void gettest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
         
      Assert.assertEquals("getname", "Speedy", jb1.getName());
      Assert.assertEquals("getBreed", "English", jb1.getBreed());
      Assert.assertEquals("getweight", 6.3, jb1.getWeight(), 0.0001);
      Assert.assertEquals("getwearandtear",
                                      25.0,
                                      jb1.getTrainingCost(),
                                       0.0001);   }

/**test for setters . **/
   @Test public void setterstest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      jb1.setName("Speedy");
      jb1.setBreed("English");
      jb1.setWeight(6.3);
      jb1.setTrainingCost(25.0); }
  
   /**test for estimated cost.**/
   @Test public void estimatedcosttest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("estimated cost test",
                          40.75, 
                          jb1.estimatedMonthlyCost(), 0.0001);
   }
                          
    /**test for tostring. **/
   @Test public void toStringtest() {
      JumpingBunny jb1 = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      Assert.assertEquals("toString",
                           true,
                            jb1.toString().contains("Speedy"
                            + " (JumpingBunny)   "
                            + "Breed: English   "
                            + "Weight: 6.3"));
   }
                      

   


}

