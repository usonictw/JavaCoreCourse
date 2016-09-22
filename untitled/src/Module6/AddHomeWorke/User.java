package Module6.AddHomeWorke;

/**
 * Created by user on 22.09.2016.
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String numberOfMobile;

    public User (int id, String firstName, String lastName, String city, String numberOfMobile){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.numberOfMobile = numberOfMobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumberOfMobile() {
        return numberOfMobile;
    }

    public void setNumberOfMobile(String numberOfMobile) {
        this.numberOfMobile = numberOfMobile;
    }
}
