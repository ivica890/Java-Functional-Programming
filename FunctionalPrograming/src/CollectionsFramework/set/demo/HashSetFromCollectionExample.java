package CollectionsFramework.set.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFiveEvenNumbers = new ArrayList<>(List.of(2,4,6,8,10));
        Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);

        System.out.println(tenEvenNumbers);
       List<Integer> nextFiveEvenNumbers = new ArrayList<>(List.of(12,14,16,18,20));

        tenEvenNumbers.addAll(nextFiveEvenNumbers);
        System.out.println(tenEvenNumbers);


    }
}
