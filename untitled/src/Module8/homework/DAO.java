package Module8.homework;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on ${DATA}.
 */
public interface DAO<T> {

    void save(T object);
    void delete(T object);
    void deleteAll(List<T> object);
    void saveAll(List<T> object);
    List<T> getList();
}
