package datastructure.collections;
import java.util.*;
public class UseArrayListForEach {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer i : numbers)
            System.out.print(i + " ");
    }
}
