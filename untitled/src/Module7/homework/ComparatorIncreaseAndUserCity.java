package Module7.homework;

import java.util.Comparator;

/**
 * Created by PC on ${DATA}.
 */
public class ComparatorIncreaseAndUserCity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
