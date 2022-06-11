package datastructure.collections;
import java.util.LinkedList;
public class UseLinkedListForLoop {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        iterateUsingForLoop(linkedList);
    }
    public static void
    iterateUsingForLoop(LinkedList<Integer> linkedList)
    {
        System.out.print(
                "Iterating the LinkedList using a simple for loop : ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}
