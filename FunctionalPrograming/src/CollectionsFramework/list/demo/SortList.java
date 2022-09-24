package CollectionsFramework.list.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 30, 20, 50, 40));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(5, "Ivica", 21, 50000),
                new Employee(6, "Cane", 21, 70000),
                new Employee(7, "Mende", 21, 10000),
                new Employee(8, "Jone", 21, 20000),
                new Employee(9, "Riki", 21, 60000)
        ));

        Collections.sort(employees, new MySort());
        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println(employees);

    }


}

class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
