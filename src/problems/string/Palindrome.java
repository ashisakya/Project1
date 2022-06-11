package problems.string;

//public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */

  //  public static void main(String[] args) {

        //write your code here

//    }
//}
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}