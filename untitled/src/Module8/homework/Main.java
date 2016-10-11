package Module8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(001, "Ivan1", "Ivanov"));
        users.add(new User(002, "Ivan2", "Petrov"));
        users.add(new User(003, "Ivanov3", "Sidorov"));

        DAOImplementation<User> implementation = new DAOImplementation<User>();

        User user1 = new User(004, "Ivan", "Petrov");
        implementation.save(user1);

        System.out.println(users);




    }
}
