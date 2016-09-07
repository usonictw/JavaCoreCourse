package addTask;

/**
 * Created by user on 07.09.2016.
 */
public abstract class  Worker {

    private int id;
    private String firstName;
    private String lastName;
    private String position;
    //private int salary;


    public Worker(int id, String firstName, String lastName, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public abstract void avrSalaryWorkers();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }
}
