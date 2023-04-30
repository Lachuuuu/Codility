import java.util.Arrays;
import java.util.Comparator;

public class Triangle {
   public static void main(String[] args){
      System.out.println(solution(new int[]{10,2,5,1,8,20}));
      System.out.println(solution(new int[]{10,50,5,1}));
   }

   
   public static int solution(int[] A) {
      if(A.length < 3) return 0;

      Long[] sortedArray =  Arrays.stream(A).boxed().map(Long::valueOf).toArray(Long[]::new);
      Arrays.sort(sortedArray, Comparator.reverseOrder());

      Long edge1 = sortedArray[0];
      Long edge2 = sortedArray[1];
      Long edge3 = sortedArray[2];

      for(int i=3; i<sortedArray.length+1; i++){
         if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
            return 1;
         if(i==sortedArray.length) return 0;
         switch (i % 3) {
            case 0:
               edge1 = sortedArray[i];
               break;
            case 1:
               edge2 = sortedArray[i];
               break;
            case 2:
               edge3 = sortedArray[i];
               break;
         }
      }

      return 0;
   }
}
