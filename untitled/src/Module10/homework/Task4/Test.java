package Module10.homework.Task4;

/**
 * Created by user on 07.11.2016.
 */
public class Test {

           public static void main(String[] args) {

            MyException myException = new MyException();

            try {
                myException.f(10, 4);
            }
            catch (NullPointerException npe){

                System.out.println(npe.getMessage());

            }

        }

}
