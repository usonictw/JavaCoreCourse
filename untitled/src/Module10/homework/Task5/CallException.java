package Module10.homework.Task5;

import Module9.User;

import java.util.List;

/**
 * Created by user on 26.10.2016.
 */
public class CallException {


    public void callException(List<User> userList) throws MyException1 {

        //check the list to NULL

        if (userList.size() == 0) {
            throw new MyException1("Size of list is zero. you must create list of users");
        } else {

            // check the list by the type currency, if currency is "RUB" throw exception

            for (User u : userList) {
                if (u.getCurrency().equals("RUB")) {
                    throw new MyException3("User " + u.getName() + " Using RUB. You have to change type of currency");
                }

                // checking the list of the number of characters in the userName, if number of characters less 4 trow Exception

                if (u.getName().length() < 4) {
                    throw new MyException2("Name have to be more 4 chars");
                }

            }

        }

    }
}


