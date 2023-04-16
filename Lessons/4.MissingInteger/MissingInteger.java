import java.util.*;
public class MissingInteger {
   public static void main(String[] args){
      System.out.println(solution(new int[]{1,2,3}));
      System.out.println(solution(new int[]{1,3,6,4,1,2}));
      System.out.println(solution(new int[]{-1,-3}));
      int[] tablica = new int[10000];
      for (int i = 0; i < tablica.length; i++) {
         tablica[i] = i;
      }
      System.out.println(solution(tablica));
   }

   public static int solution(int[] A){
      int[] array = Arrays.stream(A).filter(it -> it > 0).distinct().sorted().toArray();
      int nextElement = 1;
      for (Integer integer : array) {
         if(!integer.equals(nextElement)){
            return nextElement;
         }
         nextElement++;
      }
      return nextElement;
   }

}