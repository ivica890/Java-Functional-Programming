package CollectionsFramework.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//remove()
//removeAll()
//clear()
public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Strawberry");

        System.out.println(fruits);

        fruits.remove(3);
        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println(fruits);

        for(int i = 0; i < fruits.size(); i++){
            if(fruits.get(i).startsWith("B"))
            System.out.println(fruits.get(i));
        }

        List<String> removeList = fruits.stream()
                        .filter(fruit -> fruit.startsWith("B")).
                collect(Collectors.toList());

        System.out.println(removeList);

        fruits.removeAll(removeList);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);

        String s = "String";
        System.out.println(s);
        char [] y = s.toCharArray();
        for (int i = 0; i < y.length; i++){
            System.out.println(y[i]);
        }
    }
}
