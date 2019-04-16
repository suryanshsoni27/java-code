/**.
* the purpose of this code is to create a class
*activity 4A
*@author suryansh soni COMP1210 005
*@2/4/2018
*/ 


public class UserInfoDriver {

 /**
  * the code to class.
  *
  *@param args Command Line arguments (not used)
  */



   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}
