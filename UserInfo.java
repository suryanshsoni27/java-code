/**.
* the purpose of this code is to create a class
*activity 4A
*@author suryansh soni COMP1210 005
*@2/4/2018
*/ 

public class UserInfo {

// instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age; 
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

/**
    *this is a function.
    *@param firstNameIn this is firstname
    *@param lastNameIn  this is last name
    */
// constructor 
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }

//methods 
/**
*@return output
*/

   public String toString() {
      String output = "Name: " + firstName + " " + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
        
      
      return output;
   
   }
   
   /**
   *
   *@param locationIn this is location 
   *
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   
   /**
   *@param ageIn this is age
   *@return isSet
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
    
   /**
   *
   *@return age 
   */ 
   public int getAge() {
      return age;
   }
        
   /**
   *
   *@return location
   */ 

   public String getLocation() {
      return location;
   }   
        

     /**
     *gives status as offline.
     *     
     */
   public void logOff() {
      status = OFFLINE;
   }
     
  
    /**
     *gives status as online.
     *     
     */ 
   public void logOn() {  
      status = ONLINE;
   }
   


}