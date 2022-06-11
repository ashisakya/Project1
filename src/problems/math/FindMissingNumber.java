package problems.math;

/*Java Program to find the missing element*/
import java.util.*;
import java.util.Arrays;

//Driver Code
public class FindMissingNumber
        /*
         *
         * the below array is supposed to have a range of number from 1 to 10
         * {10, 2, 1, 4, 5, 3, 7, 8, 6}
         * one number is missing (9 in this case)
         * write java code to find the missing number from the array
         * use a static helper method to find it
         *
         */
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the total number of elements ");
        n=sc.nextInt();

        int arr[]=new int[n];   //Declare array
        System.out.println("Enter the elements of the array ");
        for(int i=0; i<n ;i++)
        {
            arr[i]=sc.nextInt();
        }

        int sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
        }
        System.out.println("Missing Element is "+sum);
    }
}