package np.av7.zad1;

import java.util.Scanner;

public class FinalistPickerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int finalists = scanner.nextInt();
        int prizes = scanner.nextInt();

        FinalistPicker fp = new FinalistPicker(finalists);
        try {
            System.out.println(fp.pick(prizes));
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }
}
