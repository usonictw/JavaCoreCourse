package Module8.homework;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Predicate;

/**
 * Created by user on 11.10.2016.
 */
public class Main {

    public int str(String s){

        int i = Integer.parseInt(s);
        return i;
    }


    public static void printList(List<? super Integer> list) throws SQLException {

       throw new SQLException();
    }

    static List<Integer> integers = Arrays.asList(3, 2, 5, 6, 4);

    public static int sumElem(List<Integer> list, Predicate<Integer> p) {
        int sum = 0;
        for (Integer el : list) {
            if (p.test(el)) {
                sum += el;
            }
        }
        return sum;
    }


    public static void main(String[] args) {

       ex e;
       e = (String a, String b) -> "";

       String a = new String ("qwert");
       String b = new String("qwert");

        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());



        List<Number> longList = new ArrayList<>();

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer.equals(integer)) return true;
                else return false;
            }
        };


        System.out.println(sumElem(integers, p1 -> true));
        System.out.println(sumElem(integers, p1 -> p1 % 2 == 0));
        System.out.println(sumElem(integers, p1 -> p1 > 3));


        for (Integer i : integers) {
            System.out.println(i);
        }

        integers.forEach((Integer v) -> System.out.println(v));






        /*


        DAOImpl<User> implementation = new DAOImpl<>();

        User user1 = new User(001, "Ivan1", "Ivanov");
        User user2 = new User(002, "Ivan2", "Petrov");
        User user3 = new User(003, "Ivanov3", "Sidorov");
        User user4 = new User();



        DAOImpl<Order> implementation1 = new DAOImpl<>();

        Order order1 = new Order(0001, 180, "Samsung");


// Save our users in DAO
        implementation.save(user4);
        //implementation.save(user2);
        //implementation.save(user3);

        System.out.println(implementation.getList());
        System.out.println("**********************");

// Delete the user from the our list
            implementation.delete(user3);
            System.out.println(implementation.getList());
            System.out.println("**********************");


//Save the list of users in the DAO

        List<User> userList = new ArrayList<>();

        //userList.add(new User(004, "Ivan", "Ivanov"));
        //userList.add(new User(005, "Petrov", "Petr"));
        implementation.saveAll(userList);
        System.out.println("List of the users after added new list of the users");
        for (User u : implementation.getList()) {
            System.out.println(u);
        }
        System.out.println("*******************");

//remove the list of the users from DAO
        implementation.deleteAll(userList);
        System.out.println("Users's list after remove list of the users");
        for (User u : implementation.getList()) {
            System.out.println(u);
        }


// Save our orders in DAO
        implementation1.save(order1);
        System.out.println("**********************");
        System.out.println(implementation1.getList());


*/


    }
}
