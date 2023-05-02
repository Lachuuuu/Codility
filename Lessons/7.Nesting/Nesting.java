import java.util.Stack;

public class Nesting {
   public static void main(String[] args){
      System.out.println(solution("(()(())())"));
      System.out.println(solution("())"));
   }

   public static int solution(String S){
      Stack<Character> open = new Stack<>();
      for(int i=0;i<S.length();i++){
         Character character = S.charAt(i);
         if(character.equals('(')) open.push('(');
         if(character.equals(')')){
            if(open.empty()) return 0;
            else open.pop();
         }
      }
      if(open.empty()) return 1;
      else return 0;
   }
}

