package np.av8.SetAndMap;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {
        //pristap O(logn), iteriranje O(nlogn), dodavanje O(logn), brisenje O(nlogn)
        //zadaci vo koi se bara da se cuvaat unikatni elementi i se bara istite da se sortirani
        Set<Integer> treeIntSet = new TreeSet<>(Comparator.reverseOrder());//mora elementite da se comparable

        for (int i = 1; i <= 10; i++){
            treeIntSet.add(i);
        }
        System.out.println(treeIntSet);

        // najednostavna vremenska kompleksnost
        // ima O(n)
        // nema duplikati
        // redosledot se izmestuva
        Set<Integer> hashIntSet = new HashSet<>();

        for(int i = 1; i <=10; i++){
            hashIntSet.add(i);
        }
        System.out.println(hashIntSet);

        //LinkedHashSet
        //za da se zacuva redoosledot na vnesuvanje
        //ista kompleksnost kako i obivcen hashSet

        Set<String> linkedHashStringSet = new LinkedHashSet<>();
        linkedHashStringSet.add("FINKI");
        linkedHashStringSet.add("finki");
        linkedHashStringSet.add("NP");
        linkedHashStringSet.add("napredno");

        System.out.println(linkedHashStringSet);

    }
}
