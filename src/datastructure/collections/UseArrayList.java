package datastructure.collections;

// public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

 //   public static void main(String[] args) {

        //write your code here

  //  }
//}

import java.util.ArrayList;
public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);

    }
}

