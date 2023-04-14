import java.util.*;

public class OddOccurrencesInArray {
   public static void main(String[] args){
      System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
   }

   public static int solution(int[] A){
      Hashtable<Integer,Integer> table = new Hashtable<>();
      for (int element : A) {
         table.merge(element,1,Integer::sum);
      }
      for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
         if (entry.getValue() %2 == 1) {
            return entry.getKey();
         }
      }
      return 0;
   }
}
