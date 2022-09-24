package np.av8.zad2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseListTest {

    public static <T> void reversePrint(Collection<T> collection){
        List<T> list = new ArrayList<>(collection);

        for(int i = list.size()-1; i > 0; i--){
            System.out.println(list.get(i));
        }
    }

    public static <T> void reversePrint2(Collection<T> collection){
        List<T> list = new ArrayList<>(collection);

        Collections.reverse(list);
        list.stream()
                .forEach(el -> System.out.println(el));
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9,10);

        reversePrint2(ints);
    }
}
