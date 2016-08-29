package Module3.homework.Task3;

public class Student  {

    private String firstName, lastName;
    private int group, age;
    private Course[] coursesTaken;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    //
    //
    //
    //
    //
    //
    //
}
