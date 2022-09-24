package CollectionsFramework.linkedList.demo;

import java.util.LinkedList;

//How to get first, last and element at a given index;
public class RetrieveLinkedListElementExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        String firstElement = fruits.getFirst();
        System.out.println(firstElement);

        String lastElement = fruits.getLast();
        System.out.println(lastElement);

        String atIndexElement = fruits.get(1);
        System.out.println(atIndexElement);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
