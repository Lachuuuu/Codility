import java.util.Arrays;

public class FrogJmp {
   public static void main(String[] args){
      System.out.println(solution(10,85,30));
      System.out.println(solution(10,10,30));
   }

   public static int solution(int X, int Y, int D){
      int distance = Y - X;
      int result = distance / D;
      if(distance % D != 0) result++;
      return result;
   }

}