package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericExample {
    public static void main(String[] args) {
        IntegerCounter integerCounter = new IntegerCounter(1);
        DoubleCounter doubleCounter = new DoubleCounter(1.0);
        Counter<Integer> counter1 = new Counter<>(1);
        Counter<Double> counter2 = new Counter<>(2.2);


        integerCounter.print();
        doubleCounter.print();
        counter1.print();
        counter2.print();

        ArrayList<Object> integers = new ArrayList<>();

        integers.add(1);
        integers.add("1");

        Integer i = (Integer) integers.get(0);

        print("Ivica",2);
        print(integers);
    }

    // za genericki metod definirame <T> pred return type
    private static <T, U> void print(T t, U u){
        System.out.println(t);
        System.out.println(u);
    }

    private static void print(List<?> list){
        System.out.println(list);
    }
}
