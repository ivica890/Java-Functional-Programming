package np.av9.zad1;

import java.util.HashSet;
import java.util.Random;

public class BirthdayParadox {

    int maxPeople;
    static int TRIALS = 5000;

    public BirthdayParadox(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public void conductExperiment() {
        for(int i = 2; i <= maxPeople; i++){
            System.out.printf("%d --> %.2f%n", i,runSimulation(i));
        }
    }

    private float runSimulation(int people) {
        int counter = 0;
        Random random = new Random();
        for (int i = 0; i < TRIALS; i ++){
            if (runTrail(people, random)) {
                ++counter;
            }
        }
        return counter*1.0f/TRIALS;
    }

    private boolean runTrail(int people,Random random) {
        HashSet<Integer> birthdays = new HashSet<>();
        for(int i = 0; i < people; i++){
            int birthday = random.nextInt(365)+1;
            if (birthdays.contains(birthday))
                return true;
            else
                birthdays.add(birthday);
        }
        return false;
    }


}
