package Module6;

import Module4.homework.USBank;

import java.util.Arrays;

/**
 * Created by PC on ${DATA}.
 */
public class Test {

    public void printToConsole(User[] users){
        for (User i : users){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        User[] users = new User[5];

        users[0] = new User(001, "Vanya", "Ivanov", 500, 0);
        users[1] = new User(001, "Vanya", "Ivanov", 500, 0);
        users[2] = new User(003, "Sergey", "Sergeyev", 400, 0);
        users[3] = new User(004, "Aleksandr", "Aleksandrov", 500, 0);
        users[4] = new User(001, "Vanya", "Ivanov", 500, 0);


        //System.out.println(users[0]);
        //System.out.println(users[1]);

        UserUtils userUtils = new UserUtils();
        Test test = new Test();


        test.printToConsole(userUtils.uniqueUsers(users));
        System.out.println();
        users = userUtils.deleteEmptyUsers(users);
        test.printToConsole(users);
        System.out.println();
        test.printToConsole(userUtils.usersWithConditionalBalance(users, 100));
        System.out.println();
        test.printToConsole(UserUtils.paySalaryToUsers(users));
        System.out.println();
        UserUtils.getUsersId(users);








    }
}
