package Module3.homework.Task3;


import java.util.Arrays;

public class Student  {

    private String firstName, lastName;
    private int group, age;
    private Course[] coursesTaken;


    public Student(String firstName, String lastName, int group, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
    }


    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", age=" + age +
                ", coursesTaken=" + coursesTaken +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
