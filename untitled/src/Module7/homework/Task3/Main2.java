package Module7.homework.Task3;

import Module7.homework.Currency;

import java.util.*;

/**
 * Created by user on 03.10.2016.
 */
public class Main2 {

    public static void main(String[] args) {

       // Set<User1> userList = new TreeSet<User1>();
        Set<Order1> order1Set = new TreeSet<Order1>(new Comparator<Order1>() {
            @Override
            public int compare(Order1 o1, Order1 o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });


        Iterator<Order1> iterator = order1Set.iterator();

       order1Set.add(new Order1(0001, 13, Module7.homework.Currency.USD, "item1", "AID04", new User1(0001, "John", "Johnaton", "NY", 100)));
       order1Set.add(new Order1(0002, 15, Module7.homework.Currency.UAH, "item3", "ID02", new User1(0002, "John1", "Petrov", "LA", 200)));
       order1Set.add(new Order1(0003, 20, Module7.homework.Currency.USD, "item2", "ID03", new User1(0003, "John2", "Johnaton2", "Huston", 150) ));
       order1Set.add(new Order1(0001, 13, Module7.homework.Currency.USD, "item1", "AID04", new User1(0004, "John3", "Johnaton3", "LA", 160)));
       order1Set.add(new Order1(0005, 32, Module7.homework.Currency.UAH, "item5", "ID05", new User1(0005, "Anton", "Johnaton4", "Washington", 120)));
       order1Set.add(new Order1(0006, 51, Module7.homework.Currency.USD, "item6", "ID06", new User1(0006, "John5", "Johnaton5", "NY1", 160)));
       order1Set.add(new Order1(0007, 60, Module7.homework.Currency.UAH, "item7", "ID07", new User1(0007, "John6", "Johnaton6", "NY2", 130)));
       order1Set.add(new Order1(00012, 42, Module7.homework.Currency.USD, "item8", "ID08", new User1(00010, "John7", "Johnaton7", "NY3", 120)));
       order1Set.add(new Order1(0010, 1500, Module7.homework.Currency.UAH, "item1", "ID010", new User1(00012, "John9", "Johnaton9", "NY5", 170)));
       order1Set.add(new Order1(0010, 1500, Module7.homework.Currency.UAH, "item1", "ID010", new User1(00012, "John9", "Johnaton9", "NY5", 170)));

//----------------------------------------Check if Set contain Order where User’s lastName is - “Petrov”----------------

        System.out.println("********** Check if Set contain Order where User’s lastName is - Petrov*************");
        for(Order1 o : order1Set) {
            //System.out.println(o);
            if(o.getUser1().getLastName() == "Petrov"){
                System.out.println(o.getUser1().getLastName()+" is Listed");
            }
        }
        System.out.println();
//------------------------------------------------removing order with currency USD---------------------------------------
        System.out.println("********removing order with currency USD**********");
        while (iterator.hasNext()){

            Order1 o = iterator.next();
            if (o.getCurrency() == Currency.USD){
                iterator.remove();

            }
        }
        for(Order1 o : order1Set) {
            System.out.println(o);
        }
        System.out.println();

 //-------------------------------------------print Order with largest price using only one set method - get-------------

        System.out.println("*********print Order with largest price**********");
        List<Order1> listOrder1 = new ArrayList<Order1>(order1Set);
        System.out.println(listOrder1.get(0));

    }



}
