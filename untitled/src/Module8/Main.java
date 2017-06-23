package Module8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 10.10.2016.
 */
public class Main {

    public static void main(String[] args) {


        genericSteck<String> gs = new genericSteck<String>();
        gs.push("Hello");
        System.out.println(gs.pop()+" ");
        genericSteck<Integer> gs1 = new genericSteck<Integer>();
        gs1.push(36);
        System.out.println(gs.pop());
    }
}
