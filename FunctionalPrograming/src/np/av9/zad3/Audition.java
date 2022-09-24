package np.av9.zad3;

import java.util.*;

public class Audition {
    Map<String, Set<Participants>> participantsByCity;

    Audition() {
        participantsByCity = new HashMap<>();
    }


    public void addParticpant(String city, String code, String name, int age) {
        Participants p = new Participants(city,code,name,age);
        if(participantsByCity.containsKey(city)){
            participantsByCity.put(city,new HashSet<>());
        }else {
            participantsByCity.get(city).add(p);
        }
    }

    public void listByCity(String city) {
        Set<Participants> sortedSet = new TreeSet<>(Comparator.comparing(Participants::getName)
                .thenComparing(Participants::getAge));
        sortedSet.addAll(participantsByCity.get(city));
    }

}
