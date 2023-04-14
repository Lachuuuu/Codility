import java.util.Arrays;

public class CyclicRotation {
   public static void main(String[] args){
      System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 3)));
      System.out.println(Arrays.toString(solution(new int[]{}, 3)));
   }

   public static int[] solution(int A[], int K){
      if(A.length == 0) return A;
      K = K%A.length-1;

      int[] result = new int[A.length];

      for (int i = 0, j = 0; i < A.length; i++) {
         int backElementIndex = A.length-1-K+i;
         if(backElementIndex >= 0 && backElementIndex < A.length){
            result[i] = A[backElementIndex];
         }
         else{
            result[i] = A[j];
            j++;
         }
      }
      return result;
   }

}