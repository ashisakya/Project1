package datastructure.collections;

//public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

 //   public static void main(String[] args) {

        //write your code here

   // }
//}

import java.io.*;
import java.util.LinkedList;
public class UseLinkedList {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("LinkedList:" + list);
        list.remove(4);
        System.out.println("Final LinkedList:" + list);
    }
}