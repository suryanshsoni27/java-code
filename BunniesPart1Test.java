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

public class BunniesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void bunnycounttest() {
      BunniesPart1 vp1 = new BunniesPart1();
      Bunny.resetBunnyCount();
      BunniesPart1.main(null);
      Assert.assertEquals("Bunny.BunnyCount should be 4. ",
                               4, Bunny.getBunnyCount());
   }
}
