import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   


public class HouseBunnyTest {


   /** Fixture initialization (common initialization.
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**test for getters .**/
   @Test public void getterstest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("getname", "Spot", hb1.getName());
      Assert.assertEquals("getBreed", "Really Mixed", hb1.getBreed());
      Assert.assertEquals("getweight", 5.8, hb1.getWeight(), 0.0001);
      Assert.assertEquals("getwearandtear", 0.15, hb1.getWearAndTear(), 0.0001);
      
   
   
   
   
   }
   
   /**test for setters . **/
   @Test public void setterstest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      hb1.setName("Spot");
      hb1.setBreed("Spot");
      hb1.setWeight(5.8);
      hb1.setWearAndTear(0.15); }
   
   /**test for estimated cost.**/
   @Test public void estimatedcosttest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("estimated cost test",
                          15.0074, 
                          hb1.estimatedMonthlyCost(), 0.0001);
   }
   
   /**test for tostring. **/
   @Test public void toStringtest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("toString",
                           true,
                            hb1.toString().contains("Spot"
                            + " (HouseBunny)   "
                            + "Breed: Really Mixed   "
                            + "Weight: 5.8"));
   }
   
   /**test for equals. **/
   @Test public void equalsTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      HouseBunny hb2 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
   
      Assert.assertEquals("equals test",
                          true,
                           hb1.equals(hb2));
                           
      
      hb2 = new HouseBunny("lol", "Really Mixed", 5.8, 0.15);
         
      Assert.assertEquals("equals test",
                          false,
                           hb1.equals(hb2));
   
      hb2 = new HouseBunny("Spot", "lol", 5.8, 0.15);
         
      Assert.assertEquals("equals test",
                          false,
                           hb1.equals(hb2));
      hb2 = new HouseBunny("Spot", "Really Mixed", 5.2, 0.15);
      Assert.assertEquals("equals test",
                          false,
                           hb1.equals(hb2));
      HouseBunny hb3 = new HouseBunny("Spot", "Really Mixed", 5.8, 55);
      Assert.assertEquals("equals test",
                          false,
                           hb2.equals(hb3));
                           
      hb2 = new HouseBunny("lol", "Really dss Mixed", 2.8, 0.111);
      Assert.assertEquals("equals test",
                          false,
                           hb1.equals(hb2));      
                           
      String obj = new String();
      Assert.assertEquals("equalstest",
                           false,
                            hb1.equals(obj));                                   
   }

/**HashCodeTest.**/
   @Test public void hashtest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("test", 0, hb1.hashCode());
   
   }
   
   /**comparetotest. **/
   @Test public void compareTest() {
      HouseBunny hb1 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      HouseBunny hb2 = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("test", 0, hb1.getName().compareTo(hb2.getName()));
      
      hb2 = new HouseBunny("SpoT", "Really Mixed", 5.8, 0.15);
      Assert.assertEquals("test",
                           32,
                            hb1.getName().compareTo(hb2.getName()));      
   }
   


   
   
    
 
    
                                                                  
}     
   
   

     
   

   
   

