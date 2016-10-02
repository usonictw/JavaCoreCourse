package Module7.homework;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by PC on ${DATA}.
 */
public class Main {

    public static void main(String[] args) {


        List<User> listUser = new ArrayList<User>();
        List<Order> listOrder = new ArrayList<Order>();



        listUser.add(new User(0001, "John", "Johnaton", "NY", 100));
        listUser.add(new User(0002, "John1", "Johnaton1", "LA", 200));
        listUser.add(new User(0003, "John2", "Johnaton2", "Huston", 150));
        listUser.add(new User(0004, "John3", "Johnaton3", "AMassachusets", 160));
        listUser.add(new User(0005, "John4", "Johnaton4", "Washington", 120));
        listUser.add(new User(0006, "John5", "Johnaton5", "NY", 160));
        listUser.add(new User(0007, "John6", "Johnaton6", "NY2", 130));
        listUser.add(new User(00010, "John7", "Johnaton7", "NY3", 120));
        listUser.add(new User(00011, "John8", "Johnaton8", "NY4", 120));
        listUser.add(new User(00012, "John9", "Johnaton9", "NY5", 170));


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
        //listOrder.add(new Order(0011, 54, Currency.UAH, "item1", "ID01", listUser.get(0)));

        /*System.out.println(listOrder.get(0));
        listOrder.sort(new ComparatorDecraese());
        for(int i = 0; i < listOrder.size(); i++) {
            System.out.println(listOrder.get(i));
        }
        System.out.println();

        listOrder.sort(new ComparatorIncrease());
        for(int i = 0; i < listOrder.size(); i++) {
            System.out.println(listOrder.get(i));
        }
        System.out.println();

        listOrder.sort(new ComparatorIncreaseAndUserCity());
        for(Order o : listOrder){

            System.out.println(o);
        }*/

       /* listOrder.sort(new CompareItemShopIdCity());
        for(Order o : listOrder){

            System.out.println(o);
        }
        */



        Set<Order> setOrder = new HashSet<Order>(listOrder);

        setOrder.addAll(listOrder);
        listOrder.clear();
        listOrder.addAll(setOrder);

        for(Order o : listOrder) {
            System.out.println(o);
        }

        int[] index = new int[listOrder.size()];
        for(int i = 0; i < listOrder.size(); i++){
            if(listOrder.get(i).getPrice() < 1500){
                index[i] = i+1;
            } else index[i] = 0;
        }

        for(int i : index){
            if (i!=0){
                listOrder.remove(i-1);
            }
        }

        System.out.println();
        for(Order o : listOrder) {
            System.out.println(o);
        }


    }
}
