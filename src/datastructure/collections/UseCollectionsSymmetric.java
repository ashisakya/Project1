package datastructure.collections;
import java.util.*;
public class UseCollectionsSymmetric {
    static void symmDiff(int[] arr1, int[] arr2, int n,
                         int m)
    {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
       else {
                i++;
                j++;
            }
        }
        while (i < n) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
    public static void main(String[] args)
    {
        int[] arr1 = { 1, 3, 2, 4, 8, 9, 0 };
        int[] arr2 = { 1, 3, 7, 5, 4, 0, 7, 5 };
        int n = arr1.length;
        int m = arr2.length;
        symmDiff(arr1, arr2, n, m);
    }
}