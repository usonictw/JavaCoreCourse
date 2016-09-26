package Module6.AddHomeWorke;

import java.util.Date;

/**
 * Created by user on 22.09.2016.
 */
public class Controller {

    Store store = new Store("Kiev");

    public void makeOrder(User user, Item item){

        Item[] items = store.getItems();

        for (Item storeItem : items){
            if(store.getCity().equals(user.getCity()) && storeItem.getItemName().equals(item.getItemName()) && storeItem.getProducerName().equals(item.getProducerName())){

                System.out.println("item is in stock");
                Order order = new Order(user, item);
                Date date = new Date();
                order.setIsActive(true);
                order.setIsShipped(false);
                Order.setCounter(001);

                System.out.println("Your order:"+order.getCounter());
                System.out.println(date);
                System.out.println(user.getFirstName());
                System.out.println(user.getLastName());
                System.out.println(storeItem.getItemName());
                System.out.println(storeItem.getProducerName());
                System.out.println("price: "+storeItem.getPrice());
            }
        }
    /*if (counterStore > 0) {
        System.out.println("Store in the city you entered is in the amount " + counterStore);
    } else{
        System.out.println("Store in the city you entered is not");
        System.out.println("Store's list by city");
        System.out.println();
        for (Item storeCity : items){
            System.out.println(storeCity.getCityStore());
        }
    }*/

    }

}
