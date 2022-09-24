package functionalProg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    public static void main(String[] args) {
        List<String> names = List.of("Amigos", "Code", "Alex");

        Stream<String> namesStream = Stream.of("Amigos", "Code", "Alex");

        long collect = names.stream()
                .count();

        System.out.println(collect);

    }
}
