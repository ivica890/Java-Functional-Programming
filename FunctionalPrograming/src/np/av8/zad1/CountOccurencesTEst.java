package np.av8.zad1;

import java.util.Collection;
import java.util.stream.Stream;

public class CountOccurencesTEst {

    public static int count(Collection<Collection<String>> c, String str){
        int counter = 0;

        for(Collection<String> collection : c){
            for(String element : collection){
                if(element.equalsIgnoreCase(str)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int count2(Collection<Collection<String>> c, String str){
       return (int) c.stream()
                .flatMap(col ->col.stream())
                .filter(s -> s.equalsIgnoreCase(str))
                .count();
    }

    public static void main(String[] args) {

    }
}
