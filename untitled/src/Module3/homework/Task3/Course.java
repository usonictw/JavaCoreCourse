package Module3.homework.Task3;

import java.util.Date;

public class Course {

    private Date startDate;
    private String name, teacherName;
    private int hoursDuration;


    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, String teacherName, int hoursDuration) {
        this.name = name;
        this.teacherName = teacherName;
        this.hoursDuration = hoursDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "startDate=" + startDate +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", hoursDuration=" + hoursDuration +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }
}

