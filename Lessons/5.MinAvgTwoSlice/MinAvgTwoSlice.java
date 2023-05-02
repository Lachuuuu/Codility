public class MinAvgTwoSlice {
   public static void main(String[] args){
      System.out.println(solution(new int[]{4,2,2,5,1,5,8}));
   }
   public static int solution(int[] A) {
      double avg = 0;
      double sum = 0;
      double minAvg = Double.MAX_VALUE;
      int minAvgIndex = 0;

      for (int i=0; i<A.length-2; i++) {
         sum = A[i] + A[i+1];
         avg = sum / 2.0;
         if(avg < minAvg){
            minAvgIndex = i;
            minAvg = avg;
         }
         sum += A[i+2];
         avg = sum / 3.0;
         if(avg < minAvg){
            minAvgIndex = i;
            minAvg = avg;
         }
      }

      avg = (A[A.length-1] + A[A.length-2]) / 2.0;
      if(avg < minAvg){
         minAvgIndex = A.length-2;
      }

      return minAvgIndex;
   }
}
