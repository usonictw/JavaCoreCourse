package Module7.homework.Task2;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by PC on ${DATA}.
 */
public class Main {


    public static void main(String[] args) {


        List<User> listUser = new ArrayList<User>();
        List<Order> listOrder = new ArrayList<Order>();


        listUser.add(new User(0001, "John", "Johnaton", "C", 100));
        listUser.add(new User(0002, "John1", "Johnaton1", "B", 200));
        listUser.add(new User(0003, "John2", "Johnaton2", "W", 150));
        listUser.add(new User(0004, "John3", "Johnaton3", "L", 160));
        listUser.add(new User(0005, "John4", "Johnaton4", "L", 120));
        listUser.add(new User(0006, "John5", "Johnaton5", "N", 160));
        listUser.add(new User(0007, "John6", "Johnaton6", "N", 130));
        listUser.add(new User(00010, "John7", "Johnaton7", "T", 120));
        listUser.add(new User(00011, "John8", "Johnaton8", "K", 120));
        listUser.add(new User(00012, "John9", "Johnaton9", "L", 170));


        listOrder.add(new Order(0001, 13, Currency.USD, "Aitem4", "AID04", listUser.get(0)));
        listOrder.add(new Order(0002, 15, Currency.UAH, "item3", "ID02", listUser.get(1)));
        listOrder.add(new Order(0003, 20, Currency.USD, "item2", "ID03", listUser.get(2)));
        listOrder.add(new Order(0001, 13, Currency.USD, "Aitem4", "AID04", listUser.get(0)));
        listOrder.add(new Order(0005, 32, Currency.UAH, "item5", "ID05", listUser.get(4)));
        listOrder.add(new Order(0006, 51, Currency.USD, "item6", "ID06", listUser.get(5)));
        listOrder.add(new Order(0007, 60, Currency.UAH, "item7", "ID07", listUser.get(6)));
        listOrder.add(new Order(00012, 42, Currency.USD, "item8", "ID08", listUser.get(7)));
        listOrder.add(new Order(0013, 21, Currency.UAH, "item9", "ID09", listUser.get(8)));
        listOrder.add(new Order(0010, 1500, Currency.UAH, "item1", "ID010", listUser.get(9)));
        //listOrder.add(new Order1(0011, 54, Currency.UAH, "item1", "ID01", listUser.get(0)));


        // -------------------------------------Sorting the List to Decrease----------------------------------------------
        System.out.println("Sorting the List to Decrease");
        listOrder.sort(new ComparatorDecraese());
        for (int i = 0; i < listOrder.size(); i++) {
            System.out.println(listOrder.get(i));
        }


//---------------------------------------------------Sorting the list to increase and the city-------------------------
        listOrder.sort(new ComparatorIncreaseAndUserCity());
        System.out.println("Sorting the list to increase and the city");
        for (Order o : listOrder) {

            System.out.println(o);
        }
//--------------------------------------------------Sorting the list by Item and ShopID and UserCity
       /* listOrder.sort(new CompareItemShopIdCity());
        for(Order1 o : listOrder){

            System.out.println(o);
        }
        */


//------------------------------------------------removing duplicates------------------------------------------------
        Set<Order> setOrder = new HashSet<Order>(listOrder);

        setOrder.addAll(listOrder);
        listOrder.clear();
        listOrder.addAll(setOrder);
        listOrder.sort(new ComparatorIncrease());
        List<Order> orderListM = new ArrayList<Order>(listOrder);

        System.out.println("removing duplicates");
        for (int i = 0; i < orderListM.size(); i++) {
            System.out.println(listOrder.get(i));
        }

//-----------------------------------------------removing object with price less than 1500----------------------------
        System.out.println("removing object with price less than 1500");
        Iterator<Order> iterator = orderListM.iterator();

        while (iterator.hasNext()) {

            Order o = iterator.next();
            if (o.getPrice() < 1500) {
                iterator.remove();
            }
        }

//----------------------------------------------separation the list into two by currency----------------------------------

        List<Order> list1 = new ArrayList<Order>();
        List<Order> list2 = new ArrayList<Order>();

        for (int i = 0; i < listOrder.size(); i++) {

            if (listOrder.get(i).getCurrency() == Currency.UAH) {
                list1.add(listOrder.get(i));
            } else {
                list2.add(listOrder.get(i));
            }
        }
        System.out.println("LIST1");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("LIST2");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }


        // -----------------------Searching quantity City uniq-----------------------------------------------

        List<List<Order>> listByCity = new ArrayList<List<Order>>();
        listOrder.sort(new ComparatorCity());
        for (int i = 0; i < listOrder.size(); i++){

        }

        System.out.println();
        for (Order s : listOrder) {
            System.out.println(s);
        }

        int counter = 0;
        for (int i = 0; i < listOrder.size() - 1; i++) {

            for (int j = i + 1; j < listOrder.size(); j++) {
                if (listOrder.get(i).getUser().getCity().equals(listOrder.get(j).getUser().getCity())) {

                }

            }
        }
        System.out.println(counter);


    }
}


