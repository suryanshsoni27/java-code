import java.util.Comparator;

/**
*costComparator.
*/

public class CostComparator implements Comparator<Bunny> {

   @Override
   
   public int compare(Bunny b1, Bunny b2) {
      if (b1.estimatedMonthlyCost() < b2.estimatedMonthlyCost()) {
         return -1;
      }
         
      else if (b1.estimatedMonthlyCost() > b2.estimatedMonthlyCost()) {
         
         return 1;
      }
      else {
         return 0;
      }
   }
}