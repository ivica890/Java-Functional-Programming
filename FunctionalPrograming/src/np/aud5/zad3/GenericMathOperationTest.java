package np.aud5.zad3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class GenericMathOperationTest {
    public static String statistics(List<? extends Number> numbers) {
        DoubleSummaryStatistics doubleSummaryStatistics = new DoubleSummaryStatistics();
        numbers
                .stream()
                .forEach(i -> doubleSummaryStatistics.accept(i.doubleValue()));

        double standardDeviation = 0;

        for (Number n : numbers) {
            standardDeviation += (n.doubleValue() - doubleSummaryStatistics.getAverage()
                    * (n.doubleValue() - doubleSummaryStatistics.getAverage()));
        }
        double finalStandardDeviation = Math.sqrt(standardDeviation/numbers.size());

        return String.format("%.2f",finalStandardDeviation);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random r = new Random();

        IntStream.range(0,1000)
                .forEach(i -> {
                   integers.add(r.nextInt(100)+1);
                });

        List<Double> doubles = new ArrayList<>();
        IntStream.range(0,1000)
                .forEach(i -> {
                    doubles.add(r.nextDouble()*100);
                });

        System.out.println(statistics(integers));
        System.out.println(statistics(doubles));
    }
}
