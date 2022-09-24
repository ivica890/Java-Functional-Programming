package np.aud4.zad4;

import java.io.*;
import java.util.Random;
import java.util.stream.IntStream;

public class BinaryNumbers {
    public static final String FILE_NAME = "C:\\Users\\icick\\LETO2k22\\src\\np\\aud5\\numbers.dat";

    private static void generateFile(int n) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            Random random = new Random();

            IntStream.range(0,n)
                    .forEach(i -> {
                        int nextRandom = random.nextInt(1000);
                        try {
                            outputStream.writeInt(nextRandom);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double average() {
        int count = 0;
        int sum = 0;

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));

                try {
                    while (true){
                        int number = objectInputStream.readInt();
                        sum += number;
                        count++;
                    }
                }catch (EOFException e){
                    System.out.println("End of File was reached");
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum/count;
    }

    public static void main(String[] args) {
        generateFile(100);
        System.out.println("Average: " + average());
    }
}
