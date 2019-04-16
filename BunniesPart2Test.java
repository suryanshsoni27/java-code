import org.junit.Assert;
import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;

/**.
* the purpose of this code is bunnies
*
*project 9
*@author suryansh soni COMP1210 005
*@4/4/2018
*/   


public class BunniesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *@test1
   *@throws FileNotFoundException for test 1.
   */
   @Test public void maintest() throws FileNotFoundException {
      BunniesPart2 bPart2Obj = new BunniesPart2();
       // test constructor Bunny.resetBunnyCount();
      String[] args = {"bunnies1.txt"}; BunniesPart2.main(args);
      Assert.assertEquals(4, Bunny.getBunnyCount());
   
   }
}
     
   
      
