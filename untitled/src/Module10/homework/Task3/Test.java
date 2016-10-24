package Module10.homework.Task3;

import Module9.User;

/**
 * Created by user on 24.10.2016.
 */
public class Test {

    public static void main(String[] args) {

        User user = new User();
        user = null;

        try {
            user.getName();
        }
        catch (NullPointerException npe){

            System.out.println("object is Null");

        }


    }
}
