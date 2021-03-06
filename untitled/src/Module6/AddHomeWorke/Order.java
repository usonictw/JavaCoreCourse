package Module6.AddHomeWorke;

import java.util.Date;

/**
 * Created by user on 22.09.2016.
 */
public class Order {
    private Date date;
    private User user;
    private Item item;

    private static int counter;

    private boolean isActive;
    private boolean isShipped;

    public Order(User user, Item item) {

        this.user = user;
        this.item = item;

        this.isActive = true;
        this.isShipped = false;
    }

    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsShipped(boolean isShipped) {
        this.isShipped = isShipped;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }
}

