package Module10.homework.Task1;

/**
 * Created by PC on ${DATA}.
 *
 * Task1: Create a class with a Test( ) that throws an object of class Exception inside a try block. Give the constructor for
 * Exception a String argument. Catch the exception inside a catch clause and print the String argument.
 * Add a finally clause and print a message to prove you were there.
 */
public class Task1HW {


    public static void main(String[] args) {

        try {

            String arg1 = " Warning";
            throw new Exception(arg1);

        } catch (Exception ex) {

            System.err.println("Warning: " + ex);

        } finally {
            System.out.println("we were here");
        }
    }
}
