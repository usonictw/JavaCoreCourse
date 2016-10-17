package Module9.homework;

import Module7.homework.Task2.Order;
import Module7.homework.Task2.User;


import java.util.*;

/**
 * Created by PC on ${DATA}.
 */
public class Main {
    public static List<User> listUser = new ArrayList<User>();
    public static List<Order> listOrder = new ArrayList<Order>();

    // -------------------------------------Sorting the List to Decrease----------------------------------------------



    public static void sortDecrease(List<Order> listOrder) {
        System.out.println("Sorting the List to Decrease");
        listOrder.sort(((o1, o2) -> o2.getPrice() - o1.getPrice()));
        for (Order aListOrder : listOrder) System.out.println(aListOrder);
        System.out.println();
    }


    //---------------------------------------------------Sorting the list to increase and the city-------------------------
    public static void sortIncreaseAndCity(List<Order> listOrder) {

        listOrder.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        listOrder.sort((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity()));
        System.out.println("Sorting the list to increase and the city");

        listOrder.forEach(System.out::println);

    }

    //--------------------------------------------------Sorting the list by Item and ShopID and UserCity
    public static void sortItemShopIDUserCity(List<Order> listOrder) {
        listOrder.sort(new CompareItemShopIdCity());

        for (Order o : listOrder) {

            System.out.println(o);
        }
    }

    //-----------------------------------------------removing duplicates------------------------------------------------
    public static void removingDuplicate(List<Order> listOrder) {
        Set<Order> setOrder = new HashSet<Order>(listOrder);

        listOrder.clear();
        listOrder.addAll(setOrder);
        listOrder.sort(new ComparatorIncrease());
        List<Order> orderListM = new ArrayList<Order>(listOrder);

        System.out.println("removing duplicates");
        for (int i = 0; i < orderListM.size(); i++) {
            System.out.println(listOrder.get(i));
        }
    }

    //-----------------------------------------------removing object with price less than 1500----------------------------
    public static void deleteLess1500(List<Order> listOrder) {
        System.out.println("removing object with price less than 1500");
        Iterator<Order> iterator = listOrder.iterator();

        while (iterator.hasNext()) {

            Order o = iterator.next();
            if (o.getPrice() < 1500) {
                iterator.remove();
            }
        }
        System.out.println(listOrder);
    }

//----------------------------------------------separation the list into two by currency----------------------------------

    public static void separateByCurrency(List<Order> listOrder) {
        List<Order> list1 = new ArrayList<Order>();
        List<Order> list2 = new ArrayList<Order>();

        for (int i = 0; i < listOrder.size(); i++) {

            if (listOrder.get(i).getCurrency() == Module7.homework.Task2.Currency.UAH) {
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
    }


    // -----------------------separate list for as many lists as many unique cities are in User-----------------------------------------------

    public static void listsByUserCity(List<Order> listOrder) {

        List<ArrayList<Order>> listsByCity = new ArrayList<ArrayList<Order>>();

        for (int i = 0; i < listOrder.size() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < listOrder.size(); j++) {
                if(i!=j) {
                    if (listOrder.get(i).getUser().getCity().equals(listOrder.get(j).getUser().getCity())) {
                        flag = false;
                    }
                }
            }
            if(flag){
                List<Order> temp = new ArrayList<Order>();
                temp.add(listOrder.get(i));
                listsByCity.add((ArrayList<Order>) temp);
            }

        }

        for(ArrayList o : listsByCity) {
            System.out.println(o);
        }


    }

    public static void main(String[] args) {


        listUser.add(new User(0001, "John", "Johnaton", "C", 100));
        listUser.add(new User(0002, "John1", "Johnaton1", "B", 200));
        listUser.add(new User(0003, "John2", "Johnaton2", "W", 150));
        listUser.add(new User(0004, "John3", "Johnaton3", "L", 160));
        listUser.add(new User(0005, "John4", "Johnaton4", "C", 120));
        listUser.add(new User(0006, "John5", "Johnaton5", "N", 160));
        listUser.add(new User(0007, "John6", "Johnaton6", "N", 130));
        listUser.add(new User(00010, "John7", "Johnaton7", "N", 120));
        listUser.add(new User(00011, "John8", "Johnaton8", "N", 120));
        listUser.add(new User(00012, "John9", "Johnaton9", "L", 170));


        listOrder.add(new Order(0001, 13, Module7.homework.Task2.Currency.USD, "Aitem4", "AID04", listUser.get(0)));
        listOrder.add(new Order(0002, 15, Module7.homework.Task2.Currency.UAH, "item3", "ID02", listUser.get(1)));
        listOrder.add(new Order(0003, 20, Module7.homework.Task2.Currency.USD, "item2", "ID03", listUser.get(2)));
        listOrder.add(new Order(0001, 13, Module7.homework.Task2.Currency.USD, "Aitem4", "AID04", listUser.get(0)));
        listOrder.add(new Order(0005, 32, Module7.homework.Task2.Currency.UAH, "item5", "ID05", listUser.get(4)));
        listOrder.add(new Order(0006, 51, Module7.homework.Task2.Currency.USD, "item6", "ID06", listUser.get(5)));
        listOrder.add(new Order(0007, 60, Module7.homework.Task2.Currency.UAH, "item7", "ID07", listUser.get(6)));
        listOrder.add(new Order(00012, 42, Module7.homework.Task2.Currency.USD, "item8", "ID08", listUser.get(7)));
        listOrder.add(new Order(0013, 21, Module7.homework.Task2.Currency.UAH, "item9", "ID09", listUser.get(8)));
        listOrder.add(new Order(0010, 1500, Module7.homework.Task2.Currency.UAH, "item1", "ID010", listUser.get(9)));
        //listOrder.add(new Order1(0011, 54, Currency.UAH, "item1", "ID01", listUser.get(0)));

        listsByUserCity(listOrder);
        //sortDecrease(listOrder);
        //sortIncreaseAndCity(listOrder);
        //sortItemShopIDUserCity(listOrder);
        //deleteLess1500(listOrder);
        //separateByCurrency(listOrder);


    }
}


