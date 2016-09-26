package Module6.AddHomeWorke;

/**
 * Created by user on 22.09.2016.
 */
public class Store {

    private Order[] orders = new Order[5];
    private Item[] items = new Item[10];
    private String city;

    public Store(String city) {
        this.city = city;

        Item item1 = new Item(0001, "Galaxy Note1", 210.0, "Samsung");
        items[0] = item1;
        Item item2 = new Item(0002, "Galaxy Note2", 210.0, "Samsung");
        items[1] = item2;
        Item item3 = new Item(0003, "Galaxy Note3", 210.0, "Samsung");
        items[2] = item3;
        Item item4 = new Item(0004, "M3 Note", 110.0, "Meizu");
        items[3] = item4;
        Item item5 = new Item(0005, "M2", 150.0, "Meizu");
        items[4] = item5;
        Item item6 = new Item(0006, "M3S", 240.0, "Meizu");
        items[5] = item6;
        Item item7 = new Item(0007, "redmi note 3", 190.0, "Xiaomi");
        items[6] = item7;
        Item item8 = new Item(00012, "redmi note 2", 180.0, "Xiaomi");
        items[7] = item8;
        Item item9 = new Item(00011, "P60", 280.0, "Lenovo");
        items[8] = item9;
        Item item10 = new Item(0010, "P80", 240.0, "Lenovo");
        items[9] = item10;


    }

    public Order[] getOrders() {
        return orders;
    }

    public Item[] getItems() {
        return items;
    }

    public String getCity() {
        return city;
    }
}
