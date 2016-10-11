package Module8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.10.2016.
 */
public class DAOImplementation<T> implements DAO<T> {

    private List<T> object;
    @Override
    public void save(T object) {

        this.object.add(object);
    }

    @Override
    public void delete(T object) {

        this.object.remove(object);

    }

    @Override
    public void deleteAll(List<T> object) {

    }

    @Override
    public void saveAll(List<T> object) {

    }

    @Override
    public List<T> getList() {
        return null;
    }
}
