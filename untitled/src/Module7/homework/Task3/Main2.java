package Module7.homework.Task3;

import Module7.homework.Task2.Currency;

import java.util.*;

/**
 * Created by user on 03.10.2016.
 */
public class Main2 {

    static Set<Order1> order1Set = new TreeSet<Order1>(new Comparator<Order1>() {
        @Override
        public int compare(Order1 o1, Order1 o2) {
            return o2.getPrice() - o1.getPrice();
        }
    });
    static Iterator<Order1> iterator = order1Set.iterator();

    //----------------------------------------Check if Set contain Order where Users lastName is - Petrov----------------

    public static void searchingLastName(Set<Order1> order1Set, String lastName) {
        System.out.println("********** Check if Set contain Order where User’s lastName is - Petrov*************");
        boolean flag = false;
        for (Order1 o : order1Set) {

            //System.out.println(o);
            if (o.getUser1().getLastName() == lastName) {
                flag = true;
                // System.out.println(o.getUser1().getLastName() + " is Listed");
            }

        }
        if(flag){
            System.out.println(lastName + " is Listed");
        } else {
            System.out.println(lastName + " is not Listed");
        }
        System.out.println();
    }
//------------------------------------------------removing order with currency USD---------------------------------------
    public static void deleteCurrencyUSD(Set<Order1> order1Set) {
        System.out.println("********removing order with currency USD**********");
        while (iterator.hasNext()) {

            Order1 o = iterator.next();
            if (o.getCurrency() == Currency.USD) {
                iterator.remove();

            }
        }
        for (Order1 o : order1Set) {
            System.out.println(o);
        }
        System.out.println();
    }

    //-------------------------------------------print Order with largest price using only one set method - get-------------
    public static void searchingLargestPrice(Set<Order1> order1Set) {
        System.out.println("*********print Order with largest price**********");
        List<Order1> listOrder1 = new ArrayList<Order1>(order1Set);
        System.out.println(listOrder1.get(0));
    }



    public static void main(String[] args) {



        order1Set.add(new Order1(0001, 13, Currency.USD, "item1", "AID04", new User1(0001, "John", "Johnaton", "NY", 100)));
        order1Set.add(new Order1(0002, 15, Currency.UAH, "item3", "ID02", new User1(0002, "John1", "Petrov", "LA", 200)));
        order1Set.add(new Order1(0003, 20, Currency.USD, "item2", "ID03", new User1(0003, "John2", "Johnaton2", "Huston", 150)));
        order1Set.add(new Order1(0001, 13, Currency.USD, "item1", "AID04", new User1(0004, "John3", "Johnaton3", "LA", 160)));
        order1Set.add(new Order1(0005, 32, Currency.UAH, "item5", "ID05", new User1(0005, "Anton", "Johnaton4", "Washington", 120)));
        order1Set.add(new Order1(0006, 51, Currency.USD, "item6", "ID06", new User1(0006, "John5", "Johnaton5", "NY1", 160)));
        order1Set.add(new Order1(0007, 60, Currency.UAH, "item7", "ID07", new User1(0007, "John6", "Johnaton6", "NY2", 130)));
        order1Set.add(new Order1(00012, 42, Currency.USD, "item8", "ID08", new User1(00010, "John7", "Johnaton7", "NY3", 120)));
        order1Set.add(new Order1(0010, 1500, Currency.UAH, "item1", "ID010", new User1(00012, "John9", "Johnaton9", "NY5", 170)));
        order1Set.add(new Order1(0010, 1500, Currency.UAH, "item1", "ID010", new User1(00012, "John9", "Johnaton9", "NY5", 170)));

            searchingLastName(order1Set, "Ivanov");
            //deleteCurrencyUSD(order1Set);
            //searchingLargestPrice(order1Set);

    }


}
