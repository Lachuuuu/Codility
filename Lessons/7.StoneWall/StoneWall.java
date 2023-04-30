import java.util.Stack;

public class StoneWall {

   public static void main(String[] args){
      System.out.println(solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
   }
   public static int solution(int[] H) {
      // Implement your solution here
      Stack<Integer> stack = new Stack<>();
      int blocks = 0;
      stack.push(0);

      for (int i : H) {
         while(stack.peek() > i) stack.pop();
         if(stack.peek() != i){
            blocks++;
            stack.push(i);
         }
      }
      return blocks;
   }
}
