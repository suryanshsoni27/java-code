import java.io.FileNotFoundException;

/**
*Bunnies part 3.
*/
public class BunniesPart2 {

/**
*@param args for method.
*@throws FileNotFoundException for method.
*/

   public static void main(String[] args) 
            throws FileNotFoundException {
   
      //String fileName = args[0];
      BunnyList blist = new BunnyList();
      blist.readBunnyFile("bunnies1.txt");
      System.out.println(blist.summary());
      System.out.println(blist.listByName());
      System.out.println(blist.listByCost());
      System.out.println(blist.excludedRecordsList());
      
      
    
   }
}
     







