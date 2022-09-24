package np.aud4.zad3;

public class Student implements Comparable<Student>{
    private String lastname;
    private String firstname;
    private int exam1;
    private int exam2;
    private int exam3;
    private  char grade;

    public Student(String lastname, String firstname, int exam1, int exam2, int exam3) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    public char getGrade() {
        return grade;
    }

    public double totalPoints(){
        return 0.25 * exam1 + 0.3 * exam2 + 0.45 * exam3;
    }

    public void setGrade() {
    double points = totalPoints();

    if(points >= 90){
        this.grade = 'A';
    }else  if (points >= 80){
        this.grade = 'B';
    }else if (points >= 70){
        this.grade = 'C';
    }else if (points >= 60){
        this.grade = 'D';
    }else if(points >= 50){
        this.grade = 'E';
    } else
        this.grade = 'F';
        }

        public static Student createStudent(String line){
        String [] parts = line.split("\\s+");
        return new Student(parts[0],
                parts[1],
                Integer.parseInt(parts[2]),
                Integer.parseInt(parts[3]),
                Integer.parseInt(parts[4])
                );
        }

    @Override
    public String toString() {
        return lastname + " " + firstname + " " + grade;
    }

    public String printFullInformation(){
        return String.format("%s %s %d %d %d %.2f %c", lastname, firstname, exam1, exam2,exam3,totalPoints(),grade);
    }

    @Override
    public int compareTo(Student other) {
        return Character.compare(this.grade,other.grade);
    }
}
