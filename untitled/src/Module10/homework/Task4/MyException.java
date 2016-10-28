package Module10.homework.Task4;

/**
 * Created by user on 24.10.2016.
 */
public class MyException {

    public void f(int lengthArr, int index) throws NullPointerException {

        try {
            int[] arr2 = g(lengthArr);
            if (index < lengthArr - 1) {
                System.out.println("called index - ok");
            } else throw new NullPointerException("You've input wrong index of array");
        } catch (NegativeArraySizeException nas) {

            System.out.println(nas.getMessage());

        }

    }

    public int[] g(int lengthArr) throws NegativeArraySizeException {

        int[] arr;
        if (lengthArr > 0) {
            arr = new int[lengthArr];
            for (int i = 0; i > lengthArr; i++) {
                arr[i] = i + 1;
            }
            System.out.println("length of array - ok");
            return arr;
        } else {
            throw new NegativeArraySizeException("Your input negative size of array");
        }

    }
}
