package Module9;

/**
 * Created by user on 17.10.2016.
 */
public class User {

    private long id;
    private String Name;


    public User() {
    }

    public User(long id, String name) {
        this.id = id;
        Name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }


}
