package Module7.homework.Task2;

import java.util.Comparator;

/**
 * Created by PC on ${DATA}.
 */
public class ComparatorCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
