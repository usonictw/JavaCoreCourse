package Module7.homework.Task3;

/**
 * Created by PC on ${DATA}.
 */
public class User1 implements Comparable<User1> {

    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User1(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }


    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int compareTo(User1 o) {
        return firstName.compareTo(o.getFirstName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User1 user1 = (User1) o;

        if (id != user1.id) return false;
        if (balance != user1.balance) return false;
        if (!firstName.equals(user1.firstName)) return false;
        if (!lastName.equals(user1.lastName)) return false;
        return city.equals(user1.city);

    }


    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                '}';
    }


}
