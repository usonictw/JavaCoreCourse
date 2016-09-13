package Module5.homework;

/**
 * Created by user on 12.09.2016.
 */
public class DAOImplementation implements DAO {

    @Override
    public Room save(Room room) {

        System.out.println("Saving room "+ room);

        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room upDate(Room room) {
        return null;
    }

    @Override
    public Room findById(Room room) {
        return null;
    }
}
