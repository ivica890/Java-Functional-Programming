package np.aud4.zad2;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OldestPersonTest {

    public static List<Person> readData(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

       return bufferedReader.lines()
                .map(line -> new Person(line))
                .collect( Collectors.toList());
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\icick\\LETO2k22\\src\\np\\aud4\\zad2\\iminja");

        try {
            List<Person> people = readData(new FileInputStream(file));
            Collections.sort(people);
            System.out.println(people.get(people.size()-1));

            if (people.stream().max(Comparator.naturalOrder()).isPresent())
            System.out.println(people.stream().max(Comparator.naturalOrder()).get());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
