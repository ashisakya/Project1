package problems.math;

//public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
     */

  //  public static void main(String[] args) {

    //    int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
    //    int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

//    }
// }

import java.util.*;

public class FindLowestDifference
{
    static int findSmallestDifference(int A[], int B[],
                                      int m, int n)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int a = 0, b = 0;
        int result = Integer.MAX_VALUE;
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);
            if (A[a] < B[b])
                a++;
            else
                b++;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int m = array1.length;
        int n = array2.length;
        System.out.println(findSmallestDifference
                (array1, array2, m, n));
    }
}