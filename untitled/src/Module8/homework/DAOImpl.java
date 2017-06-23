package Module8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class DAOImpl<T> implements DAO<T> {

    private List<T> list = new ArrayList<>();
    @Override
    public void save(T object) {
        System.out.println("Added users in the DAO");
        list.add(object);
    }

    @Override
    public void delete(T object) {

        if (!list.isEmpty()) {
            list.remove(object);
            System.out.println("The List of our users after delete");

        }else  System.out.println("List is empty");



    }



    @Override
    public void deleteAll(List<? extends T> object) {

        if (!object.isEmpty()) {
            list.removeAll(object);
        } else {
            System.out.println("  ");
        }

    }

    @Override
    public void saveAll(List<? extends T> objects) {

        list.addAll(objects);

    }

    @Override
    public List<T> getList() {


            return list;

    }


}
