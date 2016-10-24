package Module10.homework;

/**
 * Created by PC on ${DATA}.
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
