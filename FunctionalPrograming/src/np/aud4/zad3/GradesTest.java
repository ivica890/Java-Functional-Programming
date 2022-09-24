package np.aud4.zad3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class GradesTest {
    public static void main(String[] args) {
        Course course = new Course();

        File inputFile = new File("C:\\Users\\icick\\LETO2k22\\src\\np\\aud4\\zad3\\grades");
        File outputFile = new File("C:\\Users\\icick\\LETO2k22\\src\\np\\aud4\\zad3\\results");

        try {
            course.readData(new FileInputStream(inputFile));
            System.out.println("Printing sorted students");
            course.printDetailData(System.out);

            System.out.println("Printing detailed report");
            course.printDetailData(new FileOutputStream(outputFile));

            System.out.println("Printing distribution");
            course.printDistribution(System.out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
