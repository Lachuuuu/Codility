public class CountDiv {
   public static void main(String[] args){
      System.out.println(solution(11,345,17));
      System.out.println(solution(0,0,11));
      System.out.println(solution(0,2000000000-1,1));
      System.out.println(solution(10,345,10));
   }

   public static int solution(int A, int B, int K){
      int plus1 = (A%K == 0) ? 1 : 0;
      return (B/K) - (A/K) + plus1;
   }


}