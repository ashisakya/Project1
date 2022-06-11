package datastructure.collections;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

//public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use datastructure.collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

  //  public static void main(String[] args) {

        //write your code here

  //  }

//}

import java.util.*;
public class UseCollections {
    static void getUnion(int a[], int n, int b[], int m)
    {
        int min = (n < m) ? n : m;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < min; i++) {
            set.add(a[i]);
            set.add(b[i]);
        }
        if (n > m) {
            for (int i = m; i < n; i++) {
                set.add(a[i]);
            }
        }
        else if (n < m) {
            for (int i = n; i < m; i++) {
                set.add(b[i]);
            }
        }
        System.out.println("Number of elements after union operation: " + set.size());
        System.out.println("The union set of both arrays is :");
        System.out.print(set.toString());
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 3, 2, 4, 8, 9, 0};
        int b[] = { 1, 3, 7, 5, 4, 0, 7, 5};
        getUnion(a, 7, b, 8);
    }
}
