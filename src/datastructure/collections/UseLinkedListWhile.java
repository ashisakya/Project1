package datastructure.collections;
import java.util.LinkedList;
public class UseLinkedListWhile {
    public static void main(String[] args) {
        LinkedList<Character> vowels = new LinkedList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        iterateUsingWhileLoop(vowels);
    }
    public static void iterateUsingWhileLoop(LinkedList<Character> vowels){
        System.out.print("Iterating the LinkedList using while loop : ");
        int i=0;
        while(i<vowels.size()){
            System.out.print(vowels.get(i) + " ");
            i++;
        }
    }
}
