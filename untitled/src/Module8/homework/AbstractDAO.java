package Module8.homework;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on ${DATA}.
 */
public interface AbstractDAO<T> {

    T save(T user);
    void delete(T user);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
}
