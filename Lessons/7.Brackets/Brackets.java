import java.util.*;

public class Brackets {
   public static void main(String[] args){
      System.out.println(solution("{[()()]}"));
      System.out.println(solution("([)()]"));
      System.out.println(solution("()()()()()()())(()"));
      System.out.println(solution("()()()()()()()(()"));
   }

   
   public static int solution(String S) {
      Stack<Character> opened = new Stack<>();
      for(int i=0; i<S.length(); i++){
         Character currentChar = S.charAt(i);
         if(currentChar.equals('(') || currentChar.equals('[') || currentChar.equals('{'))
            opened.push(currentChar);
         else if (currentChar.equals(')') || currentChar.equals(']') || currentChar.equals('}')){
            if(opened.size() < 1) return 0;
            Character lastOpenedBracket = opened.pop();
            switch (currentChar){
               case ')':
                  if(!lastOpenedBracket.equals('(')) return 0;
                  break;
               case ']':
                  if(!lastOpenedBracket.equals('[')) return 0;
                  break;
               case '}':
                  if(!lastOpenedBracket.equals('{')) return 0;
                  break;
            }
         }
      }
      if(opened.size() > 0) return 0;
      return 1;
   }
}
