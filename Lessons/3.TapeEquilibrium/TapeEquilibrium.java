import java.util.Arrays;

public class TapeEquilibrium {
   public static void main(String[] args){
      //System.out.println(solution(new int[]{2,3,1,5}));
      //System.out.println(solution(new int[]{3,1,2,4,3}));
      System.out.println(solution2(new int[]{-5,2,5,10}));
   }

   // 53% cuz of bad performance
   public static int solution(int[] A){
      int result = -1;
      int[] firstPart, secondPart;
      for (int index = 1; index < A.length; index++) {
         firstPart = new int[index+1];
         secondPart = new int[A.length - index];
         for(int j=0; j<index; j++){
            firstPart[j] = A[j];
         }

         for(int j=index; j<A.length; j++){
            secondPart[j-index] = A[j];
         }
         if(result == -1 || result > Math.abs(Arrays.stream(firstPart).sum() - Arrays.stream(secondPart).sum()))
            result = Math.abs(Arrays.stream(firstPart).sum() - Arrays.stream(secondPart).sum());
      }
      return result;
   }

   public static int solution2(int[] A){
      int result = -1;
      int sumFirstPart = A[0];
      int sumSecondPart = Arrays.stream(A).sum() - sumFirstPart;
      int value;
      for (int index = 1; index < A.length; index++) {
         value = Math.abs(sumFirstPart - sumSecondPart);
         if(result == -1 || value < result) result = value;

         sumFirstPart += A[index];
         sumSecondPart -= A[index];
      }
      return result;
   }

}