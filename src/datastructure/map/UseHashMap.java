package datastructure.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

    /*
     *
     * Map is created and inserted some data
     * 1. retrieve and print out the Collection view (datastructure.map entries) of values present in datastructure.map
     * 2. print out Denver
     *
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        //write your code here
        System.out.println(map);
        System.out.println(Arrays.asList(map));
        System.out.println(Collections.singletonList(map));
       }
}