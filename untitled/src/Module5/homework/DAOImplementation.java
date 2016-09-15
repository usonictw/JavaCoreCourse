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
        System.out.println("Delete room "+ room);
        return false;
    }

    @Override
    public Room upDate(Room room) {
        System.out.println("Update room "+ room);
        return null;
    }

    @Override
    public Room findById(Room room) {
        System.out.println("Update room "+ room);

        return null;
    }
}
