package Module5.homework;

/**
 * Created by user on 12.09.2016.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room upDate(Room room);
    Room findById(Room room);

}
