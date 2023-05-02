import java.util.Arrays;
import java.util.HashMap;

public class GenomicRangeQuery {
   public static void main(String[] args){
      System.out.println(Arrays.toString(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
   }
   public static int[] solution(String S, int[] P, int[] Q){
      HashMap<String, Integer> map = new HashMap<>();
      int[][] prefixSums = new int[S.length()][4];
      map.put("A",1);
      map.put("C",2);
      map.put("G",3);
      map.put("T",4);

      for(int i=0; i<S.length(); i++){
         String letter = String.valueOf(S.charAt(i));
         prefixSums[i][map.get(letter)-1] += 1;
      }

      for(int i=1; i<prefixSums.length; i++){
         for(int j=0; j<4; j++){
            prefixSums[i][j] += prefixSums[i-1][j];
         }
      }

      int[] res = new int[P.length];

      for(int i=0; i<P.length; i++){
         int min = -1;
         int[] lowersums = P[i] > 0? prefixSums[P[i]-1] : new int[]{0,0,0,0};
         for(int j=0; j<4; j++){
            int[] uppersums = prefixSums[Q[i]];
            if(uppersums[j] - lowersums[j] > 0){
               min = j+1;
               break;
            }
         }
         res[i] = min;
      }

      return res;
   }
}
