package Module7.homework.Task3;

import Module7.homework.Task2.Currency;

/**
 * Created by PC on ${DATA}.
 */
public class Order1 implements Comparable<Order1> {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User1 user1;

    public Order1(long id, int price, Currency currency, String itemName, String shopIdentificator, User1 user1) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user1 = user1;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User1 getUser1() {
        return user1;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public int compareTo(Order1 o) {
        return user1.getLastName().compareTo(o.getUser1().getLastName());
    }

    @Override
    public String toString() {
        return "Order1{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user1=" + user1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order1 order1 = (Order1) o;

        if (id != order1.id) return false;
        if (price != order1.price) return false;
        if (currency != order1.currency) return false;
        if (!itemName.equals(order1.itemName)) return false;
        if (!shopIdentificator.equals(order1.shopIdentificator)) return false;
        return user1.equals(order1.user1);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user1.hashCode();
        return result;
    }
}
