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


public class CostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   
/**test**/
/**
*@throws Exception file.
*/
   @Test public void priceComparator() throws Exception {
      BunnyList b = new BunnyList();
      Bunny b1 = new PetBunny("l", "g", 19);
      Bunny b2 = new PetBunny("e", "p", 29);
      Bunny b3 = new PetBunny("f", "g", 9);
      Bunny b4 = new PetBunny("g", "p", 19);
      CostComparator c = new CostComparator();
      CostComparator d = new CostComparator();
      CostComparator f = new CostComparator();
      Assert.assertEquals("test", -1, c.compare(b1, b2));
      Assert.assertEquals("test", 1, d.compare(b1, b3));
      Assert.assertEquals("test", 0, f.compare(b1, b4));
      b.readBunnyFile("bunnies1.txt");
      String input = " bunnies at party ";
      Assert.assertEquals(false, b.listByCost().contains(input));
   }
}
