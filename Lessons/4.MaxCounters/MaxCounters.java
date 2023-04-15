import java.util.*;
public class MaxCounters {
   public static void main(String[] args){
      System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6, 5, 6, 1, 6, 2, 2, 2, 6})));
      System.out.println(Arrays.toString(solution2(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6, 5, 6, 1, 6, 2, 2, 2, 6})));
   }


   //77%
   public static int[] solution(int N, int[] A){
      int[] counters = new int[N];
      int max = 0;
      for (int action : A) {
         if(action == N+1){
            for (int i = 0; i < counters.length; i++) {
               counters[i] = max;
            }
         }
         else {
            counters[action - 1]++;
            if(counters[action-1] > max) max = counters[action-1];
         }
      }
      return counters;
   }

   //100%
   public static int[] solution2(int N, int[] A){
      int[] counters = new int[N];
      int max = 0;
      int base = 0;
      for (int action : A) {
         if(action == N+1){
            base = max;
         }
         else {
            if(counters[action-1] < base) counters[action-1] = base;
            counters[action - 1]++;
            if(counters[action-1] > max) max = counters[action-1];
         }
      }

      for (int i = 0; i < counters.length; i++) {
         if(counters[i] < base) counters[i] = base;
      }
      return counters;
   }


}