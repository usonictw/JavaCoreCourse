package Module6.AddHomeWorke;

/**
 * Created by user on 22.09.2016.
 */
public class Controller {

    Store store = new Store("Kiev");

    public void makeOrder(User user, Item item){

        Order order = new Order(user, item);

        Item[] items = store.getItems();

        for (Item storeItem : items){

            if(storeItem.getCityStore().equals(item.getCityStore())){

                System.out.println("Order true");
            }
        }
    }

}
