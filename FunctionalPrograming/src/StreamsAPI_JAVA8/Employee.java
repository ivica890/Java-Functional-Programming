package StreamsAPI_JAVA8;

import java.util.List;

public class Employee {


    private String firstName;
    private String lastName;
    private Double sailary;
    private List<String> projects;

    public Employee(String firstName, String lastName, Double sailary, List<String> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sailary = sailary;
        this.projects = projects;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSailary() {
        return sailary;
    }

    public void setSailary(Double sailary) {
        this.sailary = sailary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sailary=" + sailary +
                ", projects=" + projects +
                '}';
    }
}
