package StreamsAPI_JAVA8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Ivica", "Cickoski", 5000.0, List.of("Project1", "Project2"))
        );
        employees.add(new Employee("Mende", "Meco", 6000.0, List.of("Project3", "Project4"))
        );
        employees.add(new Employee("Luka", "Cickoski", 7000.0, List.of("Project1", "Project2"))
        );
        employees.add(new Employee("Mile", "Miki", 9000.0, List.of("Project3", "Project4"))
        );
        employees.add(new Employee("Cane", "Pelister", 8000.0, List.of("Project5", "Project6"))
        );

    }

    public static void main(String[] args) {
        //foreach
        employees.stream()
                .forEach(employee -> System.out.println(employee));


        //map --- zema eden objekt i ni dava drug objekt
        List<Employee> increasedSailary =
                employees.stream()
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSailary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toList());

        System.out.println(increasedSailary);

        //filter
        Employee filterEmployee =
                employees.stream().filter(employee -> employee.getSailary() > 6000)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSailary() * 1.10,
                                employee.getProjects()
                        ))
                        .findFirst()
                        .orElse(null);

        System.out.println(filterEmployee);

        //flatMap
        String projects =
                employees
                        .stream()
                        .map(employee -> employee.getProjects())
                        .flatMap(strings -> strings.stream())
                        .collect(Collectors.joining(","));

        System.out.println(projects);

        //short Circuit operations

        List<Employee> shortCircuit =
                employees
                        .stream()
                        .skip(1)
                        .limit(2)
                        .collect(Collectors.toList());

        System.out.println(shortCircuit);

        //Finite Data

        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));

        //sorting
        List<Employee> sorted =
                employees
                        .stream()
                        .sorted((o1, o2) -> o1.getSailary().compareTo(o2.getSailary()))
                        .collect(Collectors.toList());

        System.out.println(sorted);

        //min or max
        employees
                .stream()
                .max(Comparator.comparing(Employee::getSailary))
                .orElse(null);

        //reduce

        Double totalSailary =
                employees
                        .stream()
                        .map(employee -> employee.getSailary())
                        .reduce((double) 0, (aDouble, aDouble2) -> aDouble + aDouble2);

        System.out.println(totalSailary);


    }


}
