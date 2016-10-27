package Module10.homework.Task5;


import Module9.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.10.2016.
 */
public class Check {

    public static List<User> userList = new ArrayList<>();

    public static void main(String[] args) throws MyException1 {

        userList.add(new User(01, "Jhon", "USD"));
        userList.add(new User(02, "Piter", "USD"));
        userList.add(new User(03, "Curt", "USD"));

        CallException callException = new CallException();

        try {
            callException.callException(userList);
            System.out.println("list is compiled correctly");
        } catch (MyException1 me) {
            System.out.println(me.getMessage());
        }

    }
}
