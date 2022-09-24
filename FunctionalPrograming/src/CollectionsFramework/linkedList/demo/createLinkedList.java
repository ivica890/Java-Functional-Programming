package CollectionsFramework.linkedList.demo;

import java.util.LinkedList;

//add()
//add(pos,el)
//addFirst()
//addLast()
public class createLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Strawberry");
        System.out.println(fruits);

        //Adding an element at the specified position in the LinkedList
        fruits.add(2,"Watermelon");
        System.out.println(fruits);

        //Adding an element at the beginning position in the LinkedList
        fruits.addFirst("Peach");
        System.out.println(fruits);

        //Adding an element at the last position in the LinkedList
        fruits.addLast("Pear");
        System.out.println(fruits);




    }
}
