import java.util.Arrays;

public class PermMissingElem {
   public static void main(String[] args){
      System.out.println(solution(new int[]{2,3,1,5}));
      System.out.println(solution(new int[]{}));
      System.out.println(solution(new int[]{1}));
      System.out.println(solution(new int[]{2,3,1,4}));
   }

   public static int solution(int[] A){
      A = Arrays.stream(A).sorted().toArray();
      int last = 0;
      for (int present : A) {
         last++;
         if(last != present) return last;
      }
      return A.length+1;
   }

}