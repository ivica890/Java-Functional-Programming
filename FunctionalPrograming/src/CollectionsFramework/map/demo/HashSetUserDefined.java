package CollectionsFramework.map.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetUserDefined {
    public static void main(String[] args) {
        Map<Integer,Student> student = new HashMap<>();
        student.put(1,new Student("Ivica1","Cickoski1"));
        student.put(2,new Student("Svica2","Cickoski2"));
        student.put(3,new Student("Gvica5","Cickoski5"));
        student.put(4,new Student("Qvica4","Cickoski4"));
        student.put(5,new Student("Qvica3","Cickoski3"));

        System.out.println(student);

        System.out.println(student.values());
        Set<Integer> keysLowerThan = new HashSet<>();
       for (Map.Entry<Integer,Student> entry : student.entrySet()){
          if(entry.getKey()<3){
              keysLowerThan.add(entry.getKey());
          }
       }
        System.out.println(keysLowerThan);

       student.forEach((K,V) -> {
           if(K<3){
               keysLowerThan.add(K);
           }
       });

        System.out.println(keysLowerThan);

        student.forEach((K,V) -> {
            if(V.getFirstName().startsWith("Q"))
                System.out.println(V);
        });

        String s = "ivica";
        char s1 [] = s.toCharArray();

        int x = 5;
        String y = Integer.toString(x);
        System.out.println(y);

        String z = "5";
        int q = Integer.parseInt(z);
        System.out.println(q);



    }
}
