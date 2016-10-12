package Module8.homework;

/**
 * Created by user on 12.10.2016.
 */
public class Order implements Comparable<Order> {

    private long id;
    private Integer price;
    private String itemName;

    public Order(long id, int price, String itemName) {
        this.id = id;
        this.price = price;
        this.itemName = itemName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return getPrice() - o.getPrice();
    }
}
