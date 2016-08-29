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

    public Course(String teacherName, int hoursDuration) {
        this.teacherName = teacherName;
        this.hoursDuration = hoursDuration;
    }

}

