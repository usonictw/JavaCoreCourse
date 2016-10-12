package Module7.homework.Task4;

/**
 * Created by user on 12.09.2016.
 */
public interface DAO {

    Room1 save(Room1 room1);
    boolean delete(Room1 room1);
    Room1 upDate(Room1 room1);
    Room1 findById(Room1 room1);

}
