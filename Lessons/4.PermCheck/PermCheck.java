import java.util.*;


public class PermCheck {
   public static void main(String[] args){
      System.out.println(solution(new int[]{1,3,1,4,2,3,5,4}));
      System.out.println(solution(new int[]{1,2,3,4}));
   }

   public static int solution(int[] A){
      Set<Integer> values = new TreeSet<>();
      for (int element : A) {
         values.add(element);
      }
      if(values.size() != A.length) return 0;
      int last = 0;
      for (Integer value : values) {
         last++;
         if(!(value == last)) return 0;
      }
      return 1;
   }


}