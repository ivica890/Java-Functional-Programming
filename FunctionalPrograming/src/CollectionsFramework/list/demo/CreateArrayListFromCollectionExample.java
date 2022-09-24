package CollectionsFramework.list.demo;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimitiveNumbers = new ArrayList<>();
        firstFivePrimitiveNumbers.add(2);
        firstFivePrimitiveNumbers.add(3);
        firstFivePrimitiveNumbers.add(5);
        firstFivePrimitiveNumbers.add(7);
        firstFivePrimitiveNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimitiveNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
    }
}
