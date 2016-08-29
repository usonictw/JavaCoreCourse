package Module3.homework.Task3;


public class CollegeStudent extends Student {

    private String colageName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String colageName, int rating, long id) {
        super(firstName, lastName, group);
        this.colageName = colageName;
        this.rating = rating;
        this.id = id;
    }

    //
    //
    //
    //
    //
    //
    //
}
