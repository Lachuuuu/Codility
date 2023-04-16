import java.util.*;


public class Distinct {
   public static void main(String[] args){
      System.out.println(solution(new int[]{1,3,1,4,2,3,5,4}));
      System.out.println(solution(new int[]{1,2,3,4,4}));
   }

   public static int solution(int[] A){
      return Arrays.stream(A).distinct().toArray().length;
   }


}