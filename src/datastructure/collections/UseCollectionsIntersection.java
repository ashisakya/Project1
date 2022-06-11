package datastructure.collections;
public class UseCollectionsIntersection{
    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
    public static void main(String args[])
    {
        int arr1[] = { 1, 3, 2, 4, 8, 9, 0};
        int arr2[] = { 1, 3, 7, 5, 4, 0, 7, 5};
        int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }
}