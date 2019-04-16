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


public class BunnyListTest {


   /** Fixture initialization (common initialization.
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** getters test .**/
   /**
   *@throws FileNotFoundException file.
   */
   @Test public void getterstest()throws FileNotFoundException {
      BunnyList b = new BunnyList();
      Assert.assertEquals("not yet assigned", b.getListName());
      b.readBunnyFile("bunnies1.txt");
      Assert.assertEquals(4, b.getBunnyList().length);
      Assert.assertEquals(2,  b.getExcludedRecords().length);
   }
   
   /** setter test .**/
   @Test public void settersTest() {
      BunnyList b = new BunnyList();
      b.setListName("lolol");
   }
   
   /**add bunny tesy .**/
   @Test public void addbunnytest() {
      BunnyList b = new BunnyList();
      PetBunny pb = new PetBunny("b", "l", 19);
      b.addBunny(pb);
   }
   
   /**add excluded records test.**/
   @Test public void addexcludedrecordstest() {
      BunnyList bb = new BunnyList();
      String nameoflist = "Bunnyrocks";
   
      bb.addExcludedRecord(nameoflist);
   }
   
   /**toStringtest.**/
    /** getters test .**/
   /**
   *@throws FileNotFoundException file.
   */

   @Test public void toStringTest() throws FileNotFoundException {
      BunnyList b = new BunnyList();
      Assert.assertEquals("not yet assigned", b.getListName());
      b.readBunnyFile("bunnies1.txt");
   
      Assert.assertEquals("toString",
                        true,
                        b.toString().
                        contains("Floppy"
                            + " (PetBunny)   "
                            + "Breed: Holland Lop   "
                            + "Weight: 3.5"));      
   }
   
   /**test for summaryInfo.**/
    /** getters test .**/
   /**
   *@throws FileNotFoundException file.
   */

   @Test public void suminfotest() throws FileNotFoundException {
      BunnyList b = new BunnyList();
      Assert.assertEquals("not yet assigned", b.getListName());
      b.readBunnyFile("bunnies1.txt");
      
      Assert.assertEquals("summaryinfo",
                           true,
                           b.summary()
                           .contains("Number of Bunnies: 4"));
        
   }
   
   /**totalMonthlyCost test.**/
    /** getters test .**/
   /**
   *@throws FileNotFoundException file.
   */

   @Test public void totaltest() throws FileNotFoundException {
      BunnyList b = new BunnyList();
      b.readBunnyFile("bunnies1.txt");
      Assert.assertEquals("test",
                        124.3825,
                        b.totalEstimatedMonthlyCost(),
                        0.000001);
                        
   }
   
   /**listtest.**/
    /** getters test .**/
   /**
   *@throws FileNotFoundException file.
   */

   @Test public void listtest() throws FileNotFoundException {
      BunnyList b = new BunnyList();
      b.readBunnyFile("bunnies1.txt");
      Assert.assertEquals("test",
                           true,
                           b.listByName().
                           contains("Bigun (ShowBunny) "));
      Assert.assertEquals("test2",
                           true,
                           b.listByCost().
                           contains("Floppy (PetBunny) "));
      Assert.assertEquals("testex",
                           true,
                           b.excludedRecordsList().
                           contains("mouse Bunny,"));                     
                           
   }                     

   

   

   
 
 
 

   

   
    
      
   
   
   

}
