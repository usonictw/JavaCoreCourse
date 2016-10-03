package Module7.homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 03.10.2016.
 */
public class Main2 {

    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        Set<Order> orderSet = new HashSet<>();

        userSet.add(new User(0001, "John", "Johnaton", "NY", 100));
        userSet.add(new User(0002, "John1", "Johnaton1", "LA", 200));
        userSet.add(new User(0003, "John2", "Johnaton2", "Huston", 150));
        userSet.add(new User(0004, "John3", "Johnaton3", "LA", 160));
        userSet.add(new User(0005, "John4", "Johnaton4", "Washington", 120));
        userSet.add(new User(0006, "John5", "Johnaton5", "NY", 160));
        userSet.add(new User(0007, "John6", "Johnaton6", "NY2", 130));
        userSet.add(new User(00010, "John7", "Johnaton7", "NY3", 120));
        userSet.add(new User(00011, "John8", "Johnaton8", "NY4", 120));
        userSet.add(new User(00012, "John9", "Johnaton9", "NY5", 170));

       orderSet.add(new Order(0001, 13, Currency.USD, "Aitem4", "AID04", userSet.);
       orderSet.add(new Order(0002, 15, Currency.UAH, "item3", "ID02", listUser.get(1)));
       orderSet.add(new Order(0003, 20, Currency.USD, "item2", "ID03", listUser.get(2)));
       orderSet.add(new Order(0001, 13, Currency.USD, "Aitem4", "AID04", listUser.get(0)));
       orderSet.add(new Order(0005, 32, Currency.UAH, "item5", "ID05", listUser.get(4)));
       orderSet.add(new Order(0006, 51, Currency.USD, "item6", "ID06", listUser.get(5)));
       orderSet.add(new Order(0007, 60, Currency.UAH, "item7", "ID07", listUser.get(6)));
       orderSet.add(new Order(00012, 42, Currency.USD, "item8", "ID08", listUser.get(7)));
       orderSet.add(new Order(0013, 21, Currency.UAH, "item9", "ID09", listUser.get(8)));
       orderSet.add(new Order(0010, 1500, Currency.UAH, "item1", "ID010", listUser.get(9)));
    }
}
