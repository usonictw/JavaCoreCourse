package Module8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    private List<T> list = new ArrayList<T>();
    @Override
    public void save(T object) {
        System.out.println("Added users in the DAO");
        list.add(object);
    }

    @Override
    public void delete(T object) {

        if (!list.isEmpty()) {
            System.out.println("The List of our users after delete");
            list.remove(object);
        } else System.out.println("List is empty");

    }

    @Override
    public void deleteAll(List<T> object) {

        list.removeAll(object);

    }

    @Override
    public void saveAll(List<T> object) {

        list.addAll(object);

    }

    @Override
    public List<T> getList() {


            return list;

    }


}
