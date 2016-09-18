package Module6;

/**
 * Created by PC on ${DATA}.
 */
public class Test {

    public static void main(String[] args) {

        User[] users = new User[5];

        users[0] = new User(001, "Vanya", "Ivanov", 500, 0);
        users[1] = null;
        users[2] = new User(003, "Sergey", "Sergeyev", 400, 0);
        users[3] = new User(004, "Aleksandr", "Aleksandrov", 500, 0);
        users[4] = null;


        System.out.println(users[0]);
        System.out.println(users[1]);

        UserUtils userUtils = new UserUtils();

        userUtils.deleteEmptyUsers(users);
    }
}
