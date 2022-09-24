package np.aud4.zad1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> integerList = new java.util.ArrayList<>(100);
        List<String> stringList = new java.util.ArrayList<>();

        integerList.add(8);
        integerList.add(7);
        integerList.add(5);
        integerList.add(2);
        integerList.add(5);

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        System.out.println(integerList);
        System.out.println(stringList);

        System.out.println(integerList.get(3));

        System.out.println(integerList.contains(5));
        System.out.println(integerList.contains(102));

        System.out.println(integerList.indexOf(5));

        System.out.println(integerList.lastIndexOf(5));

        System.out.println(integerList.removeIf(i -> i > 5));
        System.out.println(integerList);

    }
}

