package np.aud5.zad1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class BoxTest {
    public static void main(String[] args) {
        Box<Circle> box = new Box<>();

        IntStream
                .range(0,100)
                .forEach(i -> new Circle());

        IntStream
                .range(0,100)
                .forEach(i -> System.out.println(box.draw()));


    }
}
