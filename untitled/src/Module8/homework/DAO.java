package Module8.homework;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on ${DATA}.
 */
public interface DAO<T> {

    void save(T object);
    void delete(T object);
    void deleteAll(List<? extends T> object);
    void saveAll(List<? extends T> object);
    List<? extends T> getList();
}
