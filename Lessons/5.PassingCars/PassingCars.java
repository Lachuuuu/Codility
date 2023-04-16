import java.util.*;


public class PassingCars {
   public static void main(String[] args){
      System.out.println(solution(new int[]{0,1,0,1,1}));
   }

   public static int solution(int[] A){
      int multi = 0;
      int count = 0;
      for (int car : A) {
         if(multi == 0 && car == 0) multi++;
         else if (multi > 0) {
            if(car == 0) multi++;
            else if(car == 1) count += multi;
            if(count > 1000000000) return -1;
         }
      }
      return count;
   }


}