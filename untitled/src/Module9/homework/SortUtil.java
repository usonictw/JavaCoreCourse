package Module9.homework;

import Module7.homework.Task2.*;
import Module7.homework.Task2.Currency;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by PC on ${DATA}.
 */
public class SortUtil {


    // -------------------------------------Sorting the List to Decrease----------------------------------------------


    public static void sortDecrease(List<Order> listOrder) {
        System.out.println("Sorting the List to Decrease");
        listOrder.sort(((o1, o2) -> o2.getPrice() - o1.getPrice()));
        for (Order aListOrder : listOrder) System.out.println(aListOrder);
        System.out.println();
    }


    //---------------------------------------------------Sorting the list to increase and the city-------------------------
    public static void sortIncreaseAndCity(List<Order> listOrder) {

        listOrder.sort((o1, o2) -> {

            int result = o1.getPrice() - o2.getPrice();
            if (result != 0) return result;
            else return o1.getUser().getCity().compareTo(o2.getUser().getCity());

        });
        System.out.println("Sorting the list to increase and the city");

        listOrder.forEach(System.out::println);

    }

    //--------------------------------------------------Sorting the list by Item and ShopID and UserCity
    public static void sortItemShopIDUserCity(List<Order> listOrder) {
        //listOrder.sort(new CompareItemShopIdCity());
        listOrder.sort((o1, o2) -> {

            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result != 0) return result;
            result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (result != 0) return result;
            result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return (result != 0) ? result : 0;
        });
        System.out.println("Sorting the list to Item the ShopID and the city");
        listOrder.forEach(System.out::println);
    }

    //-----------------------------------------------removing duplicates------------------------------------------------
    public static void removingDuplicate(List<Order> listOrder) {
        List<Order> orderListM = new ArrayList<Order>(listOrder);
        System.out.println("**********Removing duplicate**********");
        orderListM.stream().distinct().collect(Collectors.toList());
        orderListM.forEach(System.out::println);

        /*Set<Order> setOrder = new HashSet<Order>(orderListM);
        orderListM.clear();
        orderListM.addAll(setOrder);
        orderListM.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        System.out.println("removing duplicates");
        orderListM.forEach(System.out::println);
        */
    }

    //-----------------------------------------------removing object with price less than 1500----------------------------
    public static void deleteLess1500(List<Order> listOrder) {

        System.out.println("**********removing object with price less than 1500**********");
        List<Order> orderListM = new ArrayList<Order>(listOrder);
        Predicate<Order> orderPredicate = order -> order.getPrice() < 1500;
        orderListM.stream().filter(orderPredicate).collect(Collectors.toList());
        orderListM.forEach(System.out::println);

        /*Iterator<Order> iterator = listOrder.iterator();

        while (iterator.hasNext()) {

            Order o = iterator.next();
            if (o.getPrice() < 1500) {
                iterator.remove();
            }
        }
        System.out.println(listOrder);
        */
    }

//----------------------------------------------separation the list into two by currency----------------------------------

    public static void separateByCurrency(List<Order> listOrder) {

        System.out.println("**********split the list into two by type the currency **********");
        List<Order> list1 = new ArrayList<Order>();
        List<Order> list2 = new ArrayList<Order>();

        Predicate<Order> orderPredicateUAH = o -> o.getCurrency() == Currency.UAH;
        Predicate<Order> orderPredicateUSD = order -> order.getCurrency() == Currency.USD;
        list1.stream().filter(orderPredicateUAH).collect(Collectors.toList());
        list2.stream().filter(orderPredicateUSD).collect(Collectors.toList());
        list1.forEach(System.out::println);
        list2.forEach(System.out::println);
    }

        /*for (int i = 0; i < listOrder.size(); i++) {

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
        }*/


    // -----------------------separate list for as many lists as many unique cities are in User-----------------------------------------------

    public static void listsByUserCity(List<Order> listOrder) {

        System.out.println("**********Split List by uniq city**********");
        Set<Order> set = new HashSet<>(listOrder);
        Function<Order, List<Order>> separateFunction = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {

                return set.stream()
                        .filter(order1 -> order1.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());
            }
        };

        List<List<Order>> listsByCity = listOrder.stream()
                .map(separateFunction)
                .collect(Collectors.toList());

        listsByCity.forEach(l -> System.out.println(l));

        /*for (int i = 0; i < listOrder.size() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < listOrder.size(); j++) {
                if (i != j) {
                    if (listOrder.get(i).getUser().getCity()
                        .equals(listOrder.get(j).getUser().getCity())) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                List<Order> temp = new ArrayList<Order>();
                temp.add(listOrder.get(i));
                listsByCity.add((ArrayList<Order>) temp);
            }

        }

        for (ArrayList o : listsByCity) {
            System.out.println(o);
        }*/


    }

    public static void deleteOrdersUSD(List<Order> listOrder) {
        System.out.println("********removing order with currency USD**********");
        listOrder.stream()
                .filter(l -> l.getCurrency() == Currency.USD)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public static boolean checkList(List<Order> listOtder) {

        System.out.println("********** Check if Set contain Order where User�s lastName is - Petrov*************");

        return listOtder.stream()
                .anyMatch(l -> l.getUser().getLastName().equals("Petrov"));


    }


}


