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

        Item item1 = new Item(0001, "Galaxy Note1", "Kiev", 210.0, "Samsung");
        Item item2 = new Item(0002, "Galaxy Note2", "Kiev", 210.0, "Samsung");
        Item item3 = new Item(0003, "Galaxy Note3", "Kiev", 210.0, "Samsung");
        Item item4 = new Item(0004, "M3 Note", "Dnepr", 110.0, "Meizu");
        Item item5 = new Item(0005, "M2", "Kiev", 150.0, "Meizu");
        Item item6 = new Item(0006, "M3S", "Kiev", 240.0, "Meizu");
        Item item7 = new Item(0007, "redmi note 3", "Kiev", 190.0, "Xiaomi");
        Item item8 = new Item(00012, "redmi note 2", "Kharkov", 180.0, "Xiaomi");
        Item item9 = new Item(00011, "P60", "Kiev", 280.0, "Lenovo");
        Item item10 = new Item(0010, "P80", "Kiev", 240.0, "Lenovo");



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
