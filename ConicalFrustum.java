import java.text.DecimalFormat;
/**.
* the purpose of this code is to create a class
*project 4
*@author suryansh soni COMP1210 005
*@2/7/2018
*/ 



public class ConicalFrustum {

//instance variables

   private String label = "";
   private double radius1 = 0;
   private double radius2 = 0; 
   private double height = 0;


/**
    *this is a function.
    *@param labelIn this is label
    *@param radius1In this is radius1
    *@param radius2In this is radius2
    *@param heightIn this is height
    */

//constructor 
   public ConicalFrustum(String labelIn, double radius1In,
                         double radius2In, double heightIn) {
      setLabel(labelIn);
      setRadius1(radius1In);
      setRadius2(radius2In);
      setHeight(heightIn);
   
   }

//methods 
  /**
  *function returns label.
  *@return label
  */
   public String getLabel()
   {
      return label;
   }

/**
*function returns boolean.
*@param labelIn 
*@return set
*/
   public boolean setLabel(String labelIn) {
      boolean set = false;
   
      if (labelIn != null) {
         label = labelIn.trim();
         set = true;
      }
      return set;
   }
   
   /**
   *gives radius 1.
   *@return radius1
   */

   public double getRadius1()
   { 
      return radius1; }

/**
*function returns boolean.
*@param radius1In 
*@return r1set
*/
   public boolean setRadius1(double radius1In) {
      boolean r1set = false;
      if (radius1In >= 0) {
         r1set = true;
         radius1 = radius1In;
      }
      return r1set;
   }

  /**
   *gives radius 2.
   *@return radius2
   */
   public double getRadius2()
   { 
      return radius2; }

 /**
*function returns boolean.
*@param radius2In 
*@return r2set
*/
   public boolean setRadius2(double radius2In) {
      boolean r2set = false;
      if (radius2In >= 0) {
         r2set = true;
         radius2 = radius2In;
      }
      return r2set;
   }
  /**
   *gives height.
   *@return height
   */
   public double getHeight()
   { 
      return height; }
      
      
      
        /**
*function returns boolean.
*@param heightIn takes height in account 
*@return hset
*/
   public boolean setHeight(double heightIn) {
      boolean hset = false;
      if (heightIn >= 0) {
         hset = true;
         height = heightIn;
      }
      return hset;
   }

/**
*@return volume;
*/
   public double volume() {
      double volume;
      volume = ((Math.PI  * height) / 3) * ((radius1 * radius1)
               + (radius2 * radius2) + (radius1 * radius2));
      return volume;
   }
 
/**
*@return slantheight;
*/
   public double slantHeight() {
      double slantheight;
      slantheight = Math.sqrt(Math.pow((radius1 - radius2), 2) 
         + Math.pow(height, 2));
   
      return slantheight;
   }
   
   
 
/**
*@return lateralSurfaceArea;
*/  
   public double lateralSurfaceArea() {
      double lateralSurfaceArea;
      lateralSurfaceArea = Math.PI  * (radius1 
         + radius2) * Math.sqrt(Math.pow((radius1 - radius2), 2) 
         + Math.pow(height, 2));
     
      return lateralSurfaceArea; }
 
/**
*@return totalSurfaceArea;
*/    
     
   public double totalSurfaceArea() {
      double totalSurfaceArea;
      totalSurfaceArea = Math.PI  * ((radius1 * radius1) 
         + (radius2 * radius2)
         + (radius1
         + radius2) * Math.sqrt(Math.pow((radius1 - radius2), 2) 
         + Math.pow(height, 2)));
   
      return totalSurfaceArea;
      
   
   }
   
    /**
*@return ConicalFrustum;
*/    
  
   public String toString() {
   
      double rad1;
      double rad2;
      double vol;
      double la;
      double sa;
      DecimalFormat df = new DecimalFormat("#,##0.0##");  
   
      String conicalFrustum = "";
     
     
      
      conicalFrustum = "ConicalFrustum " 
                       + "\"" 
                       + label 
                       + "\""
                       + " with radius1 = " 
                       + radius1
                       + ", radius2 = " 
                       + radius2
                       + ", and height = " 
                       + height 
                       + " has:" 
                       + "\n" 
                       + "\tvolume = " 
                       + df.format(volume()) 
                       + " cubic units" 
                       + "\n"
                       + "\tslant height = "
                       + df.format(slantHeight()) 
                       + " units" + "\n"
                       + "\tlateral surface area = "
                       + df.format(lateralSurfaceArea()) 
                       + " units" + "\n"
                       + "\ttotal surface area = "
                       + df.format(totalSurfaceArea()) 
                       + " square units";
                     
                       
                       
      return conicalFrustum;
    
   
   
   
   }
}
   
