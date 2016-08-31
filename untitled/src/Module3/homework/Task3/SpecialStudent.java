package Module3.homework.Task3;


public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private  String email;

    public SpecialStudent(String firstName, String lastName, int group, int age) {
        super(firstName, lastName, group, age);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, int age, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, age, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
