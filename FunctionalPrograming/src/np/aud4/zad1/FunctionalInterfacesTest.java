package np.aud4.zad1;

import java.net.Socket;
import java.util.Random;
import java.util.function.*;
//Funkciski interfgejso vo java definirani od java
public class FunctionalInterfacesTest {
    public static void main(String[] args) {
        //pravi nekakva proverka, vrakja boolean vrednost
        Predicate<Integer> lessThan100 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 100;
            }
        };


        Predicate<Integer> LessThan100 = integer -> integer < 100;

        //vrakja nekakov rezultat
        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(1000);
            }
        };

        Supplier<Integer> integerSupplier1 = () -> new Random().nextInt(1000);
        //ne vrakja nisto
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> stringConsumer1 = s -> System.out.println(s);
        //prima integer(1), vrakja string(2)
        Function<Integer, String> printNumber = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.format("%d", integer);
            }
        };

        Function<Integer,String> PrintNumber = integer -> String.format("%d",integer);

        //prima 2 argumenti (vo slucajot 2 integer(1,2)), a vrakja string (vo slucajot(3))
        BiFunction<Integer,Integer,String> integerIntegerStringBiFunction = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2) {
                return String.format("%d + %d = %d",integer,integer2,integer+integer2);
            }
        };
        BiFunction<Integer,Integer,String> integerIntegerStringBiFunction1 = (integer,integer2) -> String.format("%d + %d = %d",integer,integer2,integer+integer2);
    }
}
