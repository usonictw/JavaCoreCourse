package Module3.homework.Task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Course course1 = new Course("Mathematic", "Pol", 30);
        Course course2 = new Course("Chemistry", "Pen", 43);
        Course course3 = new Course("Biology", "Edward", 45);
        Course course4 = new Course("IT", "Michel", 50);
        Course course5 = new Course("Geometry", "Klark", 50);

        Course course11 = new Course(new Date(),"Mathematic");
        Course course12 = new Course(new Date(),"Chemistry");
        Course course13 = new Course(new Date(),"Biology");
        Course course14 = new Course(new Date(),"IT");
        Course course15 = new Course(new Date(),"Geometry");


        Course[] courseTaken = {course1, course2, course3, course4, course5};

        Student student1 = new Student("Pol", "Smith", 1);
        Student student1_0 = new Student("Smith",courseTaken);

        CollegeStudent collegeStudent1 = new CollegeStudent("Kurt", "Russell", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("Rassel", courseTaken);
        CollegeStudent collegeStudent3 = new CollegeStudent("Kurt", "Russell", 2, "Stanford", 100, 010203);

        SpecialStudent specialStudent1 = new SpecialStudent(student1.getFirstName(), student1.getLastName(),student1.getGroup());
        SpecialStudent specialStudent2 =






    }
}
