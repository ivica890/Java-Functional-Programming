package np.av8.SetAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {
    public static void main(String[] args) {
        //klucot mora da bide comparable
        //izbegnuva duplikati klucevi
        //sortirana e spored klucot
        //slicna kompleksnost kako tree set
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Finki");
        treeMap.put(2, "NP");
        treeMap.put(3, "Napredno");
        treeMap.put(4, "FINKI");

        System.out.println(treeMap);

        //ista kompleksnost kako kaj hashSet
        //go izmestuva redosledot
        //isti karakteristiki kako hashset
        //klucovite moraat da imaat overriden hash metotd
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("F", "Finki");
        hashMap.put("N", "NP");
        hashMap.put("NP", "Napredno");
        hashMap.put("FinKI", "FINKI");

        System.out.println(hashMap);

        //LinkedHashMap
        //isti karakteristiki kako linked hashSet
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("F", "Finki");
        linkedHashMap.put("N", "NP");
        linkedHashMap.put("NP", "Napredno");
        linkedHashMap.put("FinKI", "FINKI");

        System.out.println(linkedHashMap);
    }
}
