package Module3.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by user on 16.06.2017.
 */
public class GenMethDemo {

    public static <T extends Comparable<T>, V extends T> boolean isIn(T t, V[] v) {

        for (V v1 : v) {
            if (t.equals(v1)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = null;
        int integer = 0;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            input = bf.readLine();
            integer = Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            Integer[] intArray = {1, 4, 2, 5, 8, 9};
            if (isIn(integer, intArray)) {
                System.out.println("Number " + integer + " is value intArray");
            }else {
                System.out.println("Number " + integer + " not found");
            }

            String[] strArray = {"f", "2", "wrgt", "23"};
            if (isIn(input, strArray)) {
                System.out.println("String \"f\" is string of the strArray");
            } else {
                System.out.println("String not found");
            }
        }
    }
}
