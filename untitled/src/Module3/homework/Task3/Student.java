package Module3.homework.Task3;


public class Student {

    private String firstName, lastName;
    private Course[] coursesTaken;
    private int age, group;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] corsesTaken) {
        this.lastName = lastName;
        this.coursesTaken = corsesTaken;
    }
}
