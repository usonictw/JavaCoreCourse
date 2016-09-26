package Module6.AddHomeWorke;

/**
 * Created by user on 23.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        User user = new User(001, "John", "Johnatan", "Kiev", "0657654321");

        Item item = new Item();
        item.setProducerName("Samsung");
        //item.setCityStore("Kiev");
        item.setItemName("Galaxy Note3");

        controller.makeOrder(user, item);



    }
}
