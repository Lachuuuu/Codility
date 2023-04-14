public class BinaryGap {
   public static void main(String[] args){
      System.out.println(solution(1041));
      System.out.println(solution(32));
   }

   public static int solution(int N){
      String binaryString = Integer.toBinaryString(N);
      String[] words = binaryString.split("1+");

      String[] gaps = new String[words.length];

      if(binaryString.charAt(binaryString.length()-1) == '0') for (int i = 0; i < words.length-1; i++) {
         gaps[i] = words[i];
      }else{
         gaps = words;
      }

      int max = 0;
      for (String word: gaps) {
         if(word != null && word.length() > max) max = word.length();
      }
      return max;
   }

}