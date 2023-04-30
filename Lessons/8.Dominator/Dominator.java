import java.util.HashMap;
import java.util.Map;

public class Dominator {
   public static void main(String[] args){
      System.out.println(solution(new int[]{3,4,3,2,3,-1,3,3}));
   }
   public static int solution(int[] A) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int element : A) {
         map.merge(element,1,Integer::sum);
      }
      int max = 0;
      int maxKey = 0;
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
         if(entry.getValue() > max){
            max = entry.getValue();
            maxKey = entry.getKey();
         }
      }
      int index = -1;
      if(max != 0 && max > A.length/2)
         for(int i=0; i<A.length; i++)
            if(A[i] == maxKey){
               index = i;
               break;
            }
      return index;

   }
}
