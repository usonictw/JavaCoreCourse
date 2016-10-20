package Module9.homework;

import Module7.homework.Task2.Currency;
import Module7.homework.Task2.Order;
import Module7.homework.Task2.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.10.2016.
 */
public class Test {

    public static List<User> listUser = new ArrayList<User>();
    public static List<Order> listOrder = new ArrayList<Order>();

    public static void main(String[] args) {


        listUser.add(new User(0001, "John", "Petrov", "C", 100));
        listUser.add(new User(0002, "John1", "Johnaton1", "A", 200));
        listUser.add(new User(0003, "John2", "Johnaton2", "W", 150));
        listUser.add(new User(0004, "John3", "Johnaton3", "L", 160));
        listUser.add(new User(0005, "John4", "Johnaton4", "A", 120));
        listUser.add(new User(0006, "John5", "Johnaton5", "N", 160));
        listUser.add(new User(0007, "John6", "Johnaton6", "N", 130));
        listUser.add(new User(00010, "John7", "Johnaton7", "N", 120));
        listUser.add(new User(00011, "John8", "Johnaton8", "N", 120));
        listUser.add(new User(00012, "John9", "Johnaton9", "L", 170));


        listOrder.add(new Order(0001, 13, Currency.USD, "Aitem4", "AID04", listUser.get(0)));
        listOrder.add(new Order(0002, 13, Currency.UAH, "item3", "ID02", listUser.get(1)));
        listOrder.add(new Order(0003, 20, Currency.USD, "item2", "ID03", listUser.get(2)));
        listOrder.add(new Order(0004, 13, Currency.USD, "Aitem4", "AID04", listUser.get(3)));
        listOrder.add(new Order(0005, 32, Currency.UAH, "item5", "ID05", listUser.get(4)));
        listOrder.add(new Order(0006, 51, Currency.USD, "item6", "ID06", listUser.get(5)));
        listOrder.add(new Order(0007, 60, Currency.UAH, "item7", "ID07", listUser.get(6)));
        listOrder.add(new Order(00012, 42, Currency.USD, "item8", "ID08", listUser.get(7)));
        listOrder.add(new Order(0013, 21, Currency.UAH, "item9", "ID09", listUser.get(8)));
        listOrder.add(new Order(0010, 1500, Currency.UAH, "item1", "ID010", listUser.get(9)));
        //listOrder.add(new Order1(0011, 54, Currency.UAH, "item1", "ID01", listUser.get(0)));

        //OrderUtil.sortDecrease(listOrder);
        //OrderUtil.sortIncreaseAndCity(listOrder);
        //OrderUtil.sortItemShopIDUserCity(listOrder);
        //OrderUtil.removingDuplicate();
        //OrderUtil.deleteLess1500(listOrder);
        //OrderUtil.separateByCurrency(listOrder);
        //OrderUtil.listsByUserCity(listOrder);
        OrderUtil.checkList(listOrder, "Ivanov");
        //OrderUtil.deleteOrdersUSD(listOrder);


    }
}
