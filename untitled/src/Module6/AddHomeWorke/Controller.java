package Module6.AddHomeWorke;

/**
 * Created by user on 22.09.2016.
 */
public class Controller {

    Store store = new Store("Kiev");

    public void makeOrder(User user, Item item){

        Order order = new Order(user, item);

        Item[] items = store.getItems();

        int counterStore = 0;
        for (Item storeItem : items){
            if(storeItem.getCityStore().equals(user.getCity())){
                //System.out.println("store true");
                counterStore++;
            }
        }
    if (counterStore > 0) {
        System.out.println("Store in the city you entered is in the amount " + counterStore);
    } else{
        System.out.println("Store in the city you entered is not");
        System.out.println("Store's list by city");
        System.out.println();
        for (Item storeCity : items){
            System.out.println(storeCity.getCityStore());
        }
    }

    }

}
