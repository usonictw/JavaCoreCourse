package Module7.homework.Task2;

import java.util.Comparator;

/**
 * Created by PC on ${DATA}.
 */
public class ComparatorIncreaseAndUserCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {

        if (o1.getPrice() - o2.getPrice() == 0) {

            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        else return o1.getPrice() - o2.getPrice();

    }
}
