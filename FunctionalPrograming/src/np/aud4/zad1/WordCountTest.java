package np.aud4.zad1;

import java.io.*;
import java.util.Scanner;

public class WordCountTest {

    public static void readDataWithScanner(InputStream inputStream) {
        int lines = 0, words = 0, chars = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ++lines;
            words += line.split("\\s+").length;
            chars += line.length();
        }
        System.out.printf("Lines: %d, Words: %d, Chars: %d\n", lines, words, chars);
    }

    public static void readDataWithBufferdReader(InputStream inputStream) throws IOException {
        int lines = 0, words = 0, chars = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;

        while ((line = bufferedReader.readLine())!=null){
            ++lines;
            words += line.split("\\s+").length;
            chars += line.length();
        }
        System.out.printf("Lines: %d, Words: %d, Chars: %d\n", lines, words, chars);
    }
    public static void readDataWithBufferedReaderAndMapReduce(InputStream inputStream){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        LineCounter result = bufferedReader
                .lines()
                .map(line -> new LineCounter(line))
                .reduce(
                        new LineCounter(0, 0, 0),
                        (left, right) -> left.sum(right)
                );
        System.out.println(result);
    }

    public static void readDataWithBufferedreaderAndCunsumer(InputStream inputStream){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        LineConsumer lineConsumer = new LineConsumer();
        bufferedReader.lines().forEach(lineConsumer);
        System.out.println(lineConsumer);
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\icick\\LETO2k22\\src\\np\\aud4\\text");

        try {
            readDataWithBufferdReader(new FileInputStream(file));
            readDataWithBufferedReaderAndMapReduce(new FileInputStream(file));
            readDataWithBufferedreaderAndCunsumer(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
