package Module6.AddHomeWorke;

import java.util.Date;

/**
 * Created by user on 22.09.2016.
 */
public class Order {
    private Date date;
    private User user;
    private Item item;
    private int counter;

    private boolean isActive = true;
    private boolean isShipped = false;

    public Order(Date date, User user, Item item, boolean isActive, boolean isShipped) {
        this.date = date;
        this.user = user;
        this.item = item;

        this.isActive = true;
        this.isShipped = false;
    }


}

