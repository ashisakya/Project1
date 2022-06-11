package problems.string;

//public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the problems.string
     * also Find the average length of the words
     *
     */

  //  public static void main(String[] args) {

    //    String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";

        //run your code here


   // }

//}

public class DuplicateWord {
    public static void main(String[] args) {
        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");
        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}