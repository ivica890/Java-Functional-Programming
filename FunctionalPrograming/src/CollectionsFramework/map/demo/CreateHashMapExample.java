package CollectionsFramework.map.demo;

import java.util.*;

public class CreateHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();

        //adding key-value to map

        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
        number.put("Five", 5);
        System.out.println(number);

        number.put(null, 6);
        //replacing existing key
        number.put(null, 7);
        System.out.println(number);

        boolean check = number.isEmpty();
        System.out.println(check);

        System.out.println(number.size());

        //check key
        if (number.containsKey("One")) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }

        //check value
        if (number.containsValue(4)) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }
        //get value by key
        Integer value1 = number.get("One");
        System.out.println(value1);

        //remove keys from hashmap
        number.remove("One");
        System.out.println(number);

        //get only keys from hashmap
        Set<String> keys = number.keySet();
        System.out.println(keys);

        //get only values from hashmap
        Collection<Integer> values = number.values();
        System.out.println(values);

        //foreach

        for(Map.Entry<String,Integer> entry :number.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //java 8 foreach

        number.forEach((K,V) -> {
            System.out.println("K "+ K);
            System.out.println("V "+ V);
        });





    }
}
