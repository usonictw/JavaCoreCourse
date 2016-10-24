package Module10.homework.Task2;

/**
 * Created by PC on ${DATA}.
 */
public class Test {

    public static void main(String[] args) {

        try {

            testEx("Strin");
        } catch (OwnerException ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getStr());

        }

    }

    public static void testEx(String msg) throws OwnerException {

        if (msg.equals("String")) {
            System.out.println("Ok");
        } else {
            throw new OwnerException("Exception", msg);
        }
    }
}
