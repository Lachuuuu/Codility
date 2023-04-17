import java.util.*;


public class MaxProductOfThree {
   public static void main(String[] args){
      System.out.println(solution(new int[]{-3,-2,5,6}));
   }

   public static int solution(int[] A){
      int[] sortedArray = Arrays.stream(A).sorted().toArray();
      int maxNumbers = sortedArray[sortedArray.length-1]*sortedArray[sortedArray.length-2]*sortedArray[sortedArray.length-3];
      int minNumbers = sortedArray[0]*sortedArray[1]*sortedArray[sortedArray.length-1];
      return Math.max(maxNumbers,minNumbers);
   }


}