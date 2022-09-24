package np.av7.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FinalistPicker {

    int finalist;
    static Random RANDOM = new Random();

    public FinalistPicker(int finalist) {
        this.finalist = finalist;
    }

    public List<Integer> pick(int prizes) throws InvalidArgumentException {
        if(prizes<=0){
            throw new InvalidArgumentException("Prizes number must be positive");
        }
        if(prizes>finalist){
            throw new InvalidArgumentException("Invalid input");
        }

        List<Integer> list = new ArrayList<>();

        while (list.size()!=prizes){
            int pick = RANDOM.nextInt(finalist) + 1;
            if(!list.contains(pick)){
                list.add(pick);
            }
        }

        return list;
    }
}
