import java.util.*;


public class FrogRiverOne {
   public static void main(String[] args){
      System.out.println(solution(5,new int[]{1,3,1,4,2,3,5,4}));
   }

   public static int solution(int X, int[] A){
      Set<Integer> lookingFor = new HashSet<>();
      for(int i=1; i<X+1; i++)
         lookingFor.add(i);

      int result = 0;
      for (int element : A) {
         lookingFor.remove(element);
         if(lookingFor.size() == 0) return result;
         result++;
      }
      return -1;
   }


}