package np.av9.zad2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NamesTest {
    public static Map<String, Integer> createFromFile(String path) throws FileNotFoundException {
        Map<String, Integer> result = new HashMap<>();
        InputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String parts[] = line.split("\\s+");
            String name = parts[0];
            Integer freq = Integer.parseInt(parts[1]);
            result.put(name, freq);
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> boysNamesMap = createFromFile("C:\\Users\\icick\\LETO2k22\\src\\np\\av9\\zad2\\names");

        System.out.println(boysNamesMap);


    }
}
