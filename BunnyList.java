import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.util.Arrays;


  /**.
* the purpose of this code is to convert message 
*
*project 11
*@author suryansh soni COMP1210 005
*@4/15/2018
*/ 


public class BunnyList {
//instances

   private String listName = "";
   private Bunny[] bunnyList;
   private String[] excludedRecords = new String[0];

//constructor
/**
*constructor of class.
*/
   public BunnyList() {
      listName = "not yet assigned";
      bunnyList = new Bunny[0];
      excludedRecords = new String[0];
   }
   
   //methods
   
 /**
   *
   *@param fileNameIn filename
   *@throws FileNotFoundException if ghe file cannot be opem
   */
 
   public void readBunnyFile(String fileNameIn) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
                         
      listName = scanFile.nextLine();
      char choice;
      String set;
   
      
      while (scanFile.hasNext()) {
      
         String input = scanFile.nextLine();
         Scanner scan = new Scanner(input).useDelimiter(",");
         
         //input = input.toUpperCase();
         choice = scan.next().toUpperCase().charAt(0);         
         String nameIn = "";
         String breedIn = "";
         double weightIn;
         double wearandtearIn;
         double trainingcostIn;
         double groomingcostIn;
         Bunny b;
         switch(choice) {
         
            case 'P':
               nameIn = scan.next().trim();
               breedIn = scan.next().trim();
               weightIn = Double.parseDouble(scan.next());
               b = new PetBunny(nameIn, breedIn, weightIn);
               addBunny(b);
               break;
           
            case 'H':
               nameIn = scan.next().trim();
               breedIn = scan.next().trim();
               weightIn = Double.parseDouble(scan.next());
               wearandtearIn = Double.parseDouble(scan.next());
               b = new HouseBunny(nameIn,
                                        breedIn,
                                        weightIn,
                                        wearandtearIn);
               addBunny(b);
               break; 
           
            case 'J':
               nameIn = scan.next().trim();
               breedIn = scan.next().trim();
               weightIn = Double.parseDouble(scan.next());
               trainingcostIn = Double.parseDouble(scan.next());
               b = new JumpingBunny(nameIn,
                                           breedIn,
                                           weightIn,
                                           trainingcostIn);
               addBunny(b);
            
               break;
         
            case 'S':
               nameIn = scan.next().trim();
               breedIn = scan.next().trim();
               weightIn = Double.parseDouble(scan.next());
               groomingcostIn = Double.parseDouble(scan.next());
               b = new ShowBunny(nameIn,
                                           breedIn,
                                           weightIn,
                                           groomingcostIn);
               addBunny(b);
               break;  
          
            default:
               addExcludedRecord(input);
               break;
                  
         
           
           
         
         
         }
      }
   }
   
   
   
   
   
/**
*@return listName name.
*/

   public String getListName() {
      return listName;
   }

/**
*@param listNameIn name.
*/
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }

/**
*@return bunnyList list.
*/
   public Bunny[] getBunnyList() {
      return bunnyList;
   }

/**
*@return excludedRecords records.
*/

   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   *@param bunnyIn bunny 
   */
   public void addBunny(Bunny bunnyIn) {
      bunnyList = Arrays.copyOf(bunnyList, bunnyList.length + 1);
      bunnyList[bunnyList.length - 1] = bunnyIn;
   
   
   }
   /**
   *@param listNameIn name.
   */
   public void addExcludedRecord(String listNameIn) {
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[ excludedRecords.length - 1] = listNameIn;
   }
   
   /**
   *@return bunnyList list.
   */
   public String toString() {
      int index = 0;
      
      String result = "";
      if (bunnyList.length != 0) {
         result = "------------------------------\n" 
                 + getListName() 
                 + "\n------------------------------"; 
         while (index < bunnyList.length) {
            result += "\n" + bunnyList[index].toString() + "\n";
            index = index + 1;
         }
         return result; }
      else {
         result = getListName() + "\n"; 
         
         return result;
      }
   }
   
   /**
   *@return total total.
   */
      
   public double totalEstimatedMonthlyCost() {
      int index = 0;
      double total = 0;
      while (index < bunnyList.length) {
         total += bunnyList[index].estimatedMonthlyCost();
         index = index + 1;
      }
      return total; 
   }
   
   /**
   *@return sumInfo suminfo.
   */
   public String summary() {
      String sumInfo = "";
      
      sumInfo += "------------------------------" + "\n" + "Summary for "
                            + getListName() 
                            + "\n" 
                            + "------------------------------";
      sumInfo += "\nNumber of " 
            + "Bunnies: " + bunnyList.length
         + "\nTotal Estimated Monthly Cost: $" 
         +  totalEstimatedMonthlyCost()
         + "\n\n\n";
            
              
       
   
      return sumInfo;
   
     
     
   
   
   }
   
   /**
   *@return result result.
   */

   public String listByName() {
   
      
      Arrays.sort(bunnyList);
      String result =  "------------------------------" 
                    + "\n" 
                    + "Bunnies by Name\n" 
                    + "------------------------------"; 
      for (int j = 0; j < bunnyList.length; j++) {
         result += "\n" + bunnyList[j].toString() + "\n";
      }
      return result;                 
                    
                    
   }
   
   /**
   *@return result res.
   */

   public String listByCost() {
     
      Arrays.sort(bunnyList, new CostComparator());
      String result = "------------------------------" 
                    + "\n" 
                    + "Bunnies by Cost\n" 
                    + "------------------------------";
             
             
      for (int j = 0; j < bunnyList.length; j++) {
         result += "\n" +  bunnyList[j].toString() + "\n";
      }
      return result;                 
         
   
   }

/**
*@return result result.
*/
   public String excludedRecordsList() {
   
      String result = "------------------------------" 
                    + "\n" 
                    + "Excluded Records\n" 
                    + "------------------------------\n";
                    
      for (int j = 0; j < excludedRecords.length; j++) {
         result += excludedRecords[j] + "\n";
      }
           
      return result;            
   }


}
   
   
   
   
   
