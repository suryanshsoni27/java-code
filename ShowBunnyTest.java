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

public class ShowBunnyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


 /**test for gettertest. **/
   @Test public void gettest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
         
      Assert.assertEquals("getname", "Bigun", sb1.getName());
      Assert.assertEquals("getBreed", "Flemish Giant", sb1.getBreed());
      Assert.assertEquals("getweight", 14.6, sb1.getWeight(), 0.0001);
      Assert.assertEquals("getwearandtear",
                                      22.0,
                                      sb1.getGroomingCost(),
                                       0.0001);   }
                                       
                                       
   /**test for setters . **/
   @Test public void setterstest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);     
      sb1.setName("Bigun");
      sb1.setBreed("Flemish Giant");
      sb1.setWeight(14.6);
      sb1.setGroomingCost(22.0); }
                                    
                                       
  /**test for estimated cost.**/
   @Test public void estimatedcosttest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
   
      Assert.assertEquals("estimated cost test",
                          62.15, 
                          sb1.estimatedMonthlyCost(), 0.0001);
   }
   
   /**test for toString. **/
   @Test public void toStringtest() {
      ShowBunny sb1 = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
   
      Assert.assertEquals("toString",
                           true,
                            sb1.toString().contains("Bigun"
                                                   + " (ShowBunny)   " 
                                                   + "Breed: Flemish Giant   "
                                                   + "Weight: 14.6"));
   }


                                     
}
