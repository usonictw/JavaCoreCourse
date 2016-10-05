package Module7.homework;

import java.util.*;

/**
 * Created by user on 03.10.2016.
 */
public class Main2 {

    public static void main(String[] args) {

        Set<User> userList = new TreeSet<User>();
        Set<Order> orderSet = new TreeSet<Order>();

        userList.add(new User(0001, "John", "Johnaton", "NY", 100));
        userList.add(new User(0002, "John1", "Johnaton1", "LA", 200));
        userList.add(new User(0003, "John2", "Johnaton2", "Huston", 150));
        userList.add(new User(0004, "John3", "Johnaton3", "LA", 160));
        userList.add(new User(0005, "Anton", "Johnaton4", "Washington", 120));
        userList.add(new User(0006, "John5", "Johnaton5", "NY1", 160));
        userList.add(new User(0007, "John6", "Johnaton6", "NY2", 130));
        userList.add(new User(00010, "John7", "Johnaton7", "NY3", 120));
        userList.add(new User(00011, "John8", "Johnaton8", "NY4", 120));
        userList.add(new User(00012, "John9", "Johnaton9", "NY5", 170));

        System.out.println(userList);
        Iterator<User> iterator = userList.iterator();


       orderSet.add(new Order(0001, 13, Currency.USD, "item1", "AID04", iterator.next()));
       orderSet.add(new Order(0002, 15, Currency.UAH, "item3", "ID02", iterator.next()));
       orderSet.add(new Order(0003, 20, Currency.USD, "item2", "ID03", iterator.next()));
       orderSet.add(new Order(0001, 13, Currency.USD, "item1", "AID04", iterator.next()));
       orderSet.add(new Order(0005, 32, Currency.UAH, "item5", "ID05", iterator.next()));
       orderSet.add(new Order(0006, 51, Currency.USD, "item6", "ID06", iterator.next()));
       orderSet.add(new Order(0007, 60, Currency.UAH, "item7", "ID07", iterator.next()));
       orderSet.add(new Order(00012, 42, Currency.USD, "item8", "ID08", iterator.next()));
       orderSet.add(new Order(0013, 21, Currency.UAH, "item9", "ID09", iterator.next()));
       orderSet.add(new Order(0010, 1500, Currency.UAH, "item1", "ID010", iterator.next()));

        for(Order o : orderSet) {
            System.out.println(orderSet);
        }


    }



}
