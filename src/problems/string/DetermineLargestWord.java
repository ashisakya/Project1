package problems.string;

//public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

  //  public static void main(String[] args) {

    //    String str = "Human brain is a biological learning machine";

        //write your code here

  //  }

// }

public class DetermineLargestWord {
   static int LongestWordLength(String str)
    {
        String[] words = str.split(" ");
        int length = 0;
        for(String word:words){
            if(length < word.length()){
                length = word.length();
            }
        }
        return length;
    }
    public static void main(String args[])
    {
        String str = "Human brain is a biological learning machine";
        System.out.println(LongestWordLength(str));
    }
}