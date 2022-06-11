package problems.math;

//public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

  //  public static void main(String[] args) {

        //write your code here

    //}
//}

import java.util.Scanner;
public class PrimeNumber
{
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
           String  primeNumber = "";

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumber);
    }
}