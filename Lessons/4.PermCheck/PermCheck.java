import java.util.*;


public class PermCheck {
   public static void main(String[] args){
      System.out.println(solution(new int[]{1,3,1,4,2,3,5,4}));
      System.out.println(solution(new int[]{1,2,3,4}));
   }

   public static int solution(int[] A){
      Arrays.sort(A);
      int next = 0;
      for (int element : A) {
         next++;
         if(element != next) return 0;
      }
      return 1;
   }


}